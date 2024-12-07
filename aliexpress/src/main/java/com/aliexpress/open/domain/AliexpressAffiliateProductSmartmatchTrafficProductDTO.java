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

public class AliexpressAffiliateProductSmartmatchTrafficProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sale price on App */
                @ApiField("app_sale_price")
            private String appSalePrice;
        /** Commission rate is applicable to non-relevant market countries and non hot product promolinks. For relevant market countries commission please use relevant_market_commission_rate; For hot product promolinks please use hot_product_commission. */
                @ApiField("commission_rate")
            private String commissionRate;
        /** Discount rate */
                @ApiField("discount")
            private String discount;
        /** product Evaluate rate */
                @ApiField("evaluate_rate")
            private String evaluateRate;
        /** First level category ID */
                @ApiField("first_level_category_id")
            private Long firstLevelCategoryId;
        /** First level category Name */
                @ApiField("first_level_category_name")
            private String firstLevelCategoryName;
        /** Sales volume in the last 30 days */
                @ApiField("lastest_volume")
            private Long lastestVolume;
        /** Hot product commission rate */
                @ApiField("hot_product_commission_rate")
            private String hotProductCommissionRate;
        /** Original price */
                @ApiField("original_price")
            private String originalPrice;
        /** product Type：ALL, PLAZA,TMALL */
                @ApiField("platform_product_type")
            private String platformProductType;
        /** url link of Product detail, not promotion link */
                @ApiField("product_detail_url")
            private String productDetailUrl;
        /** Product ID */
                @ApiField("product_id")
            private Long productId;
        /** Main image url of product */
                @ApiField("product_main_image_url")
            private String productMainImageUrl;
        /** Small image urls of product */
                @ApiListField("product_small_image_urls")
            private List<String> productSmallImageUrls;
        /** Product title */
                @ApiField("product_title")
            private String productTitle;
        /** Video url of product */
                @ApiField("product_video_url")
            private String productVideoUrl;
        /** Promotion link */
                @ApiField("promotion_link")
            private String promotionLink;
        /** sale price (Non-APP Sale price) */
                @ApiField("sale_price")
            private String salePrice;
        /** Second level category ID */
                @ApiField("second_level_category_id")
            private Long secondLevelCategoryId;
        /** Second level category Name */
                @ApiField("second_level_category_name")
            private String secondLevelCategoryName;
        /** store ID */
                @ApiField("shop_id")
            private Long shopId;
        /** store URL */
                @ApiField("shop_url")
            private String shopUrl;
        /** App sale price in target currency */
                @ApiField("target_app_sale_price")
            private String targetAppSalePrice;
        /** Original price in target currency */
                @ApiField("target_original_price")
            private String targetOriginalPrice;
        /** Non-App sale price in target currency */
                @ApiField("target_sale_price")
            private String targetSalePrice;
        /** currency of original price */
                @ApiField("original_price_currency")
            private String originalPriceCurrency;
        /** currency of target Original price */
                @ApiField("target_original_price_currency")
            private String targetOriginalPriceCurrency;
        /** currency of Non-APP sale price */
                @ApiField("sale_price_currency")
            private String salePriceCurrency;
        /** currency of target Non-App sale price */
                @ApiField("target_sale_price_currency")
            private String targetSalePriceCurrency;
        /** currency of sale price on App */
                @ApiField("app_sale_price_currency")
            private String appSalePriceCurrency;
        /** target currency of sale price on App */
                @ApiField("target_app_sale_price_currency")
            private String targetAppSalePriceCurrency;
        /** commission rate for relevant market(only for relevant market countries: RU, AM, AZ, BY, GE, KG, KZ, MD, TJ, TM, UZ) */
                @ApiField("relevant_market_commission_rate")
            private String relevantMarketCommissionRate;
        /** code */
                @ApiField("promo_code_info")
            private AliexpressAffiliateProductSmartmatchPromoCodeDTO promoCodeInfo;
    
        public String getAppSalePrice() {
    return this.appSalePrice;
    }
    public void setAppSalePrice(String appSalePrice) {
    this.appSalePrice = appSalePrice;
    }
        public String getCommissionRate() {
    return this.commissionRate;
    }
    public void setCommissionRate(String commissionRate) {
    this.commissionRate = commissionRate;
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
        public String getPlatformProductType() {
    return this.platformProductType;
    }
    public void setPlatformProductType(String platformProductType) {
    this.platformProductType = platformProductType;
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
        public String getTargetOriginalPrice() {
    return this.targetOriginalPrice;
    }
    public void setTargetOriginalPrice(String targetOriginalPrice) {
    this.targetOriginalPrice = targetOriginalPrice;
    }
        public String getTargetSalePrice() {
    return this.targetSalePrice;
    }
    public void setTargetSalePrice(String targetSalePrice) {
    this.targetSalePrice = targetSalePrice;
    }
        public String getOriginalPriceCurrency() {
    return this.originalPriceCurrency;
    }
    public void setOriginalPriceCurrency(String originalPriceCurrency) {
    this.originalPriceCurrency = originalPriceCurrency;
    }
        public String getTargetOriginalPriceCurrency() {
    return this.targetOriginalPriceCurrency;
    }
    public void setTargetOriginalPriceCurrency(String targetOriginalPriceCurrency) {
    this.targetOriginalPriceCurrency = targetOriginalPriceCurrency;
    }
        public String getSalePriceCurrency() {
    return this.salePriceCurrency;
    }
    public void setSalePriceCurrency(String salePriceCurrency) {
    this.salePriceCurrency = salePriceCurrency;
    }
        public String getTargetSalePriceCurrency() {
    return this.targetSalePriceCurrency;
    }
    public void setTargetSalePriceCurrency(String targetSalePriceCurrency) {
    this.targetSalePriceCurrency = targetSalePriceCurrency;
    }
        public String getAppSalePriceCurrency() {
    return this.appSalePriceCurrency;
    }
    public void setAppSalePriceCurrency(String appSalePriceCurrency) {
    this.appSalePriceCurrency = appSalePriceCurrency;
    }
        public String getTargetAppSalePriceCurrency() {
    return this.targetAppSalePriceCurrency;
    }
    public void setTargetAppSalePriceCurrency(String targetAppSalePriceCurrency) {
    this.targetAppSalePriceCurrency = targetAppSalePriceCurrency;
    }
        public String getRelevantMarketCommissionRate() {
    return this.relevantMarketCommissionRate;
    }
    public void setRelevantMarketCommissionRate(String relevantMarketCommissionRate) {
    this.relevantMarketCommissionRate = relevantMarketCommissionRate;
    }
        public AliexpressAffiliateProductSmartmatchPromoCodeDTO getPromoCodeInfo() {
    return this.promoCodeInfo;
    }
    public void setPromoCodeInfo(AliexpressAffiliateProductSmartmatchPromoCodeDTO promoCodeInfo) {
    this.promoCodeInfo = promoCodeInfo;
    }
    }