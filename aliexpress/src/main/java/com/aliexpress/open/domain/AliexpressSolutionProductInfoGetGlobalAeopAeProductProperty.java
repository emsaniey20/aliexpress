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

public class AliexpressSolutionProductInfoGetGlobalAeopAeProductProperty implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Customized attribute name */
                @ApiField("attr_name")
            private String attrName;
        /** Attribute Name ID */
                @ApiField("attr_name_id")
            private Integer attrNameId;
        /** Customized attribute value */
                @ApiField("attr_value")
            private String attrValue;
        /** Attribute Value ID */
                @ApiField("attr_value_id")
            private Long attrValueId;
        /** unit of customized attribute value */
                @ApiField("attr_value_unit")
            private String attrValueUnit;
    
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
        public String getAttrValue() {
    return this.attrValue;
    }
    public void setAttrValue(String attrValue) {
    this.attrValue = attrValue;
    }
        public Long getAttrValueId() {
    return this.attrValueId;
    }
    public void setAttrValueId(Long attrValueId) {
    this.attrValueId = attrValueId;
    }
        public String getAttrValueUnit() {
    return this.attrValueUnit;
    }
    public void setAttrValueUnit(String attrValueUnit) {
    this.attrValueUnit = attrValueUnit;
    }
    }