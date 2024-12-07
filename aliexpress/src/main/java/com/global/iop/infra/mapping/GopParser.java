package com.global.iop.infra.mapping;

import com.global.iop.util.ApiException;

/**
 * @author jiangyi.lx
 * @since 2022/9/6 8:19 下午
 */
public interface GopParser<T> {
    /**
     * 把响应字符串解释成相应的领域对象。
     *
     * @param rsp 响应字符串
     * @param responseType 响应格式
     * @return 领域对象
     */
    public T parse(String rsp, String responseType) throws ApiException;

    /**
     * 获取响应类类型。
     */
    public Class<T> getResponseClass() throws ApiException;

}
