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

public class CainiaoGlobalRedeliveryCommitAeopReRouteCommitResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 错误信息 */
                @ApiField("error_msg")
            private String errorMsg;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
        /** 交易订单ID */
                @ApiField("trade_order_id")
            private Long tradeOrderId;
        /** 国际运单号 */
                @ApiField("intl_tracking_no")
            private String intlTrackingNo;
        /** 物流单号（LP） */
                @ApiField("out_order_code")
            private String outOrderCode;
        /** 提示信息 */
                @ApiField("tips")
            private String tips;
    
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public Long getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
        public String getIntlTrackingNo() {
    return this.intlTrackingNo;
    }
    public void setIntlTrackingNo(String intlTrackingNo) {
    this.intlTrackingNo = intlTrackingNo;
    }
        public String getOutOrderCode() {
    return this.outOrderCode;
    }
    public void setOutOrderCode(String outOrderCode) {
    this.outOrderCode = outOrderCode;
    }
        public String getTips() {
    return this.tips;
    }
    public void setTips(String tips) {
    this.tips = tips;
    }
    }