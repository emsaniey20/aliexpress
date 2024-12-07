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

public class AliexpressOfferProductEditAeopSKUProperty implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 属性值自定义名称 */
                @ApiField("property_value_definition_name")
            private String propertyValueDefinitionName;
        /** SKU属性值ID */
                @ApiField("property_value_id")
            private Long propertyValueId;
        /** SKU图片地址 */
                @ApiField("sku_image")
            private String skuImage;
        /** SKU属性ID */
                @ApiField("sku_property_id")
            private Integer skuPropertyId;
        /** 女装类目sku套图,图片比例要求3:4,图片数量限制 : 3到6张图片。女装(200000345)下的叶子类目必传参数 */
                @ApiListField("image_url_list")
            private List<String> imageUrlList;
    
        public String getPropertyValueDefinitionName() {
    return this.propertyValueDefinitionName;
    }
    public void setPropertyValueDefinitionName(String propertyValueDefinitionName) {
    this.propertyValueDefinitionName = propertyValueDefinitionName;
    }
        public Long getPropertyValueId() {
    return this.propertyValueId;
    }
    public void setPropertyValueId(Long propertyValueId) {
    this.propertyValueId = propertyValueId;
    }
        public String getSkuImage() {
    return this.skuImage;
    }
    public void setSkuImage(String skuImage) {
    this.skuImage = skuImage;
    }
        public Integer getSkuPropertyId() {
    return this.skuPropertyId;
    }
    public void setSkuPropertyId(Integer skuPropertyId) {
    this.skuPropertyId = skuPropertyId;
    }
        public List<String> getImageUrlList() {
    return this.imageUrlList;
    }
    public void setImageUrlList(List<String> imageUrlList) {
    this.imageUrlList = imageUrlList;
    }
    }