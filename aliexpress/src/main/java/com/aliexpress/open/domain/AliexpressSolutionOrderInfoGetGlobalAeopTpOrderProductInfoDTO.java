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

public class AliexpressSolutionOrderInfoGetGlobalAeopTpOrderProductInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** product quantity */
                @ApiField("quantity")
            private Long quantity;
        /** product unit price */
                @ApiField("unit_price")
            private AliexpressSolutionOrderInfoGetGlobalMoneyStr unitPrice;
        /** product SKU details */
                @ApiField("sku")
            private String sku;
        /** product name */
                @ApiField("product_name")
            private String productName;
        /** product id */
                @ApiField("product_id")
            private Long productId;
        /** Leaf category Id of the product */
                @ApiField("category_id")
            private String categoryId;
    
        public Long getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Long quantity) {
    this.quantity = quantity;
    }
        public AliexpressSolutionOrderInfoGetGlobalMoneyStr getUnitPrice() {
    return this.unitPrice;
    }
    public void setUnitPrice(AliexpressSolutionOrderInfoGetGlobalMoneyStr unitPrice) {
    this.unitPrice = unitPrice;
    }
        public String getSku() {
    return this.sku;
    }
    public void setSku(String sku) {
    this.sku = sku;
    }
        public String getProductName() {
    return this.productName;
    }
    public void setProductName(String productName) {
    this.productName = productName;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
    }
    }