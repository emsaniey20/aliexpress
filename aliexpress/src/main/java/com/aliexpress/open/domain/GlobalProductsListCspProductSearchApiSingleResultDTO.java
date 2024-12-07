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

public class GlobalProductsListCspProductSearchApiSingleResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 修改时间 */
                @ApiField("modified_time")
            private String modifiedTime;
        /** 商品ID */
                @ApiField("product_id")
            private Integer productId;
        /** 商品最低价 */
                @ApiField("product_min_price")
            private String productMinPrice;
        /** 全球商品总库存 */
                @ApiField("total_stocks")
            private String totalStocks;
        /** sku信息 */
                @ApiListField("sku_infos")
            private List<GlobalProductsListProductSearchApiSingleBaseResultDTO$SkuInfo> skuInfos;
        /** 商品最高价 */
                @ApiField("product_max_price")
            private String productMaxPrice;
        /** 商品标题 */
                @ApiField("title")
            private String title;
        /** 商品渠道信息 */
                @ApiListField("channels")
            private List<GlobalProductsListCspProductSearchApiSingleResultDTO$SaleChannel> channels;
        /** 创建时间 */
                @ApiField("created_time")
            private String createdTime;
        /** 商品主图 */
                @ApiField("main_image_url")
            private String mainImageUrl;
        /** 商品所属叶属性ID */
                @ApiField("leaf_category_id")
            private Integer leafCategoryId;
        /** 商品状态（0或不填是全部，1 是上架 ，-1 是删除 ， -2 是下架 ，-5 是 审核中 ，-10 是 草稿 ， 101 是废弃 ） */
                @ApiField("product_status")
            private String productStatus;
    
        public String getModifiedTime() {
    return this.modifiedTime;
    }
    public void setModifiedTime(String modifiedTime) {
    this.modifiedTime = modifiedTime;
    }
        public Integer getProductId() {
    return this.productId;
    }
    public void setProductId(Integer productId) {
    this.productId = productId;
    }
        public String getProductMinPrice() {
    return this.productMinPrice;
    }
    public void setProductMinPrice(String productMinPrice) {
    this.productMinPrice = productMinPrice;
    }
        public String getTotalStocks() {
    return this.totalStocks;
    }
    public void setTotalStocks(String totalStocks) {
    this.totalStocks = totalStocks;
    }
        public List<GlobalProductsListProductSearchApiSingleBaseResultDTO$SkuInfo> getSkuInfos() {
    return this.skuInfos;
    }
    public void setSkuInfos(List<GlobalProductsListProductSearchApiSingleBaseResultDTO$SkuInfo> skuInfos) {
    this.skuInfos = skuInfos;
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
        public List<GlobalProductsListCspProductSearchApiSingleResultDTO$SaleChannel> getChannels() {
    return this.channels;
    }
    public void setChannels(List<GlobalProductsListCspProductSearchApiSingleResultDTO$SaleChannel> channels) {
    this.channels = channels;
    }
        public String getCreatedTime() {
    return this.createdTime;
    }
    public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
    }
        public String getMainImageUrl() {
    return this.mainImageUrl;
    }
    public void setMainImageUrl(String mainImageUrl) {
    this.mainImageUrl = mainImageUrl;
    }
        public Integer getLeafCategoryId() {
    return this.leafCategoryId;
    }
    public void setLeafCategoryId(Integer leafCategoryId) {
    this.leafCategoryId = leafCategoryId;
    }
        public String getProductStatus() {
    return this.productStatus;
    }
    public void setProductStatus(String productStatus) {
    this.productStatus = productStatus;
    }
    }