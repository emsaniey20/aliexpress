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

public class AliexpressPopChoiceProductsListPopChoiceProductSearchResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品状态 */
                @ApiField("product_status")
            private String productStatus;
        /** 修改时间 */
                @ApiField("modified_time")
            private String modifiedTime;
        /** 商品主图 */
                @ApiField("product_image")
            private String productImage;
        /** 商品id */
                @ApiField("product_id")
            private Long productId;
        /** 创建时间 */
                @ApiField("create_time")
            private String createTime;
        /** 商品下库存总数 */
                @ApiField("total_stocks")
            private String totalStocks;
        /** 最大SKU价格 */
                @ApiField("max_sku_price")
            private String maxSkuPrice;
        /** 最小SKU价格 */
                @ApiField("min_sku_price")
            private String minSkuPrice;
        /** 商品标题 */
                @ApiField("title")
            private String title;
        /** 货币币种 */
                @ApiField("currency_code")
            private String currencyCode;
    
        public String getProductStatus() {
    return this.productStatus;
    }
    public void setProductStatus(String productStatus) {
    this.productStatus = productStatus;
    }
        public String getModifiedTime() {
    return this.modifiedTime;
    }
    public void setModifiedTime(String modifiedTime) {
    this.modifiedTime = modifiedTime;
    }
        public String getProductImage() {
    return this.productImage;
    }
    public void setProductImage(String productImage) {
    this.productImage = productImage;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getCreateTime() {
    return this.createTime;
    }
    public void setCreateTime(String createTime) {
    this.createTime = createTime;
    }
        public String getTotalStocks() {
    return this.totalStocks;
    }
    public void setTotalStocks(String totalStocks) {
    this.totalStocks = totalStocks;
    }
        public String getMaxSkuPrice() {
    return this.maxSkuPrice;
    }
    public void setMaxSkuPrice(String maxSkuPrice) {
    this.maxSkuPrice = maxSkuPrice;
    }
        public String getMinSkuPrice() {
    return this.minSkuPrice;
    }
    public void setMinSkuPrice(String minSkuPrice) {
    this.minSkuPrice = minSkuPrice;
    }
        public String getTitle() {
    return this.title;
    }
    public void setTitle(String title) {
    this.title = title;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
    }