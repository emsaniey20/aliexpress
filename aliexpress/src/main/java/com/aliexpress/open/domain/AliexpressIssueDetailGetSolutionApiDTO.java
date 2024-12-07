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

public class AliexpressIssueDetailGetSolutionApiDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 买家接受时间 */
                @ApiField("buyer_accept_time")
            private String buyerAcceptTime;
        /** 内容 */
                @ApiField("content")
            private String content;
        /** 是否是默认方案 */
                @ApiField("is_default")
            private Boolean isDefault;
        /** 方案创建时间 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 最后修改时间 */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** 方案id */
                @ApiField("id")
            private Long id;
        /** 纠纷id */
                @ApiField("issue_id")
            private Long issueId;
        /** 退货运费金额 */
                @ApiField("logistics_fee_amount")
            private Long logisticsFeeAmount;
        /** 退货运费币种 */
                @ApiField("logistics_fee_amount_currency")
            private String logisticsFeeAmountCurrency;
        /** 运费承担方：seller、buyer、platform */
                @ApiField("logistics_fee_bear_role")
            private String logisticsFeeBearRole;
        /** 订单id */
                @ApiField("order_id")
            private Long orderId;
        /** 达成时间 */
                @ApiField("reached_time")
            private String reachedTime;
        /** 方案达成类型：协商一致negotiation_consensus、平台仲裁platform_arbitrate、卖家响应超时seller_reponse_timeout */
                @ApiField("reached_type")
            private String reachedType;
        /** 退款金额本币 */
                @ApiField("refund_money")
            private String refundMoney;
        /** 本币币种 */
                @ApiField("refund_money_currency")
            private String refundMoneyCurrency;
        /** 退款金额 美金 */
                @ApiField("refund_money_post")
            private String refundMoneyPost;
        /** refundMoneyPostCurrency */
                @ApiField("refund_money_post_currency")
            private String refundMoneyPostCurrency;
        /** 卖家接受时间 */
                @ApiField("seller_accept_time")
            private String sellerAcceptTime;
        /** 方案提出者 */
                @ApiField("solution_owner")
            private String solutionOwner;
        /** 方案类型：退款refund、退货退款return_and_refund */
                @ApiField("solution_type")
            private String solutionType;
        /** 方案状态 待买卖家双方接受wait_buyer_and_seller_accept,待买家接受wait_buyer_accept,待卖家接受wait_seller_accept,达成reached,买家拒绝buyer_refused,卖家接受买家拒绝(针对平台方案)seller_accept_and_buyer_refused,退货阶段,卖家上升仲裁,平台给方案,之前达成的方案改成此状态reach_cancle,执行perform */
                @ApiField("status")
            private String status;
        /** 版本号 */
                @ApiField("version")
            private Integer version;
    
        public String getBuyerAcceptTime() {
    return this.buyerAcceptTime;
    }
    public void setBuyerAcceptTime(String buyerAcceptTime) {
    this.buyerAcceptTime = buyerAcceptTime;
    }
        public String getContent() {
    return this.content;
    }
    public void setContent(String content) {
    this.content = content;
    }
        public Boolean getIsDefault() {
    return this.isDefault;
    }
    public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
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
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public Long getIssueId() {
    return this.issueId;
    }
    public void setIssueId(Long issueId) {
    this.issueId = issueId;
    }
        public Long getLogisticsFeeAmount() {
    return this.logisticsFeeAmount;
    }
    public void setLogisticsFeeAmount(Long logisticsFeeAmount) {
    this.logisticsFeeAmount = logisticsFeeAmount;
    }
        public String getLogisticsFeeAmountCurrency() {
    return this.logisticsFeeAmountCurrency;
    }
    public void setLogisticsFeeAmountCurrency(String logisticsFeeAmountCurrency) {
    this.logisticsFeeAmountCurrency = logisticsFeeAmountCurrency;
    }
        public String getLogisticsFeeBearRole() {
    return this.logisticsFeeBearRole;
    }
    public void setLogisticsFeeBearRole(String logisticsFeeBearRole) {
    this.logisticsFeeBearRole = logisticsFeeBearRole;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public String getReachedTime() {
    return this.reachedTime;
    }
    public void setReachedTime(String reachedTime) {
    this.reachedTime = reachedTime;
    }
        public String getReachedType() {
    return this.reachedType;
    }
    public void setReachedType(String reachedType) {
    this.reachedType = reachedType;
    }
        public String getRefundMoney() {
    return this.refundMoney;
    }
    public void setRefundMoney(String refundMoney) {
    this.refundMoney = refundMoney;
    }
        public String getRefundMoneyCurrency() {
    return this.refundMoneyCurrency;
    }
    public void setRefundMoneyCurrency(String refundMoneyCurrency) {
    this.refundMoneyCurrency = refundMoneyCurrency;
    }
        public String getRefundMoneyPost() {
    return this.refundMoneyPost;
    }
    public void setRefundMoneyPost(String refundMoneyPost) {
    this.refundMoneyPost = refundMoneyPost;
    }
        public String getRefundMoneyPostCurrency() {
    return this.refundMoneyPostCurrency;
    }
    public void setRefundMoneyPostCurrency(String refundMoneyPostCurrency) {
    this.refundMoneyPostCurrency = refundMoneyPostCurrency;
    }
        public String getSellerAcceptTime() {
    return this.sellerAcceptTime;
    }
    public void setSellerAcceptTime(String sellerAcceptTime) {
    this.sellerAcceptTime = sellerAcceptTime;
    }
        public String getSolutionOwner() {
    return this.solutionOwner;
    }
    public void setSolutionOwner(String solutionOwner) {
    this.solutionOwner = solutionOwner;
    }
        public String getSolutionType() {
    return this.solutionType;
    }
    public void setSolutionType(String solutionType) {
    this.solutionType = solutionType;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public Integer getVersion() {
    return this.version;
    }
    public void setVersion(Integer version) {
    this.version = version;
    }
    }