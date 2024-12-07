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

public class AliexpressTradeDsOrderGetAeopOrderInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** order creation time */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** order status */
                @ApiField("order_status")
            private String orderStatus;
        /** logistics status */
                @ApiField("logistics_status")
            private String logisticsStatus;
        /** order amount */
                @ApiField("order_amount")
            private AliexpressTradeDsOrderGetSimpleMoney orderAmount;
        /** child order list */
                @ApiListField("child_order_list")
            private List<AliexpressTradeDsOrderGetAeopChildOrderInfo> childOrderList;
        /** order logistics information list */
                @ApiListField("logistics_info_list")
            private List<AliexpressTradeDsOrderGetAeopOrderLogisticsInfo> logisticsInfoList;
        /** store Information */
                @ApiField("store_info")
            private AliexpressTradeDsOrderGetAeopStoreInfo storeInfo;
    
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public String getLogisticsStatus() {
    return this.logisticsStatus;
    }
    public void setLogisticsStatus(String logisticsStatus) {
    this.logisticsStatus = logisticsStatus;
    }
        public AliexpressTradeDsOrderGetSimpleMoney getOrderAmount() {
    return this.orderAmount;
    }
    public void setOrderAmount(AliexpressTradeDsOrderGetSimpleMoney orderAmount) {
    this.orderAmount = orderAmount;
    }
        public List<AliexpressTradeDsOrderGetAeopChildOrderInfo> getChildOrderList() {
    return this.childOrderList;
    }
    public void setChildOrderList(List<AliexpressTradeDsOrderGetAeopChildOrderInfo> childOrderList) {
    this.childOrderList = childOrderList;
    }
        public List<AliexpressTradeDsOrderGetAeopOrderLogisticsInfo> getLogisticsInfoList() {
    return this.logisticsInfoList;
    }
    public void setLogisticsInfoList(List<AliexpressTradeDsOrderGetAeopOrderLogisticsInfo> logisticsInfoList) {
    this.logisticsInfoList = logisticsInfoList;
    }
        public AliexpressTradeDsOrderGetAeopStoreInfo getStoreInfo() {
    return this.storeInfo;
    }
    public void setStoreInfo(AliexpressTradeDsOrderGetAeopStoreInfo storeInfo) {
    this.storeInfo = storeInfo;
    }
    }