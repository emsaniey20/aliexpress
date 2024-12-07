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

public class AliexpressTradeSellerOrderlistGetAeopOrderItemDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 订单类型。（AE_COMMON:普通订单;AE_TRIAL:试用订单;AE_RECHARGE:手机充值订单) */
                @ApiField("biz_type")
            private String bizType;
        /** 买家登录id */
                @ApiField("buyer_login_id")
            private String buyerLoginId;
        /** 买家全名 */
                @ApiField("buyer_signer_fullname")
            private String buyerSignerFullname;
        /** 结束原因 */
                @ApiField("end_reason")
            private String endReason;
        /** 手续费 */
                @ApiField("escrow_fee")
            private AliexpressTradeSellerOrderlistGetSimpleMoney escrowFee;
        /** 手续费率 */
                @ApiField("escrow_fee_rate")
            private Integer escrowFeeRate;
        /** 冻结状态。(NO_FROZEN:无冻结; IN_FROZEN:冻结中) */
                @ApiField("frozen_status")
            private String frozenStatus;
        /** 资金状态。(NOT_PAY:未付款; PAY_SUCCESS:付款成功; WAIT_SELLER_CHECK:卖家验款) */
                @ApiField("fund_status")
            private String fundStatus;
        /** 订单创建时间 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 订单支付时间（和订单详情中gmtPaysuccess字段意义相同。) */
                @ApiField("gmt_pay_time")
            private String gmtPayTime;
        /** 最后一次订单发货时间（已完成订单不返回时间） */
                @ApiField("gmt_send_goods_time")
            private String gmtSendGoodsTime;
        /** 订单最后更新时间 */
                @ApiField("gmt_update")
            private String gmtUpdate;
        /** 是否已请求放款 */
                @ApiField("has_request_loan")
            private Boolean hasRequestLoan;
        /** 纠纷状态。(NO_ISSUE:无纠纷; IN_ISSUE:纠纷中; END_ISSUE:纠纷结束) */
                @ApiField("issue_status")
            private String issueStatus;
        /** 剩余发货时间（天） */
                @ApiField("left_send_good_day")
            private String leftSendGoodDay;
        /** 剩余发货时间（小时） */
                @ApiField("left_send_good_hour")
            private String leftSendGoodHour;
        /** 剩余发货时间（分钟） */
                @ApiField("left_send_good_min")
            private String leftSendGoodMin;
        /** 放款金额 */
                @ApiField("loan_amount")
            private AliexpressTradeSellerOrderlistGetSimpleMoney loanAmount;
        /** 运费佣金比例 */
                @ApiField("logisitcs_escrow_fee_rate")
            private String logisitcsEscrowFeeRate;
        /** 物流状态。（WAIT_SELLER_SEND_GOODS:等待卖家发货; SELLER_SEND_PART_GOODS:卖家部分发货; SELLER_SEND_GOODS:卖家已发货; BUYER_ACCEPT_GOODS:买家已确认收货; NO_LOGISTICS:没有物流流转信息） */
                @ApiField("logistics_status")
            private String logisticsStatus;
        /** 订单详情链接 */
                @ApiField("order_detail_url")
            private String orderDetailUrl;
        /** 订单ID */
                @ApiField("order_id")
            private Long orderId;
        /** 订单状态 */
                @ApiField("order_status")
            private String orderStatus;
        /** 付款金额 */
                @ApiField("pay_amount")
            private AliexpressTradeSellerOrderlistGetSimpleMoney payAmount;
        /** 付款方式。 （migs:信用卡支付走人民币渠道; migs102:MasterCard支付并且走人民币渠道; migs101:Visa支付并且走人民币渠道; pp101:PayPal; mb: MoneyBooker渠道; tt101:Bank Transfer支付; wu101: West Union支付； wp101:Visa走美金渠道的支付; wp102:Mastercard走美金渠道的支付; qw101:QIWI支付; cybs101:Visa走CYBS渠道的支付; cybs102: Mastercard走CYBS渠道的支付; wm101:WebMoney支付; ebanx101:巴西Beloto支付） */
                @ApiField("payment_type")
            private String paymentType;
        /** 是否手机订单 */
                @ApiField("phone")
            private Boolean phone;
        /** 商品列表 */
                @ApiListField("product_list")
            private List<AliexpressTradeSellerOrderlistGetAeopOrderProductDTO> productList;
        /** 卖家登录ID */
                @ApiField("seller_login_id")
            private String sellerLoginId;
        /** 卖家操作人员的登录id */
                @ApiField("seller_operator_login_id")
            private String sellerOperatorLoginId;
        /** 卖家全名 */
                @ApiField("seller_signer_fullname")
            private String sellerSignerFullname;
        /** 当前状态下的超时剩余时间（负数表示已超时时间） */
                @ApiField("timeout_left_time")
            private Long timeoutLeftTime;
    
        public String getBizType() {
    return this.bizType;
    }
    public void setBizType(String bizType) {
    this.bizType = bizType;
    }
        public String getBuyerLoginId() {
    return this.buyerLoginId;
    }
    public void setBuyerLoginId(String buyerLoginId) {
    this.buyerLoginId = buyerLoginId;
    }
        public String getBuyerSignerFullname() {
    return this.buyerSignerFullname;
    }
    public void setBuyerSignerFullname(String buyerSignerFullname) {
    this.buyerSignerFullname = buyerSignerFullname;
    }
        public String getEndReason() {
    return this.endReason;
    }
    public void setEndReason(String endReason) {
    this.endReason = endReason;
    }
        public AliexpressTradeSellerOrderlistGetSimpleMoney getEscrowFee() {
    return this.escrowFee;
    }
    public void setEscrowFee(AliexpressTradeSellerOrderlistGetSimpleMoney escrowFee) {
    this.escrowFee = escrowFee;
    }
        public Integer getEscrowFeeRate() {
    return this.escrowFeeRate;
    }
    public void setEscrowFeeRate(Integer escrowFeeRate) {
    this.escrowFeeRate = escrowFeeRate;
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
        public String getGmtPayTime() {
    return this.gmtPayTime;
    }
    public void setGmtPayTime(String gmtPayTime) {
    this.gmtPayTime = gmtPayTime;
    }
        public String getGmtSendGoodsTime() {
    return this.gmtSendGoodsTime;
    }
    public void setGmtSendGoodsTime(String gmtSendGoodsTime) {
    this.gmtSendGoodsTime = gmtSendGoodsTime;
    }
        public String getGmtUpdate() {
    return this.gmtUpdate;
    }
    public void setGmtUpdate(String gmtUpdate) {
    this.gmtUpdate = gmtUpdate;
    }
        public Boolean getHasRequestLoan() {
    return this.hasRequestLoan;
    }
    public void setHasRequestLoan(Boolean hasRequestLoan) {
    this.hasRequestLoan = hasRequestLoan;
    }
        public String getIssueStatus() {
    return this.issueStatus;
    }
    public void setIssueStatus(String issueStatus) {
    this.issueStatus = issueStatus;
    }
        public String getLeftSendGoodDay() {
    return this.leftSendGoodDay;
    }
    public void setLeftSendGoodDay(String leftSendGoodDay) {
    this.leftSendGoodDay = leftSendGoodDay;
    }
        public String getLeftSendGoodHour() {
    return this.leftSendGoodHour;
    }
    public void setLeftSendGoodHour(String leftSendGoodHour) {
    this.leftSendGoodHour = leftSendGoodHour;
    }
        public String getLeftSendGoodMin() {
    return this.leftSendGoodMin;
    }
    public void setLeftSendGoodMin(String leftSendGoodMin) {
    this.leftSendGoodMin = leftSendGoodMin;
    }
        public AliexpressTradeSellerOrderlistGetSimpleMoney getLoanAmount() {
    return this.loanAmount;
    }
    public void setLoanAmount(AliexpressTradeSellerOrderlistGetSimpleMoney loanAmount) {
    this.loanAmount = loanAmount;
    }
        public String getLogisitcsEscrowFeeRate() {
    return this.logisitcsEscrowFeeRate;
    }
    public void setLogisitcsEscrowFeeRate(String logisitcsEscrowFeeRate) {
    this.logisitcsEscrowFeeRate = logisitcsEscrowFeeRate;
    }
        public String getLogisticsStatus() {
    return this.logisticsStatus;
    }
    public void setLogisticsStatus(String logisticsStatus) {
    this.logisticsStatus = logisticsStatus;
    }
        public String getOrderDetailUrl() {
    return this.orderDetailUrl;
    }
    public void setOrderDetailUrl(String orderDetailUrl) {
    this.orderDetailUrl = orderDetailUrl;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public AliexpressTradeSellerOrderlistGetSimpleMoney getPayAmount() {
    return this.payAmount;
    }
    public void setPayAmount(AliexpressTradeSellerOrderlistGetSimpleMoney payAmount) {
    this.payAmount = payAmount;
    }
        public String getPaymentType() {
    return this.paymentType;
    }
    public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
    }
        public Boolean getPhone() {
    return this.phone;
    }
    public void setPhone(Boolean phone) {
    this.phone = phone;
    }
        public List<AliexpressTradeSellerOrderlistGetAeopOrderProductDTO> getProductList() {
    return this.productList;
    }
    public void setProductList(List<AliexpressTradeSellerOrderlistGetAeopOrderProductDTO> productList) {
    this.productList = productList;
    }
        public String getSellerLoginId() {
    return this.sellerLoginId;
    }
    public void setSellerLoginId(String sellerLoginId) {
    this.sellerLoginId = sellerLoginId;
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
        public Long getTimeoutLeftTime() {
    return this.timeoutLeftTime;
    }
    public void setTimeoutLeftTime(Long timeoutLeftTime) {
    this.timeoutLeftTime = timeoutLeftTime;
    }
    }