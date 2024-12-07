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

public class DsProductGetAeopSKUProperty implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 111 */
                @ApiField("sku_property_value")
            private String skuPropertyValue;
        /** 111 */
                @ApiField("property_value_id_long")
            private Long propertyValueIdLong;
        /** 111 */
                @ApiField("sku_property_id_long")
            private Long skuPropertyIdLong;
        /** 111 */
                @ApiField("property_value_id")
            private Integer propertyValueId;
        /** 111 */
                @ApiField("sku_property_name")
            private String skuPropertyName;
        /** 111 */
                @ApiField("sku_property_id")
            private Integer skuPropertyId;
        /** 111 */
                @ApiField("property_value_definition_name")
            private String propertyValueDefinitionName;
        /** 111 */
                @ApiField("sku_image")
            private String skuImage;
    
        public String getSkuPropertyValue() {
    return this.skuPropertyValue;
    }
    public void setSkuPropertyValue(String skuPropertyValue) {
    this.skuPropertyValue = skuPropertyValue;
    }
        public Long getPropertyValueIdLong() {
    return this.propertyValueIdLong;
    }
    public void setPropertyValueIdLong(Long propertyValueIdLong) {
    this.propertyValueIdLong = propertyValueIdLong;
    }
        public Long getSkuPropertyIdLong() {
    return this.skuPropertyIdLong;
    }
    public void setSkuPropertyIdLong(Long skuPropertyIdLong) {
    this.skuPropertyIdLong = skuPropertyIdLong;
    }
        public Integer getPropertyValueId() {
    return this.propertyValueId;
    }
    public void setPropertyValueId(Integer propertyValueId) {
    this.propertyValueId = propertyValueId;
    }
        public String getSkuPropertyName() {
    return this.skuPropertyName;
    }
    public void setSkuPropertyName(String skuPropertyName) {
    this.skuPropertyName = skuPropertyName;
    }
        public Integer getSkuPropertyId() {
    return this.skuPropertyId;
    }
    public void setSkuPropertyId(Integer skuPropertyId) {
    this.skuPropertyId = skuPropertyId;
    }
        public String getPropertyValueDefinitionName() {
    return this.propertyValueDefinitionName;
    }
    public void setPropertyValueDefinitionName(String propertyValueDefinitionName) {
    this.propertyValueDefinitionName = propertyValueDefinitionName;
    }
        public String getSkuImage() {
    return this.skuImage;
    }
    public void setSkuImage(String skuImage) {
    this.skuImage = skuImage;
    }
    }