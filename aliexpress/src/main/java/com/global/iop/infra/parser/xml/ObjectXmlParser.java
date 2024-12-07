package com.global.iop.infra.parser.xml;

import com.global.iop.infra.mapping.Converter;
import com.global.iop.infra.mapping.GopParser;
import com.global.iop.util.ApiException;

/**
 * @author jiangyi.lx
 * @since 2022/9/6 8:22 下午
 */
public class ObjectXmlParser <T> implements GopParser<T> {

    private Class<T> clazz;

    public ObjectXmlParser(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T parse(String rsp, String responseType) throws ApiException {
        Converter converter = new XmlConverter(responseType);
        return converter.toResponse(rsp, clazz);
    }

    public Class<T> getResponseClass() {
        return clazz;
    }

}
