package com.global.iop.infra.parser.json;

import com.global.iop.infra.mapping.Converter;
import com.global.iop.infra.mapping.GopParser;
import com.global.iop.util.ApiException;

/**
 * @author jiangyi.lx
 * @since 2022/9/6 8:19 下午
 */
public class ObjectJsonParser<T> implements GopParser<T> {

    private Class<T> clazz;
    private boolean simplify;

    public ObjectJsonParser(Class<T> clazz) {
        this.clazz = clazz;
    }

    public ObjectJsonParser(Class<T> clazz, boolean simplify) {
        this.clazz = clazz;
        this.simplify = simplify;
    }

    @Override
    public T parse(String rsp, String responseType) throws ApiException {
        Converter converter;
        if (this.simplify) {
            converter = new SimplifyJsonConverter(responseType);
        } else {
            converter = new JsonConverter(responseType);
        }
        return converter.toResponse(rsp, clazz);
    }

    @Override
    public Class<T> getResponseClass() {
        return clazz;
    }

}