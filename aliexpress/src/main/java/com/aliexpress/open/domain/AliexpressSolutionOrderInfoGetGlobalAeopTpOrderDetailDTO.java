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

public class AliexpressSolutionOrderInfoGetGlobalAeopTpOrderDetailDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** order creation time */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** seller operator login ID */
                @ApiField("seller_operator_login_id")
            private String sellerOperatorLoginId;
        /** payment type */
                @ApiField("payment_type")
            private String paymentType;
        /** loan info */
                @ApiField("loan_info")
            private AliexpressSolutionOrderInfoGetGlobalAeopTpLoanInfoDTO loanInfo;
        /** child order ext info list */
                @ApiListField("child_order_ext_info_list")
            private List<AliexpressSolutionOrderInfoGetGlobalAeopTpOrderProductInfoDTO> childOrderExtInfoList;
        /** Order Status：PLACE_ORDER_SUCCESS;  IN_CANCEL;  WAIT_SELLER_SEND_GOODS;  SELLER_PART_SEND_GOODS;  WAIT_BUYER_ACCEPT_GOODS;  FUND_PROCESSING; IN_ISSUE;  IN_FROZEN;  WAIT_SELLER_EXAMINE_MONEY;  RISK_CONTROL. */
                @ApiField("order_status")
            private String orderStatus;
        /** buyer full name */
                @ApiField("buyer_signer_fullname")
            private String buyerSignerFullname;
        /** successful payment time */
                @ApiField("gmt_pay_success")
            private String gmtPaySuccess;
        /** loan status */
                @ApiField("loan_status")
            private String loanStatus;
        /** seller operator ali login id */
                @ApiField("seller_operator_aliidloginid")
            private String sellerOperatorAliidloginid;
        /** fund status */
                @ApiField("fund_status")
            private String fundStatus;
        /** escrow fee (deprecated) */
                @ApiField("escrow_fee")
            private AliexpressSolutionOrderInfoGetGlobalMoneyStr escrowFee;
        /** issue info */
                @ApiField("issue_info")
            private AliexpressSolutionOrderInfoGetGlobalAeopTpIssueInfoDTO issueInfo;
        /** cpf  number of order */
                @ApiField("cpf_number")
            private String cpfNumber;
        /** pick-up type of order */
                @ApiField("offline_pickup_type")
            private String offlinePickupType;
        /** Order discount total amount (sum of the platform and seller discounts) */
                @ApiField("order_discount_info")
            private AliexpressSolutionOrderInfoGetGlobalMoneyStr orderDiscountInfo;
        /** refund info */
                @ApiField("refund_info")
            private AliexpressSolutionOrderInfoGetGlobalAeopTpRefundInfoDTO refundInfo;
        /** pickup point code of the specific order */
                @ApiField("offline_pickup_point_code")
            private String offlinePickupPointCode;
        /** Payment settlement currency */
                @ApiField("settlement_currency")
            private String settlementCurrency;
        /** logistics info */
                @ApiListField("logistic_info_list")
            private List<AliexpressSolutionOrderInfoGetGlobalAeopTpLogisticInfoDTO> logisticInfoList;
        /** order pay amount(settlemet currency) */
                @ApiField("pay_amount_by_settlement_cur")
            private String payAmountBySettlementCur;
        /** order ID */
                @ApiField("id")
            private Long id;
        /** frozen status */
                @ApiField("frozen_status")
            private String frozenStatus;
        /** issue status */
                @ApiField("issue_status")
            private String issueStatus;
        /** logistics status：NO_LOGISTICS 、 WAIT_SELLER_SEND_GOODS, SELLER_SEND_PART_GOODS, SELLER_SEND_GOODS, BUYER_ACCEPT_GOODS,NO_LOGISTICS */
                @ApiField("logistics_status")
            private String logisticsStatus;
        /** order amount */
                @ApiField("order_amount")
            private AliexpressSolutionOrderInfoGetGlobalMoneyStr orderAmount;
        /** Seller full name */
                @ApiField("seller_signer_fullname")
            private String sellerSignerFullname;
        /** Current status expiration date */
                @ApiField("over_time_left")
            private String overTimeLeft;
        /** order end reason */
                @ApiField("order_end_reason")
            private String orderEndReason;
        /** order amount */
                @ApiField("init_oder_amount")
            private AliexpressSolutionOrderInfoGetGlobalMoneyStr initOderAmount;
        /** operation details list */
                @ApiListField("opr_log_dto_list")
            private List<AliexpressSolutionOrderInfoGetGlobalAeopTpOperationLogDTO> oprLogDtoList;
        /** child order list */
                @ApiListField("child_order_list")
            private List<AliexpressSolutionOrderInfoGetGlobalAeopTpChildOrderDTO> childOrderList;
        /** buyer info */
                @ApiField("buyer_info")
            private AliexpressSolutionOrderInfoGetGlobalAeopTpPersonDTO buyerInfo;
        /** modified time, it's US pacific time */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** receipt address */
                @ApiField("receipt_address")
            private AliexpressSolutionOrderInfoGetGlobalAeopTpAddressDTO receiptAddress;
        /** Order end time */
                @ApiField("gmt_trade_end")
            private String gmtTradeEnd;
        /** phone order or not */
                @ApiField("is_phone")
            private Boolean isPhone;
        /** buyer login id */
                @ApiField("buyerloginid")
            private String buyerloginid;
        /** logistics amount */
                @ApiField("logistics_amount")
            private AliexpressSolutionOrderInfoGetGlobalMoneyStr logisticsAmount;
        /** buyer memo */
                @ApiField("memo")
            private String memo;
        /** logisitcs escrow fee rate(Deprecated) */
                @ApiField("logisitcs_escrow_fee_rate")
            private String logisitcsEscrowFeeRate;
        /** Order Message list(deprecated) */
                @ApiListField("order_msg_list")
            private List<AliexpressSolutionOrderInfoGetGlobalAeopTpOrderMsgDTO> orderMsgList;
    
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getSellerOperatorLoginId() {
    return this.sellerOperatorLoginId;
    }
    public void setSellerOperatorLoginId(String sellerOperatorLoginId) {
    this.sellerOperatorLoginId = sellerOperatorLoginId;
    }
        public String getPaymentType() {
    return this.paymentType;
    }
    public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
    }
        public AliexpressSolutionOrderInfoGetGlobalAeopTpLoanInfoDTO getLoanInfo() {
    return this.loanInfo;
    }
    public void setLoanInfo(AliexpressSolutionOrderInfoGetGlobalAeopTpLoanInfoDTO loanInfo) {
    this.loanInfo = loanInfo;
    }
        public List<AliexpressSolutionOrderInfoGetGlobalAeopTpOrderProductInfoDTO> getChildOrderExtInfoList() {
    return this.childOrderExtInfoList;
    }
    public void setChildOrderExtInfoList(List<AliexpressSolutionOrderInfoGetGlobalAeopTpOrderProductInfoDTO> childOrderExtInfoList) {
    this.childOrderExtInfoList = childOrderExtInfoList;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public String getBuyerSignerFullname() {
    return this.buyerSignerFullname;
    }
    public void setBuyerSignerFullname(String buyerSignerFullname) {
    this.buyerSignerFullname = buyerSignerFullname;
    }
        public String getGmtPaySuccess() {
    return this.gmtPaySuccess;
    }
    public void setGmtPaySuccess(String gmtPaySuccess) {
    this.gmtPaySuccess = gmtPaySuccess;
    }
        public String getLoanStatus() {
    return this.loanStatus;
    }
    public void setLoanStatus(String loanStatus) {
    this.loanStatus = loanStatus;
    }
        public String getSellerOperatorAliidloginid() {
    return this.sellerOperatorAliidloginid;
    }
    public void setSellerOperatorAliidloginid(String sellerOperatorAliidloginid) {
    this.sellerOperatorAliidloginid = sellerOperatorAliidloginid;
    }
        public String getFundStatus() {
    return this.fundStatus;
    }
    public void setFundStatus(String fundStatus) {
    this.fundStatus = fundStatus;
    }
        public AliexpressSolutionOrderInfoGetGlobalMoneyStr getEscrowFee() {
    return this.escrowFee;
    }
    public void setEscrowFee(AliexpressSolutionOrderInfoGetGlobalMoneyStr escrowFee) {
    this.escrowFee = escrowFee;
    }
        public AliexpressSolutionOrderInfoGetGlobalAeopTpIssueInfoDTO getIssueInfo() {
    return this.issueInfo;
    }
    public void setIssueInfo(AliexpressSolutionOrderInfoGetGlobalAeopTpIssueInfoDTO issueInfo) {
    this.issueInfo = issueInfo;
    }
        public String getCpfNumber() {
    return this.cpfNumber;
    }
    public void setCpfNumber(String cpfNumber) {
    this.cpfNumber = cpfNumber;
    }
        public String getOfflinePickupType() {
    return this.offlinePickupType;
    }
    public void setOfflinePickupType(String offlinePickupType) {
    this.offlinePickupType = offlinePickupType;
    }
        public AliexpressSolutionOrderInfoGetGlobalMoneyStr getOrderDiscountInfo() {
    return this.orderDiscountInfo;
    }
    public void setOrderDiscountInfo(AliexpressSolutionOrderInfoGetGlobalMoneyStr orderDiscountInfo) {
    this.orderDiscountInfo = orderDiscountInfo;
    }
        public AliexpressSolutionOrderInfoGetGlobalAeopTpRefundInfoDTO getRefundInfo() {
    return this.refundInfo;
    }
    public void setRefundInfo(AliexpressSolutionOrderInfoGetGlobalAeopTpRefundInfoDTO refundInfo) {
    this.refundInfo = refundInfo;
    }
        public String getOfflinePickupPointCode() {
    return this.offlinePickupPointCode;
    }
    public void setOfflinePickupPointCode(String offlinePickupPointCode) {
    this.offlinePickupPointCode = offlinePickupPointCode;
    }
        public String getSettlementCurrency() {
    return this.settlementCurrency;
    }
    public void setSettlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
    }
        public List<AliexpressSolutionOrderInfoGetGlobalAeopTpLogisticInfoDTO> getLogisticInfoList() {
    return this.logisticInfoList;
    }
    public void setLogisticInfoList(List<AliexpressSolutionOrderInfoGetGlobalAeopTpLogisticInfoDTO> logisticInfoList) {
    this.logisticInfoList = logisticInfoList;
    }
        public String getPayAmountBySettlementCur() {
    return this.payAmountBySettlementCur;
    }
    public void setPayAmountBySettlementCur(String payAmountBySettlementCur) {
    this.payAmountBySettlementCur = payAmountBySettlementCur;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public String getFrozenStatus() {
    return this.frozenStatus;
    }
    public void setFrozenStatus(String frozenStatus) {
    this.frozenStatus = frozenStatus;
    }
        public String getIssueStatus() {
    return this.issueStatus;
    }
    public void setIssueStatus(String issueStatus) {
    this.issueStatus = issueStatus;
    }
        public String getLogisticsStatus() {
    return this.logisticsStatus;
    }
    public void setLogisticsStatus(String logisticsStatus) {
    this.logisticsStatus = logisticsStatus;
    }
        public AliexpressSolutionOrderInfoGetGlobalMoneyStr getOrderAmount() {
    return this.orderAmount;
    }
    public void setOrderAmount(AliexpressSolutionOrderInfoGetGlobalMoneyStr orderAmount) {
    this.orderAmount = orderAmount;
    }
        public String getSellerSignerFullname() {
    return this.sellerSignerFullname;
    }
    public void setSellerSignerFullname(String sellerSignerFullname) {
    this.sellerSignerFullname = sellerSignerFullname;
    }
        public String getOverTimeLeft() {
    return this.overTimeLeft;
    }
    public void setOverTimeLeft(String overTimeLeft) {
    this.overTimeLeft = overTimeLeft;
    }
        public String getOrderEndReason() {
    return this.orderEndReason;
    }
    public void setOrderEndReason(String orderEndReason) {
    this.orderEndReason = orderEndReason;
    }
        public AliexpressSolutionOrderInfoGetGlobalMoneyStr getInitOderAmount() {
    return this.initOderAmount;
    }
    public void setInitOderAmount(AliexpressSolutionOrderInfoGetGlobalMoneyStr initOderAmount) {
    this.initOderAmount = initOderAmount;
    }
        public List<AliexpressSolutionOrderInfoGetGlobalAeopTpOperationLogDTO> getOprLogDtoList() {
    return this.oprLogDtoList;
    }
    public void setOprLogDtoList(List<AliexpressSolutionOrderInfoGetGlobalAeopTpOperationLogDTO> oprLogDtoList) {
    this.oprLogDtoList = oprLogDtoList;
    }
        public List<AliexpressSolutionOrderInfoGetGlobalAeopTpChildOrderDTO> getChildOrderList() {
    return this.childOrderList;
    }
    public void setChildOrderList(List<AliexpressSolutionOrderInfoGetGlobalAeopTpChildOrderDTO> childOrderList) {
    this.childOrderList = childOrderList;
    }
        public AliexpressSolutionOrderInfoGetGlobalAeopTpPersonDTO getBuyerInfo() {
    return this.buyerInfo;
    }
    public void setBuyerInfo(AliexpressSolutionOrderInfoGetGlobalAeopTpPersonDTO buyerInfo) {
    this.buyerInfo = buyerInfo;
    }
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
    }
        public AliexpressSolutionOrderInfoGetGlobalAeopTpAddressDTO getReceiptAddress() {
    return this.receiptAddress;
    }
    public void setReceiptAddress(AliexpressSolutionOrderInfoGetGlobalAeopTpAddressDTO receiptAddress) {
    this.receiptAddress = receiptAddress;
    }
        public String getGmtTradeEnd() {
    return this.gmtTradeEnd;
    }
    public void setGmtTradeEnd(String gmtTradeEnd) {
    this.gmtTradeEnd = gmtTradeEnd;
    }
        public Boolean getIsPhone() {
    return this.isPhone;
    }
    public void setIsPhone(Boolean isPhone) {
    this.isPhone = isPhone;
    }
        public String getBuyerloginid() {
    return this.buyerloginid;
    }
    public void setBuyerloginid(String buyerloginid) {
    this.buyerloginid = buyerloginid;
    }
        public AliexpressSolutionOrderInfoGetGlobalMoneyStr getLogisticsAmount() {
    return this.logisticsAmount;
    }
    public void setLogisticsAmount(AliexpressSolutionOrderInfoGetGlobalMoneyStr logisticsAmount) {
    this.logisticsAmount = logisticsAmount;
    }
        public String getMemo() {
    return this.memo;
    }
    public void setMemo(String memo) {
    this.memo = memo;
    }
        public String getLogisitcsEscrowFeeRate() {
    return this.logisitcsEscrowFeeRate;
    }
    public void setLogisitcsEscrowFeeRate(String logisitcsEscrowFeeRate) {
    this.logisitcsEscrowFeeRate = logisitcsEscrowFeeRate;
    }
        public List<AliexpressSolutionOrderInfoGetGlobalAeopTpOrderMsgDTO> getOrderMsgList() {
    return this.orderMsgList;
    }
    public void setOrderMsgList(List<AliexpressSolutionOrderInfoGetGlobalAeopTpOrderMsgDTO> orderMsgList) {
    this.orderMsgList = orderMsgList;
    }
    }