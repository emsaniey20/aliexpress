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

public class AliexpressSocialProductFulldetailQueryProductSKUPropertyValue implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Property value definition name */
                @ApiField("property_value_definition_name")
            private String propertyValueDefinitionName;
        /** Property value name */
                @ApiField("property_value_display_name")
            private String propertyValueDisplayName;
        /** property value id */
                @ApiField("property_value_id")
            private Integer propertyValueId;
        /** property value ID */
                @ApiField("property_value_id_long")
            private Long propertyValueIdLong;
        /** Property value name */
                @ApiField("property_value_name")
            private String propertyValueName;
        /** color */
                @ApiField("sku_color_value")
            private String skuColorValue;
        /** image path */
                @ApiField("sku_property_image_path")
            private String skuPropertyImagePath;
        /** image */
                @ApiField("sku_property_image_summ_path")
            private String skuPropertyImageSummPath;
        /** send goods country */
                @ApiField("sku_property_send_goods_country_code")
            private String skuPropertySendGoodsCountryCode;
        /** Property of sku */
                @ApiField("sku_property_tips")
            private String skuPropertyTips;
        /** display order for sku */
                @ApiField("sku_property_value_show_order")
            private Integer skuPropertyValueShowOrder;
        /** sku property */
                @ApiField("sku_property_value_tips")
            private String skuPropertyValueTips;
    
        public String getPropertyValueDefinitionName() {
    return this.propertyValueDefinitionName;
    }
    public void setPropertyValueDefinitionName(String propertyValueDefinitionName) {
    this.propertyValueDefinitionName = propertyValueDefinitionName;
    }
        public String getPropertyValueDisplayName() {
    return this.propertyValueDisplayName;
    }
    public void setPropertyValueDisplayName(String propertyValueDisplayName) {
    this.propertyValueDisplayName = propertyValueDisplayName;
    }
        public Integer getPropertyValueId() {
    return this.propertyValueId;
    }
    public void setPropertyValueId(Integer propertyValueId) {
    this.propertyValueId = propertyValueId;
    }
        public Long getPropertyValueIdLong() {
    return this.propertyValueIdLong;
    }
    public void setPropertyValueIdLong(Long propertyValueIdLong) {
    this.propertyValueIdLong = propertyValueIdLong;
    }
        public String getPropertyValueName() {
    return this.propertyValueName;
    }
    public void setPropertyValueName(String propertyValueName) {
    this.propertyValueName = propertyValueName;
    }
        public String getSkuColorValue() {
    return this.skuColorValue;
    }
    public void setSkuColorValue(String skuColorValue) {
    this.skuColorValue = skuColorValue;
    }
        public String getSkuPropertyImagePath() {
    return this.skuPropertyImagePath;
    }
    public void setSkuPropertyImagePath(String skuPropertyImagePath) {
    this.skuPropertyImagePath = skuPropertyImagePath;
    }
        public String getSkuPropertyImageSummPath() {
    return this.skuPropertyImageSummPath;
    }
    public void setSkuPropertyImageSummPath(String skuPropertyImageSummPath) {
    this.skuPropertyImageSummPath = skuPropertyImageSummPath;
    }
        public String getSkuPropertySendGoodsCountryCode() {
    return this.skuPropertySendGoodsCountryCode;
    }
    public void setSkuPropertySendGoodsCountryCode(String skuPropertySendGoodsCountryCode) {
    this.skuPropertySendGoodsCountryCode = skuPropertySendGoodsCountryCode;
    }
        public String getSkuPropertyTips() {
    return this.skuPropertyTips;
    }
    public void setSkuPropertyTips(String skuPropertyTips) {
    this.skuPropertyTips = skuPropertyTips;
    }
        public Integer getSkuPropertyValueShowOrder() {
    return this.skuPropertyValueShowOrder;
    }
    public void setSkuPropertyValueShowOrder(Integer skuPropertyValueShowOrder) {
    this.skuPropertyValueShowOrder = skuPropertyValueShowOrder;
    }
        public String getSkuPropertyValueTips() {
    return this.skuPropertyValueTips;
    }
    public void setSkuPropertyValueTips(String skuPropertyValueTips) {
    this.skuPropertyValueTips = skuPropertyValueTips;
    }
    }