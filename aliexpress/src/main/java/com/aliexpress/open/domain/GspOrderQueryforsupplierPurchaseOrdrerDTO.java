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

public class GspOrderQueryforsupplierPurchaseOrdrerDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 支付状态  UnPayed Payed Paying PayFailed PayCanceled */
                @ApiField("paymentStatus")
            private String paymentStatus;
        /** 总金额，单位：分 */
                @ApiField("totalPrice")
            private String totalPrice;
        /** 币种  USD RMB */
                @ApiField("currency")
            private String currency;
        /** AE_OVERSEA_WAREHOUSE等 */
                @ApiField("supplyType")
            private String supplyType;
        /** 采购子单 */
                @ApiListField("orderLines")
            private List<GspOrderQueryforsupplierPurchaseOrdrerLineDTO> orderLines;
        /** 采购单ID */
                @ApiField("id")
            private String id;
        /** 格式: yyyy-MM-dd hh:mm:ss, 当saleMarket为AE时，该时间为美国太平洋时间； */
                @ApiField("createdTime")
            private String createdTime;
        /** 格式: yyyy-MM-dd hh:mm:ss, 当saleMarket为AE时，该时间为美国太平洋时间 */
                @ApiField("payTime")
            private String payTime;
        /** 履约状态  Created Payed Shipped InBound OutBound Canceled */
                @ApiField("status")
            private String status;
    
        public String getPaymentStatus() {
    return this.paymentStatus;
    }
    public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
    }
        public String getTotalPrice() {
    return this.totalPrice;
    }
    public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
    }
        public String getCurrency() {
    return this.currency;
    }
    public void setCurrency(String currency) {
    this.currency = currency;
    }
        public String getSupplyType() {
    return this.supplyType;
    }
    public void setSupplyType(String supplyType) {
    this.supplyType = supplyType;
    }
        public List<GspOrderQueryforsupplierPurchaseOrdrerLineDTO> getOrderLines() {
    return this.orderLines;
    }
    public void setOrderLines(List<GspOrderQueryforsupplierPurchaseOrdrerLineDTO> orderLines) {
    this.orderLines = orderLines;
    }
        public String getId() {
    return this.id;
    }
    public void setId(String id) {
    this.id = id;
    }
        public String getCreatedTime() {
    return this.createdTime;
    }
    public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
    }
        public String getPayTime() {
    return this.payTime;
    }
    public void setPayTime(String payTime) {
    this.payTime = payTime;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
    }