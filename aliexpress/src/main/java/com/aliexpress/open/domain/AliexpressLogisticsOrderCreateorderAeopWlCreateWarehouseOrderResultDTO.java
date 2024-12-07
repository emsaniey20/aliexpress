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

public class AliexpressLogisticsOrderCreateorderAeopWlCreateWarehouseOrderResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** LP单号 */
                @ApiField("out_order_code")
            private String outOrderCode;
        /** 创建时错误码(1表示无错误) */
                @ApiField("error_code")
            private Long errorCode;
        /** 创建时错误信息 */
                @ApiField("error_desc")
            private String errorDesc;
        /** 国际运单号 */
                @ApiField("intl_tracking_no")
            private String intlTrackingNo;
        /** 外部订单号 */
                @ApiField("out_order_id")
            private Long outOrderId;
        /** 创建订单是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 订单来源 */
                @ApiField("trade_order_from")
            private String tradeOrderFrom;
        /** 交易订单号 */
                @ApiField("trade_order_id")
            private Long tradeOrderId;
        /** 物流订单号 */
                @ApiField("warehouse_order_id")
            private Long warehouseOrderId;
    
        public String getOutOrderCode() {
    return this.outOrderCode;
    }
    public void setOutOrderCode(String outOrderCode) {
    this.outOrderCode = outOrderCode;
    }
        public Long getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Long errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorDesc() {
    return this.errorDesc;
    }
    public void setErrorDesc(String errorDesc) {
    this.errorDesc = errorDesc;
    }
        public String getIntlTrackingNo() {
    return this.intlTrackingNo;
    }
    public void setIntlTrackingNo(String intlTrackingNo) {
    this.intlTrackingNo = intlTrackingNo;
    }
        public Long getOutOrderId() {
    return this.outOrderId;
    }
    public void setOutOrderId(Long outOrderId) {
    this.outOrderId = outOrderId;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getTradeOrderFrom() {
    return this.tradeOrderFrom;
    }
    public void setTradeOrderFrom(String tradeOrderFrom) {
    this.tradeOrderFrom = tradeOrderFrom;
    }
        public Long getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
        public Long getWarehouseOrderId() {
    return this.warehouseOrderId;
    }
    public void setWarehouseOrderId(Long warehouseOrderId) {
    this.warehouseOrderId = warehouseOrderId;
    }
    }