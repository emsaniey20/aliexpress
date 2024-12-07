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

public class AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpRefundInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("refund_type")
            private String refundType;
        /** 1 */
                @ApiField("refund_cash_amt")
            private String refundCashAmt;
        /** 1 */
                @ApiField("refund_time")
            private String refundTime;
        /** 1 */
                @ApiField("refund_reason")
            private String refundReason;
        /** 1 */
                @ApiField("refund_coupon_amt")
            private String refundCouponAmt;
        /** 1 */
                @ApiField("refund_status")
            private String refundStatus;
    
        public String getRefundType() {
    return this.refundType;
    }
    public void setRefundType(String refundType) {
    this.refundType = refundType;
    }
        public String getRefundCashAmt() {
    return this.refundCashAmt;
    }
    public void setRefundCashAmt(String refundCashAmt) {
    this.refundCashAmt = refundCashAmt;
    }
        public String getRefundTime() {
    return this.refundTime;
    }
    public void setRefundTime(String refundTime) {
    this.refundTime = refundTime;
    }
        public String getRefundReason() {
    return this.refundReason;
    }
    public void setRefundReason(String refundReason) {
    this.refundReason = refundReason;
    }
        public String getRefundCouponAmt() {
    return this.refundCouponAmt;
    }
    public void setRefundCouponAmt(String refundCouponAmt) {
    this.refundCouponAmt = refundCouponAmt;
    }
        public String getRefundStatus() {
    return this.refundStatus;
    }
    public void setRefundStatus(String refundStatus) {
    this.refundStatus = refundStatus;
    }
    }