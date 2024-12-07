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

public class AliexpressDsProductGetAeItemProperty implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Interval attribute start value */
                @ApiField("attr_value_start")
            private String attrValueStart;
        /** Attribute ID */
                @ApiField("attr_value_id")
            private Integer attrValueId;
        /** End value of interval attribute */
                @ApiField("attr_value_end")
            private String attrValueEnd;
        /** Attribute value */
                @ApiField("attr_value")
            private String attrValue;
        /** Attribute unit */
                @ApiField("attr_value_unit")
            private String attrValueUnit;
        /** Attribute name */
                @ApiField("attr_name")
            private String attrName;
        /** Attribute ID */
                @ApiField("attr_name_id")
            private Integer attrNameId;
    
        public String getAttrValueStart() {
    return this.attrValueStart;
    }
    public void setAttrValueStart(String attrValueStart) {
    this.attrValueStart = attrValueStart;
    }
        public Integer getAttrValueId() {
    return this.attrValueId;
    }
    public void setAttrValueId(Integer attrValueId) {
    this.attrValueId = attrValueId;
    }
        public String getAttrValueEnd() {
    return this.attrValueEnd;
    }
    public void setAttrValueEnd(String attrValueEnd) {
    this.attrValueEnd = attrValueEnd;
    }
        public String getAttrValue() {
    return this.attrValue;
    }
    public void setAttrValue(String attrValue) {
    this.attrValue = attrValue;
    }
        public String getAttrValueUnit() {
    return this.attrValueUnit;
    }
    public void setAttrValueUnit(String attrValueUnit) {
    this.attrValueUnit = attrValueUnit;
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