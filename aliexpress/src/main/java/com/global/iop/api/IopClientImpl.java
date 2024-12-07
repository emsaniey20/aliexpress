package com.global.iop.api;

import java.net.Proxy;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.global.iop.domain.Protocol;
import com.global.iop.util.ApiException;
import com.global.iop.util.IopLogger;
import com.global.iop.util.WebUtils;

/**
 * International Open Platform API Client.
 * 
 * @author carver.gu
 * @since Feb 4, 2018
 */
public class IopClientImpl implements IopClient {

	private final GopExecutor gopDelegate;
	private final TopExecutor topDelegate;
	private final GopRestExecutor gopRestDelegate;
	private final Map<Protocol, BaseExecutor> factory;

	public IopClientImpl(String serverUrl, String appKey, String appSecret) {
		this.gopDelegate = new GopExecutor(serverUrl, appKey, appSecret);
		this.topDelegate = new TopExecutor(serverUrl, appKey, appSecret);
		this.gopRestDelegate = new GopRestExecutor(serverUrl, appKey, appSecret);
		factory = new HashMap<Protocol, BaseExecutor>();
		factory.put(Protocol.GOP, gopDelegate);
		factory.put(Protocol.TOP, topDelegate);
		factory.put(Protocol.REST_VND_2, gopRestDelegate);
	}

	public IopClientImpl(String serverUrl, String appKey, String appSecret, int connectTimeout, int readTimeout) {
		this(serverUrl, appKey, appSecret);
		setConnectTimeout(connectTimeout);
		setReadTimeout(readTimeout);
	}

	@Override
	public <T extends IopResponse> T execute(BaseGopRequest<T> request) throws ApiException {
		return execute(request, "");
	}

	@Override
	public <T extends IopResponse> T execute(BaseGopRequest<T> request, String accessToken) throws ApiException {
		return execute(request, accessToken, Protocol.TOP);
	}

	@Override
	public <T extends IopResponse> T execute(BaseGopRequest<T> request, String accessToken, Protocol protocol) throws ApiException {
		return factory.get(protocol).doExecute(request, accessToken);
	}

	@Override
	public <T extends IopResponse> T execute(BaseGopRequest<T> request, Protocol protocol) throws ApiException {
		return factory.get(protocol).doExecute(request, null);
	}

	@Override
	public IopResponse execute(IopRequest request, Protocol protocol) throws ApiException {
		return factory.get(protocol).doExecute(request, null);
	}

	@Override
	public IopResponse execute(IopRequest request, String accessToken, Protocol protocol) throws ApiException {
		return factory.get(protocol).doExecute(request, accessToken);
	}

	@Override
	public IopResponse execute(IopRequest request) throws ApiException {
		return execute(request, Protocol.GOP);
	}

	@Override
	public IopResponse execute(IopRequest request, String accessToken) throws ApiException {
		return execute(request, accessToken, Protocol.GOP);
	}

	/**
	 * Enable request logging when error happen.
	 */
	public void setNeedEnableLogger(boolean needEnableLogger) {
		IopLogger.setNeedEnableLogger(needEnableLogger);
	}

	/**
	 * Set whether ignore SSL certificate verification.
	 */
	public void setIgnoreSSLCheck(boolean ignore) {
		WebUtils.setIgnoreSSLCheck(ignore);
	}

	/**
	 * Set whether need gzip encoding or not.
	 */
	public void setUseGzipEncoding(boolean useGzipEncoding) {
		if (factory == null) {
			return;
		}
		Collection<BaseExecutor> values = factory.values();
		for (BaseExecutor executor : values) {
			executor.setUseGzipEncoding(useGzipEncoding);
		}
	}

	/**
	 * Set socket connect timeout time, default is 15 seconds.
	 */
	public void setConnectTimeout(int connectTimeout) {
		if (factory == null) {
			return;
		}
		Collection<BaseExecutor> values = factory.values();
		for (BaseExecutor executor : values) {
			executor.setConnectTimeout(connectTimeout);
		}
	}

	/**
	 * Set socket read timeout time, default is 30 seconds.
	 */
	public void setReadTimeout(int readTimeout) {
		if (factory == null) {
			return;
		}
		Collection<BaseExecutor> values = factory.values();
		for (BaseExecutor executor : values) {
			executor.setReadTimeout(readTimeout);
		}
	}

	/**
	 * set new sign method to client
	 * @param signMethod
	 */
	public void setSignMethod(String signMethod) {
		if (factory == null) {
			return;
		}
		Collection<BaseExecutor> values = factory.values();
		for (BaseExecutor executor : values) {
			executor.setSignMethod(signMethod);
		}
	}

	/**
	 * Set request proxy.
	 */
    public void setProxy(Proxy proxy){
		if (factory == null) {
			return;
		}
		Collection<BaseExecutor> values = factory.values();
		for (BaseExecutor executor : values) {
			executor.setProxy(proxy);
		}
    }

    public void setLogLevel(String logLevel) {
		if (factory == null) {
			return;
		}
		Collection<BaseExecutor> values = factory.values();
		for (BaseExecutor executor : values) {
			executor.setLogLevel(logLevel);
		}
	}
}
