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

public class AliexpressEcowarehouseReturnOrderStatusPostWarehouseReturnCallbackRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 退仓单ID */
                @ApiField("out_biz_id")
            private String outBizId;
        /** 易仓多租户路由ID，自研系统为固定值 */
                @ApiField("warehouse_customer_id")
            private String warehouseCustomerId;
        /** 状态码 */
                @ApiField("event_code")
            private String eventCode;
        /** 货主ID */
                @ApiField("goods_owner_id")
            private String goodsOwnerId;
        /** 时间戳 */
                @ApiField("time_stamp")
            private Long timeStamp;
        /** 寄送服务商 */
                @ApiField("shipping_provider")
            private String shippingProvider;
        /** 寄送运单号 */
                @ApiField("tracking_numbers")
            private String trackingNumbers;
        /** 拒单原因 */
                @ApiField("reject_reason")
            private String rejectReason;
    
        public String getOutBizId() {
    return this.outBizId;
    }
    public void setOutBizId(String outBizId) {
    this.outBizId = outBizId;
    }
        public String getWarehouseCustomerId() {
    return this.warehouseCustomerId;
    }
    public void setWarehouseCustomerId(String warehouseCustomerId) {
    this.warehouseCustomerId = warehouseCustomerId;
    }
        public String getEventCode() {
    return this.eventCode;
    }
    public void setEventCode(String eventCode) {
    this.eventCode = eventCode;
    }
        public String getGoodsOwnerId() {
    return this.goodsOwnerId;
    }
    public void setGoodsOwnerId(String goodsOwnerId) {
    this.goodsOwnerId = goodsOwnerId;
    }
        public Long getTimeStamp() {
    return this.timeStamp;
    }
    public void setTimeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
    }
        public String getShippingProvider() {
    return this.shippingProvider;
    }
    public void setShippingProvider(String shippingProvider) {
    this.shippingProvider = shippingProvider;
    }
        public String getTrackingNumbers() {
    return this.trackingNumbers;
    }
    public void setTrackingNumbers(String trackingNumbers) {
    this.trackingNumbers = trackingNumbers;
    }
        public String getRejectReason() {
    return this.rejectReason;
    }
    public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
    }
    }