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

public class AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpOrderDetailDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 1 */
                @ApiField("offline_pickup_point_code")
            private String offlinePickupPointCode;
        /** 1 */
                @ApiListField("logistic_info_list")
            private List<AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpLogisticInfoDTO> logisticInfoList;
        /** 1 */
                @ApiField("payment_type")
            private String paymentType;
        /** 1 */
                @ApiListField("child_order_list")
            private List<AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpChildOrderDTO> childOrderList;
        /** 1 */
                @ApiField("order_end_reason")
            private String orderEndReason;
        /** 1 */
                @ApiField("buyer_signer_fullname")
            private String buyerSignerFullname;
        /** 1 */
                @ApiField("cod")
            private Boolean cod;
        /** 1 */
                @ApiField("fund_status")
            private String fundStatus;
        /** 1 */
                @ApiField("logistics_status")
            private String logisticsStatus;
        /** 1 */
                @ApiField("over_time_left")
            private String overTimeLeft;
        /** 1 */
                @ApiField("shipping_discount_fee")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr shippingDiscountFee;
        /** 1 */
                @ApiListField("opr_log_dto_list")
            private String oprLogDtoList;
        /** 1 */
                @ApiField("memo")
            private String memo;
        /** 1 */
                @ApiField("escrow_fee")
            private String escrowFee;
        /** 1 */
                @ApiField("seller_order_amount")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789SimpleMoney sellerOrderAmount;
        /** 1 */
                @ApiField("gmt_pay_success")
            private String gmtPaySuccess;
        /** 1 */
                @ApiField("new_order_amount")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789SimpleMoney newOrderAmount;
        /** 1 */
                @ApiField("loan_status")
            private String loanStatus;
        /** 1 */
                @ApiField("id")
            private Long id;
        /** 1 */
                @ApiField("logisitcs_escrow_fee_rate")
            private String logisitcsEscrowFeeRate;
        /** 1 */
                @ApiField("actual_fee")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr actualFee;
        /** 1 */
                @ApiField("seller_operator_login_id")
            private String sellerOperatorLoginId;
        /** 1 */
                @ApiField("is_phone")
            private Boolean isPhone;
        /** 1 */
                @ApiField("gmt_trade_end")
            private String gmtTradeEnd;
        /** 1 */
                @ApiField("order_msg_list")
            private String orderMsgList;
        /** 1 */
                @ApiField("cancel_request_reason")
            private String cancelRequestReason;
        /** 1 */
                @ApiField("buyer_info")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpPersonDTO buyerInfo;
        /** 1 */
                @ApiField("settlement_currency")
            private String settlementCurrency;
        /** 1 */
                @ApiField("shipping_fee")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr shippingFee;
        /** 1 */
                @ApiField("phone")
            private Boolean phone;
        /** 1 */
                @ApiField("seller_signer_fullname")
            private String sellerSignerFullname;
        /** 1 */
                @ApiField("loan_info")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpLoanInfoDTO loanInfo;
        /** 1 */
                @ApiField("issue_status")
            private String issueStatus;
        /** 1 */
                @ApiField("order_amount")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr orderAmount;
        /** 1 */
                @ApiField("refund_info")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpRefundInfoDTO refundInfo;
        /** 1 */
                @ApiField("receipt_address")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpAddressDTO receiptAddress;
        /** 1 */
                @ApiField("frozen_status")
            private String frozenStatus;
        /** 1 */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** 1 */
                @ApiField("offline_pickup_type")
            private String offlinePickupType;
        /** 1 */
                @ApiField("pay_amount_by_settlement_cur")
            private String payAmountBySettlementCur;
        /** 1 */
                @ApiField("order_status")
            private String orderStatus;
        /** 1 */
                @ApiField("init_oder_amount")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr initOderAmount;
        /** 1 */
                @ApiField("sale_discount_fee")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr saleDiscountFee;
        /** 1 */
                @ApiField("issue_info")
            private String issueInfo;
        /** 1 */
                @ApiField("buyerloginid")
            private String buyerloginid;
        /** 1 */
                @ApiField("a_id")
            private String aId;
        /** 1 */
                @ApiField("seller_operator_aliidloginid")
            private String sellerOperatorAliidloginid;
        /** 1 */
                @ApiListField("child_order_ext_info_list")
            private List<AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpOrderProductInfoDTO> childOrderExtInfoList;
        /** 1 */
                @ApiField("logistics_amount")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr logisticsAmount;
    
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getOfflinePickupPointCode() {
    return this.offlinePickupPointCode;
    }
    public void setOfflinePickupPointCode(String offlinePickupPointCode) {
    this.offlinePickupPointCode = offlinePickupPointCode;
    }
        public List<AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpLogisticInfoDTO> getLogisticInfoList() {
    return this.logisticInfoList;
    }
    public void setLogisticInfoList(List<AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpLogisticInfoDTO> logisticInfoList) {
    this.logisticInfoList = logisticInfoList;
    }
        public String getPaymentType() {
    return this.paymentType;
    }
    public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
    }
        public List<AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpChildOrderDTO> getChildOrderList() {
    return this.childOrderList;
    }
    public void setChildOrderList(List<AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpChildOrderDTO> childOrderList) {
    this.childOrderList = childOrderList;
    }
        public String getOrderEndReason() {
    return this.orderEndReason;
    }
    public void setOrderEndReason(String orderEndReason) {
    this.orderEndReason = orderEndReason;
    }
        public String getBuyerSignerFullname() {
    return this.buyerSignerFullname;
    }
    public void setBuyerSignerFullname(String buyerSignerFullname) {
    this.buyerSignerFullname = buyerSignerFullname;
    }
        public Boolean getCod() {
    return this.cod;
    }
    public void setCod(Boolean cod) {
    this.cod = cod;
    }
        public String getFundStatus() {
    return this.fundStatus;
    }
    public void setFundStatus(String fundStatus) {
    this.fundStatus = fundStatus;
    }
        public String getLogisticsStatus() {
    return this.logisticsStatus;
    }
    public void setLogisticsStatus(String logisticsStatus) {
    this.logisticsStatus = logisticsStatus;
    }
        public String getOverTimeLeft() {
    return this.overTimeLeft;
    }
    public void setOverTimeLeft(String overTimeLeft) {
    this.overTimeLeft = overTimeLeft;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getShippingDiscountFee() {
    return this.shippingDiscountFee;
    }
    public void setShippingDiscountFee(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr shippingDiscountFee) {
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
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789SimpleMoney getSellerOrderAmount() {
    return this.sellerOrderAmount;
    }
    public void setSellerOrderAmount(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789SimpleMoney sellerOrderAmount) {
    this.sellerOrderAmount = sellerOrderAmount;
    }
        public String getGmtPaySuccess() {
    return this.gmtPaySuccess;
    }
    public void setGmtPaySuccess(String gmtPaySuccess) {
    this.gmtPaySuccess = gmtPaySuccess;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789SimpleMoney getNewOrderAmount() {
    return this.newOrderAmount;
    }
    public void setNewOrderAmount(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789SimpleMoney newOrderAmount) {
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
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getActualFee() {
    return this.actualFee;
    }
    public void setActualFee(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr actualFee) {
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
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpPersonDTO getBuyerInfo() {
    return this.buyerInfo;
    }
    public void setBuyerInfo(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpPersonDTO buyerInfo) {
    this.buyerInfo = buyerInfo;
    }
        public String getSettlementCurrency() {
    return this.settlementCurrency;
    }
    public void setSettlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getShippingFee() {
    return this.shippingFee;
    }
    public void setShippingFee(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr shippingFee) {
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
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpLoanInfoDTO getLoanInfo() {
    return this.loanInfo;
    }
    public void setLoanInfo(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpLoanInfoDTO loanInfo) {
    this.loanInfo = loanInfo;
    }
        public String getIssueStatus() {
    return this.issueStatus;
    }
    public void setIssueStatus(String issueStatus) {
    this.issueStatus = issueStatus;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getOrderAmount() {
    return this.orderAmount;
    }
    public void setOrderAmount(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr orderAmount) {
    this.orderAmount = orderAmount;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpRefundInfoDTO getRefundInfo() {
    return this.refundInfo;
    }
    public void setRefundInfo(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpRefundInfoDTO refundInfo) {
    this.refundInfo = refundInfo;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpAddressDTO getReceiptAddress() {
    return this.receiptAddress;
    }
    public void setReceiptAddress(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpAddressDTO receiptAddress) {
    this.receiptAddress = receiptAddress;
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
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getInitOderAmount() {
    return this.initOderAmount;
    }
    public void setInitOderAmount(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr initOderAmount) {
    this.initOderAmount = initOderAmount;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getSaleDiscountFee() {
    return this.saleDiscountFee;
    }
    public void setSaleDiscountFee(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr saleDiscountFee) {
    this.saleDiscountFee = saleDiscountFee;
    }
        public String getIssueInfo() {
    return this.issueInfo;
    }
    public void setIssueInfo(String issueInfo) {
    this.issueInfo = issueInfo;
    }
        public String getBuyerloginid() {
    return this.buyerloginid;
    }
    public void setBuyerloginid(String buyerloginid) {
    this.buyerloginid = buyerloginid;
    }
        public String getAId() {
    return this.aId;
    }
    public void setAId(String aId) {
    this.aId = aId;
    }
        public String getSellerOperatorAliidloginid() {
    return this.sellerOperatorAliidloginid;
    }
    public void setSellerOperatorAliidloginid(String sellerOperatorAliidloginid) {
    this.sellerOperatorAliidloginid = sellerOperatorAliidloginid;
    }
        public List<AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpOrderProductInfoDTO> getChildOrderExtInfoList() {
    return this.childOrderExtInfoList;
    }
    public void setChildOrderExtInfoList(List<AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpOrderProductInfoDTO> childOrderExtInfoList) {
    this.childOrderExtInfoList = childOrderExtInfoList;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getLogisticsAmount() {
    return this.logisticsAmount;
    }
    public void setLogisticsAmount(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr logisticsAmount) {
    this.logisticsAmount = logisticsAmount;
    }
    }