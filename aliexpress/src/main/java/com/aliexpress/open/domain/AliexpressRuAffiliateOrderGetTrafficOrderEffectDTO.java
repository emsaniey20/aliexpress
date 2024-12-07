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

public class AliexpressRuAffiliateOrderGetTrafficOrderEffectDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** FullRefund: Full refund, Antispam: Risk control interception */
                @ApiField("effect_detail_status")
            private String effectDetailStatus;
        /** Whether it is an alliance product: N/Y */
                @ApiField("is_affiliate_product")
            private String isAffiliateProduct;
        /** Hot order: Y or N */
                @ApiField("is_hot_product")
            private String isHotProduct;
        /** tracking_id */
                @ApiField("tracking_id")
            private String trackingId;
        /** Category ID */
                @ApiField("category_id")
            private Long categoryId;
        /** Order logistics country */
                @ApiField("ship_to_country")
            private String shipToCountry;
        /** New Buyer Incentive Commission */
                @ApiField("new_buyer_bonus_commission")
            private Long newBuyerBonusCommission;
        /** Is new buyer: Y/N */
                @ApiField("is_new_buyer")
            private String isNewBuyer;
        /** Custom parameters (JSON format) */
                @ApiField("custom_parameter")
            private String customParameter;
        /** Promoter settlement currency */
                @ApiField("settled_currency")
            private String settledCurrency;
        /** Publisher ID */
                @ApiField("publisher_id")
            private Long publisherId;
        /** Order status: Payment Completed, Buyer Confirmed Receipt */
                @ApiField("order_status")
            private String orderStatus;
        /** Estimated commission upon completion of an incentive order */
                @ApiField("estimated_incentive_finished_commission")
            private Long estimatedIncentiveFinishedCommission;
        /** Estimated commission when incentivizing order payment */
                @ApiField("estimated_incentive_paid_commission")
            private Long estimatedIncentivePaidCommission;
        /** Incentive commission rate */
                @ApiField("incentive_commission_rate")
            private String incentiveCommissionRate;
        /** Estimated commission upon order completion */
                @ApiField("estimated_finished_commission")
            private Long estimatedFinishedCommission;
        /** Order completed amount */
                @ApiField("fimished_amount")
            private Long fimishedAmount;
        /** Order completion time */
                @ApiField("finished_time")
            private String finishedTime;
        /** Estimated commission at the time of order payment */
                @ApiField("estimated_paid_commission")
            private Long estimatedPaidCommission;
        /** Order payment completed amount */
                @ApiField("paid_amount")
            private Long paidAmount;
        /** Order payment completion time */
                @ApiField("paid_time")
            private String paidTime;
        /** Commission rate */
                @ApiField("commission_rate")
            private String commissionRate;
        /** Order creation time */
                @ApiField("created_time")
            private String createdTime;
        /** Product main image Url */
                @ApiField("product_main_image_url")
            private String productMainImageUrl;
        /** Commodity DetailUrl */
                @ApiField("product_detail_url")
            private String productDetailUrl;
        /** Product title */
                @ApiField("product_title")
            private String productTitle;
        /** Quantity of goods ordered */
                @ApiField("product_count")
            private Long productCount;
        /** Commodity ID */
                @ApiField("product_id")
            private Long productId;
        /** Parent order ID: Obsolete, please use order_id */
                @ApiField("parent_order_number")
            private Long parentOrderNumber;
        /** Child order ID */
                @ApiField("sub_order_id")
            private Long subOrderId;
        /** Order id */
                @ApiField("order_id")
            private Long orderId;
        /** Sub-order ID: Obsolete, please use sub_order_id */
                @ApiField("order_number")
            private Long orderNumber;
    
        public String getEffectDetailStatus() {
    return this.effectDetailStatus;
    }
    public void setEffectDetailStatus(String effectDetailStatus) {
    this.effectDetailStatus = effectDetailStatus;
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
        public String getShipToCountry() {
    return this.shipToCountry;
    }
    public void setShipToCountry(String shipToCountry) {
    this.shipToCountry = shipToCountry;
    }
        public Long getNewBuyerBonusCommission() {
    return this.newBuyerBonusCommission;
    }
    public void setNewBuyerBonusCommission(Long newBuyerBonusCommission) {
    this.newBuyerBonusCommission = newBuyerBonusCommission;
    }
        public String getIsNewBuyer() {
    return this.isNewBuyer;
    }
    public void setIsNewBuyer(String isNewBuyer) {
    this.isNewBuyer = isNewBuyer;
    }
        public String getCustomParameter() {
    return this.customParameter;
    }
    public void setCustomParameter(String customParameter) {
    this.customParameter = customParameter;
    }
        public String getSettledCurrency() {
    return this.settledCurrency;
    }
    public void setSettledCurrency(String settledCurrency) {
    this.settledCurrency = settledCurrency;
    }
        public Long getPublisherId() {
    return this.publisherId;
    }
    public void setPublisherId(Long publisherId) {
    this.publisherId = publisherId;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
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
        public String getIncentiveCommissionRate() {
    return this.incentiveCommissionRate;
    }
    public void setIncentiveCommissionRate(String incentiveCommissionRate) {
    this.incentiveCommissionRate = incentiveCommissionRate;
    }
        public Long getEstimatedFinishedCommission() {
    return this.estimatedFinishedCommission;
    }
    public void setEstimatedFinishedCommission(Long estimatedFinishedCommission) {
    this.estimatedFinishedCommission = estimatedFinishedCommission;
    }
        public Long getFimishedAmount() {
    return this.fimishedAmount;
    }
    public void setFimishedAmount(Long fimishedAmount) {
    this.fimishedAmount = fimishedAmount;
    }
        public String getFinishedTime() {
    return this.finishedTime;
    }
    public void setFinishedTime(String finishedTime) {
    this.finishedTime = finishedTime;
    }
        public Long getEstimatedPaidCommission() {
    return this.estimatedPaidCommission;
    }
    public void setEstimatedPaidCommission(Long estimatedPaidCommission) {
    this.estimatedPaidCommission = estimatedPaidCommission;
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
        public String getProductMainImageUrl() {
    return this.productMainImageUrl;
    }
    public void setProductMainImageUrl(String productMainImageUrl) {
    this.productMainImageUrl = productMainImageUrl;
    }
        public String getProductDetailUrl() {
    return this.productDetailUrl;
    }
    public void setProductDetailUrl(String productDetailUrl) {
    this.productDetailUrl = productDetailUrl;
    }
        public String getProductTitle() {
    return this.productTitle;
    }
    public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
    }
        public Long getProductCount() {
    return this.productCount;
    }
    public void setProductCount(Long productCount) {
    this.productCount = productCount;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public Long getParentOrderNumber() {
    return this.parentOrderNumber;
    }
    public void setParentOrderNumber(Long parentOrderNumber) {
    this.parentOrderNumber = parentOrderNumber;
    }
        public Long getSubOrderId() {
    return this.subOrderId;
    }
    public void setSubOrderId(Long subOrderId) {
    this.subOrderId = subOrderId;
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
    }