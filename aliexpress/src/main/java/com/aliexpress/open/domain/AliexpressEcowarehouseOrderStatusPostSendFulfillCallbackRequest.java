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

public class AliexpressEcowarehouseOrderStatusPostSendFulfillCallbackRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("ae_trade_order_id")
            private String aeTradeOrderId;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("out_biz_id")
            private String outBizId;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("order_create_time")
            private Long orderCreateTime;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("warehouse_customer_id")
            private String warehouseCustomerId;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiListField("package_list")
            private List<AliexpressEcowarehouseOrderStatusPostSendPackage> packageList;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("warehouse_code")
            private String warehouseCode;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("event_code")
            private String eventCode;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("order_status_name")
            private String orderStatusName;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("reject_reason")
            private String rejectReason;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("order_update_time")
            private Long orderUpdateTime;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("event_time")
            private Long eventTime;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("order_status_code")
            private String orderStatusCode;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("order_outbound_time")
            private Long orderOutboundTime;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("wms_order_id")
            private String wmsOrderId;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("error_code")
            private String errorCode;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("owner_id")
            private String ownerId;
    
        public String getAeTradeOrderId() {
    return this.aeTradeOrderId;
    }
    public void setAeTradeOrderId(String aeTradeOrderId) {
    this.aeTradeOrderId = aeTradeOrderId;
    }
        public String getOutBizId() {
    return this.outBizId;
    }
    public void setOutBizId(String outBizId) {
    this.outBizId = outBizId;
    }
        public Long getOrderCreateTime() {
    return this.orderCreateTime;
    }
    public void setOrderCreateTime(Long orderCreateTime) {
    this.orderCreateTime = orderCreateTime;
    }
        public String getWarehouseCustomerId() {
    return this.warehouseCustomerId;
    }
    public void setWarehouseCustomerId(String warehouseCustomerId) {
    this.warehouseCustomerId = warehouseCustomerId;
    }
        public List<AliexpressEcowarehouseOrderStatusPostSendPackage> getPackageList() {
    return this.packageList;
    }
    public void setPackageList(List<AliexpressEcowarehouseOrderStatusPostSendPackage> packageList) {
    this.packageList = packageList;
    }
        public String getWarehouseCode() {
    return this.warehouseCode;
    }
    public void setWarehouseCode(String warehouseCode) {
    this.warehouseCode = warehouseCode;
    }
        public String getEventCode() {
    return this.eventCode;
    }
    public void setEventCode(String eventCode) {
    this.eventCode = eventCode;
    }
        public String getOrderStatusName() {
    return this.orderStatusName;
    }
    public void setOrderStatusName(String orderStatusName) {
    this.orderStatusName = orderStatusName;
    }
        public String getRejectReason() {
    return this.rejectReason;
    }
    public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
    }
        public Long getOrderUpdateTime() {
    return this.orderUpdateTime;
    }
    public void setOrderUpdateTime(Long orderUpdateTime) {
    this.orderUpdateTime = orderUpdateTime;
    }
        public Long getEventTime() {
    return this.eventTime;
    }
    public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
    }
        public String getOrderStatusCode() {
    return this.orderStatusCode;
    }
    public void setOrderStatusCode(String orderStatusCode) {
    this.orderStatusCode = orderStatusCode;
    }
        public Long getOrderOutboundTime() {
    return this.orderOutboundTime;
    }
    public void setOrderOutboundTime(Long orderOutboundTime) {
    this.orderOutboundTime = orderOutboundTime;
    }
        public String getWmsOrderId() {
    return this.wmsOrderId;
    }
    public void setWmsOrderId(String wmsOrderId) {
    this.wmsOrderId = wmsOrderId;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getOwnerId() {
    return this.ownerId;
    }
    public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
    }
    }