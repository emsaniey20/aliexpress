package com.global.iop.api;

import com.global.iop.util.IopHashMap;
import com.global.iop.util.RequestContext;
import com.global.iop.util.WebUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * REST API
 * SIGN WITH REPLACED API PATH
 */
public class GopRestExecutor extends GopExecutor {
    public GopRestExecutor(String serverUrl, String appKey, String appSecret) {
        super(serverUrl, appKey, appSecret);
    }

    @Override
    protected String getUrl(IopRequest request, RequestContext requestContext) {
        String path = request.getApiName();
        IopHashMap pathParams = new IopHashMap();
        StringBuilder sb = new StringBuilder();
        IopHashMap apiParams = request.getApiParams();
        String[] arr = path.split("/");
        for (String s : arr) {
            if (s == null || s.length() == 0) {
                continue;
            }
            if (s.startsWith("{") && s.endsWith("}")) {
                String k = s.substring(1, s.length() - 1);
                String v = apiParams.get(k);
                pathParams.put(k, v);
                sb.append("/").append(v);
            } else {
                sb.append("/").append(s);
            }
        }
        requestContext.setPathParams(pathParams);
        String realPath = sb.toString();
        requestContext.setApiName(realPath);
        return WebUtils.buildRestUrl(this.serverUrl + "/rest/2.0", realPath);
    }

    @Override
    protected IopHashMap getBizParams(IopRequest request, RequestContext requestContext) {
        IopHashMap pathParams = requestContext.getPathParams();
        IopHashMap bizParams = new IopHashMap(request.getApiParams() != null ? request.getApiParams() : new HashMap<String, String>());
        if (pathParams == null || pathParams.isEmpty()) {
            return bizParams;
        }
        IopHashMap result = new IopHashMap();
        for (Map.Entry<String, String> entry : bizParams.entrySet()) {
            String key = entry.getKey();
            if (!pathParams.containsKey(key)) {
                result.put(key, entry.getValue());
            }
        }
        return result;
    }
}
