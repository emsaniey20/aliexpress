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

public class AliexpressSocialProductFulldetailQuerySkuInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** if the product has several skus */
                @ApiField("has_sku_property")
            private Boolean hasSkuProperty;
        /** product properties */
                @ApiListField("product_s_k_u_property_list")
            private List<AliexpressSocialProductFulldetailQueryProductSKUProperty> productSKUPropertyList;
        /** all properties of sku */
                @ApiField("sku_property_json")
            private String skuPropertyJson;
    
        public Boolean getHasSkuProperty() {
    return this.hasSkuProperty;
    }
    public void setHasSkuProperty(Boolean hasSkuProperty) {
    this.hasSkuProperty = hasSkuProperty;
    }
        public List<AliexpressSocialProductFulldetailQueryProductSKUProperty> getProductSKUPropertyList() {
    return this.productSKUPropertyList;
    }
    public void setProductSKUPropertyList(List<AliexpressSocialProductFulldetailQueryProductSKUProperty> productSKUPropertyList) {
    this.productSKUPropertyList = productSKUPropertyList;
    }
        public String getSkuPropertyJson() {
    return this.skuPropertyJson;
    }
    public void setSkuPropertyJson(String skuPropertyJson) {
    this.skuPropertyJson = skuPropertyJson;
    }
    }