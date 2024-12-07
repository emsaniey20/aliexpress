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

public class AliexpressDsProductSpecialinfoGetItemQualification implements Serializable {
    private static final long serialVersionUID = 1L;
        /** certification type */
                @ApiField("value_type")
            private String valueType;
        /** certification name */
                @ApiField("name")
            private String name;
        /** certification url */
                @ApiField("value")
            private String value;
        /** certification key */
                @ApiField("key")
            private String key;
    
        public String getValueType() {
    return this.valueType;
    }
    public void setValueType(String valueType) {
    this.valueType = valueType;
    }
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
        public String getValue() {
    return this.value;
    }
    public void setValue(String value) {
    this.value = value;
    }
        public String getKey() {
    return this.key;
    }
    public void setKey(String key) {
    this.key = key;
    }
    }