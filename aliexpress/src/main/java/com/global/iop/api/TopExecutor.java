package com.global.iop.api;

import com.global.iop.util.*;

import java.util.Date;

/**
 * TOP protocol
 */
public class TopExecutor extends BaseExecutor {
    public TopExecutor(String serverUrl, String appKey, String appSecret) {
        super(serverUrl, appKey, appSecret);
    }

    @Override
    RequestContext getRequestContext(IopRequest request, String accessToken, IopHashMap bizParams) throws ApiException {
        RequestContext requestContext = new RequestContext();
        requestContext.setApiName(request.getApiName());

        IopHashMap params = request.getApiParams();
        // add common parameters
        IopHashMap commonParams = new IopHashMap();
        requestContext.setQueryParams(bizParams);
        commonParams.put(Constants.APP_KEY, appKey);
        commonParams.put(Constants.VERSION, "2.0");
        Long timestamp = request.getTimestamp();
        if (timestamp == null) {
            timestamp = System.currentTimeMillis();
        }

        commonParams.put(Constants.TIMESTAMP, new Date(timestamp));
        commonParams.put(Constants.METHOD, request.getApiName());
        commonParams.put(Constants.FORMAT, format);
        commonParams.put(Constants.SESSION, accessToken);
        commonParams.put(Constants.PARTNER_ID, sdkVersion);
        commonParams.put(Constants.SIGN_METHOD, signMethod);
        if(params == null) {
            params = new IopHashMap();
        }
        String simplify = params.get(Constants.SIMPLIFY);
        if (StringUtils.isEmpty(simplify)) {
            simplify = super.simplify.toString();
        }
        if (Boolean.TRUE.toString().equals(simplify)) {
            commonParams.put(Constants.SIMPLIFY, Boolean.TRUE.toString());
        }

        if(isDebugEnabled()) {
            commonParams.put(Constants.DEBUG, true);
        }

        requestContext.setCommonParams(commonParams);
        requestContext.setRequestUrl(this.serverUrl + "/sync?" + "method=" + request.getApiName());
        try {
            commonParams.put(Constants.SIGN, IopUtils.signApiRequest("", requestContext.getAllParams(), null, appSecret, signMethod));
        } catch (Exception e) {
            throw new ApiException(e);
        }
        return requestContext;
    }

    @Override
    protected String responseType() {
        return Constants.RESPONSE_TYPE_AE_DEFAULT;
    }
}
