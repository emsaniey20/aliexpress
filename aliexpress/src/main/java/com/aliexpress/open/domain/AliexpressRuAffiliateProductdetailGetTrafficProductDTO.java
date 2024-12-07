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

public class AliexpressRuAffiliateProductdetailGetTrafficProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** App exclusive price */
                @ApiField("app_sale_price")
            private String appSalePrice;
        /** App exclusive price currency */
                @ApiField("app_sale_price_currency")
            private String appSalePriceCurrency;
        /** Commission rate */
                @ApiField("base_commission_rate")
            private String baseCommissionRate;
        /** Coupon end time */
                @ApiField("coupon_denomination")
            private String couponDenomination;
        /** Coupon end time */
                @ApiField("coupon_end_time")
            private String couponEndTime;
        /** Coupon limit */
                @ApiField("coupon_limit")
            private String couponLimit;
        /** Coupon start time */
                @ApiField("coupon_start_time")
            private String couponStartTime;
        /** Discount Rate */
                @ApiField("discount")
            private String discount;
        /** Favorable rate */
                @ApiField("evaluate_rate")
            private String evaluateRate;
        /** Primary category ID */
                @ApiField("first_level_category_id")
            private Long firstLevelCategoryId;
        /** Primary category name */
                @ApiField("first_level_category_name")
            private String firstLevelCategoryName;
        /** Is hot product */
                @ApiField("hot_product_flag")
            private String hotProductFlag;
        /** JV commission rate */
                @ApiField("relevant_market_commission_rate")
            private String relevantMarketCommissionRate;
        /** Recent sales */
                @ApiField("lastest_volume")
            private Long lastestVolume;
        /** Explosive product commission rate */
                @ApiField("hot_product_commission_rate")
            private String hotProductCommissionRate;
        /** Original price */
                @ApiField("original_price")
            private String originalPrice;
        /** Original price currency */
                @ApiField("original_price_currency")
            private String originalPriceCurrency;
        /** Platform commodity types: ALL, PLAZA, TMALL */
                @ApiField("platform_product_type")
            private String platformProductType;
        /** Product coupon url */
                @ApiField("product_coupon_url")
            private String productCouponUrl;
        /** Product access address */
                @ApiField("product_detail_url")
            private String productDetailUrl;
        /** Product access address	msite */
                @ApiField("product_detail_url4_msite")
            private String productDetailUrl4Msite;
        /** Product ID */
                @ApiField("product_id")
            private Long productId;
        /** Commodity main image address */
                @ApiField("product_main_image_url")
            private String productMainImageUrl;
        /** Commodity thumbnail address list */
                @ApiListField("product_small_image_urls")
            private List<String> productSmallImageUrls;
        /** Product title */
                @ApiField("product_title")
            private String productTitle;
        /** Product video address */
                @ApiField("product_video_url")
            private String productVideoUrl;
        /** Promo code info */
                @ApiField("promo_code_info")
            private AliexpressRuAffiliateProductdetailGetPromoCodeDTO promoCodeInfo;
        /** Sponsored link */
                @ApiField("promotion_link")
            private String promotionLink;
        /** Commodity price */
                @ApiField("sale_price")
            private String salePrice;
        /** Commodity price currency */
                @ApiField("sale_price_currency")
            private String salePriceCurrency;
        /** Commodity secondary category ID */
                @ApiField("second_level_category_id")
            private Long secondLevelCategoryId;
        /** Commodity secondary category name */
                @ApiField("second_level_category_name")
            private String secondLevelCategoryName;
        /** Seller ID */
                @ApiField("seller_id")
            private Long sellerId;
        /** Ship to days */
                @ApiField("ship_to_days")
            private String shipToDays;
        /** Shop coupon url */
                @ApiField("shop_coupon_url")
            private String shopCouponUrl;
        /** Store ID */
                @ApiField("shop_id")
            private Long shopId;
        /** Shop address */
                @ApiField("shop_url")
            private String shopUrl;
        /** App exclusive price after conversion in target currency */
                @ApiField("target_app_sale_price")
            private String targetAppSalePrice;
        /** App exclusive price currency after conversion according to the target currency */
                @ApiField("target_app_sale_price_currency")
            private String targetAppSalePriceCurrency;
        /** Original price after conversion in target currency */
                @ApiField("target_original_price")
            private String targetOriginalPrice;
        /** Original price currency after conversion by target currency */
                @ApiField("target_original_price_currency")
            private String targetOriginalPriceCurrency;
        /** Selling price after conversion in target currency */
                @ApiField("target_sale_price")
            private String targetSalePrice;
        /** Original price currency after conversion by target currency */
                @ApiField("target_sale_price_currency")
            private String targetSalePriceCurrency;
    
        public String getAppSalePrice() {
    return this.appSalePrice;
    }
    public void setAppSalePrice(String appSalePrice) {
    this.appSalePrice = appSalePrice;
    }
        public String getAppSalePriceCurrency() {
    return this.appSalePriceCurrency;
    }
    public void setAppSalePriceCurrency(String appSalePriceCurrency) {
    this.appSalePriceCurrency = appSalePriceCurrency;
    }
        public String getBaseCommissionRate() {
    return this.baseCommissionRate;
    }
    public void setBaseCommissionRate(String baseCommissionRate) {
    this.baseCommissionRate = baseCommissionRate;
    }
        public String getCouponDenomination() {
    return this.couponDenomination;
    }
    public void setCouponDenomination(String couponDenomination) {
    this.couponDenomination = couponDenomination;
    }
        public String getCouponEndTime() {
    return this.couponEndTime;
    }
    public void setCouponEndTime(String couponEndTime) {
    this.couponEndTime = couponEndTime;
    }
        public String getCouponLimit() {
    return this.couponLimit;
    }
    public void setCouponLimit(String couponLimit) {
    this.couponLimit = couponLimit;
    }
        public String getCouponStartTime() {
    return this.couponStartTime;
    }
    public void setCouponStartTime(String couponStartTime) {
    this.couponStartTime = couponStartTime;
    }
        public String getDiscount() {
    return this.discount;
    }
    public void setDiscount(String discount) {
    this.discount = discount;
    }
        public String getEvaluateRate() {
    return this.evaluateRate;
    }
    public void setEvaluateRate(String evaluateRate) {
    this.evaluateRate = evaluateRate;
    }
        public Long getFirstLevelCategoryId() {
    return this.firstLevelCategoryId;
    }
    public void setFirstLevelCategoryId(Long firstLevelCategoryId) {
    this.firstLevelCategoryId = firstLevelCategoryId;
    }
        public String getFirstLevelCategoryName() {
    return this.firstLevelCategoryName;
    }
    public void setFirstLevelCategoryName(String firstLevelCategoryName) {
    this.firstLevelCategoryName = firstLevelCategoryName;
    }
        public String getHotProductFlag() {
    return this.hotProductFlag;
    }
    public void setHotProductFlag(String hotProductFlag) {
    this.hotProductFlag = hotProductFlag;
    }
        public String getRelevantMarketCommissionRate() {
    return this.relevantMarketCommissionRate;
    }
    public void setRelevantMarketCommissionRate(String relevantMarketCommissionRate) {
    this.relevantMarketCommissionRate = relevantMarketCommissionRate;
    }
        public Long getLastestVolume() {
    return this.lastestVolume;
    }
    public void setLastestVolume(Long lastestVolume) {
    this.lastestVolume = lastestVolume;
    }
        public String getHotProductCommissionRate() {
    return this.hotProductCommissionRate;
    }
    public void setHotProductCommissionRate(String hotProductCommissionRate) {
    this.hotProductCommissionRate = hotProductCommissionRate;
    }
        public String getOriginalPrice() {
    return this.originalPrice;
    }
    public void setOriginalPrice(String originalPrice) {
    this.originalPrice = originalPrice;
    }
        public String getOriginalPriceCurrency() {
    return this.originalPriceCurrency;
    }
    public void setOriginalPriceCurrency(String originalPriceCurrency) {
    this.originalPriceCurrency = originalPriceCurrency;
    }
        public String getPlatformProductType() {
    return this.platformProductType;
    }
    public void setPlatformProductType(String platformProductType) {
    this.platformProductType = platformProductType;
    }
        public String getProductCouponUrl() {
    return this.productCouponUrl;
    }
    public void setProductCouponUrl(String productCouponUrl) {
    this.productCouponUrl = productCouponUrl;
    }
        public String getProductDetailUrl() {
    return this.productDetailUrl;
    }
    public void setProductDetailUrl(String productDetailUrl) {
    this.productDetailUrl = productDetailUrl;
    }
        public String getProductDetailUrl4Msite() {
    return this.productDetailUrl4Msite;
    }
    public void setProductDetailUrl4Msite(String productDetailUrl4Msite) {
    this.productDetailUrl4Msite = productDetailUrl4Msite;
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
        public List<String> getProductSmallImageUrls() {
    return this.productSmallImageUrls;
    }
    public void setProductSmallImageUrls(List<String> productSmallImageUrls) {
    this.productSmallImageUrls = productSmallImageUrls;
    }
        public String getProductTitle() {
    return this.productTitle;
    }
    public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
    }
        public String getProductVideoUrl() {
    return this.productVideoUrl;
    }
    public void setProductVideoUrl(String productVideoUrl) {
    this.productVideoUrl = productVideoUrl;
    }
        public AliexpressRuAffiliateProductdetailGetPromoCodeDTO getPromoCodeInfo() {
    return this.promoCodeInfo;
    }
    public void setPromoCodeInfo(AliexpressRuAffiliateProductdetailGetPromoCodeDTO promoCodeInfo) {
    this.promoCodeInfo = promoCodeInfo;
    }
        public String getPromotionLink() {
    return this.promotionLink;
    }
    public void setPromotionLink(String promotionLink) {
    this.promotionLink = promotionLink;
    }
        public String getSalePrice() {
    return this.salePrice;
    }
    public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
    }
        public String getSalePriceCurrency() {
    return this.salePriceCurrency;
    }
    public void setSalePriceCurrency(String salePriceCurrency) {
    this.salePriceCurrency = salePriceCurrency;
    }
        public Long getSecondLevelCategoryId() {
    return this.secondLevelCategoryId;
    }
    public void setSecondLevelCategoryId(Long secondLevelCategoryId) {
    this.secondLevelCategoryId = secondLevelCategoryId;
    }
        public String getSecondLevelCategoryName() {
    return this.secondLevelCategoryName;
    }
    public void setSecondLevelCategoryName(String secondLevelCategoryName) {
    this.secondLevelCategoryName = secondLevelCategoryName;
    }
        public Long getSellerId() {
    return this.sellerId;
    }
    public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
    }
        public String getShipToDays() {
    return this.shipToDays;
    }
    public void setShipToDays(String shipToDays) {
    this.shipToDays = shipToDays;
    }
        public String getShopCouponUrl() {
    return this.shopCouponUrl;
    }
    public void setShopCouponUrl(String shopCouponUrl) {
    this.shopCouponUrl = shopCouponUrl;
    }
        public Long getShopId() {
    return this.shopId;
    }
    public void setShopId(Long shopId) {
    this.shopId = shopId;
    }
        public String getShopUrl() {
    return this.shopUrl;
    }
    public void setShopUrl(String shopUrl) {
    this.shopUrl = shopUrl;
    }
        public String getTargetAppSalePrice() {
    return this.targetAppSalePrice;
    }
    public void setTargetAppSalePrice(String targetAppSalePrice) {
    this.targetAppSalePrice = targetAppSalePrice;
    }
        public String getTargetAppSalePriceCurrency() {
    return this.targetAppSalePriceCurrency;
    }
    public void setTargetAppSalePriceCurrency(String targetAppSalePriceCurrency) {
    this.targetAppSalePriceCurrency = targetAppSalePriceCurrency;
    }
        public String getTargetOriginalPrice() {
    return this.targetOriginalPrice;
    }
    public void setTargetOriginalPrice(String targetOriginalPrice) {
    this.targetOriginalPrice = targetOriginalPrice;
    }
        public String getTargetOriginalPriceCurrency() {
    return this.targetOriginalPriceCurrency;
    }
    public void setTargetOriginalPriceCurrency(String targetOriginalPriceCurrency) {
    this.targetOriginalPriceCurrency = targetOriginalPriceCurrency;
    }
        public String getTargetSalePrice() {
    return this.targetSalePrice;
    }
    public void setTargetSalePrice(String targetSalePrice) {
    this.targetSalePrice = targetSalePrice;
    }
        public String getTargetSalePriceCurrency() {
    return this.targetSalePriceCurrency;
    }
    public void setTargetSalePriceCurrency(String targetSalePriceCurrency) {
    this.targetSalePriceCurrency = targetSalePriceCurrency;
    }
    }