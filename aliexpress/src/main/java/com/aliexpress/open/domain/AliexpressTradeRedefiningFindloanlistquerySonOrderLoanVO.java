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

public class AliexpressTradeRedefiningFindloanlistquerySonOrderLoanVO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 放款时间（不返回） */
                @ApiField("released_datetime")
            private String releasedDatetime;
        /** 待放款原因 */
                @ApiField("wait_loan_reson")
            private String waitLoanReson;
        /** 实际放款出账金额 */
                @ApiField("real_loan_amount")
            private AliexpressTradeRedefiningFindloanlistqueryMoney realLoanAmount;
        /** 联盟佣金 */
                @ApiField("affiliate_commission")
            private AliexpressTradeRedefiningFindloanlistqueryMoney affiliateCommission;
        /** 手续费 */
                @ApiField("escrow_fee")
            private AliexpressTradeRedefiningFindloanlistqueryMoney escrowFee;
        /** 放款金额 */
                @ApiField("loan_amount")
            private AliexpressTradeRedefiningFindloanlistqueryMoney loanAmount;
        /** 实际退款出账金额 */
                @ApiField("real_refund_amount")
            private AliexpressTradeRedefiningFindloanlistqueryMoney realRefundAmount;
        /** 退款金额 */
                @ApiField("refund_amount")
            private AliexpressTradeRedefiningFindloanlistqueryMoney refundAmount;
        /** 放款金额(已废弃) */
                @ApiField("amount")
            private AliexpressTradeRedefiningFindloanlistqueryMoney amount;
        /** 放款状态 */
                @ApiField("loan_status")
            private String loanStatus;
        /** 子订单ID */
                @ApiField("child_order_id")
            private Long childOrderId;
    
        public String getReleasedDatetime() {
    return this.releasedDatetime;
    }
    public void setReleasedDatetime(String releasedDatetime) {
    this.releasedDatetime = releasedDatetime;
    }
        public String getWaitLoanReson() {
    return this.waitLoanReson;
    }
    public void setWaitLoanReson(String waitLoanReson) {
    this.waitLoanReson = waitLoanReson;
    }
        public AliexpressTradeRedefiningFindloanlistqueryMoney getRealLoanAmount() {
    return this.realLoanAmount;
    }
    public void setRealLoanAmount(AliexpressTradeRedefiningFindloanlistqueryMoney realLoanAmount) {
    this.realLoanAmount = realLoanAmount;
    }
        public AliexpressTradeRedefiningFindloanlistqueryMoney getAffiliateCommission() {
    return this.affiliateCommission;
    }
    public void setAffiliateCommission(AliexpressTradeRedefiningFindloanlistqueryMoney affiliateCommission) {
    this.affiliateCommission = affiliateCommission;
    }
        public AliexpressTradeRedefiningFindloanlistqueryMoney getEscrowFee() {
    return this.escrowFee;
    }
    public void setEscrowFee(AliexpressTradeRedefiningFindloanlistqueryMoney escrowFee) {
    this.escrowFee = escrowFee;
    }
        public AliexpressTradeRedefiningFindloanlistqueryMoney getLoanAmount() {
    return this.loanAmount;
    }
    public void setLoanAmount(AliexpressTradeRedefiningFindloanlistqueryMoney loanAmount) {
    this.loanAmount = loanAmount;
    }
        public AliexpressTradeRedefiningFindloanlistqueryMoney getRealRefundAmount() {
    return this.realRefundAmount;
    }
    public void setRealRefundAmount(AliexpressTradeRedefiningFindloanlistqueryMoney realRefundAmount) {
    this.realRefundAmount = realRefundAmount;
    }
        public AliexpressTradeRedefiningFindloanlistqueryMoney getRefundAmount() {
    return this.refundAmount;
    }
    public void setRefundAmount(AliexpressTradeRedefiningFindloanlistqueryMoney refundAmount) {
    this.refundAmount = refundAmount;
    }
        public AliexpressTradeRedefiningFindloanlistqueryMoney getAmount() {
    return this.amount;
    }
    public void setAmount(AliexpressTradeRedefiningFindloanlistqueryMoney amount) {
    this.amount = amount;
    }
        public String getLoanStatus() {
    return this.loanStatus;
    }
    public void setLoanStatus(String loanStatus) {
    this.loanStatus = loanStatus;
    }
        public Long getChildOrderId() {
    return this.childOrderId;
    }
    public void setChildOrderId(Long childOrderId) {
    this.childOrderId = childOrderId;
    }
    }