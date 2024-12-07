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

public class AliexpressSocialShoppingOrderConfirmShopcartQueryBundleItem implements Serializable {
    private static final long serialVersionUID = 1L;
        /** item id */
                @ApiField("product_id")
            private String productId;
        /** quantity */
                @ApiField("quantity")
            private Integer quantity;
        /** sku */
                @ApiField("sku_attr")
            private String skuAttr;
    
        public String getProductId() {
    return this.productId;
    }
    public void setProductId(String productId) {
    this.productId = productId;
    }
        public Integer getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Integer quantity) {
    this.quantity = quantity;
    }
        public String getSkuAttr() {
    return this.skuAttr;
    }
    public void setSkuAttr(String skuAttr) {
    this.skuAttr = skuAttr;
    }
    }