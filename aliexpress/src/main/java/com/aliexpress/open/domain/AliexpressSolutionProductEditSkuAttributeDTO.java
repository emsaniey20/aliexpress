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

public class AliexpressSolutionProductEditSkuAttributeDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Deprecated, please use sku_attribute_name_id. To obtain the available sku attribute names under a specific category, please check API: aliexpress.solution.sku.attribute.query */
                @ApiField("sku_attribute_name")
            private String skuAttributeName;
        /** Customized sku attribute value by sellers, do not include these 4 symbols { # : = , }.maximum 70 characters. */
                @ApiField("sku_attribute_value")
            private String skuAttributeValue;
        /** Image that will represent the variation of the product. The url can point to a seller's server or to AliExpress photobank. In order to obtain more information about the photobank and how to upload images, please visit the following page: https://developers.aliexpress.com/en/doc.htm?docId=30186&docType=2 */
                @ApiField("sku_image")
            private String skuImage;
        /** Please refer to https://developers.aliexpress.com/en/doc.htm?docId=29988&docType=2 to obtain the sku_attribute_value_id under specific category */
                @ApiField("sku_attribute_value_id")
            private Long skuAttributeValueId;
        /** Please refer to https://developers.aliexpress.com/en/doc.htm?docId=29988&docType=2 to obtain the sku_attribute_name_id under specific category */
                @ApiField("sku_attribute_name_id")
            private Long skuAttributeNameId;
    
        public String getSkuAttributeName() {
    return this.skuAttributeName;
    }
    public void setSkuAttributeName(String skuAttributeName) {
    this.skuAttributeName = skuAttributeName;
    }
        public String getSkuAttributeValue() {
    return this.skuAttributeValue;
    }
    public void setSkuAttributeValue(String skuAttributeValue) {
    this.skuAttributeValue = skuAttributeValue;
    }
        public String getSkuImage() {
    return this.skuImage;
    }
    public void setSkuImage(String skuImage) {
    this.skuImage = skuImage;
    }
        public Long getSkuAttributeValueId() {
    return this.skuAttributeValueId;
    }
    public void setSkuAttributeValueId(Long skuAttributeValueId) {
    this.skuAttributeValueId = skuAttributeValueId;
    }
        public Long getSkuAttributeNameId() {
    return this.skuAttributeNameId;
    }
    public void setSkuAttributeNameId(Long skuAttributeNameId) {
    this.skuAttributeNameId = skuAttributeNameId;
    }
    }