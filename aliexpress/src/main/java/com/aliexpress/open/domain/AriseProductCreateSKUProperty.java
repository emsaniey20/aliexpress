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

public class AriseProductCreateSKUProperty implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 属性值 */
                @ApiField("sku_property_value")
            private String skuPropertyValue;
        /** 属性值id。 ,支持自定义销售属性值，自定义id从-2开始递减，不能重复 */
                @ApiField("property_value_id")
            private Long propertyValueId;
        /** 属性名 */
                @ApiField("sku_property_name")
            private String skuPropertyName;
        /** 属性名id ,支持自定义销售属性，自定义id从-2开始递减，不能重复 */
                @ApiField("sku_property_id")
            private Long skuPropertyId;
    
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
    }