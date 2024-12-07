package com.global.iop.api;

import com.global.iop.domain.Protocol;
import com.global.iop.util.ApiException;

/**
 * International Open Platform API client interface.
 * 
 * @author carver.gu
 * @since Feb 4, 2018
 */
public interface IopClient {

	<T extends IopResponse> T execute(BaseGopRequest<T> request) throws ApiException;

	<T extends IopResponse> T execute(BaseGopRequest<T> request, String accessToken) throws ApiException;

	<T extends IopResponse> T execute(BaseGopRequest<T> request, String accessToken, Protocol protocol) throws ApiException;

	<T extends IopResponse> T execute(BaseGopRequest<T> request, Protocol protocol) throws ApiException;
	/**
	 * Execute API request without access token.
	 */
	public IopResponse execute(IopRequest request) throws ApiException;

	/**
	 * Execute API request with access token.
	 */
	public IopResponse execute(IopRequest request, String accessToken) throws ApiException;

	/**
	 * Execute API request without access token.
	 */
	public IopResponse execute(IopRequest request, Protocol protocol) throws ApiException;

	/**
	 * Execute API request with access token.
	 */
	public IopResponse execute(IopRequest request, String accessToken, Protocol protocol) throws ApiException;
}
