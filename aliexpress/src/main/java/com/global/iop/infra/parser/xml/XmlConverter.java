package com.global.iop.infra.parser.xml;

import com.global.iop.infra.mapping.Converter;
import com.global.iop.infra.mapping.Converters;
import com.global.iop.infra.mapping.Reader;
import com.global.iop.util.ApiException;
import com.global.iop.util.StringUtils;
import com.global.iop.util.XmlUtils;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author jiangyi.lx
 * @since 2022/9/6 8:22 下午
 */
public class XmlConverter implements Converter {

    private String responseType;

    public XmlConverter(String responseType) {
        this.responseType = responseType;
    }

    public <T> T toResponse(String rsp, Class<T> clazz) throws ApiException {
        Element root = XmlUtils.getRootElementFromString(rsp);
        return getModelFromXML(root, clazz);
    }

    private <T> T getModelFromXML(final Element element, Class<T> clazz) throws ApiException {
        if (element == null)
            return null;

        return Converters.convert(clazz, new Reader() {
            public boolean hasReturnField(Object name) {
                Element childE = XmlUtils.getChildElement(element, (String) name);
                return childE != null;
            }

            public Object getPrimitiveObject(Object name) {
                return XmlUtils.getChildElementValue(element, (String) name);
            }

            public Object getObject(Object name, Class<?> type) throws ApiException {
                Element childE = XmlUtils.getChildElement(element, (String) name);
                if (childE != null) {
                    return getModelFromXML(childE, type);
                } else {
                    return null;
                }
            }

            public List<?> getListObjects(Object listName, Object itemName, Class<?> subType) throws ApiException {
                List<Object> list = null;
                Element listE = XmlUtils.getChildElement(element, (String) listName);
                if (listE != null) {
                    list = new ArrayList<Object>();
                    List<Element> itemEs = XmlUtils.getChildElements(listE, (String) itemName);
                    for (Element itemE : itemEs) {
                        Object obj = null;
                        boolean isObject = false;
                        String value = XmlUtils.getElementValue(itemE);

                        if (String.class.isAssignableFrom(subType)) {
                            obj = value;
                        } else if (Long.class.isAssignableFrom(subType)) {
                            obj = Long.valueOf(value);
                        } else if (Integer.class.isAssignableFrom(subType)) {
                            obj = Integer.valueOf(value);
                        } else if (Boolean.class.isAssignableFrom(subType)) {
                            obj = Boolean.valueOf(value);
                        } else if (Date.class.isAssignableFrom(subType)) {
                            obj = StringUtils.parseDateTime(value);
                        } else {
                            isObject = true;
                            obj = getModelFromXML(itemE, subType);
                        }
                        if (isObject) {
                            if (obj != null) list.add(obj);
                        } else {
                            list.add(obj);
                        }
                    }
                }
                return list;
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
