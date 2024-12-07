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

public class AliexpressRuAffiliateOrderListbyindexTrafficOrderEffectDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Category id */
                @ApiField("category_id")
            private Long categoryId;
        /** Comission rate */
                @ApiField("commission_rate")
            private String commissionRate;
        /** Created at */
                @ApiField("created_time")
            private String createdTime;
        /** Custom parameters (JSON format) */
                @ApiField("custom_parameters")
            private String customParameters;
        /** FullRefund: full refund of the order, Antispam: cheating on the order */
                @ApiField("effect_detail_status")
            private String effectDetailStatus;
        /** Order status: Payment Completed, Buyer Confirmed Receipt */
                @ApiField("order_status")
            private String orderStatus;
        /** Estimated commission upon order completion */
                @ApiField("estimated_finished_commission")
            private Long estimatedFinishedCommission;
        /** Estimated commission upon completion of an incentive order */
                @ApiField("estimated_incentive_finished_commission")
            private Long estimatedIncentiveFinishedCommission;
        /** Estimated commission when incentivizing order payment */
                @ApiField("estimated_incentive_paid_commission")
            private Long estimatedIncentivePaidCommission;
        /** Estimated commission at the time of order payment */
                @ApiField("estimated_paid_commission")
            private Long estimatedPaidCommission;
        /** Order completed amount */
                @ApiField("finished_amount")
            private Long finishedAmount;
        /** Order completion amount */
                @ApiField("finished_time")
            private String finishedTime;
        /** Incentive commission rate */
                @ApiField("incentive_commission_rate")
            private String incentiveCommissionRate;
        /** Whether it is an alliance product: Y or N */
                @ApiField("is_affiliate_product")
            private String isAffiliateProduct;
        /** Whether the product is explosive: Y or N */
                @ApiField("is_hot_product")
            private String isHotProduct;
        /** New buyer */
                @ApiField("is_new_buyer")
            private String isNewBuyer;
        /** Quantity of goods ordered */
                @ApiField("product_count")
            private Long productCount;
        /** URL */
                @ApiField("product_detail_url")
            private String productDetailUrl;
        /** Commodity ID */
                @ApiField("product_id")
            private Long productId;
        /** Product main image url */
                @ApiField("product_main_image_url")
            private String productMainImageUrl;
        /** Product title */
                @ApiField("product_title")
            private String productTitle;
        /** New Buyer Incentive Commission */
                @ApiField("new_buyer_bonus_commission")
            private Long newBuyerBonusCommission;
        /** Order id */
                @ApiField("order_id")
            private Long orderId;
        /** Order number */
                @ApiField("order_number")
            private Long orderNumber;
        /** Order payment completed amount */
                @ApiField("paid_amount")
            private Long paidAmount;
        /** Order payment completion time */
                @ApiField("paid_time")
            private String paidTime;
        /** Parent order number */
                @ApiField("parent_order_number")
            private Long parentOrderNumber;
        /** Publisher id */
                @ApiField("publisher_id")
            private Long publisherId;
        /** Promoter settlement currency */
                @ApiField("settled_currency")
            private String settledCurrency;
        /** Ship to */
                @ApiField("ship_to_country")
            private String shipToCountry;
        /** Child order ID */
                @ApiField("sub_order_id")
            private Long subOrderId;
        /** Tracking id */
                @ApiField("tracking_id")
            private String trackingId;
    
        public Long getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
    }
        public String getCommissionRate() {
    return this.commissionRate;
    }
    public void setCommissionRate(String commissionRate) {
    this.commissionRate = commissionRate;
    }
        public String getCreatedTime() {
    return this.createdTime;
    }
    public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
    }
        public String getCustomParameters() {
    return this.customParameters;
    }
    public void setCustomParameters(String customParameters) {
    this.customParameters = customParameters;
    }
        public String getEffectDetailStatus() {
    return this.effectDetailStatus;
    }
    public void setEffectDetailStatus(String effectDetailStatus) {
    this.effectDetailStatus = effectDetailStatus;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public Long getEstimatedFinishedCommission() {
    return this.estimatedFinishedCommission;
    }
    public void setEstimatedFinishedCommission(Long estimatedFinishedCommission) {
    this.estimatedFinishedCommission = estimatedFinishedCommission;
    }
        public Long getEstimatedIncentiveFinishedCommission() {
    return this.estimatedIncentiveFinishedCommission;
    }
    public void setEstimatedIncentiveFinishedCommission(Long estimatedIncentiveFinishedCommission) {
    this.estimatedIncentiveFinishedCommission = estimatedIncentiveFinishedCommission;
    }
        public Long getEstimatedIncentivePaidCommission() {
    return this.estimatedIncentivePaidCommission;
    }
    public void setEstimatedIncentivePaidCommission(Long estimatedIncentivePaidCommission) {
    this.estimatedIncentivePaidCommission = estimatedIncentivePaidCommission;
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
        public String getIncentiveCommissionRate() {
    return this.incentiveCommissionRate;
    }
    public void setIncentiveCommissionRate(String incentiveCommissionRate) {
    this.incentiveCommissionRate = incentiveCommissionRate;
    }
        public String getIsAffiliateProduct() {
    return this.isAffiliateProduct;
    }
    public void setIsAffiliateProduct(String isAffiliateProduct) {
    this.isAffiliateProduct = isAffiliateProduct;
    }
        public String getIsHotProduct() {
    return this.isHotProduct;
    }
    public void setIsHotProduct(String isHotProduct) {
    this.isHotProduct = isHotProduct;
    }
        public String getIsNewBuyer() {
    return this.isNewBuyer;
    }
    public void setIsNewBuyer(String isNewBuyer) {
    this.isNewBuyer = isNewBuyer;
    }
        public Long getProductCount() {
    return this.productCount;
    }
    public void setProductCount(Long productCount) {
    this.productCount = productCount;
    }
        public String getProductDetailUrl() {
    return this.productDetailUrl;
    }
    public void setProductDetailUrl(String productDetailUrl) {
    this.productDetailUrl = productDetailUrl;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getProductMainImageUrl() {
    return this.productMainImageUrl;
    }
    public void setProductMainImageUrl(String productMainImageUrl) {
    this.productMainImageUrl = productMainImageUrl;
    }
        public String getProductTitle() {
    return this.productTitle;
    }
    public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
    }
        public Long getNewBuyerBonusCommission() {
    return this.newBuyerBonusCommission;
    }
    public void setNewBuyerBonusCommission(Long newBuyerBonusCommission) {
    this.newBuyerBonusCommission = newBuyerBonusCommission;
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
        public Long getParentOrderNumber() {
    return this.parentOrderNumber;
    }
    public void setParentOrderNumber(Long parentOrderNumber) {
    this.parentOrderNumber = parentOrderNumber;
    }
        public Long getPublisherId() {
    return this.publisherId;
    }
    public void setPublisherId(Long publisherId) {
    this.publisherId = publisherId;
    }
        public String getSettledCurrency() {
    return this.settledCurrency;
    }
    public void setSettledCurrency(String settledCurrency) {
    this.settledCurrency = settledCurrency;
    }
        public String getShipToCountry() {
    return this.shipToCountry;
    }
    public void setShipToCountry(String shipToCountry) {
    this.shipToCountry = shipToCountry;
    }
        public Long getSubOrderId() {
    return this.subOrderId;
    }
    public void setSubOrderId(Long subOrderId) {
    this.subOrderId = subOrderId;
    }
        public String getTrackingId() {
    return this.trackingId;
    }
    public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
    }
    }