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

public class AliexpressSocialItemSearchItemSearchResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品ID */
                @ApiField("item_id")
            private Long itemId;
        /** 商品标题 */
                @ApiField("item_title")
            private String itemTitle;
        /** 商品URL */
                @ApiField("item_url")
            private String itemUrl;
        /** 商品主图 */
                @ApiField("item_main_pic")
            private String itemMainPic;
        /** 商品原价最低值 */
                @ApiField("item_origin_price_min")
            private String itemOriginPriceMin;
        /** 商品原价最高值 */
                @ApiField("item_origin_price_max")
            private String itemOriginPriceMax;
        /** 商品折扣价最低至 */
                @ApiField("item_price_discount_min")
            private String itemPriceDiscountMin;
        /** 商品折扣价最高值 */
                @ApiField("item_price_discount_max")
            private String itemPriceDiscountMax;
        /** 商品折扣率 */
                @ApiField("item_discount_rate")
            private String itemDiscountRate;
        /** 发布时间 */
                @ApiField("pub_time")
            private String pubTime;
        /** 评价分 */
                @ApiField("comment_score")
            private String commentScore;
        /** 销量语义化 */
                @ApiField("sales30_day_semantic")
            private Integer sales30DaySemantic;
        /** 店铺URL */
                @ApiField("shop_url")
            private String shopUrl;
        /** 评论语义化 */
                @ApiField("comment30_day_semantic")
            private Integer comment30DaySemantic;
        /** 卖家服务分 */
                @ApiField("seller_layer")
            private String sellerLayer;
        /** 佣金比例 */
                @ApiField("commission_rate")
            private String commissionRate;
        /** 收藏数语义化 */
                @ApiField("favorite_cnt_semantic")
            private Integer favoriteCntSemantic;
        /** 图片地址 */
                @ApiField("item_pics")
            private String itemPics;
        /** 视频地址 */
                @ApiField("item_videos")
            private String itemVideos;
    
        public Long getItemId() {
    return this.itemId;
    }
    public void setItemId(Long itemId) {
    this.itemId = itemId;
    }
        public String getItemTitle() {
    return this.itemTitle;
    }
    public void setItemTitle(String itemTitle) {
    this.itemTitle = itemTitle;
    }
        public String getItemUrl() {
    return this.itemUrl;
    }
    public void setItemUrl(String itemUrl) {
    this.itemUrl = itemUrl;
    }
        public String getItemMainPic() {
    return this.itemMainPic;
    }
    public void setItemMainPic(String itemMainPic) {
    this.itemMainPic = itemMainPic;
    }
        public String getItemOriginPriceMin() {
    return this.itemOriginPriceMin;
    }
    public void setItemOriginPriceMin(String itemOriginPriceMin) {
    this.itemOriginPriceMin = itemOriginPriceMin;
    }
        public String getItemOriginPriceMax() {
    return this.itemOriginPriceMax;
    }
    public void setItemOriginPriceMax(String itemOriginPriceMax) {
    this.itemOriginPriceMax = itemOriginPriceMax;
    }
        public String getItemPriceDiscountMin() {
    return this.itemPriceDiscountMin;
    }
    public void setItemPriceDiscountMin(String itemPriceDiscountMin) {
    this.itemPriceDiscountMin = itemPriceDiscountMin;
    }
        public String getItemPriceDiscountMax() {
    return this.itemPriceDiscountMax;
    }
    public void setItemPriceDiscountMax(String itemPriceDiscountMax) {
    this.itemPriceDiscountMax = itemPriceDiscountMax;
    }
        public String getItemDiscountRate() {
    return this.itemDiscountRate;
    }
    public void setItemDiscountRate(String itemDiscountRate) {
    this.itemDiscountRate = itemDiscountRate;
    }
        public String getPubTime() {
    return this.pubTime;
    }
    public void setPubTime(String pubTime) {
    this.pubTime = pubTime;
    }
        public String getCommentScore() {
    return this.commentScore;
    }
    public void setCommentScore(String commentScore) {
    this.commentScore = commentScore;
    }
        public Integer getSales30DaySemantic() {
    return this.sales30DaySemantic;
    }
    public void setSales30DaySemantic(Integer sales30DaySemantic) {
    this.sales30DaySemantic = sales30DaySemantic;
    }
        public String getShopUrl() {
    return this.shopUrl;
    }
    public void setShopUrl(String shopUrl) {
    this.shopUrl = shopUrl;
    }
        public Integer getComment30DaySemantic() {
    return this.comment30DaySemantic;
    }
    public void setComment30DaySemantic(Integer comment30DaySemantic) {
    this.comment30DaySemantic = comment30DaySemantic;
    }
        public String getSellerLayer() {
    return this.sellerLayer;
    }
    public void setSellerLayer(String sellerLayer) {
    this.sellerLayer = sellerLayer;
    }
        public String getCommissionRate() {
    return this.commissionRate;
    }
    public void setCommissionRate(String commissionRate) {
    this.commissionRate = commissionRate;
    }
        public Integer getFavoriteCntSemantic() {
    return this.favoriteCntSemantic;
    }
    public void setFavoriteCntSemantic(Integer favoriteCntSemantic) {
    this.favoriteCntSemantic = favoriteCntSemantic;
    }
        public String getItemPics() {
    return this.itemPics;
    }
    public void setItemPics(String itemPics) {
    this.itemPics = itemPics;
    }
        public String getItemVideos() {
    return this.itemVideos;
    }
    public void setItemVideos(String itemVideos) {
    this.itemVideos = itemVideos;
    }
    }