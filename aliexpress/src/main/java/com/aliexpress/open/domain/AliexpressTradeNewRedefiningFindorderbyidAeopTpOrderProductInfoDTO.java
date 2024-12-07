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

public class AliexpressTradeNewRedefiningFindorderbyidAeopTpOrderProductInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品ID */
                @ApiField("product_id")
            private Long productId;
        /** 商品名称 */
                @ApiField("product_name")
            private String productName;
        /** 商品数量 */
                @ApiField("quantity")
            private Long quantity;
        /** 商品SKU */
                @ApiField("sku")
            private String sku;
        /** 商品单价 */
                @ApiField("unit_price")
            private AliexpressTradeNewRedefiningFindorderbyidMoneyStr unitPrice;
        /** 类目id */
                @ApiField("category_id")
            private String categoryId;
    
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getProductName() {
    return this.productName;
    }
    public void setProductName(String productName) {
    this.productName = productName;
    }
        public Long getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Long quantity) {
    this.quantity = quantity;
    }
        public String getSku() {
    return this.sku;
    }
    public void setSku(String sku) {
    this.sku = sku;
    }
        public AliexpressTradeNewRedefiningFindorderbyidMoneyStr getUnitPrice() {
    return this.unitPrice;
    }
    public void setUnitPrice(AliexpressTradeNewRedefiningFindorderbyidMoneyStr unitPrice) {
    this.unitPrice = unitPrice;
    }
        public String getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
    }
    }