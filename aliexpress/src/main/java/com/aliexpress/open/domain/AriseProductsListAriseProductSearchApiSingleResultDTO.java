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

public class AriseProductsListAriseProductSearchApiSingleResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 修改时间 */
                @ApiField("modified_time")
            private String modifiedTime;
        /** 商品ID */
                @ApiField("product_id")
            private Long productId;
        /** 库存 */
                @ApiField("total_stocks")
            private Integer totalStocks;
        /** 商品最低价 */
                @ApiField("product_min_price")
            private String productMinPrice;
        /** 图片信息 */
                @ApiField("image_urls")
            private String imageUrls;
        /** 创建时间 */
                @ApiField("created_time")
            private String createdTime;
        /** 商品最高价 */
                @ApiField("product_max_price")
            private String productMaxPrice;
        /** 商品标题 */
                @ApiField("title")
            private String title;
        /** 商品所叶类目ID */
                @ApiField("leaf_category_id")
            private Integer leafCategoryId;
        /** currency_code */
                @ApiField("currency_code")
            private String currencyCode;
        /** 商品的状态： 1 ：表示正常在线； -2 ：卖家手动下架；-3：审核不通过或其他下架； -1：卖家删除；-4：表示小二删除 */
                @ApiField("auction_status")
            private Integer auctionStatus;
        /** 商品审核状态。 审核中 (-1,"Pending"), 审核通过(1, "Approved"),拒绝(0, "Rejected"),批准中(-2,"APPROVING"),拒绝(-3,"LiveRejected"),  锁定商品不允许编辑和上架(-4, "Lock"); */
                @ApiField("audit_status")
            private Integer auditStatus;
    
        public String getModifiedTime() {
    return this.modifiedTime;
    }
    public void setModifiedTime(String modifiedTime) {
    this.modifiedTime = modifiedTime;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public Integer getTotalStocks() {
    return this.totalStocks;
    }
    public void setTotalStocks(Integer totalStocks) {
    this.totalStocks = totalStocks;
    }
        public String getProductMinPrice() {
    return this.productMinPrice;
    }
    public void setProductMinPrice(String productMinPrice) {
    this.productMinPrice = productMinPrice;
    }
        public String getImageUrls() {
    return this.imageUrls;
    }
    public void setImageUrls(String imageUrls) {
    this.imageUrls = imageUrls;
    }
        public String getCreatedTime() {
    return this.createdTime;
    }
    public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
    }
        public String getProductMaxPrice() {
    return this.productMaxPrice;
    }
    public void setProductMaxPrice(String productMaxPrice) {
    this.productMaxPrice = productMaxPrice;
    }
        public String getTitle() {
    return this.title;
    }
    public void setTitle(String title) {
    this.title = title;
    }
        public Integer getLeafCategoryId() {
    return this.leafCategoryId;
    }
    public void setLeafCategoryId(Integer leafCategoryId) {
    this.leafCategoryId = leafCategoryId;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public Integer getAuctionStatus() {
    return this.auctionStatus;
    }
    public void setAuctionStatus(Integer auctionStatus) {
    this.auctionStatus = auctionStatus;
    }
        public Integer getAuditStatus() {
    return this.auditStatus;
    }
    public void setAuditStatus(Integer auditStatus) {
    this.auditStatus = auditStatus;
    }
    }