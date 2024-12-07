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

public class AliexpressOfferProductPostAeopQualificationStructDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 资质信息key, 每个类目下的key都不一样，请先调用资质信息查询接口：aliexpress.category.qualifications.list，查询对应的key和type */
                @ApiField("key")
            private String key;
        /** 资质信息类型 ："image","text" */
                @ApiField("type")
            private String type;
        /** 具体的资质信息：图片链接或文本。图片格式只允许jpg、png、jpeg这3种格式 */
                @ApiField("value")
            private String value;
    
        public String getKey() {
    return this.key;
    }
    public void setKey(String key) {
    this.key = key;
    }
        public String getType() {
    return this.type;
    }
    public void setType(String type) {
    this.type = type;
    }
        public String getValue() {
    return this.value;
    }
    public void setValue(String value) {
    this.value = value;
    }
    }