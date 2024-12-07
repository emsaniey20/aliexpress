package com.aliexpress.open.domain;

import java.io.Serializable;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Short;
import java.lang.Long;
import java.lang.String;
import java.lang.Byte;
import java.lang.Object;
import java.math.BigDecimal;
import com.global.iop.api.*;
import com.global.iop.util.*;
import com.global.iop.util.json.*;
import com.aliexpress.open.domain.*;
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;

public class AliexpressSolutionProductPostAttributeDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** merchant's attribute value */
                @ApiField("attribute_value")
            private String attributeValue;
        /** merchant's attribute name */
                @ApiField("attribute_name")
            private String attributeName;
        /** aliexpress attribute value id, which could be obtained from https://developers.aliexpress.com/en/doc.htm?docId=29988&docType=2. The path is: result -> attributes ->values -> id */
                @ApiField("aliexpress_attribute_value_id")
            private Long aliexpressAttributeValueId;
        /** aliexpress attribute name id, which could be obtained from https://developers.aliexpress.com/en/doc.htm?docId=29988&docType=2. The path is: result -> attributes -> id */
                @ApiField("aliexpress_attribute_name_id")
            private Integer aliexpressAttributeNameId;
    
        public String getAttributeValue() {
    return this.attributeValue;
    }
    public void setAttributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
    }
        public String getAttributeName() {
    return this.attributeName;
    }
    public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
    }
        public Long getAliexpressAttributeValueId() {
    return this.aliexpressAttributeValueId;
    }
    public void setAliexpressAttributeValueId(Long aliexpressAttributeValueId) {
    this.aliexpressAttributeValueId = aliexpressAttributeValueId;
    }
        public Integer getAliexpressAttributeNameId() {
    return this.aliexpressAttributeNameId;
    }
    public void setAliexpressAttributeNameId(Integer aliexpressAttributeNameId) {
    this.aliexpressAttributeNameId = aliexpressAttributeNameId;
    }
    }