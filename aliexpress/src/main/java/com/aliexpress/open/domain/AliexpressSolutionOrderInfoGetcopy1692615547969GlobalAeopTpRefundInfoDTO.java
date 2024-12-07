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

public class AliexpressSolutionOrderInfoGetcopy1692615547969GlobalAeopTpRefundInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** refund reason */
                @ApiField("refund_reason")
            private String refundReason;
        /** refund status: wait_refund, refund_ok, refund_cancel, close, refund_frozen */
                @ApiField("refund_status")
            private String refundStatus;
        /** refund coupon amount */
                @ApiField("refund_coupon_amt")
            private AliexpressSolutionOrderInfoGetcopy1692615547969GlobalMoneyStr refundCouponAmt;
        /** refund cash amount */
                @ApiField("refund_cash_amt")
            private AliexpressSolutionOrderInfoGetcopy1692615547969GlobalMoneyStr refundCashAmt;
        /** refund type */
                @ApiField("refund_type")
            private String refundType;
        /** refund time */
                @ApiField("refund_time")
            private String refundTime;
    
        public String getRefundReason() {
    return this.refundReason;
    }
    public void setRefundReason(String refundReason) {
    this.refundReason = refundReason;
    }
        public String getRefundStatus() {
    return this.refundStatus;
    }
    public void setRefundStatus(String refundStatus) {
    this.refundStatus = refundStatus;
    }
        public AliexpressSolutionOrderInfoGetcopy1692615547969GlobalMoneyStr getRefundCouponAmt() {
    return this.refundCouponAmt;
    }
    public void setRefundCouponAmt(AliexpressSolutionOrderInfoGetcopy1692615547969GlobalMoneyStr refundCouponAmt) {
    this.refundCouponAmt = refundCouponAmt;
    }
        public AliexpressSolutionOrderInfoGetcopy1692615547969GlobalMoneyStr getRefundCashAmt() {
    return this.refundCashAmt;
    }
    public void setRefundCashAmt(AliexpressSolutionOrderInfoGetcopy1692615547969GlobalMoneyStr refundCashAmt) {
    this.refundCashAmt = refundCashAmt;
    }
        public String getRefundType() {
    return this.refundType;
    }
    public void setRefundType(String refundType) {
    this.refundType = refundType;
    }
        public String getRefundTime() {
    return this.refundTime;
    }
    public void setRefundTime(String refundTime) {
    this.refundTime = refundTime;
    }
    }