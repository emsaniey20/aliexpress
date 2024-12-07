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

public class AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpOrderProductInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("quantity")
            private Integer quantity;
        /** 1 */
                @ApiField("product_id")
            private Long productId;
        /** 1 */
                @ApiField("sku")
            private String sku;
        /** 1 */
                @ApiField("category_id")
            private String categoryId;
        /** 1 */
                @ApiField("product_name")
            private String productName;
        /** 1 */
                @ApiField("unit_price")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr unitPrice;
    
        public Integer getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Integer quantity) {
    this.quantity = quantity;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getSku() {
    return this.sku;
    }
    public void setSku(String sku) {
    this.sku = sku;
    }
        public String getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
    }
        public String getProductName() {
    return this.productName;
    }
    public void setProductName(String productName) {
    this.productName = productName;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getUnitPrice() {
    return this.unitPrice;
    }
    public void setUnitPrice(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr unitPrice) {
    this.unitPrice = unitPrice;
    }
    }