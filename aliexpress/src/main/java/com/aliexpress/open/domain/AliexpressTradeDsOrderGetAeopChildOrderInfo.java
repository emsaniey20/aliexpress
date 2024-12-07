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

public class AliexpressTradeDsOrderGetAeopChildOrderInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** product id */
                @ApiField("product_id")
            private Long productId;
        /** product price */
                @ApiField("product_price")
            private AliexpressTradeDsOrderGetSimpleMoney productPrice;
        /** product name */
                @ApiField("product_name")
            private String productName;
        /** number of products */
                @ApiField("product_count")
            private Integer productCount;
    
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public AliexpressTradeDsOrderGetSimpleMoney getProductPrice() {
    return this.productPrice;
    }
    public void setProductPrice(AliexpressTradeDsOrderGetSimpleMoney productPrice) {
    this.productPrice = productPrice;
    }
        public String getProductName() {
    return this.productName;
    }
    public void setProductName(String productName) {
    this.productName = productName;
    }
        public Integer getProductCount() {
    return this.productCount;
    }
    public void setProductCount(Integer productCount) {
    this.productCount = productCount;
    }
    }