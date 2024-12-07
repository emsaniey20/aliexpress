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

public class AliexpressUsergrowthSearchItemsGetData implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sub category */
                @ApiField("sub_category")
            private String subCategory;
        /** product id */
                @ApiField("product_id")
            private String productId;
        /** sale price , return  local price */
                @ApiField("sale_price")
            private String salePrice;
        /** shop name */
                @ApiField("shop_name")
            private String shopName;
        /** product photo url */
                @ApiField("photo")
            private String photo;
        /** rating count */
                @ApiField("rating_count")
            private Long ratingCount;
        /** product name */
                @ApiField("product_name")
            private String productName;
        /** photo height */
                @ApiField("photo_height")
            private Long photoHeight;
        /** shop rating */
                @ApiField("shop_rating")
            private String shopRating;
        /** delivery freeShipping */
                @ApiField("free_shipping")
            private Boolean freeShipping;
        /** rating */
                @ApiField("rating_value")
            private String ratingValue;
        /** store url */
                @ApiField("shop_domain")
            private String shopDomain;
        /** shopId */
                @ApiField("shop_id")
            private String shopId;
        /** product detail Url */
                @ApiField("detail_url")
            private String detailUrl;
        /** product category */
                @ApiField("category")
            private String category;
        /** photo width */
                @ApiField("photo_width")
            private Long photoWidth;
    
        public String getSubCategory() {
    return this.subCategory;
    }
    public void setSubCategory(String subCategory) {
    this.subCategory = subCategory;
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
        public String getShopName() {
    return this.shopName;
    }
    public void setShopName(String shopName) {
    this.shopName = shopName;
    }
        public String getPhoto() {
    return this.photo;
    }
    public void setPhoto(String photo) {
    this.photo = photo;
    }
        public Long getRatingCount() {
    return this.ratingCount;
    }
    public void setRatingCount(Long ratingCount) {
    this.ratingCount = ratingCount;
    }
        public String getProductName() {
    return this.productName;
    }
    public void setProductName(String productName) {
    this.productName = productName;
    }
        public Long getPhotoHeight() {
    return this.photoHeight;
    }
    public void setPhotoHeight(Long photoHeight) {
    this.photoHeight = photoHeight;
    }
        public String getShopRating() {
    return this.shopRating;
    }
    public void setShopRating(String shopRating) {
    this.shopRating = shopRating;
    }
        public Boolean getFreeShipping() {
    return this.freeShipping;
    }
    public void setFreeShipping(Boolean freeShipping) {
    this.freeShipping = freeShipping;
    }
        public String getRatingValue() {
    return this.ratingValue;
    }
    public void setRatingValue(String ratingValue) {
    this.ratingValue = ratingValue;
    }
        public String getShopDomain() {
    return this.shopDomain;
    }
    public void setShopDomain(String shopDomain) {
    this.shopDomain = shopDomain;
    }
        public String getShopId() {
    return this.shopId;
    }
    public void setShopId(String shopId) {
    this.shopId = shopId;
    }
        public String getDetailUrl() {
    return this.detailUrl;
    }
    public void setDetailUrl(String detailUrl) {
    this.detailUrl = detailUrl;
    }
        public String getCategory() {
    return this.category;
    }
    public void setCategory(String category) {
    this.category = category;
    }
        public Long getPhotoWidth() {
    return this.photoWidth;
    }
    public void setPhotoWidth(Long photoWidth) {
    this.photoWidth = photoWidth;
    }
    }