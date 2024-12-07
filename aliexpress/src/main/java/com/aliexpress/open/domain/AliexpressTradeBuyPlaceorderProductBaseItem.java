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

public class AliexpressTradeBuyPlaceorderProductBaseItem implements Serializable {
    private static final long serialVersionUID = 1L;
        /** product count */
                @ApiField("product_count")
            private Integer productCount;
        /** product id */
                @ApiField("product_id")
            private Long productId;
        /** product sku */
                @ApiField("sku_attr")
            private String skuAttr;
        /** logistics service name */
                @ApiField("logistics_service_name")
            private String logisticsServiceName;
        /** user Comments */
                @ApiField("order_memo")
            private String orderMemo;
    
        public Integer getProductCount() {
    return this.productCount;
    }
    public void setProductCount(Integer productCount) {
    this.productCount = productCount;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getSkuAttr() {
    return this.skuAttr;
    }
    public void setSkuAttr(String skuAttr) {
    this.skuAttr = skuAttr;
    }
        public String getLogisticsServiceName() {
    return this.logisticsServiceName;
    }
    public void setLogisticsServiceName(String logisticsServiceName) {
    this.logisticsServiceName = logisticsServiceName;
    }
        public String getOrderMemo() {
    return this.orderMemo;
    }
    public void setOrderMemo(String orderMemo) {
    this.orderMemo = orderMemo;
    }
    }