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

public class AliexpressTradeNewRedefiningcopy2AeopTpOrderDetailDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("over_time_left")
            private String overTimeLeft;
        /** 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1 */
                @ApiField("shipping_discount_fee")
            private AliexpressTradeNewRedefiningcopy2MoneyStr shippingDiscountFee;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiListField("opr_log_dto_list")
            private String oprLogDtoList;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("memo")
            private String memo;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("escrow_fee")
            private String escrowFee;
        /** 11sa sad s1s1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1a sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1dafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("seller_order_amount")
            private AliexpressTradeNewRedefiningcopy2SimpleMoney sellerOrderAmount;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("gmt_pay_success")
            private String gmtPaySuccess;
        /** 1sa sad sdafsda1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1fa1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1 */
                @ApiField("new_order_amount")
            private AliexpressTradeNewRedefiningcopy2SimpleMoney newOrderAmount;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("loan_status")
            private String loanStatus;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("id")
            private Long id;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("logisitcs_escrow_fee_rate")
            private String logisitcsEscrowFeeRate;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("actual_fee")
            private AliexpressTradeNewRedefiningcopy2MoneyStr actualFee;
        /** 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1 */
                @ApiField("seller_operator_login_id")
            private String sellerOperatorLoginId;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("is_phone")
            private Boolean isPhone;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("gmt_trade_end")
            private String gmtTradeEnd;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("order_msg_list")
            private String orderMsgList;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("cancel_request_reason")
            private String cancelRequestReason;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("buyer_info")
            private AliexpressTradeNewRedefiningcopy2AeopTpPersonDTO buyerInfo;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("settlement_currency")
            private String settlementCurrency;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("shipping_fee")
            private AliexpressTradeNewRedefiningcopy2MoneyStr shippingFee;
        /** 111sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf  */
                @ApiField("phone")
            private Boolean phone;
        /** 111sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf  */
                @ApiField("seller_signer_fullname")
            private String sellerSignerFullname;
        /** 111sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf  */
                @ApiField("loan_info")
            private AliexpressTradeNewRedefiningcopy2AeopTpLoanInfoDTO loanInfo;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf 1 */
                @ApiField("refund_info")
            private AliexpressTradeNewRedefiningcopy2AeopTpRefundInfoDTO refundInfo;
        /** 111sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf  */
                @ApiField("frozen_status")
            private String frozenStatus;
        /** 111sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf  */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** 111sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf  */
                @ApiField("offline_pickup_type")
            private String offlinePickupType;
        /** 111sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf  */
                @ApiField("pay_amount_by_settlement_cur")
            private String payAmountBySettlementCur;
        /** 111sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf  */
                @ApiField("order_status")
            private String orderStatus;
        /** 111sa sad1611sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf1611sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . d1611sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf saf  . dsaf  sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf  */
                @ApiField("init_oder_amount")
            private AliexpressTradeNewRedefiningcopy2MoneyStr initOderAmount;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf  */
                @ApiField("logistics_amount")
            private AliexpressTradeNewRedefiningcopy2MoneyStr logisticsAmount;
        /** 111sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf  */
                @ApiField("payment_type")
            private String paymentType;
        /** 111sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf  */
                @ApiListField("child_order_list")
            private List<AliexpressTradeNewRedefiningcopy2AeopTpChildOrderDTO> childOrderList;
    
        public String getOverTimeLeft() {
    return this.overTimeLeft;
    }
    public void setOverTimeLeft(String overTimeLeft) {
    this.overTimeLeft = overTimeLeft;
    }
        public AliexpressTradeNewRedefiningcopy2MoneyStr getShippingDiscountFee() {
    return this.shippingDiscountFee;
    }
    public void setShippingDiscountFee(AliexpressTradeNewRedefiningcopy2MoneyStr shippingDiscountFee) {
    this.shippingDiscountFee = shippingDiscountFee;
    }
        public String getOprLogDtoList() {
    return this.oprLogDtoList;
    }
    public void setOprLogDtoList(String oprLogDtoList) {
    this.oprLogDtoList = oprLogDtoList;
    }
        public String getMemo() {
    return this.memo;
    }
    public void setMemo(String memo) {
    this.memo = memo;
    }
        public String getEscrowFee() {
    return this.escrowFee;
    }
    public void setEscrowFee(String escrowFee) {
    this.escrowFee = escrowFee;
    }
        public AliexpressTradeNewRedefiningcopy2SimpleMoney getSellerOrderAmount() {
    return this.sellerOrderAmount;
    }
    public void setSellerOrderAmount(AliexpressTradeNewRedefiningcopy2SimpleMoney sellerOrderAmount) {
    this.sellerOrderAmount = sellerOrderAmount;
    }
        public String getGmtPaySuccess() {
    return this.gmtPaySuccess;
    }
    public void setGmtPaySuccess(String gmtPaySuccess) {
    this.gmtPaySuccess = gmtPaySuccess;
    }
        public AliexpressTradeNewRedefiningcopy2SimpleMoney getNewOrderAmount() {
    return this.newOrderAmount;
    }
    public void setNewOrderAmount(AliexpressTradeNewRedefiningcopy2SimpleMoney newOrderAmount) {
    this.newOrderAmount = newOrderAmount;
    }
        public String getLoanStatus() {
    return this.loanStatus;
    }
    public void setLoanStatus(String loanStatus) {
    this.loanStatus = loanStatus;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public String getLogisitcsEscrowFeeRate() {
    return this.logisitcsEscrowFeeRate;
    }
    public void setLogisitcsEscrowFeeRate(String logisitcsEscrowFeeRate) {
    this.logisitcsEscrowFeeRate = logisitcsEscrowFeeRate;
    }
        public AliexpressTradeNewRedefiningcopy2MoneyStr getActualFee() {
    return this.actualFee;
    }
    public void setActualFee(AliexpressTradeNewRedefiningcopy2MoneyStr actualFee) {
    this.actualFee = actualFee;
    }
        public String getSellerOperatorLoginId() {
    return this.sellerOperatorLoginId;
    }
    public void setSellerOperatorLoginId(String sellerOperatorLoginId) {
    this.sellerOperatorLoginId = sellerOperatorLoginId;
    }
        public Boolean getIsPhone() {
    return this.isPhone;
    }
    public void setIsPhone(Boolean isPhone) {
    this.isPhone = isPhone;
    }
        public String getGmtTradeEnd() {
    return this.gmtTradeEnd;
    }
    public void setGmtTradeEnd(String gmtTradeEnd) {
    this.gmtTradeEnd = gmtTradeEnd;
    }
        public String getOrderMsgList() {
    return this.orderMsgList;
    }
    public void setOrderMsgList(String orderMsgList) {
    this.orderMsgList = orderMsgList;
    }
        public String getCancelRequestReason() {
    return this.cancelRequestReason;
    }
    public void setCancelRequestReason(String cancelRequestReason) {
    this.cancelRequestReason = cancelRequestReason;
    }
        public AliexpressTradeNewRedefiningcopy2AeopTpPersonDTO getBuyerInfo() {
    return this.buyerInfo;
    }
    public void setBuyerInfo(AliexpressTradeNewRedefiningcopy2AeopTpPersonDTO buyerInfo) {
    this.buyerInfo = buyerInfo;
    }
        public String getSettlementCurrency() {
    return this.settlementCurrency;
    }
    public void setSettlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
    }
        public AliexpressTradeNewRedefiningcopy2MoneyStr getShippingFee() {
    return this.shippingFee;
    }
    public void setShippingFee(AliexpressTradeNewRedefiningcopy2MoneyStr shippingFee) {
    this.shippingFee = shippingFee;
    }
        public Boolean getPhone() {
    return this.phone;
    }
    public void setPhone(Boolean phone) {
    this.phone = phone;
    }
        public String getSellerSignerFullname() {
    return this.sellerSignerFullname;
    }
    public void setSellerSignerFullname(String sellerSignerFullname) {
    this.sellerSignerFullname = sellerSignerFullname;
    }
        public AliexpressTradeNewRedefiningcopy2AeopTpLoanInfoDTO getLoanInfo() {
    return this.loanInfo;
    }
    public void setLoanInfo(AliexpressTradeNewRedefiningcopy2AeopTpLoanInfoDTO loanInfo) {
    this.loanInfo = loanInfo;
    }
        public AliexpressTradeNewRedefiningcopy2AeopTpRefundInfoDTO getRefundInfo() {
    return this.refundInfo;
    }
    public void setRefundInfo(AliexpressTradeNewRedefiningcopy2AeopTpRefundInfoDTO refundInfo) {
    this.refundInfo = refundInfo;
    }
        public String getFrozenStatus() {
    return this.frozenStatus;
    }
    public void setFrozenStatus(String frozenStatus) {
    this.frozenStatus = frozenStatus;
    }
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
    }
        public String getOfflinePickupType() {
    return this.offlinePickupType;
    }
    public void setOfflinePickupType(String offlinePickupType) {
    this.offlinePickupType = offlinePickupType;
    }
        public String getPayAmountBySettlementCur() {
    return this.payAmountBySettlementCur;
    }
    public void setPayAmountBySettlementCur(String payAmountBySettlementCur) {
    this.payAmountBySettlementCur = payAmountBySettlementCur;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public AliexpressTradeNewRedefiningcopy2MoneyStr getInitOderAmount() {
    return this.initOderAmount;
    }
    public void setInitOderAmount(AliexpressTradeNewRedefiningcopy2MoneyStr initOderAmount) {
    this.initOderAmount = initOderAmount;
    }
        public AliexpressTradeNewRedefiningcopy2MoneyStr getLogisticsAmount() {
    return this.logisticsAmount;
    }
    public void setLogisticsAmount(AliexpressTradeNewRedefiningcopy2MoneyStr logisticsAmount) {
    this.logisticsAmount = logisticsAmount;
    }
        public String getPaymentType() {
    return this.paymentType;
    }
    public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
    }
        public List<AliexpressTradeNewRedefiningcopy2AeopTpChildOrderDTO> getChildOrderList() {
    return this.childOrderList;
    }
    public void setChildOrderList(List<AliexpressTradeNewRedefiningcopy2AeopTpChildOrderDTO> childOrderList) {
    this.childOrderList = childOrderList;
    }
    }