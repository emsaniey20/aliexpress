package com.global.iop.util;

import java.util.HashMap;
import java.util.Map;

/**
 * API request context wrapper.
 * 
 * @author carver.gu
 * @since Feb 4, 2018
 */
public class RequestContext {

	private Long start;
	private String requestUrl;
	private String responseBody;
	private String apiName;
	private IopHashMap commonParams;
	private IopHashMap queryParams;
	private IopHashMap pathParams;

	public Long getStart() {
		return start;
	}

	public void setStart(Long start) {
		this.start = start;
	}

	public IopHashMap getPathParams() {
		return pathParams;
	}

	public void setPathParams(IopHashMap pathParams) {
		this.pathParams = pathParams;
	}

	public String getRequestUrl() {
		return this.requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	public String getResponseBody() {
		return this.responseBody;
	}

	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}

	public IopHashMap getQueryParams() {
		return this.queryParams;
	}

	public void setQueryParams(IopHashMap queryParams) {
		this.queryParams = queryParams;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public IopHashMap getCommonParams() {
		return commonParams;
	}

	public void setCommonParams(IopHashMap commonParams) {
		this.commonParams = commonParams;
	}

	public Map<String, String> getAllParams() {
		Map<String, String> params = new HashMap<String, String>();
		if (commonParams != null && !commonParams.isEmpty()) {
			params.putAll(commonParams);
		}

		if (queryParams != null && !queryParams.isEmpty()) {
			params.putAll(queryParams);
		}
		return params;
	}

}
