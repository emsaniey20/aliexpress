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

public class AliexpressOfferProductPostAeopAeProductProperty implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 属性名称 */
                @ApiField("attr_name")
            private String attrName;
        /** 属性名Id */
                @ApiField("attr_name_id")
            private Integer attrNameId;
        /** 属性值 */
                @ApiField("attr_value")
            private String attrValue;
        /** 属性值区间结束 */
                @ApiField("attr_value_end")
            private String attrValueEnd;
        /** 属性值Id */
                @ApiField("attr_value_id")
            private Long attrValueId;
        /** 属性值区间开始 */
                @ApiField("attr_value_start")
            private String attrValueStart;
        /** 属性值单位 */
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
        public String getAttrValueEnd() {
    return this.attrValueEnd;
    }
    public void setAttrValueEnd(String attrValueEnd) {
    this.attrValueEnd = attrValueEnd;
    }
        public Long getAttrValueId() {
    return this.attrValueId;
    }
    public void setAttrValueId(Long attrValueId) {
    this.attrValueId = attrValueId;
    }
        public String getAttrValueStart() {
    return this.attrValueStart;
    }
    public void setAttrValueStart(String attrValueStart) {
    this.attrValueStart = attrValueStart;
    }
        public String getAttrValueUnit() {
    return this.attrValueUnit;
    }
    public void setAttrValueUnit(String attrValueUnit) {
    this.attrValueUnit = attrValueUnit;
    }
    }