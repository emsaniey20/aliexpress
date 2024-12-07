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

public class DsImageSearchTrafficImageProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** product small image urls */
                @ApiListField("product_small_image_urls")
            private List<String> productSmallImageUrls;
        /** original price */
                @ApiField("original_price")
            private String originalPrice;
        /** original price currency */
                @ApiField("original_price_currency")
            private String originalPriceCurrency;
        /** discount */
                @ApiField("discount")
            private String discount;
        /** latest volume */
                @ApiField("lastest_volume")
            private String lastestVolume;
        /** seller id */
                @ApiField("seller_id")
            private Integer sellerId;
        /** target sale price */
                @ApiField("target_sale_price")
            private String targetSalePrice;
        /** evaluate rate */
                @ApiField("evaluate_rate")
            private String evaluateRate;
        /** target original price */
                @ApiField("target_original_price")
            private String targetOriginalPrice;
        /** shop id */
                @ApiField("shop_id")
            private Integer shopId;
        /** second level category name */
                @ApiField("second_level_category_name")
            private String secondLevelCategoryName;
        /** first level category id */
                @ApiField("first_level_category_id")
            private String firstLevelCategoryId;
        /** product vedio url */
                @ApiField("product_video_url")
            private String productVideoUrl;
        /** product id */
                @ApiField("product_id")
            private String productId;
        /** sale price */
                @ApiField("sale_price")
            private String salePrice;
        /** target sale price currency */
                @ApiField("target_sale_price_currency")
            private String targetSalePriceCurrency;
        /** second level category id */
                @ApiField("second_level_category_id")
            private String secondLevelCategoryId;
        /** shop url */
                @ApiField("shop_url")
            private String shopUrl;
        /** product title */
                @ApiField("product_title")
            private String productTitle;
        /** product detail url */
                @ApiField("product_detail_url")
            private String productDetailUrl;
        /** first level category name */
                @ApiField("first_level_category_name")
            private String firstLevelCategoryName;
        /** product main image url */
                @ApiField("product_main_image_url")
            private String productMainImageUrl;
        /** platform product type */
                @ApiField("platform_product_type")
            private String platformProductType;
        /** target original price currency */
                @ApiField("target_original_price_currency")
            private String targetOriginalPriceCurrency;
        /** sale price currency */
                @ApiField("sale_price_currency")
            private String salePriceCurrency;
    
        public List<String> getProductSmallImageUrls() {
    return this.productSmallImageUrls;
    }
    public void setProductSmallImageUrls(List<String> productSmallImageUrls) {
    this.productSmallImageUrls = productSmallImageUrls;
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
        public String getDiscount() {
    return this.discount;
    }
    public void setDiscount(String discount) {
    this.discount = discount;
    }
        public String getLastestVolume() {
    return this.lastestVolume;
    }
    public void setLastestVolume(String lastestVolume) {
    this.lastestVolume = lastestVolume;
    }
        public Integer getSellerId() {
    return this.sellerId;
    }
    public void setSellerId(Integer sellerId) {
    this.sellerId = sellerId;
    }
        public String getTargetSalePrice() {
    return this.targetSalePrice;
    }
    public void setTargetSalePrice(String targetSalePrice) {
    this.targetSalePrice = targetSalePrice;
    }
        public String getEvaluateRate() {
    return this.evaluateRate;
    }
    public void setEvaluateRate(String evaluateRate) {
    this.evaluateRate = evaluateRate;
    }
        public String getTargetOriginalPrice() {
    return this.targetOriginalPrice;
    }
    public void setTargetOriginalPrice(String targetOriginalPrice) {
    this.targetOriginalPrice = targetOriginalPrice;
    }
        public Integer getShopId() {
    return this.shopId;
    }
    public void setShopId(Integer shopId) {
    this.shopId = shopId;
    }
        public String getSecondLevelCategoryName() {
    return this.secondLevelCategoryName;
    }
    public void setSecondLevelCategoryName(String secondLevelCategoryName) {
    this.secondLevelCategoryName = secondLevelCategoryName;
    }
        public String getFirstLevelCategoryId() {
    return this.firstLevelCategoryId;
    }
    public void setFirstLevelCategoryId(String firstLevelCategoryId) {
    this.firstLevelCategoryId = firstLevelCategoryId;
    }
        public String getProductVideoUrl() {
    return this.productVideoUrl;
    }
    public void setProductVideoUrl(String productVideoUrl) {
    this.productVideoUrl = productVideoUrl;
    }
        public String getProductId() {
    return this.productId;
    }
    public void setProductId(String productId) {
    this.productId = productId;
    }
        public String getSalePrice() {
    return this.salePrice;
    }
    public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
    }
        public String getTargetSalePriceCurrency() {
    return this.targetSalePriceCurrency;
    }
    public void setTargetSalePriceCurrency(String targetSalePriceCurrency) {
    this.targetSalePriceCurrency = targetSalePriceCurrency;
    }
        public String getSecondLevelCategoryId() {
    return this.secondLevelCategoryId;
    }
    public void setSecondLevelCategoryId(String secondLevelCategoryId) {
    this.secondLevelCategoryId = secondLevelCategoryId;
    }
        public String getShopUrl() {
    return this.shopUrl;
    }
    public void setShopUrl(String shopUrl) {
    this.shopUrl = shopUrl;
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
        public String getFirstLevelCategoryName() {
    return this.firstLevelCategoryName;
    }
    public void setFirstLevelCategoryName(String firstLevelCategoryName) {
    this.firstLevelCategoryName = firstLevelCategoryName;
    }
        public String getProductMainImageUrl() {
    return this.productMainImageUrl;
    }
    public void setProductMainImageUrl(String productMainImageUrl) {
    this.productMainImageUrl = productMainImageUrl;
    }
        public String getPlatformProductType() {
    return this.platformProductType;
    }
    public void setPlatformProductType(String platformProductType) {
    this.platformProductType = platformProductType;
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
    }