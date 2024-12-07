package com.global.iop.api;

/**
 * 请求基础类,对老sdk做了兼容
 * @author jiangyi.lx
 * @since 2022/9/6 8:30 下午
 */
public abstract class BaseGopRequest<T extends IopResponse> extends IopRequest {

    public abstract Class<T> getResponseClass();

    public abstract String getHttpMethod();

}
