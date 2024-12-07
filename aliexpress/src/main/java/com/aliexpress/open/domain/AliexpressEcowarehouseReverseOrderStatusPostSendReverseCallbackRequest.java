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

public class AliexpressEcowarehouseReverseOrderStatusPostSendReverseCallbackRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** warehouse_customer_id */
                @ApiField("warehouse_customer_id")
            private String warehouseCustomerId;
        /** ae_trade_order_id */
                @ApiField("ae_trade_order_id")
            private String aeTradeOrderId;
        /** goods_owner_id */
                @ApiField("goods_owner_id")
            private String goodsOwnerId;
        /** out_biz_id */
                @ApiField("out_biz_id")
            private String outBizId;
        /** wms_order_id */
                @ApiField("wms_order_id")
            private String wmsOrderId;
        /** order_status_code */
                @ApiField("order_status_code")
            private String orderStatusCode;
        /** order_status_name */
                @ApiField("order_status_name")
            private String orderStatusName;
        /** event_code */
                @ApiField("event_code")
            private String eventCode;
        /** error_code */
                @ApiField("error_code")
            private String errorCode;
        /** event_time */
                @ApiField("event_time")
            private Long eventTime;
        /** reject_reason */
                @ApiField("reject_reason")
            private String rejectReason;
        /** order_create_time */
                @ApiField("order_create_time")
            private Long orderCreateTime;
        /** order_update_time */
                @ApiField("order_update_time")
            private Long orderUpdateTime;
        /** warehouse_code */
                @ApiField("warehouse_code")
            private String warehouseCode;
        /** logistic_param */
                @ApiField("logistic_param")
            private AliexpressEcowarehouseReverseOrderStatusPostLogisticParam logisticParam;
        /** item_list */
                @ApiListField("item_list")
            private List<AliexpressEcowarehouseReverseOrderStatusPostString> itemList;
        /** 为true表示为照片只拍摄整单维度 */
                @ApiField("pic_for_whole_pkg")
            private String picForWholePkg;
    
        public String getWarehouseCustomerId() {
    return this.warehouseCustomerId;
    }
    public void setWarehouseCustomerId(String warehouseCustomerId) {
    this.warehouseCustomerId = warehouseCustomerId;
    }
        public String getAeTradeOrderId() {
    return this.aeTradeOrderId;
    }
    public void setAeTradeOrderId(String aeTradeOrderId) {
    this.aeTradeOrderId = aeTradeOrderId;
    }
        public String getGoodsOwnerId() {
    return this.goodsOwnerId;
    }
    public void setGoodsOwnerId(String goodsOwnerId) {
    this.goodsOwnerId = goodsOwnerId;
    }
        public String getOutBizId() {
    return this.outBizId;
    }
    public void setOutBizId(String outBizId) {
    this.outBizId = outBizId;
    }
        public String getWmsOrderId() {
    return this.wmsOrderId;
    }
    public void setWmsOrderId(String wmsOrderId) {
    this.wmsOrderId = wmsOrderId;
    }
        public String getOrderStatusCode() {
    return this.orderStatusCode;
    }
    public void setOrderStatusCode(String orderStatusCode) {
    this.orderStatusCode = orderStatusCode;
    }
        public String getOrderStatusName() {
    return this.orderStatusName;
    }
    public void setOrderStatusName(String orderStatusName) {
    this.orderStatusName = orderStatusName;
    }
        public String getEventCode() {
    return this.eventCode;
    }
    public void setEventCode(String eventCode) {
    this.eventCode = eventCode;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public Long getEventTime() {
    return this.eventTime;
    }
    public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
    }
        public String getRejectReason() {
    return this.rejectReason;
    }
    public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
    }
        public Long getOrderCreateTime() {
    return this.orderCreateTime;
    }
    public void setOrderCreateTime(Long orderCreateTime) {
    this.orderCreateTime = orderCreateTime;
    }
        public Long getOrderUpdateTime() {
    return this.orderUpdateTime;
    }
    public void setOrderUpdateTime(Long orderUpdateTime) {
    this.orderUpdateTime = orderUpdateTime;
    }
        public String getWarehouseCode() {
    return this.warehouseCode;
    }
    public void setWarehouseCode(String warehouseCode) {
    this.warehouseCode = warehouseCode;
    }
        public AliexpressEcowarehouseReverseOrderStatusPostLogisticParam getLogisticParam() {
    return this.logisticParam;
    }
    public void setLogisticParam(AliexpressEcowarehouseReverseOrderStatusPostLogisticParam logisticParam) {
    this.logisticParam = logisticParam;
    }
        public List<AliexpressEcowarehouseReverseOrderStatusPostString> getItemList() {
    return this.itemList;
    }
    public void setItemList(List<AliexpressEcowarehouseReverseOrderStatusPostString> itemList) {
    this.itemList = itemList;
    }
        public String getPicForWholePkg() {
    return this.picForWholePkg;
    }
    public void setPicForWholePkg(String picForWholePkg) {
    this.picForWholePkg = picForWholePkg;
    }
    }