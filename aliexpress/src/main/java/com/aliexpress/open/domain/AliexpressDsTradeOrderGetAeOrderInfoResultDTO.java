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

public class AliexpressDsTradeOrderGetAeOrderInfoResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Order amount */
                @ApiField("order_amount")
            private AliexpressDsTradeOrderGetSimpleMoney orderAmount;
        /** Order Status */
                @ApiField("order_status")
            private String orderStatus;
        /** Order logistics information list */
                @ApiListField("logistics_info_list")
            private List<AliexpressDsTradeOrderGetAeOrderLogisticsInfo> logisticsInfoList;
        /** Store Information */
                @ApiField("store_info")
            private AliexpressDsTradeOrderGetAeStoreSimpleInfo storeInfo;
        /** Sub-order list */
                @ApiListField("child_order_list")
            private List<AliexpressDsTradeOrderGetAeChildOrderInfo> childOrderList;
    
        public AliexpressDsTradeOrderGetSimpleMoney getOrderAmount() {
    return this.orderAmount;
    }
    public void setOrderAmount(AliexpressDsTradeOrderGetSimpleMoney orderAmount) {
    this.orderAmount = orderAmount;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public List<AliexpressDsTradeOrderGetAeOrderLogisticsInfo> getLogisticsInfoList() {
    return this.logisticsInfoList;
    }
    public void setLogisticsInfoList(List<AliexpressDsTradeOrderGetAeOrderLogisticsInfo> logisticsInfoList) {
    this.logisticsInfoList = logisticsInfoList;
    }
        public AliexpressDsTradeOrderGetAeStoreSimpleInfo getStoreInfo() {
    return this.storeInfo;
    }
    public void setStoreInfo(AliexpressDsTradeOrderGetAeStoreSimpleInfo storeInfo) {
    this.storeInfo = storeInfo;
    }
        public List<AliexpressDsTradeOrderGetAeChildOrderInfo> getChildOrderList() {
    return this.childOrderList;
    }
    public void setChildOrderList(List<AliexpressDsTradeOrderGetAeChildOrderInfo> childOrderList) {
    this.childOrderList = childOrderList;
    }
    }