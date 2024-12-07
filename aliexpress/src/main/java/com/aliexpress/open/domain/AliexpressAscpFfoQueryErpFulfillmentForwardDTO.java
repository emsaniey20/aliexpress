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

public class AliexpressAscpFfoQueryErpFulfillmentForwardDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 订单产生时间戳 */
                @ApiField("trade_create_time")
            private Long tradeCreateTime;
        /** 发货金额 */
                @ApiField("package_paid_fee")
            private String packagePaidFee;
        /** 收货地区 */
                @ApiField("receiver_country")
            private String receiverCountry;
        /** 收货人电话 */
                @ApiField("receiver_phone")
            private String receiverPhone;
        /** 收货人手机 */
                @ApiField("receiver_mobile")
            private String receiverMobile;
        /** 收货人姓名 */
                @ApiField("receiver_name")
            private String receiverName;
        /** 买家昵称 */
                @ApiField("buyer_name")
            private String buyerName;
        /** 运单号 */
                @ApiField("tracking_no")
            private String trackingNo;
        /** 物流单号 */
                @ApiField("lbx_no")
            private String lbxNo;
        /** 履约单号 */
                @ApiField("fulfillment_order_no")
            private String fulfillmentOrderNo;
        /** 用户订单号 */
                @ApiField("trade_order_no")
            private String tradeOrderNo;
        /** 仓名称 */
                @ApiField("warehouse_name")
            private String warehouseName;
        /** 出库时间戳 */
                @ApiField("out_bound_time")
            private Long outBoundTime;
        /** 下发到仓时间戳 */
                @ApiField("send_fulfill_time")
            private Long sendFulfillTime;
        /** 订单状态 */
                @ApiField("order_status")
            private String orderStatus;
        /** 扩展字段 */
                @ApiField("extend_fields")
            private String extendFields;
    
        public Long getTradeCreateTime() {
    return this.tradeCreateTime;
    }
    public void setTradeCreateTime(Long tradeCreateTime) {
    this.tradeCreateTime = tradeCreateTime;
    }
        public String getPackagePaidFee() {
    return this.packagePaidFee;
    }
    public void setPackagePaidFee(String packagePaidFee) {
    this.packagePaidFee = packagePaidFee;
    }
        public String getReceiverCountry() {
    return this.receiverCountry;
    }
    public void setReceiverCountry(String receiverCountry) {
    this.receiverCountry = receiverCountry;
    }
        public String getReceiverPhone() {
    return this.receiverPhone;
    }
    public void setReceiverPhone(String receiverPhone) {
    this.receiverPhone = receiverPhone;
    }
        public String getReceiverMobile() {
    return this.receiverMobile;
    }
    public void setReceiverMobile(String receiverMobile) {
    this.receiverMobile = receiverMobile;
    }
        public String getReceiverName() {
    return this.receiverName;
    }
    public void setReceiverName(String receiverName) {
    this.receiverName = receiverName;
    }
        public String getBuyerName() {
    return this.buyerName;
    }
    public void setBuyerName(String buyerName) {
    this.buyerName = buyerName;
    }
        public String getTrackingNo() {
    return this.trackingNo;
    }
    public void setTrackingNo(String trackingNo) {
    this.trackingNo = trackingNo;
    }
        public String getLbxNo() {
    return this.lbxNo;
    }
    public void setLbxNo(String lbxNo) {
    this.lbxNo = lbxNo;
    }
        public String getFulfillmentOrderNo() {
    return this.fulfillmentOrderNo;
    }
    public void setFulfillmentOrderNo(String fulfillmentOrderNo) {
    this.fulfillmentOrderNo = fulfillmentOrderNo;
    }
        public String getTradeOrderNo() {
    return this.tradeOrderNo;
    }
    public void setTradeOrderNo(String tradeOrderNo) {
    this.tradeOrderNo = tradeOrderNo;
    }
        public String getWarehouseName() {
    return this.warehouseName;
    }
    public void setWarehouseName(String warehouseName) {
    this.warehouseName = warehouseName;
    }
        public Long getOutBoundTime() {
    return this.outBoundTime;
    }
    public void setOutBoundTime(Long outBoundTime) {
    this.outBoundTime = outBoundTime;
    }
        public Long getSendFulfillTime() {
    return this.sendFulfillTime;
    }
    public void setSendFulfillTime(Long sendFulfillTime) {
    this.sendFulfillTime = sendFulfillTime;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public String getExtendFields() {
    return this.extendFields;
    }
    public void setExtendFields(String extendFields) {
    this.extendFields = extendFields;
    }
    }