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

public class DsProductGetAeopAeProductProperty implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 111 */
                @ApiField("attr_value_start")
            private String attrValueStart;
        /** 111 */
                @ApiField("attr_value_id")
            private Integer attrValueId;
        /** 111 */
                @ApiField("attr_value_end")
            private String attrValueEnd;
        /** 111 */
                @ApiField("attr_name_id_long")
            private Long attrNameIdLong;
        /** 111 */
                @ApiField("attr_value")
            private String attrValue;
        /** 111 */
                @ApiField("attr_value_unit")
            private String attrValueUnit;
        /** 111 */
                @ApiField("attr_value_id_long")
            private Long attrValueIdLong;
        /** 111 */
                @ApiField("attr_name")
            private String attrName;
        /** 111 */
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
        public Long getAttrNameIdLong() {
    return this.attrNameIdLong;
    }
    public void setAttrNameIdLong(Long attrNameIdLong) {
    this.attrNameIdLong = attrNameIdLong;
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
        public Long getAttrValueIdLong() {
    return this.attrValueIdLong;
    }
    public void setAttrValueIdLong(Long attrValueIdLong) {
    this.attrValueIdLong = attrValueIdLong;
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