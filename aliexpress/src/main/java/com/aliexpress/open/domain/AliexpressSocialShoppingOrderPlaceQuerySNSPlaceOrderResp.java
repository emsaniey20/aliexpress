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

public class AliexpressSocialShoppingOrderPlaceQuerySNSPlaceOrderResp implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Biz type */
                @ApiField("biz_type")
            private String bizType;
        /** cashier token */
                @ApiField("cashier_token")
            private String cashierToken;
        /** {} */
                @ApiField("order_amount")
            private AliexpressSocialShoppingOrderPlaceQueryOrderAmount orderAmount;
        /** created order ids list */
                @ApiListField("order_ids")
            private List<Long> orderIds;
        /** Payment gateway */
                @ApiField("payment_gateway")
            private String paymentGateway;
        /** Description of placed orders */
                @ApiListField("placed_orders")
            private List<AliexpressSocialShoppingOrderPlaceQuerySnsOrderDTO> placedOrders;
    
        public String getBizType() {
    return this.bizType;
    }
    public void setBizType(String bizType) {
    this.bizType = bizType;
    }
        public String getCashierToken() {
    return this.cashierToken;
    }
    public void setCashierToken(String cashierToken) {
    this.cashierToken = cashierToken;
    }
        public AliexpressSocialShoppingOrderPlaceQueryOrderAmount getOrderAmount() {
    return this.orderAmount;
    }
    public void setOrderAmount(AliexpressSocialShoppingOrderPlaceQueryOrderAmount orderAmount) {
    this.orderAmount = orderAmount;
    }
        public List<Long> getOrderIds() {
    return this.orderIds;
    }
    public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
    }
        public String getPaymentGateway() {
    return this.paymentGateway;
    }
    public void setPaymentGateway(String paymentGateway) {
    this.paymentGateway = paymentGateway;
    }
        public List<AliexpressSocialShoppingOrderPlaceQuerySnsOrderDTO> getPlacedOrders() {
    return this.placedOrders;
    }
    public void setPlacedOrders(List<AliexpressSocialShoppingOrderPlaceQuerySnsOrderDTO> placedOrders) {
    this.placedOrders = placedOrders;
    }
    }