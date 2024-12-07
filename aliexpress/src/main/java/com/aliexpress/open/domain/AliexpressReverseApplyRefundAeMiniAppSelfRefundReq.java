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

public class AliexpressReverseApplyRefundAeMiniAppSelfRefundReq implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 业务场景 */
                @ApiField("bizCode")
            private String bizCode;
        /** 订单号 */
                @ApiField("tradeOrderId")
            private String tradeOrderId;
        /** 金额，单位分 */
                @ApiField("refundAmount")
            private String refundAmount;
        /** 币种 */
                @ApiField("currency")
            private String currency;
        /** 语言 */
                @ApiField("lang")
            private String lang;
    
        public String getBizCode() {
    return this.bizCode;
    }
    public void setBizCode(String bizCode) {
    this.bizCode = bizCode;
    }
        public String getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(String tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
        public String getRefundAmount() {
    return this.refundAmount;
    }
    public void setRefundAmount(String refundAmount) {
    this.refundAmount = refundAmount;
    }
        public String getCurrency() {
    return this.currency;
    }
    public void setCurrency(String currency) {
    this.currency = currency;
    }
        public String getLang() {
    return this.lang;
    }
    public void setLang(String lang) {
    this.lang = lang;
    }
    }