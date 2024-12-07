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

public class AliexpressTradeNewRedefiningFindorderbyidAeopTpRefundInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 退款现金金额(不包括coupon) */
                @ApiField("refund_cash_amt")
            private AliexpressTradeNewRedefiningFindorderbyidMoneyStr refundCashAmt;
        /** 退款coupon金额 */
                @ApiField("refund_coupon_amt")
            private AliexpressTradeNewRedefiningFindorderbyidMoneyStr refundCouponAmt;
        /** 退款原因 */
                @ApiField("refund_reason")
            private String refundReason;
        /** 退款状态：等待退款 wait_refund,退款成功 refund_ok, 退款取消refund_cancel,  关闭 close, 退款冻结 refund_frozen */
                @ApiField("refund_status")
            private String refundStatus;
        /** 退款时间（此时间为美国太平洋时间） */
                @ApiField("refund_time")
            private String refundTime;
        /** 退款类型：售后退款 c,售中退款 sale_refund，赔付退款 payout_refund    ,    , 淘代销包赔退款: "consignment_guarantee_pay_refund" , paypal 出资赔付: "paypal_payout" , 延保售后退款: "extended_warranty_refund" , PAYPAL 发起退款追偿: "paypal_recover_refund" , 提前放款后的退款: "pre_loan_refund" ,追偿类: "recovery_refund" , PAYPAL发起退款: "paypal_issue_refund" , 包赔退款: "guarantee_pay_refund" */
                @ApiField("refund_type")
            private String refundType;
    
        public AliexpressTradeNewRedefiningFindorderbyidMoneyStr getRefundCashAmt() {
    return this.refundCashAmt;
    }
    public void setRefundCashAmt(AliexpressTradeNewRedefiningFindorderbyidMoneyStr refundCashAmt) {
    this.refundCashAmt = refundCashAmt;
    }
        public AliexpressTradeNewRedefiningFindorderbyidMoneyStr getRefundCouponAmt() {
    return this.refundCouponAmt;
    }
    public void setRefundCouponAmt(AliexpressTradeNewRedefiningFindorderbyidMoneyStr refundCouponAmt) {
    this.refundCouponAmt = refundCouponAmt;
    }
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
        public String getRefundTime() {
    return this.refundTime;
    }
    public void setRefundTime(String refundTime) {
    this.refundTime = refundTime;
    }
        public String getRefundType() {
    return this.refundType;
    }
    public void setRefundType(String refundType) {
    this.refundType = refundType;
    }
    }