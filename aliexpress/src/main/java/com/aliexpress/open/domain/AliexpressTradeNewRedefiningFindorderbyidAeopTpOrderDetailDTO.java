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

public class AliexpressTradeNewRedefiningFindorderbyidAeopTpOrderDetailDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 加密oaid */
                @ApiField("oaid")
            private String oaid;
        /** 手续费（已废弃） */
                @ApiField("escrow_fee")
            private AliexpressTradeNewRedefiningFindorderbyidMoneyStr escrowFee;
        /** 冻结状态 */
                @ApiField("frozen_status")
            private String frozenStatus;
        /** 资金状态 */
                @ApiField("fund_status")
            private String fundStatus;
        /** 订单创建时间(此时间为美国太平洋时间) */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 订单修改时间(此时间为美国太平洋时间) */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** 支付成功时间（与订单列表中gmtPayTime字段意义相同）(此时间为美国太平洋时间) */
                @ApiField("gmt_pay_success")
            private String gmtPaySuccess;
        /** 订单结束时间(此时间为美国太平洋时间) */
                @ApiField("gmt_trade_end")
            private String gmtTradeEnd;
        /** 订单ID */
                @ApiField("id")
            private Long id;
        /** 产品总金额 */
                @ApiField("init_oder_amount")
            private AliexpressTradeNewRedefiningFindorderbyidMoneyStr initOderAmount;
        /** 纠纷信息 */
                @ApiField("issue_info")
            private AliexpressTradeNewRedefiningFindorderbyidAeopTpIssueInfoDTO issueInfo;
        /** 纠纷状态（IN_ISSUE:纠纷中，NO_ISSUE:无纠纷;END_ISSUE:纠纷结束） */
                @ApiField("issue_status")
            private String issueStatus;
        /** 放款信息 */
                @ApiField("loan_info")
            private AliexpressTradeNewRedefiningFindorderbyidAeopTpLoanInfoDTO loanInfo;
        /** 放款状态("loan_none":无放款;"wait_loan":等待放款;"loan_ok":放款成功) */
                @ApiField("loan_status")
            private String loanStatus;
        /** 运费佣金比例(已废弃) */
                @ApiField("logisitcs_escrow_fee_rate")
            private String logisitcsEscrowFeeRate;
        /** 物流信息 */
                @ApiListField("logistic_info_list")
            private List<AliexpressTradeNewRedefiningFindorderbyidAeopTpLogisticInfoDTO> logisticInfoList;
        /** 物流费用 */
                @ApiField("logistics_amount")
            private AliexpressTradeNewRedefiningFindorderbyidMoneyStr logisticsAmount;
        /** 物流状态：NO_LOGISTICS 无物流信息、等待卖家发货 WAIT_SELLER_SEND_GOODS,卖家部分发货 SELLER_SEND_PART_GOODS,卖家已发货  SELLER_SEND_GOODS,买家已确认收货  BUYER_ACCEPT_GOODS,NO_LOGISTICS */
                @ApiField("logistics_status")
            private String logisticsStatus;
        /** 买家备注（订单级别） */
                @ApiField("memo")
            private String memo;
        /** 操作日志列表 */
                @ApiListField("opr_log_dto_list")
            private List<AliexpressTradeNewRedefiningFindorderbyidAeopTpOperationLogDTO> oprLogDtoList;
        /** 订单金额 */
                @ApiField("order_amount")
            private AliexpressTradeNewRedefiningFindorderbyidMoneyStr orderAmount;
        /** 订单结束原因 */
                @ApiField("order_end_reason")
            private String orderEndReason;
        /** 留言信息（已废弃） */
                @ApiListField("order_msg_list")
            private List<AliexpressTradeNewRedefiningFindorderbyidAeopTpOrderMsgDTO> orderMsgList;
        /** 订单状态 */
                @ApiField("order_status")
            private String orderStatus;
        /** 当前状态超时日期 （此时间为美国太平洋时间） */
                @ApiField("over_time_left")
            private String overTimeLeft;
        /** 买家支付金额(结算币种) */
                @ApiField("pay_amount_by_settlement_cur")
            private String payAmountBySettlementCur;
        /** 付款方式 （migs信用卡支付走人民币渠道； migs102MasterCard支付并且走人民币渠道； migs101Visa支付并且走人民币渠道； pp101 PayPal； mb MoneyBooker渠道； tt101 Bank Transfer支付； wu101 West Union支付； wp101 Visa走美金渠道的支付； wp102 Mastercard 走美金渠道的支付； qw101 QIWI支付； cybs101 Visa走CYBS渠道的支付； cybs102 Mastercard 走CYBS渠道的支付； wm101 WebMoney支付； ebanx101 巴西Beloto支付 ；） */
                @ApiField("payment_type")
            private String paymentType;
        /** 是否手机订单 */
                @ApiField("is_phone")
            private Boolean isPhone;
        /** 收货地址信息 */
                @ApiField("receipt_address")
            private AliexpressTradeNewRedefiningFindorderbyidAeopTpAddressDTO receiptAddress;
        /** 买家信息 */
                @ApiField("buyer_info")
            private AliexpressTradeNewRedefiningFindorderbyidAeopTpPersonDTO buyerInfo;
        /** 买家全名 */
                @ApiField("buyer_signer_fullname")
            private String buyerSignerFullname;
        /** 买家登录id */
                @ApiField("buyerloginid")
            private String buyerloginid;
        /** 商品信息 */
                @ApiListField("child_order_ext_info_list")
            private List<AliexpressTradeNewRedefiningFindorderbyidAeopTpOrderProductInfoDTO> childOrderExtInfoList;
        /** 退款信息 */
                @ApiField("refund_info")
            private AliexpressTradeNewRedefiningFindorderbyidAeopTpRefundInfoDTO refundInfo;
        /** 子订单列表 */
                @ApiListField("child_order_list")
            private List<AliexpressTradeNewRedefiningFindorderbyidAeopTpChildOrderDTO> childOrderList;
        /** 卖家操作员Ali id */
                @ApiField("seller_operator_aliidloginid")
            private String sellerOperatorAliidloginid;
        /** 卖家操作员登录ID */
                @ApiField("seller_operator_login_id")
            private String sellerOperatorLoginId;
        /** 卖家名称 */
                @ApiField("seller_signer_fullname")
            private String sellerSignerFullname;
        /** 支付金额结算币种 */
                @ApiField("settlement_currency")
            private String settlementCurrency;
        /** 是否是货到付款订单 */
                @ApiField("cod")
            private Boolean cod;
        /** 新订单金额，比order_amount更准确，考虑了卖家调价及COD费用。仅限于新订单（7.18-7.31期间创建的部分订单及8.1以后创建的所有订单）。 */
                @ApiField("new_order_amount")
            private AliexpressTradeNewRedefiningFindorderbyidSimpleMoney newOrderAmount;
        /** 买家申请取消订单的原因，仅对取消中的订单有效 */
                @ApiField("cancel_request_reason")
            private String cancelRequestReason;
        /** 新订单金额，比order_amount更准确，考虑了卖家调价及COD费用。仅限于新订单（7.18-7.31期间创建的部分订单及8.1以后创建的所有订单）。含税价订单，不含税金 */
                @ApiField("seller_order_amount")
            private AliexpressTradeNewRedefiningFindorderbyidSimpleMoney sellerOrderAmount;
    
        public String getOaid() {
    return this.oaid;
    }
    public void setOaid(String oaid) {
    this.oaid = oaid;
    }
        public AliexpressTradeNewRedefiningFindorderbyidMoneyStr getEscrowFee() {
    return this.escrowFee;
    }
    public void setEscrowFee(AliexpressTradeNewRedefiningFindorderbyidMoneyStr escrowFee) {
    this.escrowFee = escrowFee;
    }
        public String getFrozenStatus() {
    return this.frozenStatus;
    }
    public void setFrozenStatus(String frozenStatus) {
    this.frozenStatus = frozenStatus;
    }
        public String getFundStatus() {
    return this.fundStatus;
    }
    public void setFundStatus(String fundStatus) {
    this.fundStatus = fundStatus;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
    }
        public String getGmtPaySuccess() {
    return this.gmtPaySuccess;
    }
    public void setGmtPaySuccess(String gmtPaySuccess) {
    this.gmtPaySuccess = gmtPaySuccess;
    }
        public String getGmtTradeEnd() {
    return this.gmtTradeEnd;
    }
    public void setGmtTradeEnd(String gmtTradeEnd) {
    this.gmtTradeEnd = gmtTradeEnd;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public AliexpressTradeNewRedefiningFindorderbyidMoneyStr getInitOderAmount() {
    return this.initOderAmount;
    }
    public void setInitOderAmount(AliexpressTradeNewRedefiningFindorderbyidMoneyStr initOderAmount) {
    this.initOderAmount = initOderAmount;
    }
        public AliexpressTradeNewRedefiningFindorderbyidAeopTpIssueInfoDTO getIssueInfo() {
    return this.issueInfo;
    }
    public void setIssueInfo(AliexpressTradeNewRedefiningFindorderbyidAeopTpIssueInfoDTO issueInfo) {
    this.issueInfo = issueInfo;
    }
        public String getIssueStatus() {
    return this.issueStatus;
    }
    public void setIssueStatus(String issueStatus) {
    this.issueStatus = issueStatus;
    }
        public AliexpressTradeNewRedefiningFindorderbyidAeopTpLoanInfoDTO getLoanInfo() {
    return this.loanInfo;
    }
    public void setLoanInfo(AliexpressTradeNewRedefiningFindorderbyidAeopTpLoanInfoDTO loanInfo) {
    this.loanInfo = loanInfo;
    }
        public String getLoanStatus() {
    return this.loanStatus;
    }
    public void setLoanStatus(String loanStatus) {
    this.loanStatus = loanStatus;
    }
        public String getLogisitcsEscrowFeeRate() {
    return this.logisitcsEscrowFeeRate;
    }
    public void setLogisitcsEscrowFeeRate(String logisitcsEscrowFeeRate) {
    this.logisitcsEscrowFeeRate = logisitcsEscrowFeeRate;
    }
        public List<AliexpressTradeNewRedefiningFindorderbyidAeopTpLogisticInfoDTO> getLogisticInfoList() {
    return this.logisticInfoList;
    }
    public void setLogisticInfoList(List<AliexpressTradeNewRedefiningFindorderbyidAeopTpLogisticInfoDTO> logisticInfoList) {
    this.logisticInfoList = logisticInfoList;
    }
        public AliexpressTradeNewRedefiningFindorderbyidMoneyStr getLogisticsAmount() {
    return this.logisticsAmount;
    }
    public void setLogisticsAmount(AliexpressTradeNewRedefiningFindorderbyidMoneyStr logisticsAmount) {
    this.logisticsAmount = logisticsAmount;
    }
        public String getLogisticsStatus() {
    return this.logisticsStatus;
    }
    public void setLogisticsStatus(String logisticsStatus) {
    this.logisticsStatus = logisticsStatus;
    }
        public String getMemo() {
    return this.memo;
    }
    public void setMemo(String memo) {
    this.memo = memo;
    }
        public List<AliexpressTradeNewRedefiningFindorderbyidAeopTpOperationLogDTO> getOprLogDtoList() {
    return this.oprLogDtoList;
    }
    public void setOprLogDtoList(List<AliexpressTradeNewRedefiningFindorderbyidAeopTpOperationLogDTO> oprLogDtoList) {
    this.oprLogDtoList = oprLogDtoList;
    }
        public AliexpressTradeNewRedefiningFindorderbyidMoneyStr getOrderAmount() {
    return this.orderAmount;
    }
    public void setOrderAmount(AliexpressTradeNewRedefiningFindorderbyidMoneyStr orderAmount) {
    this.orderAmount = orderAmount;
    }
        public String getOrderEndReason() {
    return this.orderEndReason;
    }
    public void setOrderEndReason(String orderEndReason) {
    this.orderEndReason = orderEndReason;
    }
        public List<AliexpressTradeNewRedefiningFindorderbyidAeopTpOrderMsgDTO> getOrderMsgList() {
    return this.orderMsgList;
    }
    public void setOrderMsgList(List<AliexpressTradeNewRedefiningFindorderbyidAeopTpOrderMsgDTO> orderMsgList) {
    this.orderMsgList = orderMsgList;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public String getOverTimeLeft() {
    return this.overTimeLeft;
    }
    public void setOverTimeLeft(String overTimeLeft) {
    this.overTimeLeft = overTimeLeft;
    }
        public String getPayAmountBySettlementCur() {
    return this.payAmountBySettlementCur;
    }
    public void setPayAmountBySettlementCur(String payAmountBySettlementCur) {
    this.payAmountBySettlementCur = payAmountBySettlementCur;
    }
        public String getPaymentType() {
    return this.paymentType;
    }
    public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
    }
        public Boolean getIsPhone() {
    return this.isPhone;
    }
    public void setIsPhone(Boolean isPhone) {
    this.isPhone = isPhone;
    }
        public AliexpressTradeNewRedefiningFindorderbyidAeopTpAddressDTO getReceiptAddress() {
    return this.receiptAddress;
    }
    public void setReceiptAddress(AliexpressTradeNewRedefiningFindorderbyidAeopTpAddressDTO receiptAddress) {
    this.receiptAddress = receiptAddress;
    }
        public AliexpressTradeNewRedefiningFindorderbyidAeopTpPersonDTO getBuyerInfo() {
    return this.buyerInfo;
    }
    public void setBuyerInfo(AliexpressTradeNewRedefiningFindorderbyidAeopTpPersonDTO buyerInfo) {
    this.buyerInfo = buyerInfo;
    }
        public String getBuyerSignerFullname() {
    return this.buyerSignerFullname;
    }
    public void setBuyerSignerFullname(String buyerSignerFullname) {
    this.buyerSignerFullname = buyerSignerFullname;
    }
        public String getBuyerloginid() {
    return this.buyerloginid;
    }
    public void setBuyerloginid(String buyerloginid) {
    this.buyerloginid = buyerloginid;
    }
        public List<AliexpressTradeNewRedefiningFindorderbyidAeopTpOrderProductInfoDTO> getChildOrderExtInfoList() {
    return this.childOrderExtInfoList;
    }
    public void setChildOrderExtInfoList(List<AliexpressTradeNewRedefiningFindorderbyidAeopTpOrderProductInfoDTO> childOrderExtInfoList) {
    this.childOrderExtInfoList = childOrderExtInfoList;
    }
        public AliexpressTradeNewRedefiningFindorderbyidAeopTpRefundInfoDTO getRefundInfo() {
    return this.refundInfo;
    }
    public void setRefundInfo(AliexpressTradeNewRedefiningFindorderbyidAeopTpRefundInfoDTO refundInfo) {
    this.refundInfo = refundInfo;
    }
        public List<AliexpressTradeNewRedefiningFindorderbyidAeopTpChildOrderDTO> getChildOrderList() {
    return this.childOrderList;
    }
    public void setChildOrderList(List<AliexpressTradeNewRedefiningFindorderbyidAeopTpChildOrderDTO> childOrderList) {
    this.childOrderList = childOrderList;
    }
        public String getSellerOperatorAliidloginid() {
    return this.sellerOperatorAliidloginid;
    }
    public void setSellerOperatorAliidloginid(String sellerOperatorAliidloginid) {
    this.sellerOperatorAliidloginid = sellerOperatorAliidloginid;
    }
        public String getSellerOperatorLoginId() {
    return this.sellerOperatorLoginId;
    }
    public void setSellerOperatorLoginId(String sellerOperatorLoginId) {
    this.sellerOperatorLoginId = sellerOperatorLoginId;
    }
        public String getSellerSignerFullname() {
    return this.sellerSignerFullname;
    }
    public void setSellerSignerFullname(String sellerSignerFullname) {
    this.sellerSignerFullname = sellerSignerFullname;
    }
        public String getSettlementCurrency() {
    return this.settlementCurrency;
    }
    public void setSettlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
    }
        public Boolean getCod() {
    return this.cod;
    }
    public void setCod(Boolean cod) {
    this.cod = cod;
    }
        public AliexpressTradeNewRedefiningFindorderbyidSimpleMoney getNewOrderAmount() {
    return this.newOrderAmount;
    }
    public void setNewOrderAmount(AliexpressTradeNewRedefiningFindorderbyidSimpleMoney newOrderAmount) {
    this.newOrderAmount = newOrderAmount;
    }
        public String getCancelRequestReason() {
    return this.cancelRequestReason;
    }
    public void setCancelRequestReason(String cancelRequestReason) {
    this.cancelRequestReason = cancelRequestReason;
    }
        public AliexpressTradeNewRedefiningFindorderbyidSimpleMoney getSellerOrderAmount() {
    return this.sellerOrderAmount;
    }
    public void setSellerOrderAmount(AliexpressTradeNewRedefiningFindorderbyidSimpleMoney sellerOrderAmount) {
    this.sellerOrderAmount = sellerOrderAmount;
    }
    }