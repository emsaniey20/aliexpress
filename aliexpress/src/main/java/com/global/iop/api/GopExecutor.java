package com.global.iop.api;

import com.global.iop.util.*;

import java.util.Date;
import java.util.HashMap;

/**
 * GOP protocol
 */
public class GopExecutor extends BaseExecutor {
    public GopExecutor(String serverUrl, String appKey, String appSecret) {
        super(serverUrl, appKey, appSecret);
    }

    @Override
    RequestContext getRequestContext(IopRequest request, String accessToken, IopHashMap bizParams) throws ApiException {
        RequestContext requestContext = new RequestContext();
        requestContext.setApiName(request.getApiName());

        // add common parameters
        IopHashMap commonParams = new IopHashMap();
        requestContext.setRequestUrl(this.getUrl(request, requestContext));
        requestContext.setQueryParams(this.getBizParams(request, requestContext));
        commonParams.put(Constants.APP_KEY, appKey);
        Long timestamp = request.getTimestamp();
        if (timestamp == null) {
            timestamp = System.currentTimeMillis();
        }

        commonParams.put(Constants.TIMESTAMP, new Date(timestamp));
        commonParams.put(Constants.SIGN_METHOD, signMethod);
        commonParams.put(Constants.ACCESS_TOKEN, accessToken);
        commonParams.put(Constants.PARTNER_ID, sdkVersion);

        if(isDebugEnabled()) {
            commonParams.put(Constants.DEBUG, true);
        }

        requestContext.setCommonParams(commonParams);
        try {
            commonParams.put(Constants.SIGN, IopUtils.signApiRequest(requestContext, appSecret, signMethod));
        } catch (Exception e) {
            throw new ApiException(e);
        }
        return requestContext;
    }

    @Override
    protected String responseType() {
        return Constants.RESPONSE_TYPE_DEFAULT;
    }

    protected String getUrl(IopRequest request, RequestContext requestContext) {
        return WebUtils.buildRestUrl(this.serverUrl + "/rest", request.getApiName());
    }

    protected IopHashMap getBizParams(IopRequest request, RequestContext requestContext) {
        return new IopHashMap(request.getApiParams() != null ? request.getApiParams() : new HashMap<String, String>());
    }
}
