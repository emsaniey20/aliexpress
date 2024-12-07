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

public class AliexpressReverseApplyCancelAeMiniAppCancelOrderReq implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 业务场景 */
                @ApiField("bizCode")
            private String bizCode;
        /** 语言 */
                @ApiField("locale")
            private String locale;
        /** AE侧订单号 */
                @ApiField("tradeOrderId")
            private Long tradeOrderId;
        /** 退款方式 */
                @ApiField("refundPaymentMethodType")
            private String refundPaymentMethodType;
        /** 关单原因 */
                @ApiField("cancelReason")
            private String cancelReason;
        /** 关单动作，QD调用可以填写特定值QDCancel */
                @ApiField("cancelEvent")
            private String cancelEvent;
    
        public String getBizCode() {
    return this.bizCode;
    }
    public void setBizCode(String bizCode) {
    this.bizCode = bizCode;
    }
        public String getLocale() {
    return this.locale;
    }
    public void setLocale(String locale) {
    this.locale = locale;
    }
        public Long getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
        public String getRefundPaymentMethodType() {
    return this.refundPaymentMethodType;
    }
    public void setRefundPaymentMethodType(String refundPaymentMethodType) {
    this.refundPaymentMethodType = refundPaymentMethodType;
    }
        public String getCancelReason() {
    return this.cancelReason;
    }
    public void setCancelReason(String cancelReason) {
    this.cancelReason = cancelReason;
    }
        public String getCancelEvent() {
    return this.cancelEvent;
    }
    public void setCancelEvent(String cancelEvent) {
    this.cancelEvent = cancelEvent;
    }
    }