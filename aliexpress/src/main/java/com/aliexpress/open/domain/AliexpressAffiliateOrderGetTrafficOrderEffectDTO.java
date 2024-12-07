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

public class AliexpressAffiliateOrderGetTrafficOrderEffectDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** The time when commission is paid into Account Balance */
                @ApiField("completed_settlement_time")
            private String completedSettlementTime;
        /** commission rate */
                @ApiField("commission_rate")
            private String commissionRate;
        /** order created time */
                @ApiField("created_time")
            private String createdTime;
        /** customize parameter */
                @ApiField("customer_parameters")
            private String customerParameters;
        /** Order status:  Payment Completed(Buyer paid successfully),  Buyer Confirmed Receipt(This status only change when:Buyer confirms receipt and settlement task begins which is manually executed by our operation team),  Completed Settlement(Orders have been verified and commission has been paid),  Invalid(Orders will not be settled including buyer refunds, order risks, antispam/penalty appeal failed, antispam/penalty appeal overdue, order not settled being over 180 days apart from the Completed Payment Time (such as in abnormal state like dispute), etc.) */
                @ApiField("order_status")
            private String orderStatus;
        /** estimated commission for finished order */
                @ApiField("estimated_finished_commission")
            private Long estimatedFinishedCommission;
        /** estimated commission for paid order */
                @ApiField("estimated_paid_commission")
            private Long estimatedPaidCommission;
        /** Amount of finished order */
                @ApiField("finished_amount")
            private Long finishedAmount;
        /** The time when the buyer confirms receipt */
                @ApiField("finished_time")
            private String finishedTime;
        /** Is new buyer or not:Y/N */
                @ApiField("is_new_buyer")
            private String isNewBuyer;
        /** product count */
                @ApiField("product_count")
            private Long productCount;
        /** Product detail url */
                @ApiField("product_detail_url")
            private String productDetailUrl;
        /** Product ID */
                @ApiField("product_id")
            private Long productId;
        /** Main image url of product */
                @ApiField("product_main_image_url")
            private String productMainImageUrl;
        /** Product title */
                @ApiField("product_title")
            private String productTitle;
        /** new buyer bonus */
                @ApiField("new_buyer_bonus_commission")
            private Long newBuyerBonusCommission;
        /** order ID */
                @ApiField("order_id")
            private Long orderId;
        /** order ID:discarded.pls used sub_order_id */
                @ApiField("order_number")
            private Long orderNumber;
        /** payment amount of the order */
                @ApiField("paid_amount")
            private Long paidAmount;
        /** The time of payment for the order */
                @ApiField("paid_time")
            private String paidTime;
        /** parent order ID::discarded. pls used order_id */
                @ApiField("parent_order_number")
            private Long parentOrderNumber;
        /** settled currency */
                @ApiField("settled_currency")
            private String settledCurrency;
        /** ship to country/region */
                @ApiField("ship_to_country")
            private String shipToCountry;
        /** sub order ID */
                @ApiField("sub_order_id")
            private Long subOrderId;
        /** trackId */
                @ApiField("tracking_id")
            private String trackingId;
        /** hot product:Y OR N */
                @ApiField("is_hot_product")
            private String isHotProduct;
        /** Category ID */
                @ApiField("category_id")
            private Long categoryId;
        /** order detail status:discarded.pls use order_status */
                @ApiField("effect_detail_status")
            private String effectDetailStatus;
        /** discarded */
                @ApiField("estimated_incentive_finished_commission")
            private Long estimatedIncentiveFinishedCommission;
        /** discarded */
                @ApiField("estimated_incentive_paid_commission")
            private Long estimatedIncentivePaidCommission;
        /** discarded */
                @ApiField("incentive_commission_rate")
            private String incentiveCommissionRate;
        /** is affiliate product */
                @ApiField("is_affiliate_product")
            private String isAffiliateProduct;
        /** global、ru_site、es_site、it_site */
                @ApiField("order_type")
            private String orderType;
    
        public String getCompletedSettlementTime() {
    return this.completedSettlementTime;
    }
    public void setCompletedSettlementTime(String completedSettlementTime) {
    this.completedSettlementTime = completedSettlementTime;
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
        public String getCustomerParameters() {
    return this.customerParameters;
    }
    public void setCustomerParameters(String customerParameters) {
    this.customerParameters = customerParameters;
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
        public String getIsHotProduct() {
    return this.isHotProduct;
    }
    public void setIsHotProduct(String isHotProduct) {
    this.isHotProduct = isHotProduct;
    }
        public Long getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
    }
        public String getEffectDetailStatus() {
    return this.effectDetailStatus;
    }
    public void setEffectDetailStatus(String effectDetailStatus) {
    this.effectDetailStatus = effectDetailStatus;
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
    }