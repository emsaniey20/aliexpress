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

public class AliexpressChoiceProductsListOneStopServiceProductSearchBaseResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 修改时间：2023-01-03 20:32:37 */
                @ApiField("modified_time")
            private String modifiedTime;
        /** 商品id */
                @ApiField("product_id")
            private Long productId;
        /** 商品最小供货价 */
                @ApiField("product_min_price")
            private String productMinPrice;
        /** 商品总库存 */
                @ApiField("total_stocks")
            private Long totalStocks;
        /** 商品最大供货价 */
                @ApiField("product_max_price")
            private String productMaxPrice;
        /** 标题 */
                @ApiField("title")
            private String title;
        /** 商品审核状态，1表示审核通过 ， 其余都是不通过 */
                @ApiField("product_audit_status")
            private Integer productAuditStatus;
        /** 商品主图 */
                @ApiField("image_urls")
            private String imageUrls;
        /** 创建时间 */
                @ApiField("created_time")
            private String createdTime;
        /** sku列表 */
                @ApiListField("search_sku_info_list")
            private List<AliexpressChoiceProductsListSearchSkuInfo> searchSkuInfoList;
        /** 审核不通过的原因：    PRODUCT_AUDIT_SUB_STATUS_BASIC("audit_sub_status_basic", "商品基础信息审核"),     PRODUCT_AUDIT_SUB_STATUS_SUPPLY_PRICE("audit_sub_status_supply_price", "商品供应价格审核"),     PRODUCT_AUDIT_SUB_STATUS_CRO("audit_sub_status_cro", "商品CRO审核"),     PRODUCT_AUDIT_SUB_STATUS_QF("audit_sub_status_qf", "商品资质审核"),     PRODUCT_AUDIT_SUB_STATUS_SALE_PRICE("audit_sub_status_sale_price", "商品零售价审核"),     UP_SHELF_PRODUCT("up_shelf_product", "商品上架审核"),     DOWN_SHELF_PRODUCT("down_shelf_product", "商品下架审核"),     DELETE_PRODUCT("delete_product", "商品删除审核"),     AUDIT_APPROVE("audit_approve", "商品审核通过"),     AUDIT_REJECT("audit_reject", "商品审核拒绝"); */
                @ApiField("audit_failure_type")
            private String auditFailureType;
        /** 商品币种 */
                @ApiField("currency_code")
            private String currencyCode;
        /** 商品叶子类目id */
                @ApiField("leaf_category_id")
            private Long leafCategoryId;
        /** 全托管商品备货类型， 仓发：0  ； 即时补货模式（JIT）：1  ；      海外备仓：2。。 */
                @ApiField("product_type")
            private String productType;
    
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
        public String getProductMinPrice() {
    return this.productMinPrice;
    }
    public void setProductMinPrice(String productMinPrice) {
    this.productMinPrice = productMinPrice;
    }
        public Long getTotalStocks() {
    return this.totalStocks;
    }
    public void setTotalStocks(Long totalStocks) {
    this.totalStocks = totalStocks;
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
        public Integer getProductAuditStatus() {
    return this.productAuditStatus;
    }
    public void setProductAuditStatus(Integer productAuditStatus) {
    this.productAuditStatus = productAuditStatus;
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
        public List<AliexpressChoiceProductsListSearchSkuInfo> getSearchSkuInfoList() {
    return this.searchSkuInfoList;
    }
    public void setSearchSkuInfoList(List<AliexpressChoiceProductsListSearchSkuInfo> searchSkuInfoList) {
    this.searchSkuInfoList = searchSkuInfoList;
    }
        public String getAuditFailureType() {
    return this.auditFailureType;
    }
    public void setAuditFailureType(String auditFailureType) {
    this.auditFailureType = auditFailureType;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public Long getLeafCategoryId() {
    return this.leafCategoryId;
    }
    public void setLeafCategoryId(Long leafCategoryId) {
    this.leafCategoryId = leafCategoryId;
    }
        public String getProductType() {
    return this.productType;
    }
    public void setProductType(String productType) {
    this.productType = productType;
    }
    }