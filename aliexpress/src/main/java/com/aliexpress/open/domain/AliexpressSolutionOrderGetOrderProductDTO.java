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

public class AliexpressSolutionOrderGetOrderProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** total product amount */
                @ApiField("total_product_amount")
            private AliexpressSolutionOrderGetSimpleMoney totalProductAmount;
        /** child order status */
                @ApiField("son_order_status")
            private String sonOrderStatus;
        /** sku code */
                @ApiField("sku_code")
            private String skuCode;
        /** order show status */
                @ApiField("show_status")
            private String showStatus;
        /** Last delivery time */
                @ApiField("send_goods_time")
            private String sendGoodsTime;
        /** Shipper type. "SELLER_SEND_GOODS": seller shipping; "WAREHOUSE_SEND_GOODS": warehouse delivery */
                @ApiField("send_goods_operator")
            private String sendGoodsOperator;
        /** product unit price */
                @ApiField("product_unit_price")
            private AliexpressSolutionOrderGetSimpleMoney productUnitPrice;
        /** product unit */
                @ApiField("product_unit")
            private String productUnit;
        /** product standard */
                @ApiField("product_standard")
            private String productStandard;
        /** product snap Url */
                @ApiField("product_snap_url")
            private String productSnapUrl;
        /** product name */
                @ApiField("product_name")
            private String productName;
        /** product main image url */
                @ApiField("product_img_url")
            private String productImgUrl;
        /** product id */
                @ApiField("product_id")
            private Long productId;
        /** product count */
                @ApiField("product_count")
            private Integer productCount;
        /** order ID */
                @ApiField("order_id")
            private Long orderId;
        /** fake one compensate three flag */
                @ApiField("money_back3x")
            private Boolean moneyBack3x;
        /** buyer memo */
                @ApiField("memo")
            private String memo;
        /** logistics service name( key) */
                @ApiField("logistics_type")
            private String logisticsType;
        /** logistics service show name */
                @ApiField("logistics_service_name")
            private String logisticsServiceName;
        /** Logistics amount(sub-orders have no shipping costs, please ignore) */
                @ApiField("logistics_amount")
            private AliexpressSolutionOrderGetSimpleMoney logisticsAmount;
        /** issue status (NO_ISSUE; IN_ISSUE; END_ISSUE) */
                @ApiField("issue_status")
            private String issueStatus;
        /** issue mode */
                @ApiField("issue_mode")
            private String issueMode;
        /** goods prepare days */
                @ApiField("goods_prepare_time")
            private Integer goodsPrepareTime;
        /** fund status (NOT_PAY; PAY_SUCCESS; WAIT_SELLER_CHECK) */
                @ApiField("fund_status")
            private String fundStatus;
        /** Limited time */
                @ApiField("freight_commit_day")
            private String freightCommitDay;
        /** escrow fee rate */
                @ApiField("escrow_fee_rate")
            private String escrowFeeRate;
        /** delivery time */
                @ApiField("delivery_time")
            private String deliveryTime;
        /** child order id */
                @ApiField("child_id")
            private Long childId;
        /** Whether child orders can submit disputes */
                @ApiField("can_submit_issue")
            private Boolean canSubmitIssue;
        /** buyer last name */
                @ApiField("buyer_signer_last_name")
            private String buyerSignerLastName;
        /** buyer first name */
                @ApiField("buyer_signer_first_name")
            private String buyerSignerFirstName;
        /** afflicate fee rate */
                @ApiField("afflicate_fee_rate")
            private String afflicateFeeRate;
    
        public AliexpressSolutionOrderGetSimpleMoney getTotalProductAmount() {
    return this.totalProductAmount;
    }
    public void setTotalProductAmount(AliexpressSolutionOrderGetSimpleMoney totalProductAmount) {
    this.totalProductAmount = totalProductAmount;
    }
        public String getSonOrderStatus() {
    return this.sonOrderStatus;
    }
    public void setSonOrderStatus(String sonOrderStatus) {
    this.sonOrderStatus = sonOrderStatus;
    }
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public String getShowStatus() {
    return this.showStatus;
    }
    public void setShowStatus(String showStatus) {
    this.showStatus = showStatus;
    }
        public String getSendGoodsTime() {
    return this.sendGoodsTime;
    }
    public void setSendGoodsTime(String sendGoodsTime) {
    this.sendGoodsTime = sendGoodsTime;
    }
        public String getSendGoodsOperator() {
    return this.sendGoodsOperator;
    }
    public void setSendGoodsOperator(String sendGoodsOperator) {
    this.sendGoodsOperator = sendGoodsOperator;
    }
        public AliexpressSolutionOrderGetSimpleMoney getProductUnitPrice() {
    return this.productUnitPrice;
    }
    public void setProductUnitPrice(AliexpressSolutionOrderGetSimpleMoney productUnitPrice) {
    this.productUnitPrice = productUnitPrice;
    }
        public String getProductUnit() {
    return this.productUnit;
    }
    public void setProductUnit(String productUnit) {
    this.productUnit = productUnit;
    }
        public String getProductStandard() {
    return this.productStandard;
    }
    public void setProductStandard(String productStandard) {
    this.productStandard = productStandard;
    }
        public String getProductSnapUrl() {
    return this.productSnapUrl;
    }
    public void setProductSnapUrl(String productSnapUrl) {
    this.productSnapUrl = productSnapUrl;
    }
        public String getProductName() {
    return this.productName;
    }
    public void setProductName(String productName) {
    this.productName = productName;
    }
        public String getProductImgUrl() {
    return this.productImgUrl;
    }
    public void setProductImgUrl(String productImgUrl) {
    this.productImgUrl = productImgUrl;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public Integer getProductCount() {
    return this.productCount;
    }
    public void setProductCount(Integer productCount) {
    this.productCount = productCount;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public Boolean getMoneyBack3x() {
    return this.moneyBack3x;
    }
    public void setMoneyBack3x(Boolean moneyBack3x) {
    this.moneyBack3x = moneyBack3x;
    }
        public String getMemo() {
    return this.memo;
    }
    public void setMemo(String memo) {
    this.memo = memo;
    }
        public String getLogisticsType() {
    return this.logisticsType;
    }
    public void setLogisticsType(String logisticsType) {
    this.logisticsType = logisticsType;
    }
        public String getLogisticsServiceName() {
    return this.logisticsServiceName;
    }
    public void setLogisticsServiceName(String logisticsServiceName) {
    this.logisticsServiceName = logisticsServiceName;
    }
        public AliexpressSolutionOrderGetSimpleMoney getLogisticsAmount() {
    return this.logisticsAmount;
    }
    public void setLogisticsAmount(AliexpressSolutionOrderGetSimpleMoney logisticsAmount) {
    this.logisticsAmount = logisticsAmount;
    }
        public String getIssueStatus() {
    return this.issueStatus;
    }
    public void setIssueStatus(String issueStatus) {
    this.issueStatus = issueStatus;
    }
        public String getIssueMode() {
    return this.issueMode;
    }
    public void setIssueMode(String issueMode) {
    this.issueMode = issueMode;
    }
        public Integer getGoodsPrepareTime() {
    return this.goodsPrepareTime;
    }
    public void setGoodsPrepareTime(Integer goodsPrepareTime) {
    this.goodsPrepareTime = goodsPrepareTime;
    }
        public String getFundStatus() {
    return this.fundStatus;
    }
    public void setFundStatus(String fundStatus) {
    this.fundStatus = fundStatus;
    }
        public String getFreightCommitDay() {
    return this.freightCommitDay;
    }
    public void setFreightCommitDay(String freightCommitDay) {
    this.freightCommitDay = freightCommitDay;
    }
        public String getEscrowFeeRate() {
    return this.escrowFeeRate;
    }
    public void setEscrowFeeRate(String escrowFeeRate) {
    this.escrowFeeRate = escrowFeeRate;
    }
        public String getDeliveryTime() {
    return this.deliveryTime;
    }
    public void setDeliveryTime(String deliveryTime) {
    this.deliveryTime = deliveryTime;
    }
        public Long getChildId() {
    return this.childId;
    }
    public void setChildId(Long childId) {
    this.childId = childId;
    }
        public Boolean getCanSubmitIssue() {
    return this.canSubmitIssue;
    }
    public void setCanSubmitIssue(Boolean canSubmitIssue) {
    this.canSubmitIssue = canSubmitIssue;
    }
        public String getBuyerSignerLastName() {
    return this.buyerSignerLastName;
    }
    public void setBuyerSignerLastName(String buyerSignerLastName) {
    this.buyerSignerLastName = buyerSignerLastName;
    }
        public String getBuyerSignerFirstName() {
    return this.buyerSignerFirstName;
    }
    public void setBuyerSignerFirstName(String buyerSignerFirstName) {
    this.buyerSignerFirstName = buyerSignerFirstName;
    }
        public String getAfflicateFeeRate() {
    return this.afflicateFeeRate;
    }
    public void setAfflicateFeeRate(String afflicateFeeRate) {
    this.afflicateFeeRate = afflicateFeeRate;
    }
    }