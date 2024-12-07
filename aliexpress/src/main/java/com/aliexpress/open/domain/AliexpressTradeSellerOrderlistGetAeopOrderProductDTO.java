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

public class AliexpressTradeSellerOrderlistGetAeopOrderProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 存储子订单的拓展参数，是一个map 序列化成Json的。"orderBusinessModel":"SEMI_CHOICE_SELF"是半托管 */
                @ApiField("extend_map")
            private String extendMap;
        /** 联盟佣金比例 */
                @ApiField("afflicate_fee_rate")
            private String afflicateFeeRate;
        /** 买家firstName */
                @ApiField("buyer_signer_first_name")
            private String buyerSignerFirstName;
        /** 买家lastName */
                @ApiField("buyer_signer_last_name")
            private String buyerSignerLastName;
        /** 子订单是否能提交纠纷 */
                @ApiField("can_submit_issue")
            private Boolean canSubmitIssue;
        /** 子订单id */
                @ApiField("child_id")
            private Long childId;
        /** 妥投时间 */
                @ApiField("delivery_time")
            private String deliveryTime;
        /** 交易佣金比例 */
                @ApiField("escrow_fee_rate")
            private String escrowFeeRate;
        /** 限时达 */
                @ApiField("freight_commit_day")
            private String freightCommitDay;
        /** 资金状态。(NOT_PAY:未付款; PAY_SUCCESS:付款成功; WAIT_SELLER_CHECK:卖家验款) */
                @ApiField("fund_status")
            private String fundStatus;
        /** 备货时间 */
                @ApiField("goods_prepare_time")
            private Integer goodsPrepareTime;
        /** 纠纷类型 */
                @ApiField("issue_mode")
            private String issueMode;
        /** 纠纷状态。(NO_ISSUE:无纠纷; IN_ISSUE:纠纷中; END_ISSUE:纠纷结束) */
                @ApiField("issue_status")
            private String issueStatus;
        /** 物流费用（子订单没有运费，请忽略） */
                @ApiField("logistics_amount")
            private AliexpressTradeSellerOrderlistGetSimpleMoney logisticsAmount;
        /** 物流服务 */
                @ApiField("logistics_service_name")
            private String logisticsServiceName;
        /** 物流类型 */
                @ApiField("logistics_type")
            private String logisticsType;
        /** 买家备注 */
                @ApiField("memo")
            private String memo;
        /** 是否假一赔三产品 */
                @ApiField("money_back3x")
            private Boolean moneyBack3x;
        /** 订单id */
                @ApiField("order_id")
            private Long orderId;
        /** 商品数量 */
                @ApiField("product_count")
            private Integer productCount;
        /** 商品id */
                @ApiField("product_id")
            private Long productId;
        /** 商品主图Url */
                @ApiField("product_img_url")
            private String productImgUrl;
        /** 商品名称 */
                @ApiField("product_name")
            private String productName;
        /** 快照Url */
                @ApiField("product_snap_url")
            private String productSnapUrl;
        /** 商品规格 */
                @ApiField("product_standard")
            private String productStandard;
        /** 商品单位 */
                @ApiField("product_unit")
            private String productUnit;
        /** 商品单价 */
                @ApiField("product_unit_price")
            private AliexpressTradeSellerOrderlistGetSimpleMoney productUnitPrice;
        /** 发货者类型。 "SELLER_SEND_GOODS": 卖家发货; "WAREHOUSE_SEND_GOODS":仓库发货 */
                @ApiField("send_goods_operator")
            private String sendGoodsOperator;
        /** 最后发货时间 */
                @ApiField("send_goods_time")
            private String sendGoodsTime;
        /** 订单显示状态 */
                @ApiField("show_status")
            private String showStatus;
        /** 商品编码 */
                @ApiField("sku_code")
            private String skuCode;
        /** 子订单状态 */
                @ApiField("son_order_status")
            private String sonOrderStatus;
        /** 全部商品金额 */
                @ApiField("total_product_amount")
            private AliexpressTradeSellerOrderlistGetSimpleMoney totalProductAmount;
        /** 子订单中的各种标 */
                @ApiListField("tags")
            private List<String> tags;
    
        public String getExtendMap() {
    return this.extendMap;
    }
    public void setExtendMap(String extendMap) {
    this.extendMap = extendMap;
    }
        public String getAfflicateFeeRate() {
    return this.afflicateFeeRate;
    }
    public void setAfflicateFeeRate(String afflicateFeeRate) {
    this.afflicateFeeRate = afflicateFeeRate;
    }
        public String getBuyerSignerFirstName() {
    return this.buyerSignerFirstName;
    }
    public void setBuyerSignerFirstName(String buyerSignerFirstName) {
    this.buyerSignerFirstName = buyerSignerFirstName;
    }
        public String getBuyerSignerLastName() {
    return this.buyerSignerLastName;
    }
    public void setBuyerSignerLastName(String buyerSignerLastName) {
    this.buyerSignerLastName = buyerSignerLastName;
    }
        public Boolean getCanSubmitIssue() {
    return this.canSubmitIssue;
    }
    public void setCanSubmitIssue(Boolean canSubmitIssue) {
    this.canSubmitIssue = canSubmitIssue;
    }
        public Long getChildId() {
    return this.childId;
    }
    public void setChildId(Long childId) {
    this.childId = childId;
    }
        public String getDeliveryTime() {
    return this.deliveryTime;
    }
    public void setDeliveryTime(String deliveryTime) {
    this.deliveryTime = deliveryTime;
    }
        public String getEscrowFeeRate() {
    return this.escrowFeeRate;
    }
    public void setEscrowFeeRate(String escrowFeeRate) {
    this.escrowFeeRate = escrowFeeRate;
    }
        public String getFreightCommitDay() {
    return this.freightCommitDay;
    }
    public void setFreightCommitDay(String freightCommitDay) {
    this.freightCommitDay = freightCommitDay;
    }
        public String getFundStatus() {
    return this.fundStatus;
    }
    public void setFundStatus(String fundStatus) {
    this.fundStatus = fundStatus;
    }
        public Integer getGoodsPrepareTime() {
    return this.goodsPrepareTime;
    }
    public void setGoodsPrepareTime(Integer goodsPrepareTime) {
    this.goodsPrepareTime = goodsPrepareTime;
    }
        public String getIssueMode() {
    return this.issueMode;
    }
    public void setIssueMode(String issueMode) {
    this.issueMode = issueMode;
    }
        public String getIssueStatus() {
    return this.issueStatus;
    }
    public void setIssueStatus(String issueStatus) {
    this.issueStatus = issueStatus;
    }
        public AliexpressTradeSellerOrderlistGetSimpleMoney getLogisticsAmount() {
    return this.logisticsAmount;
    }
    public void setLogisticsAmount(AliexpressTradeSellerOrderlistGetSimpleMoney logisticsAmount) {
    this.logisticsAmount = logisticsAmount;
    }
        public String getLogisticsServiceName() {
    return this.logisticsServiceName;
    }
    public void setLogisticsServiceName(String logisticsServiceName) {
    this.logisticsServiceName = logisticsServiceName;
    }
        public String getLogisticsType() {
    return this.logisticsType;
    }
    public void setLogisticsType(String logisticsType) {
    this.logisticsType = logisticsType;
    }
        public String getMemo() {
    return this.memo;
    }
    public void setMemo(String memo) {
    this.memo = memo;
    }
        public Boolean getMoneyBack3x() {
    return this.moneyBack3x;
    }
    public void setMoneyBack3x(Boolean moneyBack3x) {
    this.moneyBack3x = moneyBack3x;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public Integer getProductCount() {
    return this.productCount;
    }
    public void setProductCount(Integer productCount) {
    this.productCount = productCount;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getProductImgUrl() {
    return this.productImgUrl;
    }
    public void setProductImgUrl(String productImgUrl) {
    this.productImgUrl = productImgUrl;
    }
        public String getProductName() {
    return this.productName;
    }
    public void setProductName(String productName) {
    this.productName = productName;
    }
        public String getProductSnapUrl() {
    return this.productSnapUrl;
    }
    public void setProductSnapUrl(String productSnapUrl) {
    this.productSnapUrl = productSnapUrl;
    }
        public String getProductStandard() {
    return this.productStandard;
    }
    public void setProductStandard(String productStandard) {
    this.productStandard = productStandard;
    }
        public String getProductUnit() {
    return this.productUnit;
    }
    public void setProductUnit(String productUnit) {
    this.productUnit = productUnit;
    }
        public AliexpressTradeSellerOrderlistGetSimpleMoney getProductUnitPrice() {
    return this.productUnitPrice;
    }
    public void setProductUnitPrice(AliexpressTradeSellerOrderlistGetSimpleMoney productUnitPrice) {
    this.productUnitPrice = productUnitPrice;
    }
        public String getSendGoodsOperator() {
    return this.sendGoodsOperator;
    }
    public void setSendGoodsOperator(String sendGoodsOperator) {
    this.sendGoodsOperator = sendGoodsOperator;
    }
        public String getSendGoodsTime() {
    return this.sendGoodsTime;
    }
    public void setSendGoodsTime(String sendGoodsTime) {
    this.sendGoodsTime = sendGoodsTime;
    }
        public String getShowStatus() {
    return this.showStatus;
    }
    public void setShowStatus(String showStatus) {
    this.showStatus = showStatus;
    }
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public String getSonOrderStatus() {
    return this.sonOrderStatus;
    }
    public void setSonOrderStatus(String sonOrderStatus) {
    this.sonOrderStatus = sonOrderStatus;
    }
        public AliexpressTradeSellerOrderlistGetSimpleMoney getTotalProductAmount() {
    return this.totalProductAmount;
    }
    public void setTotalProductAmount(AliexpressTradeSellerOrderlistGetSimpleMoney totalProductAmount) {
    this.totalProductAmount = totalProductAmount;
    }
        public List<String> getTags() {
    return this.tags;
    }
    public void setTags(List<String> tags) {
    this.tags = tags;
    }
    }