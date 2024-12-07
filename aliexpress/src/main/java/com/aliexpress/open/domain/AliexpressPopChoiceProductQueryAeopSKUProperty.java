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

public class AliexpressPopChoiceProductQueryAeopSKUProperty implements Serializable {
    private static final long serialVersionUID = 1L;
        /** SKU属性值 */
                @ApiField("sku_property_value")
            private String skuPropertyValue;
        /** SKU属性值ID */
                @ApiField("property_value_id_long")
            private Long propertyValueIdLong;
        /** 女装类目SKU套图,3:4图片,图片数量限制 : 3到6张图片。女装(200000345)下的叶子类目必传参数 */
                @ApiListField("image_url_list")
            private List<String> imageUrlList;
        /** SKU属性名ID */
                @ApiField("sku_property_id_long")
            private Long skuPropertyIdLong;
        /** SKU属性名称 */
                @ApiField("sku_property_name")
            private String skuPropertyName;
        /** 属性值自定义名称 */
                @ApiField("property_value_definition_name")
            private String propertyValueDefinitionName;
        /** SKU图片地址 */
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
        public List<String> getImageUrlList() {
    return this.imageUrlList;
    }
    public void setImageUrlList(List<String> imageUrlList) {
    this.imageUrlList = imageUrlList;
    }
        public Long getSkuPropertyIdLong() {
    return this.skuPropertyIdLong;
    }
    public void setSkuPropertyIdLong(Long skuPropertyIdLong) {
    this.skuPropertyIdLong = skuPropertyIdLong;
    }
        public String getSkuPropertyName() {
    return this.skuPropertyName;
    }
    public void setSkuPropertyName(String skuPropertyName) {
    this.skuPropertyName = skuPropertyName;
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