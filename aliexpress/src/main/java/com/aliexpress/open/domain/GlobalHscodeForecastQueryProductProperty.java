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

public class GlobalHscodeForecastQueryProductProperty implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品普通属性值id。可以参照商品发布接口填写 */
                @ApiField("attr_value_id")
            private Long attrValueId;
        /** 商品普通属性值名称。可以参照商品发布接口填写 */
                @ApiField("attr_value")
            private String attrValue;
        /** 商品普通属性名称。可以参照商品发布接口填写 */
                @ApiField("attr_name")
            private String attrName;
        /** 商品普通属性id。可以参照商品发布接口填写 */
                @ApiField("attr_name_id")
            private Long attrNameId;
    
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
        public Long getAttrNameId() {
    return this.attrNameId;
    }
    public void setAttrNameId(Long attrNameId) {
    this.attrNameId = attrNameId;
    }
    }