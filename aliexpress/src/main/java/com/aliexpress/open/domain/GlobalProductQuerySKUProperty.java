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

public class GlobalProductQuerySKUProperty implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 属性值 */
                @ApiField("sku_property_value")
            private String skuPropertyValue;
        /** 属性值id */
                @ApiField("property_value_id")
            private Long propertyValueId;
        /** 属性名 */
                @ApiField("sku_property_name")
            private String skuPropertyName;
        /** 属性名id */
                @ApiField("sku_property_id")
            private Long skuPropertyId;
        /** 自定义销售属性值名称 */
                @ApiField("property_value_definition_name")
            private String propertyValueDefinitionName;
    
        public String getSkuPropertyValue() {
    return this.skuPropertyValue;
    }
    public void setSkuPropertyValue(String skuPropertyValue) {
    this.skuPropertyValue = skuPropertyValue;
    }
        public Long getPropertyValueId() {
    return this.propertyValueId;
    }
    public void setPropertyValueId(Long propertyValueId) {
    this.propertyValueId = propertyValueId;
    }
        public String getSkuPropertyName() {
    return this.skuPropertyName;
    }
    public void setSkuPropertyName(String skuPropertyName) {
    this.skuPropertyName = skuPropertyName;
    }
        public Long getSkuPropertyId() {
    return this.skuPropertyId;
    }
    public void setSkuPropertyId(Long skuPropertyId) {
    this.skuPropertyId = skuPropertyId;
    }
        public String getPropertyValueDefinitionName() {
    return this.propertyValueDefinitionName;
    }
    public void setPropertyValueDefinitionName(String propertyValueDefinitionName) {
    this.propertyValueDefinitionName = propertyValueDefinitionName;
    }
    }