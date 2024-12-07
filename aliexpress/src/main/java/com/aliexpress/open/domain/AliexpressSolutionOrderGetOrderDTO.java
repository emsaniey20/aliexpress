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

public class AliexpressSolutionOrderGetOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** The remain time of the current status (negative number indicates the timeout period) */
                @ApiField("timeout_left_time")
            private Long timeoutLeftTime;
        /** seller fuller name */
                @ApiField("seller_signer_fullname")
            private String sellerSignerFullname;
        /** seller operator login id */
                @ApiField("seller_operator_login_id")
            private String sellerOperatorLoginId;
        /** seller login id */
                @ApiField("seller_login_id")
            private String sellerLoginId;
        /** product list */
                @ApiListField("product_list")
            private List<AliexpressSolutionOrderGetOrderProductDTO> productList;
        /** Whether mobile phone orders */
                @ApiField("phone")
            private Boolean phone;
        /** pay type: migs: Credit card payments go through the RMB channel; migs: 102MasterCard pays and takes the RMB channel; migs101:Visa Pay and take the RMB channel; pp101: PayPal; mb: MoneyBooker channel; tt101: Bank Transfer payment; wu101: West Union payment; wp101: Visa pays for the US dollar channel; wp102: Mastercard to pay for the US dollar channel; qw101: QIWI payment; cybs101: Visa takes the payment of the CYBS channel; cybs102: Mastercard to pay for CYBS channels; wm101: WebMoney payment; ebanx101: Brazilian Beloto payment; */
                @ApiField("payment_type")
            private String paymentType;
        /** pay amount */
                @ApiField("pay_amount")
            private AliexpressSolutionOrderGetSimpleMoney payAmount;
        /** order status */
                @ApiField("order_status")
            private String orderStatus;
        /** order ID */
                @ApiField("order_id")
            private Long orderId;
        /** order detail url */
                @ApiField("order_detail_url")
            private String orderDetailUrl;
        /** logistics status。logistics status。(WAIT_SELLER_SEND_GOODS: Waiting for seller to ship; SELLER_SEND_PART_GOODS: Partial delivery by seller; SELLER_SEND_GOODS: Seller has shipped; BUYER_ACCEPT_GOODS: Buyer has confirmed receipt; NO_LOGISTICS: No logistics transfer) */
                @ApiField("logistics_status")
            private String logisticsStatus;
        /** logistics escrow fee rate */
                @ApiField("logisitcs_escrow_fee_rate")
            private String logisitcsEscrowFeeRate;
        /** loan amount details */
                @ApiField("loan_amount")
            private AliexpressSolutionOrderGetSimpleMoney loanAmount;
        /** Remaining delivery time (minute) */
                @ApiField("left_send_good_min")
            private String leftSendGoodMin;
        /** Remaining delivery time (hour） */
                @ApiField("left_send_good_hour")
            private String leftSendGoodHour;
        /** Remaining delivery time (days) */
                @ApiField("left_send_good_day")
            private String leftSendGoodDay;
        /** issue status (NO_ISSUE; IN_ISSUE; END_ISSUE) */
                @ApiField("issue_status")
            private String issueStatus;
        /** Have you requested a loan? */
                @ApiField("has_request_loan")
            private Boolean hasRequestLoan;
        /** Last order update time */
                @ApiField("gmt_update")
            private String gmtUpdate;
        /** Last order delivery time */
                @ApiField("gmt_send_goods_time")
            private String gmtSendGoodsTime;
        /** order pay time (The gmtPaysuccess field has the same meaning in the order details.)it's US Pacific time */
                @ApiField("gmt_pay_time")
            private String gmtPayTime;
        /** order create time,it's US Pacific time */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** fund status (NOT_PAY; PAY_SUCCESS; WAIT_SELLER_CHECK) */
                @ApiField("fund_status")
            private String fundStatus;
        /** frozen status。(NO_FROZEN:no frozen; IN_FROZEN:in frozen) */
                @ApiField("frozen_status")
            private String frozenStatus;
        /** escrow fee rate */
                @ApiField("escrow_fee_rate")
            private Integer escrowFeeRate;
        /** escrow fee */
                @ApiField("escrow_fee")
            private AliexpressSolutionOrderGetSimpleMoney escrowFee;
        /** order finished reason */
                @ApiField("end_reason")
            private String endReason;
        /** buyer full name */
                @ApiField("buyer_signer_fullname")
            private String buyerSignerFullname;
        /** buyer login id */
                @ApiField("buyer_login_id")
            private String buyerLoginId;
        /** order type。（AE_COMMON:common type,AE_TRIAL:trial type;AE_RECHARGE:recharge order) */
                @ApiField("biz_type")
            private String bizType;
        /** pickup type of order */
                @ApiField("offline_pickup_type")
            private String offlinePickupType;
    
        public Long getTimeoutLeftTime() {
    return this.timeoutLeftTime;
    }
    public void setTimeoutLeftTime(Long timeoutLeftTime) {
    this.timeoutLeftTime = timeoutLeftTime;
    }
        public String getSellerSignerFullname() {
    return this.sellerSignerFullname;
    }
    public void setSellerSignerFullname(String sellerSignerFullname) {
    this.sellerSignerFullname = sellerSignerFullname;
    }
        public String getSellerOperatorLoginId() {
    return this.sellerOperatorLoginId;
    }
    public void setSellerOperatorLoginId(String sellerOperatorLoginId) {
    this.sellerOperatorLoginId = sellerOperatorLoginId;
    }
        public String getSellerLoginId() {
    return this.sellerLoginId;
    }
    public void setSellerLoginId(String sellerLoginId) {
    this.sellerLoginId = sellerLoginId;
    }
        public List<AliexpressSolutionOrderGetOrderProductDTO> getProductList() {
    return this.productList;
    }
    public void setProductList(List<AliexpressSolutionOrderGetOrderProductDTO> productList) {
    this.productList = productList;
    }
        public Boolean getPhone() {
    return this.phone;
    }
    public void setPhone(Boolean phone) {
    this.phone = phone;
    }
        public String getPaymentType() {
    return this.paymentType;
    }
    public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
    }
        public AliexpressSolutionOrderGetSimpleMoney getPayAmount() {
    return this.payAmount;
    }
    public void setPayAmount(AliexpressSolutionOrderGetSimpleMoney payAmount) {
    this.payAmount = payAmount;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public String getOrderDetailUrl() {
    return this.orderDetailUrl;
    }
    public void setOrderDetailUrl(String orderDetailUrl) {
    this.orderDetailUrl = orderDetailUrl;
    }
        public String getLogisticsStatus() {
    return this.logisticsStatus;
    }
    public void setLogisticsStatus(String logisticsStatus) {
    this.logisticsStatus = logisticsStatus;
    }
        public String getLogisitcsEscrowFeeRate() {
    return this.logisitcsEscrowFeeRate;
    }
    public void setLogisitcsEscrowFeeRate(String logisitcsEscrowFeeRate) {
    this.logisitcsEscrowFeeRate = logisitcsEscrowFeeRate;
    }
        public AliexpressSolutionOrderGetSimpleMoney getLoanAmount() {
    return this.loanAmount;
    }
    public void setLoanAmount(AliexpressSolutionOrderGetSimpleMoney loanAmount) {
    this.loanAmount = loanAmount;
    }
        public String getLeftSendGoodMin() {
    return this.leftSendGoodMin;
    }
    public void setLeftSendGoodMin(String leftSendGoodMin) {
    this.leftSendGoodMin = leftSendGoodMin;
    }
        public String getLeftSendGoodHour() {
    return this.leftSendGoodHour;
    }
    public void setLeftSendGoodHour(String leftSendGoodHour) {
    this.leftSendGoodHour = leftSendGoodHour;
    }
        public String getLeftSendGoodDay() {
    return this.leftSendGoodDay;
    }
    public void setLeftSendGoodDay(String leftSendGoodDay) {
    this.leftSendGoodDay = leftSendGoodDay;
    }
        public String getIssueStatus() {
    return this.issueStatus;
    }
    public void setIssueStatus(String issueStatus) {
    this.issueStatus = issueStatus;
    }
        public Boolean getHasRequestLoan() {
    return this.hasRequestLoan;
    }
    public void setHasRequestLoan(Boolean hasRequestLoan) {
    this.hasRequestLoan = hasRequestLoan;
    }
        public String getGmtUpdate() {
    return this.gmtUpdate;
    }
    public void setGmtUpdate(String gmtUpdate) {
    this.gmtUpdate = gmtUpdate;
    }
        public String getGmtSendGoodsTime() {
    return this.gmtSendGoodsTime;
    }
    public void setGmtSendGoodsTime(String gmtSendGoodsTime) {
    this.gmtSendGoodsTime = gmtSendGoodsTime;
    }
        public String getGmtPayTime() {
    return this.gmtPayTime;
    }
    public void setGmtPayTime(String gmtPayTime) {
    this.gmtPayTime = gmtPayTime;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getFundStatus() {
    return this.fundStatus;
    }
    public void setFundStatus(String fundStatus) {
    this.fundStatus = fundStatus;
    }
        public String getFrozenStatus() {
    return this.frozenStatus;
    }
    public void setFrozenStatus(String frozenStatus) {
    this.frozenStatus = frozenStatus;
    }
        public Integer getEscrowFeeRate() {
    return this.escrowFeeRate;
    }
    public void setEscrowFeeRate(Integer escrowFeeRate) {
    this.escrowFeeRate = escrowFeeRate;
    }
        public AliexpressSolutionOrderGetSimpleMoney getEscrowFee() {
    return this.escrowFee;
    }
    public void setEscrowFee(AliexpressSolutionOrderGetSimpleMoney escrowFee) {
    this.escrowFee = escrowFee;
    }
        public String getEndReason() {
    return this.endReason;
    }
    public void setEndReason(String endReason) {
    this.endReason = endReason;
    }
        public String getBuyerSignerFullname() {
    return this.buyerSignerFullname;
    }
    public void setBuyerSignerFullname(String buyerSignerFullname) {
    this.buyerSignerFullname = buyerSignerFullname;
    }
        public String getBuyerLoginId() {
    return this.buyerLoginId;
    }
    public void setBuyerLoginId(String buyerLoginId) {
    this.buyerLoginId = buyerLoginId;
    }
        public String getBizType() {
    return this.bizType;
    }
    public void setBizType(String bizType) {
    this.bizType = bizType;
    }
        public String getOfflinePickupType() {
    return this.offlinePickupType;
    }
    public void setOfflinePickupType(String offlinePickupType) {
    this.offlinePickupType = offlinePickupType;
    }
    }