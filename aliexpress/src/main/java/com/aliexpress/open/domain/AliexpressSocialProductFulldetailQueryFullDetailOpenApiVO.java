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

public class AliexpressSocialProductFulldetailQueryFullDetailOpenApiVO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Product properties */
                @ApiField("attributes")
            private HashMap<String, Object> attributes;
        /** Product rating */
                @ApiField("average_star")
            private String averageStar;
        /** Currency of product price */
                @ApiField("base_currency_code")
            private String baseCurrencyCode;
        /** Product brand */
                @ApiField("brand")
            private String brand;
        /** category url */
                @ApiField("category_url")
            private String categoryUrl;
        /** url for complaints for proudct */
                @ApiField("complaints_url")
            private String complaintsUrl;
        /** Actual currency */
                @ApiField("currency_code")
            private String currencyCode;
        /** Currency rate */
                @ApiField("currency_rate")
            private String currencyRate;
        /** Product page description */
                @ApiField("description")
            private String description;
        /** product page url */
                @ApiField("detail_page_url")
            private String detailPageUrl;
        /** discount */
                @ApiField("discount_rate")
            private Integer discountRate;
        /** display Category Id */
                @ApiField("display_category_id")
            private Integer displayCategoryId;
        /** height of product */
                @ApiField("height")
            private Integer height;
        /** Id of product */
                @ApiField("id")
            private Long id;
        /** product images */
                @ApiListField("image_path_list")
            private List<String> imagePathList;
        /** if product available or not */
                @ApiField("is_online")
            private Boolean isOnline;
        /** product keywords */
                @ApiField("keywords")
            private String keywords;
        /** length */
                @ApiField("length")
            private Integer length;
        /** if it has several lots */
                @ApiField("lot")
            private Boolean lot;
        /** number of items in lot */
                @ApiField("lot_num")
            private String lotNum;
        /** blured order count */
                @ApiField("order_count")
            private Integer orderCount;
        /** type of package */
                @ApiField("package_type")
            private String packageType;
        /** contry to send goods from */
                @ApiField("send_goods_country")
            private String sendGoodsCountry;
        /** sku details */
                @ApiField("sku_info")
            private AliexpressSocialProductFulldetailQuerySkuInfo skuInfo;
        /** sku list */
                @ApiListField("sku_list")
            private List<AliexpressSocialProductFulldetailQuerySkuOpenApiVO> skuList;
        /** product title */
                @ApiField("subject")
            private String subject;
        /** 36 */
                @ApiField("total_avail_quantity")
            private Integer totalAvailQuantity;
        /** Feedbacks count */
                @ApiField("total_feedback_number")
            private Integer totalFeedbackNumber;
        /** Type of stock */
                @ApiField("unit_type")
            private String unitType;
        /** total weight */
                @ApiField("weight")
            private String weight;
        /** pack width */
                @ApiField("width")
            private Integer width;
        /** Store name */
                @ApiField("seller_name")
            private String sellerName;
        /** Not formatted product price */
                @ApiField("product_price")
            private String productPrice;
        /** Product title ENG */
                @ApiField("eng_title")
            private String engTitle;
        /** Is local or CB */
                @ApiField("is_local_product")
            private Boolean isLocalProduct;
        /** Not formatted price after discount (actual price) */
                @ApiField("discount_product_price")
            private String discountProductPrice;
        /** video url */
                @ApiField("video_url")
            private String videoUrl;
        /** Url to description html */
                @ApiField("description_url")
            private String descriptionUrl;
    
        public HashMap<String, Object> getAttributes() {
    return this.attributes;
    }
    public void setAttributes(HashMap<String, Object> attributes) {
    this.attributes = attributes;
    }
        public String getAverageStar() {
    return this.averageStar;
    }
    public void setAverageStar(String averageStar) {
    this.averageStar = averageStar;
    }
        public String getBaseCurrencyCode() {
    return this.baseCurrencyCode;
    }
    public void setBaseCurrencyCode(String baseCurrencyCode) {
    this.baseCurrencyCode = baseCurrencyCode;
    }
        public String getBrand() {
    return this.brand;
    }
    public void setBrand(String brand) {
    this.brand = brand;
    }
        public String getCategoryUrl() {
    return this.categoryUrl;
    }
    public void setCategoryUrl(String categoryUrl) {
    this.categoryUrl = categoryUrl;
    }
        public String getComplaintsUrl() {
    return this.complaintsUrl;
    }
    public void setComplaintsUrl(String complaintsUrl) {
    this.complaintsUrl = complaintsUrl;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public String getCurrencyRate() {
    return this.currencyRate;
    }
    public void setCurrencyRate(String currencyRate) {
    this.currencyRate = currencyRate;
    }
        public String getDescription() {
    return this.description;
    }
    public void setDescription(String description) {
    this.description = description;
    }
        public String getDetailPageUrl() {
    return this.detailPageUrl;
    }
    public void setDetailPageUrl(String detailPageUrl) {
    this.detailPageUrl = detailPageUrl;
    }
        public Integer getDiscountRate() {
    return this.discountRate;
    }
    public void setDiscountRate(Integer discountRate) {
    this.discountRate = discountRate;
    }
        public Integer getDisplayCategoryId() {
    return this.displayCategoryId;
    }
    public void setDisplayCategoryId(Integer displayCategoryId) {
    this.displayCategoryId = displayCategoryId;
    }
        public Integer getHeight() {
    return this.height;
    }
    public void setHeight(Integer height) {
    this.height = height;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public List<String> getImagePathList() {
    return this.imagePathList;
    }
    public void setImagePathList(List<String> imagePathList) {
    this.imagePathList = imagePathList;
    }
        public Boolean getIsOnline() {
    return this.isOnline;
    }
    public void setIsOnline(Boolean isOnline) {
    this.isOnline = isOnline;
    }
        public String getKeywords() {
    return this.keywords;
    }
    public void setKeywords(String keywords) {
    this.keywords = keywords;
    }
        public Integer getLength() {
    return this.length;
    }
    public void setLength(Integer length) {
    this.length = length;
    }
        public Boolean getLot() {
    return this.lot;
    }
    public void setLot(Boolean lot) {
    this.lot = lot;
    }
        public String getLotNum() {
    return this.lotNum;
    }
    public void setLotNum(String lotNum) {
    this.lotNum = lotNum;
    }
        public Integer getOrderCount() {
    return this.orderCount;
    }
    public void setOrderCount(Integer orderCount) {
    this.orderCount = orderCount;
    }
        public String getPackageType() {
    return this.packageType;
    }
    public void setPackageType(String packageType) {
    this.packageType = packageType;
    }
        public String getSendGoodsCountry() {
    return this.sendGoodsCountry;
    }
    public void setSendGoodsCountry(String sendGoodsCountry) {
    this.sendGoodsCountry = sendGoodsCountry;
    }
        public AliexpressSocialProductFulldetailQuerySkuInfo getSkuInfo() {
    return this.skuInfo;
    }
    public void setSkuInfo(AliexpressSocialProductFulldetailQuerySkuInfo skuInfo) {
    this.skuInfo = skuInfo;
    }
        public List<AliexpressSocialProductFulldetailQuerySkuOpenApiVO> getSkuList() {
    return this.skuList;
    }
    public void setSkuList(List<AliexpressSocialProductFulldetailQuerySkuOpenApiVO> skuList) {
    this.skuList = skuList;
    }
        public String getSubject() {
    return this.subject;
    }
    public void setSubject(String subject) {
    this.subject = subject;
    }
        public Integer getTotalAvailQuantity() {
    return this.totalAvailQuantity;
    }
    public void setTotalAvailQuantity(Integer totalAvailQuantity) {
    this.totalAvailQuantity = totalAvailQuantity;
    }
        public Integer getTotalFeedbackNumber() {
    return this.totalFeedbackNumber;
    }
    public void setTotalFeedbackNumber(Integer totalFeedbackNumber) {
    this.totalFeedbackNumber = totalFeedbackNumber;
    }
        public String getUnitType() {
    return this.unitType;
    }
    public void setUnitType(String unitType) {
    this.unitType = unitType;
    }
        public String getWeight() {
    return this.weight;
    }
    public void setWeight(String weight) {
    this.weight = weight;
    }
        public Integer getWidth() {
    return this.width;
    }
    public void setWidth(Integer width) {
    this.width = width;
    }
        public String getSellerName() {
    return this.sellerName;
    }
    public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
    }
        public String getProductPrice() {
    return this.productPrice;
    }
    public void setProductPrice(String productPrice) {
    this.productPrice = productPrice;
    }
        public String getEngTitle() {
    return this.engTitle;
    }
    public void setEngTitle(String engTitle) {
    this.engTitle = engTitle;
    }
        public Boolean getIsLocalProduct() {
    return this.isLocalProduct;
    }
    public void setIsLocalProduct(Boolean isLocalProduct) {
    this.isLocalProduct = isLocalProduct;
    }
        public String getDiscountProductPrice() {
    return this.discountProductPrice;
    }
    public void setDiscountProductPrice(String discountProductPrice) {
    this.discountProductPrice = discountProductPrice;
    }
        public String getVideoUrl() {
    return this.videoUrl;
    }
    public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    }
        public String getDescriptionUrl() {
    return this.descriptionUrl;
    }
    public void setDescriptionUrl(String descriptionUrl) {
    this.descriptionUrl = descriptionUrl;
    }
    }