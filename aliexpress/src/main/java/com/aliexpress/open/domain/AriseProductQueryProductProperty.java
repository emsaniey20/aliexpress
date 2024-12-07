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

public class AriseProductQueryProductProperty implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 属性值id， */
                @ApiField("attr_value_id")
            private Long attrValueId;
        /** 属性值， */
                @ApiField("attr_value")
            private String attrValue;
        /** 属性名， */
                @ApiField("attr_name")
            private String attrName;
        /** 属性名id，， */
                @ApiField("attr_name_id")
            private Integer attrNameId;
    
        public Long getAttrValueId() {
    return this.attrValueId;
    }
    public void setAttrValueId(Long attrValueId) {
    this.attrValueId = attrValueId;
    }
        public String getAttrValue() {
    return this.attrValue;
    }
    public void setAttrValue(String attrValue) {
    this.attrValue = attrValue;
    }
        public String getAttrName() {
    return this.attrName;
    }
    public void setAttrName(String attrName) {
    this.attrName = attrName;
    }
        public Integer getAttrNameId() {
    return this.attrNameId;
    }
    public void setAttrNameId(Integer attrNameId) {
    this.attrNameId = attrNameId;
    }
    }