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

public class AliexpressAscpFroQueryString implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 用户订单号 */
                @ApiField("trade_order_no")
            private String tradeOrderNo;
        /** 履约单号 */
                @ApiField("fulfillment_order_no")
            private String fulfillmentOrderNo;
        /** 原物流单号 */
                @ApiField("original_lbx_no")
            private String originalLbxNo;
        /** 物流单号 */
                @ApiField("lbx_no")
            private String lbxNo;
        /** 收货人姓名 */
                @ApiField("receiver_name")
            private String receiverName;
        /** 收货人手机 */
                @ApiField("receiver_mobile")
            private String receiverMobile;
        /** 物流公司 */
                @ApiField("shipping_provider_name")
            private String shippingProviderName;
        /** 运单号 */
                @ApiField("tracking_number")
            private String trackingNumber;
        /** 退货下单时间戳 */
                @ApiField("return_order_create_time")
            private Long returnOrderCreateTime;
        /** 退货入库时间戳 */
                @ApiField("return_order_inbound_time")
            private Long returnOrderInboundTime;
        /** 订单状态 */
                @ApiField("order_status")
            private String orderStatus;
        /** 退货类型 */
                @ApiField("order_type")
            private String orderType;
        /** 扩展字段 */
                @ApiField("extend_fields")
            private String extendFields;
    
        public String getTradeOrderNo() {
    return this.tradeOrderNo;
    }
    public void setTradeOrderNo(String tradeOrderNo) {
    this.tradeOrderNo = tradeOrderNo;
    }
        public String getFulfillmentOrderNo() {
    return this.fulfillmentOrderNo;
    }
    public void setFulfillmentOrderNo(String fulfillmentOrderNo) {
    this.fulfillmentOrderNo = fulfillmentOrderNo;
    }
        public String getOriginalLbxNo() {
    return this.originalLbxNo;
    }
    public void setOriginalLbxNo(String originalLbxNo) {
    this.originalLbxNo = originalLbxNo;
    }
        public String getLbxNo() {
    return this.lbxNo;
    }
    public void setLbxNo(String lbxNo) {
    this.lbxNo = lbxNo;
    }
        public String getReceiverName() {
    return this.receiverName;
    }
    public void setReceiverName(String receiverName) {
    this.receiverName = receiverName;
    }
        public String getReceiverMobile() {
    return this.receiverMobile;
    }
    public void setReceiverMobile(String receiverMobile) {
    this.receiverMobile = receiverMobile;
    }
        public String getShippingProviderName() {
    return this.shippingProviderName;
    }
    public void setShippingProviderName(String shippingProviderName) {
    this.shippingProviderName = shippingProviderName;
    }
        public String getTrackingNumber() {
    return this.trackingNumber;
    }
    public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    }
        public Long getReturnOrderCreateTime() {
    return this.returnOrderCreateTime;
    }
    public void setReturnOrderCreateTime(Long returnOrderCreateTime) {
    this.returnOrderCreateTime = returnOrderCreateTime;
    }
        public Long getReturnOrderInboundTime() {
    return this.returnOrderInboundTime;
    }
    public void setReturnOrderInboundTime(Long returnOrderInboundTime) {
    this.returnOrderInboundTime = returnOrderInboundTime;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public String getOrderType() {
    return this.orderType;
    }
    public void setOrderType(String orderType) {
    this.orderType = orderType;
    }
        public String getExtendFields() {
    return this.extendFields;
    }
    public void setExtendFields(String extendFields) {
    this.extendFields = extendFields;
    }
    }