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

public class DsOrderListTrafficOrderEffectDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** commission rate */
                @ApiField("commission_rate")
            private String commissionRate;
        /** order number */
                @ApiField("order_number")
            private Long orderNumber;
        /** finished amount of the order, unit cent */
                @ApiField("finished_amount")
            private String finishedAmount;
        /** is affiliate product */
                @ApiField("is_affiliate_product")
            private String isAffiliateProduct;
        /** is new buyer */
                @ApiField("is_new_buyer")
            private String isNewBuyer;
        /** item title */
                @ApiField("item_title")
            private String itemTitle;
        /** Additional order status, eg: full refund order, antispam order */
                @ApiField("effect_detail_status")
            private String effectDetailStatus;
        /** estimated commission for finished incentive order */
                @ApiField("estimated_incentive_finished_commission")
            private String estimatedIncentiveFinishedCommission;
        /** estimated commission for paid incentive order */
                @ApiField("estimated_incentive_paid_commission")
            private String estimatedIncentivePaidCommission;
        /** publisher id */
                @ApiField("publisher_id")
            private Integer publisherId;
        /** is hot product */
                @ApiField("is_hot_product")
            private String isHotProduct;
        /** parent order number */
                @ApiField("parent_order_number")
            private Long parentOrderNumber;
        /** item detail url */
                @ApiField("item_detail_url")
            private String itemDetailUrl;
        /** created time of this order */
                @ApiField("created_time")
            private String createdTime;
        /** publisher settled currency */
                @ApiField("publisher_settled_currency")
            private String publisherSettledCurrency;
        /** product shipping country */
                @ApiField("ship_to_country")
            private String shipToCountry;
        /** order id */
                @ApiField("order_id")
            private Long orderId;
        /** item main image url */
                @ApiField("item_main_image_url")
            private String itemMainImageUrl;
        /** paid time */
                @ApiField("paid_time")
            private String paidTime;
        /** item count */
                @ApiField("item_count")
            private String itemCount;
        /** item id */
                @ApiField("item_id")
            private Long itemId;
        /** effect status */
                @ApiField("effect_status")
            private String effectStatus;
        /** estimated commission for finished order */
                @ApiField("estimated_finished_commission")
            private String estimatedFinishedCommission;
        /** sub order id */
                @ApiField("sub_order_id")
            private Long subOrderId;
        /** estimated commission for paid order */
                @ApiField("estimated_paid_commission")
            private Integer estimatedPaidCommission;
        /** Order finish time */
                @ApiField("finished_time")
            private String finishedTime;
        /** payment amount of the order, unit cent */
                @ApiField("paid_amount")
            private Integer paidAmount;
        /** category id */
                @ApiField("category_id")
            private Integer categoryId;
        /** incentive commission rate */
                @ApiField("incentive_commission_rate")
            private String incentiveCommissionRate;
    
        public String getCommissionRate() {
    return this.commissionRate;
    }
    public void setCommissionRate(String commissionRate) {
    this.commissionRate = commissionRate;
    }
        public Long getOrderNumber() {
    return this.orderNumber;
    }
    public void setOrderNumber(Long orderNumber) {
    this.orderNumber = orderNumber;
    }
        public String getFinishedAmount() {
    return this.finishedAmount;
    }
    public void setFinishedAmount(String finishedAmount) {
    this.finishedAmount = finishedAmount;
    }
        public String getIsAffiliateProduct() {
    return this.isAffiliateProduct;
    }
    public void setIsAffiliateProduct(String isAffiliateProduct) {
    this.isAffiliateProduct = isAffiliateProduct;
    }
        public String getIsNewBuyer() {
    return this.isNewBuyer;
    }
    public void setIsNewBuyer(String isNewBuyer) {
    this.isNewBuyer = isNewBuyer;
    }
        public String getItemTitle() {
    return this.itemTitle;
    }
    public void setItemTitle(String itemTitle) {
    this.itemTitle = itemTitle;
    }
        public String getEffectDetailStatus() {
    return this.effectDetailStatus;
    }
    public void setEffectDetailStatus(String effectDetailStatus) {
    this.effectDetailStatus = effectDetailStatus;
    }
        public String getEstimatedIncentiveFinishedCommission() {
    return this.estimatedIncentiveFinishedCommission;
    }
    public void setEstimatedIncentiveFinishedCommission(String estimatedIncentiveFinishedCommission) {
    this.estimatedIncentiveFinishedCommission = estimatedIncentiveFinishedCommission;
    }
        public String getEstimatedIncentivePaidCommission() {
    return this.estimatedIncentivePaidCommission;
    }
    public void setEstimatedIncentivePaidCommission(String estimatedIncentivePaidCommission) {
    this.estimatedIncentivePaidCommission = estimatedIncentivePaidCommission;
    }
        public Integer getPublisherId() {
    return this.publisherId;
    }
    public void setPublisherId(Integer publisherId) {
    this.publisherId = publisherId;
    }
        public String getIsHotProduct() {
    return this.isHotProduct;
    }
    public void setIsHotProduct(String isHotProduct) {
    this.isHotProduct = isHotProduct;
    }
        public Long getParentOrderNumber() {
    return this.parentOrderNumber;
    }
    public void setParentOrderNumber(Long parentOrderNumber) {
    this.parentOrderNumber = parentOrderNumber;
    }
        public String getItemDetailUrl() {
    return this.itemDetailUrl;
    }
    public void setItemDetailUrl(String itemDetailUrl) {
    this.itemDetailUrl = itemDetailUrl;
    }
        public String getCreatedTime() {
    return this.createdTime;
    }
    public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
    }
        public String getPublisherSettledCurrency() {
    return this.publisherSettledCurrency;
    }
    public void setPublisherSettledCurrency(String publisherSettledCurrency) {
    this.publisherSettledCurrency = publisherSettledCurrency;
    }
        public String getShipToCountry() {
    return this.shipToCountry;
    }
    public void setShipToCountry(String shipToCountry) {
    this.shipToCountry = shipToCountry;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public String getItemMainImageUrl() {
    return this.itemMainImageUrl;
    }
    public void setItemMainImageUrl(String itemMainImageUrl) {
    this.itemMainImageUrl = itemMainImageUrl;
    }
        public String getPaidTime() {
    return this.paidTime;
    }
    public void setPaidTime(String paidTime) {
    this.paidTime = paidTime;
    }
        public String getItemCount() {
    return this.itemCount;
    }
    public void setItemCount(String itemCount) {
    this.itemCount = itemCount;
    }
        public Long getItemId() {
    return this.itemId;
    }
    public void setItemId(Long itemId) {
    this.itemId = itemId;
    }
        public String getEffectStatus() {
    return this.effectStatus;
    }
    public void setEffectStatus(String effectStatus) {
    this.effectStatus = effectStatus;
    }
        public String getEstimatedFinishedCommission() {
    return this.estimatedFinishedCommission;
    }
    public void setEstimatedFinishedCommission(String estimatedFinishedCommission) {
    this.estimatedFinishedCommission = estimatedFinishedCommission;
    }
        public Long getSubOrderId() {
    return this.subOrderId;
    }
    public void setSubOrderId(Long subOrderId) {
    this.subOrderId = subOrderId;
    }
        public Integer getEstimatedPaidCommission() {
    return this.estimatedPaidCommission;
    }
    public void setEstimatedPaidCommission(Integer estimatedPaidCommission) {
    this.estimatedPaidCommission = estimatedPaidCommission;
    }
        public String getFinishedTime() {
    return this.finishedTime;
    }
    public void setFinishedTime(String finishedTime) {
    this.finishedTime = finishedTime;
    }
        public Integer getPaidAmount() {
    return this.paidAmount;
    }
    public void setPaidAmount(Integer paidAmount) {
    this.paidAmount = paidAmount;
    }
        public Integer getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
    }
        public String getIncentiveCommissionRate() {
    return this.incentiveCommissionRate;
    }
    public void setIncentiveCommissionRate(String incentiveCommissionRate) {
    this.incentiveCommissionRate = incentiveCommissionRate;
    }
    }