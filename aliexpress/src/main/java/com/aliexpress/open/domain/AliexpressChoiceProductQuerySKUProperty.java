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

public class AliexpressChoiceProductQuerySKUProperty implements Serializable {
    private static final long serialVersionUID = 1L;
        /** SKU属性值 */
                @ApiField("sku_property_value")
            private String skuPropertyValue;
        /** 女装类目sku套图,3:4图片,图片数量限制 : 3到6张图片。女装(200000345)下的叶子类目必传参数 */
                @ApiField("image_url_list")
            private String imageUrlList;
        /** SKU属性值ID */
                @ApiField("property_value_id")
            private Long propertyValueId;
        /** SKU属性名 */
                @ApiField("sku_property_name")
            private String skuPropertyName;
        /** SKU属性ID */
                @ApiField("sku_property_id")
            private Long skuPropertyId;
        /** SKU属性别名 */
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
        public String getImageUrlList() {
    return this.imageUrlList;
    }
    public void setImageUrlList(String imageUrlList) {
    this.imageUrlList = imageUrlList;
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
        public String getSkuImage() {
    return this.skuImage;
    }
    public void setSkuImage(String skuImage) {
    this.skuImage = skuImage;
    }
    }