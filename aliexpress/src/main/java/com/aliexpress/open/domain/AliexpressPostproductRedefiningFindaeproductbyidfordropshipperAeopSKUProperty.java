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

public class AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopSKUProperty implements Serializable {
    private static final long serialVersionUID = 1L;
        /** skuPropertyId */
                @ApiField("sku_property_id")
            private Integer skuPropertyId;
        /** skuImage */
                @ApiField("sku_image")
            private String skuImage;
        /** 自定义id */
                @ApiField("property_value_id_long")
            private Long propertyValueIdLong;
        /** 自定义名 */
                @ApiField("property_value_definition_name")
            private String propertyValueDefinitionName;
        /** 属性值 */
                @ApiField("sku_property_value")
            private String skuPropertyValue;
        /** 属性名 */
                @ApiField("sku_property_name")
            private String skuPropertyName;
    
        public Integer getSkuPropertyId() {
    return this.skuPropertyId;
    }
    public void setSkuPropertyId(Integer skuPropertyId) {
    this.skuPropertyId = skuPropertyId;
    }
        public String getSkuImage() {
    return this.skuImage;
    }
    public void setSkuImage(String skuImage) {
    this.skuImage = skuImage;
    }
        public Long getPropertyValueIdLong() {
    return this.propertyValueIdLong;
    }
    public void setPropertyValueIdLong(Long propertyValueIdLong) {
    this.propertyValueIdLong = propertyValueIdLong;
    }
        public String getPropertyValueDefinitionName() {
    return this.propertyValueDefinitionName;
    }
    public void setPropertyValueDefinitionName(String propertyValueDefinitionName) {
    this.propertyValueDefinitionName = propertyValueDefinitionName;
    }
        public String getSkuPropertyValue() {
    return this.skuPropertyValue;
    }
    public void setSkuPropertyValue(String skuPropertyValue) {
    this.skuPropertyValue = skuPropertyValue;
    }
        public String getSkuPropertyName() {
    return this.skuPropertyName;
    }
    public void setSkuPropertyName(String skuPropertyName) {
    this.skuPropertyName = skuPropertyName;
    }
    }