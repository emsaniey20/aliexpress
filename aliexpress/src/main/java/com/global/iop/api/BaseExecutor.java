package com.global.iop.api;

import com.global.iop.infra.mapping.GopParser;
import com.global.iop.infra.parser.json.ObjectJsonParser;
import com.global.iop.infra.parser.xml.ObjectXmlParser;
import com.global.iop.util.*;
import com.global.iop.util.json.JSONReader;
import com.global.iop.util.json.JSONValidatingReader;

import java.io.IOException;
import java.net.Proxy;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseExecutor {

    protected String serverUrl;
    protected String appKey;
    protected String appSecret;

    protected String signMethod = Constants.SIGN_METHOD_SHA256;
    protected int connectTimeout = 15000; // default connection timeout
    protected int readTimeout = 30000; // default read timeout
    protected boolean useGzipEncoding = true; // use gzip encoding or not
    protected Proxy proxy;
    protected String sdkVersion = "iop-sdk-java-20181207";
    protected String logLevel = Constants.LOG_LEVEL_ERROR;
    protected String format = Constants.FORMAT_JSON;
    protected Boolean needParser = true;
    protected Boolean simplify = true;

    public BaseExecutor(String serverUrl, String appKey, String appSecret) {
        this.serverUrl = serverUrl.endsWith("/") ? serverUrl.substring(0, serverUrl.length() - 1) : serverUrl;
        this.appKey = appKey;
        this.appSecret = appSecret;
    }

    abstract RequestContext getRequestContext(IopRequest request, String accessToken, IopHashMap bizParams) throws ApiException;

    protected <T extends IopResponse> GopParser<T> buildParser(Class<T> responseClass) {
        if (Constants.FORMAT_JSON.equals(format)) {
            return new ObjectJsonParser<T>(responseClass, this.simplify);
        } else {
            return new ObjectXmlParser<T>(responseClass);
        }
    }

    protected <T extends IopResponse> T doExecute(BaseGopRequest<T> request, String accessToken) throws ApiException {
        GopParser<T> parser = buildParser(request.getResponseClass());
        RequestContext context = invoke(request, accessToken);
        T tRsp = parseBody(parser, request, context);

        tRsp.setGopRequestParams(context.getAllParams());
        if (!tRsp.isSuccess()) {
            IopLogger.write(appKey, sdkVersion, request.getApiName(), serverUrl, context.getAllParams(), System.currentTimeMillis() - context.getStart(), tRsp.getGopResponseBody());
        }
        return tRsp;
    }

    protected IopResponse doExecute(IopRequest request, String accessToken) throws ApiException {
        RequestContext requestContext = invoke(request, accessToken);

        IopResponse response = parseResponse(requestContext.getResponseBody());
        if (!response.isSuccess()) {
            IopLogger.write(appKey, sdkVersion, request.getApiName(), serverUrl, requestContext.getAllParams(), System.currentTimeMillis() - requestContext.getStart(), response.getGopResponseBody());
        } else {
            if (isDebugEnabled() || isInfoEnabled()) {
                IopLogger.write(appKey, sdkVersion, request.getApiName(), serverUrl, requestContext.getAllParams(), System.currentTimeMillis() - requestContext.getStart(), "");
            }
        }

        return response;
    }

    protected <T extends IopResponse> T parseBody(GopParser<T> parser, BaseGopRequest<T> request, RequestContext requestContext) throws ApiException {
        String body = requestContext.getResponseBody();
        T tRsp = null;
        if (this.needParser) {
            tRsp = parser.parse(body, this.responseType());
            if(tRsp == null){
                try {
                    tRsp = request.getResponseClass().newInstance();
                }catch (Exception e){
                    throw new ApiException(e);
                }
            }
            tRsp.setGopResponseBody(body);
            tRsp.setGopRequestUrl(requestContext.getRequestUrl());
        } else {
            try {
                tRsp = request.getResponseClass().newInstance();
                tRsp.setGopResponseBody(body);
                tRsp.setGopRequestUrl(requestContext.getRequestUrl());
            } catch (Exception e) {
                throw new ApiException(e);
            }
        }
        return tRsp;
    }

    protected RequestContext invoke(IopRequest request, String accessToken) throws ApiException {
        long start = System.currentTimeMillis();

        IopHashMap bizParams = new IopHashMap(request.getApiParams() != null ? request.getApiParams() : new HashMap<String, String>());

        RequestContext requestContext = this.getRequestContext(request, accessToken, bizParams);
        requestContext.setStart(start);
        try {
            String rpcUrl = requestContext.getRequestUrl();
            String urlQuery = WebUtils.buildQuery(requestContext.getCommonParams(), Constants.CHARSET_UTF8);
            String fullUrl = WebUtils.buildRequestUrl(rpcUrl, urlQuery);
            requestContext.setRequestUrl(fullUrl);
            String rsp = null;
            if (this.useGzipEncoding) {
                request.addHeaderParameter(Constants.ACCEPT_ENCODING, Constants.CONTENT_ENCODING_GZIP);
            }
            // use file upload request if there are file parameters
            if (request.getFileParams() != null) {
                rsp = WebUtils.doPost(fullUrl, bizParams, request.getFileParams(), request.getHeaderParams(), Constants.CHARSET_UTF8, connectTimeout, readTimeout);
            } else {
                if (request.getHttpMethod().equals(Constants.METHOD_POST)) {
                    rsp = WebUtils.doPost(fullUrl, bizParams, request.getHeaderParams(), Constants.CHARSET_UTF8, connectTimeout, readTimeout, proxy);
                } else {
                    rsp = WebUtils.doGet(fullUrl, bizParams, request.getHeaderParams(), connectTimeout, readTimeout, Constants.CHARSET_UTF8, proxy);
                }
            }
            requestContext.setResponseBody(rsp);
        } catch (IOException e) {
            IopLogger.write(appKey, sdkVersion, request.getApiName(), serverUrl, requestContext.getAllParams(), System.currentTimeMillis() - start, e.toString());
            throw new ApiException(e);
        } catch (Exception e) {
            IopLogger.write(appKey, sdkVersion, request.getApiName(), serverUrl, requestContext.getAllParams(), System.currentTimeMillis() - start, e.toString());
            throw new ApiException(e);
        }
        return requestContext;
    }

    public boolean isDebugEnabled() {
        return logLevel.equals(Constants.LOG_LEVEL_DEBUG);
    }

    private IopResponse parseResponse(String jsonRsp) {
        JSONReader reader = new JSONValidatingReader();
        Map<?, ?> root = (Map<?, ?>) reader.read(jsonRsp);
        IopResponse response = new IopResponse();
        if (root.containsKey(Constants.RSP_ERR_RSP)) {
            root = ((Map<?, ?>) root.get(Constants.RSP_ERR_RSP));
        }
        response.setGopErrorType((String) root.get(Constants.RSP_TYPE));
        response.setGopErrorCode((String) root.get(Constants.RSP_CODE));
        response.setGopErrorMessage((String) root.get(Constants.RSP_MSG));
        response.setGopRequestId((String) root.get(Constants.RSP_REQUEST_ID));
        response.setGopResponseBody(jsonRsp);
        return response;
    }

    public boolean isInfoEnabled() {
        return logLevel.equals(Constants.LOG_LEVEL_INFO);
    }

    public boolean isErrorEnabled() {
        return logLevel.equals(Constants.LOG_LEVEL_ERROR);
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public boolean isUseGzipEncoding() {
        return useGzipEncoding;
    }

    public void setUseGzipEncoding(boolean useGzipEncoding) {
        this.useGzipEncoding = useGzipEncoding;
    }

    public String getSignMethod() {
        return signMethod;
    }

    public void setSignMethod(String signMethod) {
        this.signMethod = signMethod;
    }

    public Proxy getProxy() {
        return proxy;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    protected abstract String responseType();
}
