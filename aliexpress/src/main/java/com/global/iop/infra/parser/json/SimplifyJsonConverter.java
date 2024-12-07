package com.global.iop.infra.parser.json;

import com.global.iop.infra.mapping.Converter;
import com.global.iop.infra.mapping.Converters;
import com.global.iop.infra.mapping.Reader;
import com.global.iop.util.ApiException;
import com.global.iop.util.Constants;
import com.global.iop.util.json.ExceptionErrorListener;
import com.global.iop.util.json.JSONReader;
import com.global.iop.util.json.JSONValidatingReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author jiangyi.lx
 * @since 2022/9/6 8:20 下午
 */
public class SimplifyJsonConverter implements Converter {

    private String responseType;

    public SimplifyJsonConverter(String responseType) {
        this.responseType = responseType;
    }

    public <T> T toResponse(String rsp, Class<T> clazz) throws ApiException {
        JSONReader reader = new JSONValidatingReader(new ExceptionErrorListener());
        Object rootObj = reader.read(rsp);
        if (rootObj instanceof Map<?, ?>) {
            Map<?, ?> rootJson = (Map<?, ?>) rootObj;
            if(Constants.RESPONSE_TYPE_DEFAULT.equals(responseType)) {
                return fromJson((Map<?, ?>) rootJson, clazz);
            } else {
                Object errorJson = rootJson.get(Constants.RSP_ERR_RSP);
                if (errorJson instanceof Map<?, ?>) {
                    return fromJson((Map<?, ?>) errorJson, clazz);
                } else {
                    return fromJson(rootJson, clazz);
                }
            }
        }
        return null;
    }

    /**
     * 把JSON格式的数据转换为对象。
     *
     * @param <T> 泛型领域对象
     * @param json JSON格式的数据
     * @param clazz 泛型领域类型
     * @return 领域对象
     */
    public <T> T fromJson(final Map<?, ?> json, Class<T> clazz) throws ApiException {
        return Converters.convert(clazz, new Reader() {
            public boolean hasReturnField(Object name) {
                return json.containsKey(name);
            }

            public Object getPrimitiveObject(Object name) {
                return json.get(name);
            }

            public Object getObject(Object name, Class<?> type) throws ApiException {
                Object tmp = json.get(name);
                if (tmp instanceof Map<?, ?>) {
                    Map<?, ?> map = (Map<?, ?>) tmp;
                    return fromJson(map, type);
                } else {
                    return tmp;
                }
            }

            public List<?> getListObjects(Object listName, Object itemName, Class<?> subType) throws ApiException {
                List<Object> listObjs = null;

                Object jsonList = json.get(listName);
                if (jsonList instanceof List<?>) {
                    listObjs = new ArrayList<Object>();
                    List<?> listObj = (List<?>) jsonList;
                    for (Object tmp : listObj) {
                        if (tmp instanceof Map<?, ?>) {// object
                            Map<?, ?> subMap = (Map<?, ?>) tmp;
                            Object subObj = fromJson(subMap, subType);
                            if (subObj != null) {
                                listObjs.add(subObj);
                            }
                        } else if (tmp instanceof List<?>) {// array
                            // TODO not support yet
                        } else {// boolean, long, double, string, null
                            listObjs.add(tmp);
                        }
                    }
                }

                return listObjs;
            }
        }, responseType);
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

}
