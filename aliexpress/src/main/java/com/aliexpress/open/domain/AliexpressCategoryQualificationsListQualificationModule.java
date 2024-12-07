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

public class AliexpressCategoryQualificationsListQualificationModule implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 资质信息名称 */
                @ApiField("label")
            private String label;
        /** 资质信息类型 ："image","text" */
                @ApiField("type")
            private String type;
        /** 资质信息key, 每个类目下的key都不一样，请先调用资质信息查询接口：aliexpress.category.qualifications.list，查询对应的key和type */
                @ApiField("key")
            private String key;
        /** 资质信息说明 */
                @ApiField("tips")
            private String tips;
        /** 是否必填 */
                @ApiField("required")
            private Boolean required;
    
        public String getLabel() {
    return this.label;
    }
    public void setLabel(String label) {
    this.label = label;
    }
        public String getType() {
    return this.type;
    }
    public void setType(String type) {
    this.type = type;
    }
        public String getKey() {
    return this.key;
    }
    public void setKey(String key) {
    this.key = key;
    }
        public String getTips() {
    return this.tips;
    }
    public void setTips(String tips) {
    this.tips = tips;
    }
        public Boolean getRequired() {
    return this.required;
    }
    public void setRequired(Boolean required) {
    this.required = required;
    }
    }