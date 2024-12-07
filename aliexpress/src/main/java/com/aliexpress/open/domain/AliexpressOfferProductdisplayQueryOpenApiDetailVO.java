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

public class AliexpressOfferProductdisplayQueryOpenApiDetailVO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** average evaluation  rating */
                @ApiField("avg_evaluation_rating")
            private String avgEvaluationRating;
        /** currency code */
                @ApiField("currency_code")
            private String currencyCode;
        /** order  count */
                @ApiField("order_count")
            private String orderCount;
        /** Product title in eng */
                @ApiField("english_subject")
            private String englishSubject;
        /** quantity of available items */
                @ApiField("quantity")
            private Long quantity;
        /** brand */
                @ApiField("brand")
            private String brand;
        /** Product specific properties */
                @ApiField("item_specific_attributes")
            private String itemSpecificAttributes;
        /** Code of the country to send goods from */
                @ApiField("logistics_class")
            private String logisticsClass;
        /** url with description media */
                @ApiField("description_url")
            private String descriptionUrl;
        /** categories tree divided by > */
                @ApiField("categories")
            private String categories;
        /** indicates if the product available or not */
                @ApiField("online")
            private Boolean online;
        /** Indicates if the seller is local or CB */
                @ApiField("is_local_product")
            private Boolean isLocalProduct;
        /** Product category id */
                @ApiField("category_id")
            private Integer categoryId;
        /** Price in subcurrency */
                @ApiField("original_price_cents")
            private Integer originalPriceCents;
        /** Discount price in subcurrency */
                @ApiField("discount_price_cents")
            private Integer discountPriceCents;
        /** Image URLs */
                @ApiField("image_urls")
            private String imageUrls;
        /** discount price */
                @ApiField("item_offer_site_sale_price")
            private String itemOfferSiteSalePrice;
        /** original price */
                @ApiField("product_price")
            private String productPrice;
        /** Product titile in russian */
                @ApiField("subject")
            private String subject;
        /** discount rate */
                @ApiField("discount_rate")
            private String discountRate;
        /** Number of evaluations */
                @ApiField("evaluation_count")
            private String evaluationCount;
    
        public String getAvgEvaluationRating() {
    return this.avgEvaluationRating;
    }
    public void setAvgEvaluationRating(String avgEvaluationRating) {
    this.avgEvaluationRating = avgEvaluationRating;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public String getOrderCount() {
    return this.orderCount;
    }
    public void setOrderCount(String orderCount) {
    this.orderCount = orderCount;
    }
        public String getEnglishSubject() {
    return this.englishSubject;
    }
    public void setEnglishSubject(String englishSubject) {
    this.englishSubject = englishSubject;
    }
        public Long getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Long quantity) {
    this.quantity = quantity;
    }
        public String getBrand() {
    return this.brand;
    }
    public void setBrand(String brand) {
    this.brand = brand;
    }
        public String getItemSpecificAttributes() {
    return this.itemSpecificAttributes;
    }
    public void setItemSpecificAttributes(String itemSpecificAttributes) {
    this.itemSpecificAttributes = itemSpecificAttributes;
    }
        public String getLogisticsClass() {
    return this.logisticsClass;
    }
    public void setLogisticsClass(String logisticsClass) {
    this.logisticsClass = logisticsClass;
    }
        public String getDescriptionUrl() {
    return this.descriptionUrl;
    }
    public void setDescriptionUrl(String descriptionUrl) {
    this.descriptionUrl = descriptionUrl;
    }
        public String getCategories() {
    return this.categories;
    }
    public void setCategories(String categories) {
    this.categories = categories;
    }
        public Boolean getOnline() {
    return this.online;
    }
    public void setOnline(Boolean online) {
    this.online = online;
    }
        public Boolean getIsLocalProduct() {
    return this.isLocalProduct;
    }
    public void setIsLocalProduct(Boolean isLocalProduct) {
    this.isLocalProduct = isLocalProduct;
    }
        public Integer getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
    }
        public Integer getOriginalPriceCents() {
    return this.originalPriceCents;
    }
    public void setOriginalPriceCents(Integer originalPriceCents) {
    this.originalPriceCents = originalPriceCents;
    }
        public Integer getDiscountPriceCents() {
    return this.discountPriceCents;
    }
    public void setDiscountPriceCents(Integer discountPriceCents) {
    this.discountPriceCents = discountPriceCents;
    }
        public String getImageUrls() {
    return this.imageUrls;
    }
    public void setImageUrls(String imageUrls) {
    this.imageUrls = imageUrls;
    }
        public String getItemOfferSiteSalePrice() {
    return this.itemOfferSiteSalePrice;
    }
    public void setItemOfferSiteSalePrice(String itemOfferSiteSalePrice) {
    this.itemOfferSiteSalePrice = itemOfferSiteSalePrice;
    }
        public String getProductPrice() {
    return this.productPrice;
    }
    public void setProductPrice(String productPrice) {
    this.productPrice = productPrice;
    }
        public String getSubject() {
    return this.subject;
    }
    public void setSubject(String subject) {
    this.subject = subject;
    }
        public String getDiscountRate() {
    return this.discountRate;
    }
    public void setDiscountRate(String discountRate) {
    this.discountRate = discountRate;
    }
        public String getEvaluationCount() {
    return this.evaluationCount;
    }
    public void setEvaluationCount(String evaluationCount) {
    this.evaluationCount = evaluationCount;
    }
    }