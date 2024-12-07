package com.global.iop.infra.mapping;

import com.global.iop.util.ApiException;

/**
 * @author jiangyi.lx
 * @since 2022/9/6 7:59 下午
 */
public interface Converter {

    /**
     * 把字符串转换为响应对象。
     *
     * @param <T> 领域泛型
     * @param rsp 响应字符串
     * @param clazz 领域类型
     * @return 响应对象
     */
    public <T> T toResponse(String rsp, Class<T> clazz) throws ApiException;

}

