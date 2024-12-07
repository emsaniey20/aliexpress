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

public class AliexpressAffiliateOrderListTrafficOrderEffectDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** The time when commission is paid into Account Balance */
                @ApiField("completed_settlement_time")
            private String completedSettlementTime;
        /** trackingId */
                @ApiField("tracking_id")
            private String trackingId;
        /** Category ID */
                @ApiField("category_id")
            private Long categoryId;
        /** hot product:Y OR N */
                @ApiField("is_hot_product")
            private String isHotProduct;
        /** order detail status:discarded.pls use order_status */
                @ApiField("effect_detail_status")
            private String effectDetailStatus;
        /** discarded */
                @ApiField("incentive_commission_rate")
            private String incentiveCommissionRate;
        /** discarded */
                @ApiField("estimated_incentive_paid_commission")
            private Long estimatedIncentivePaidCommission;
        /** discarded */
                @ApiField("estimated_incentive_finished_commission")
            private Long estimatedIncentiveFinishedCommission;
        /** is affiliate product */
                @ApiField("is_affiliate_product")
            private String isAffiliateProduct;
        /** global、ru_site、es_site、it_site */
                @ApiField("order_type")
            private String orderType;
        /** order ID:discarded.pls use sub_order_id */
                @ApiField("order_id")
            private Long orderId;
        /** order ID:discarded.pls use sub_order_id */
                @ApiField("order_number")
            private Long orderNumber;
        /** order ID */
                @ApiField("sub_order_id")
            private Long subOrderId;
        /** parent order ID::discarded. pls use order_id */
                @ApiField("parent_order_number")
            private Long parentOrderNumber;
        /** Order status:  Payment Completed(Buyer paid successfully),  Buyer Confirmed Receipt(This status only change when:Buyer confirms receipt and settlement task begins which is manually executed by our operation team),  Completed Settlement(Orders have been verified and commission has been paid),  Invalid(Orders will not be settled including buyer refunds, order risks, antispam/penalty appeal failed, antispam/penalty appeal overdue, order not settled being over 180 days apart from the Completed Payment Time (such as in abnormal state like dispute), etc.) */
                @ApiField("order_status")
            private String orderStatus;
        /** order created time */
                @ApiField("created_time")
            private String createdTime;
        /** Commission rate */
                @ApiField("commission_rate")
            private String commissionRate;
        /** payment amount of the order */
                @ApiField("paid_amount")
            private Long paidAmount;
        /** The time of payment for the order */
                @ApiField("paid_time")
            private String paidTime;
        /** estimated commission for paid order */
                @ApiField("estimated_paid_commission")
            private Long estimatedPaidCommission;
        /** Amount of finished order */
                @ApiField("finished_amount")
            private Long finishedAmount;
        /** The time when the buyer confirms receipt */
                @ApiField("finished_time")
            private String finishedTime;
        /** estimated commission for finished order */
                @ApiField("estimated_finished_commission")
            private Long estimatedFinishedCommission;
        /** Is new buyer or not */
                @ApiField("is_new_buyer")
            private String isNewBuyer;
        /** settled currency */
                @ApiField("settled_currency")
            private String settledCurrency;
        /** custom paramters */
                @ApiField("custom_parameters")
            private String customParameters;
        /** new buyer bonus */
                @ApiField("new_buyer_bonus_commission")
            private Long newBuyerBonusCommission;
        /** Product ID */
                @ApiField("product_id")
            private Long productId;
        /** Product title */
                @ApiField("product_title")
            private String productTitle;
        /** Product detail url */
                @ApiField("product_detail_url")
            private String productDetailUrl;
        /** Main image url of product */
                @ApiField("product_main_image_url")
            private String productMainImageUrl;
        /** product count */
                @ApiField("product_count")
            private Long productCount;
        /** ship to country/region */
                @ApiField("ship_to_country")
            private String shipToCountry;
    
        public String getCompletedSettlementTime() {
    return this.completedSettlementTime;
    }
    public void setCompletedSettlementTime(String completedSettlementTime) {
    this.completedSettlementTime = completedSettlementTime;
    }
        public String getTrackingId() {
    return this.trackingId;
    }
    public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
    }
        public Long getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
    }
        public String getIsHotProduct() {
    return this.isHotProduct;
    }
    public void setIsHotProduct(String isHotProduct) {
    this.isHotProduct = isHotProduct;
    }
        public String getEffectDetailStatus() {
    return this.effectDetailStatus;
    }
    public void setEffectDetailStatus(String effectDetailStatus) {
    this.effectDetailStatus = effectDetailStatus;
    }
        public String getIncentiveCommissionRate() {
    return this.incentiveCommissionRate;
    }
    public void setIncentiveCommissionRate(String incentiveCommissionRate) {
    this.incentiveCommissionRate = incentiveCommissionRate;
    }
        public Long getEstimatedIncentivePaidCommission() {
    return this.estimatedIncentivePaidCommission;
    }
    public void setEstimatedIncentivePaidCommission(Long estimatedIncentivePaidCommission) {
    this.estimatedIncentivePaidCommission = estimatedIncentivePaidCommission;
    }
        public Long getEstimatedIncentiveFinishedCommission() {
    return this.estimatedIncentiveFinishedCommission;
    }
    public void setEstimatedIncentiveFinishedCommission(Long estimatedIncentiveFinishedCommission) {
    this.estimatedIncentiveFinishedCommission = estimatedIncentiveFinishedCommission;
    }
        public String getIsAffiliateProduct() {
    return this.isAffiliateProduct;
    }
    public void setIsAffiliateProduct(String isAffiliateProduct) {
    this.isAffiliateProduct = isAffiliateProduct;
    }
        public String getOrderType() {
    return this.orderType;
    }
    public void setOrderType(String orderType) {
    this.orderType = orderType;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public Long getOrderNumber() {
    return this.orderNumber;
    }
    public void setOrderNumber(Long orderNumber) {
    this.orderNumber = orderNumber;
    }
        public Long getSubOrderId() {
    return this.subOrderId;
    }
    public void setSubOrderId(Long subOrderId) {
    this.subOrderId = subOrderId;
    }
        public Long getParentOrderNumber() {
    return this.parentOrderNumber;
    }
    public void setParentOrderNumber(Long parentOrderNumber) {
    this.parentOrderNumber = parentOrderNumber;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public String getCreatedTime() {
    return this.createdTime;
    }
    public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
    }
        public String getCommissionRate() {
    return this.commissionRate;
    }
    public void setCommissionRate(String commissionRate) {
    this.commissionRate = commissionRate;
    }
        public Long getPaidAmount() {
    return this.paidAmount;
    }
    public void setPaidAmount(Long paidAmount) {
    this.paidAmount = paidAmount;
    }
        public String getPaidTime() {
    return this.paidTime;
    }
    public void setPaidTime(String paidTime) {
    this.paidTime = paidTime;
    }
        public Long getEstimatedPaidCommission() {
    return this.estimatedPaidCommission;
    }
    public void setEstimatedPaidCommission(Long estimatedPaidCommission) {
    this.estimatedPaidCommission = estimatedPaidCommission;
    }
        public Long getFinishedAmount() {
    return this.finishedAmount;
    }
    public void setFinishedAmount(Long finishedAmount) {
    this.finishedAmount = finishedAmount;
    }
        public String getFinishedTime() {
    return this.finishedTime;
    }
    public void setFinishedTime(String finishedTime) {
    this.finishedTime = finishedTime;
    }
        public Long getEstimatedFinishedCommission() {
    return this.estimatedFinishedCommission;
    }
    public void setEstimatedFinishedCommission(Long estimatedFinishedCommission) {
    this.estimatedFinishedCommission = estimatedFinishedCommission;
    }
        public String getIsNewBuyer() {
    return this.isNewBuyer;
    }
    public void setIsNewBuyer(String isNewBuyer) {
    this.isNewBuyer = isNewBuyer;
    }
        public String getSettledCurrency() {
    return this.settledCurrency;
    }
    public void setSettledCurrency(String settledCurrency) {
    this.settledCurrency = settledCurrency;
    }
        public String getCustomParameters() {
    return this.customParameters;
    }
    public void setCustomParameters(String customParameters) {
    this.customParameters = customParameters;
    }
        public Long getNewBuyerBonusCommission() {
    return this.newBuyerBonusCommission;
    }
    public void setNewBuyerBonusCommission(Long newBuyerBonusCommission) {
    this.newBuyerBonusCommission = newBuyerBonusCommission;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getProductTitle() {
    return this.productTitle;
    }
    public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
    }
        public String getProductDetailUrl() {
    return this.productDetailUrl;
    }
    public void setProductDetailUrl(String productDetailUrl) {
    this.productDetailUrl = productDetailUrl;
    }
        public String getProductMainImageUrl() {
    return this.productMainImageUrl;
    }
    public void setProductMainImageUrl(String productMainImageUrl) {
    this.productMainImageUrl = productMainImageUrl;
    }
        public Long getProductCount() {
    return this.productCount;
    }
    public void setProductCount(Long productCount) {
    this.productCount = productCount;
    }
        public String getShipToCountry() {
    return this.shipToCountry;
    }
    public void setShipToCountry(String shipToCountry) {
    this.shipToCountry = shipToCountry;
    }
    }