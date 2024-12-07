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

public class AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopFindProductResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 评价数 */
                @ApiField("evaluation_count")
            private Integer evaluationCount;
        /** 平均评价星级，1-5星 */
                @ApiField("avg_evaluation_rating")
            private String avgEvaluationRating;
        /** 订单数 */
                @ApiField("order_count")
            private Integer orderCount;
        /** 商品的SKU信息 */
                @ApiListField("aeop_ae_product_s_k_us")
            private List<AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopAEProductSKU> aeopAeProductSKUs;
        /** 商品详描 */
                @ApiField("detail")
            private String detail;
        /** 请求是否成功 */
                @ApiField("is_success")
            private Boolean isSuccess;
        /** 产品的单位 */
                @ApiField("product_unit")
            private Integer productUnit;
        /** 产品的下架日期 */
                @ApiField("ws_offline_date")
            private String wsOfflineDate;
        /** 产品的下架原因 */
                @ApiField("ws_display")
            private String wsDisplay;
        /** 产品所在类目的ID */
                @ApiField("category_id")
            private Integer categoryId;
        /** 商品多媒体信息，该属性主要包含商品的视频列表 */
                @ApiField("aeop_a_e_multimedia")
            private AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopAEMultimedia aeopAEMultimedia;
        /** 商品拥有者的login_id */
                @ApiField("owner_member_id")
            private String ownerMemberId;
        /** 产品的状态 */
                @ApiField("product_status_type")
            private String productStatusType;
        /** 商品的类目属性 */
                @ApiListField("aeop_ae_product_propertys")
            private List<AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopAeProductProperty> aeopAeProductPropertys;
        /** 产品的毛重 */
                @ApiField("gross_weight")
            private String grossWeight;
        /** 商品的备货期 */
                @ApiField("delivery_time")
            private Integer deliveryTime;
        /** 产品的有效期 */
                @ApiField("ws_valid_num")
            private Integer wsValidNum;
        /** 修改时间 */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
        /** 包装类型 */
                @ApiField("package_type")
            private Boolean packageType;
        /** 商品分国家报价的配置 */
                @ApiField("aeop_national_quote_configuration")
            private AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopNationalQuoteConfiguration aeopNationalQuoteConfiguration;
        /** 产品的标题 */
                @ApiField("subject")
            private String subject;
        /** 自定义计重的基本产品件数 */
                @ApiField("base_unit")
            private Integer baseUnit;
        /** 产品的长度 */
                @ApiField("package_length")
            private Integer packageLength;
        /** 无线详描 */
                @ApiField("mobile_detail")
            private String mobileDetail;
        /** 产品的高度 */
                @ApiField("package_height")
            private Integer packageHeight;
        /** 产品的宽度 */
                @ApiField("package_width")
            private Integer packageWidth;
        /** 产品的货币单位。美元: USD, 卢布: RUB */
                @ApiField("currency_code")
            private String currencyCode;
        /** 产品创建时间 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 产品的主图列表 */
                @ApiField("image_u_r_ls")
            private String imageURLs;
        /** 产品ID */
                @ApiField("product_id")
            private Long productId;
        /** 错误代码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 单品产品的价格。 */
                @ApiField("product_price")
            private String productPrice;
        /** 网站折扣后价格 */
                @ApiField("item_offer_site_sale_price")
            private String itemOfferSiteSalePrice;
        /** 库存 */
                @ApiField("total_available_stock")
            private Long totalAvailableStock;
        /** 店铺信息 */
                @ApiField("store_info")
            private AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopStoreInfo storeInfo;
    
        public Integer getEvaluationCount() {
    return this.evaluationCount;
    }
    public void setEvaluationCount(Integer evaluationCount) {
    this.evaluationCount = evaluationCount;
    }
        public String getAvgEvaluationRating() {
    return this.avgEvaluationRating;
    }
    public void setAvgEvaluationRating(String avgEvaluationRating) {
    this.avgEvaluationRating = avgEvaluationRating;
    }
        public Integer getOrderCount() {
    return this.orderCount;
    }
    public void setOrderCount(Integer orderCount) {
    this.orderCount = orderCount;
    }
        public List<AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopAEProductSKU> getAeopAeProductSKUs() {
    return this.aeopAeProductSKUs;
    }
    public void setAeopAeProductSKUs(List<AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopAEProductSKU> aeopAeProductSKUs) {
    this.aeopAeProductSKUs = aeopAeProductSKUs;
    }
        public String getDetail() {
    return this.detail;
    }
    public void setDetail(String detail) {
    this.detail = detail;
    }
        public Boolean getIsSuccess() {
    return this.isSuccess;
    }
    public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    }
        public Integer getProductUnit() {
    return this.productUnit;
    }
    public void setProductUnit(Integer productUnit) {
    this.productUnit = productUnit;
    }
        public String getWsOfflineDate() {
    return this.wsOfflineDate;
    }
    public void setWsOfflineDate(String wsOfflineDate) {
    this.wsOfflineDate = wsOfflineDate;
    }
        public String getWsDisplay() {
    return this.wsDisplay;
    }
    public void setWsDisplay(String wsDisplay) {
    this.wsDisplay = wsDisplay;
    }
        public Integer getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
    }
        public AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopAEMultimedia getAeopAEMultimedia() {
    return this.aeopAEMultimedia;
    }
    public void setAeopAEMultimedia(AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopAEMultimedia aeopAEMultimedia) {
    this.aeopAEMultimedia = aeopAEMultimedia;
    }
        public String getOwnerMemberId() {
    return this.ownerMemberId;
    }
    public void setOwnerMemberId(String ownerMemberId) {
    this.ownerMemberId = ownerMemberId;
    }
        public String getProductStatusType() {
    return this.productStatusType;
    }
    public void setProductStatusType(String productStatusType) {
    this.productStatusType = productStatusType;
    }
        public List<AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopAeProductProperty> getAeopAeProductPropertys() {
    return this.aeopAeProductPropertys;
    }
    public void setAeopAeProductPropertys(List<AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopAeProductProperty> aeopAeProductPropertys) {
    this.aeopAeProductPropertys = aeopAeProductPropertys;
    }
        public String getGrossWeight() {
    return this.grossWeight;
    }
    public void setGrossWeight(String grossWeight) {
    this.grossWeight = grossWeight;
    }
        public Integer getDeliveryTime() {
    return this.deliveryTime;
    }
    public void setDeliveryTime(Integer deliveryTime) {
    this.deliveryTime = deliveryTime;
    }
        public Integer getWsValidNum() {
    return this.wsValidNum;
    }
    public void setWsValidNum(Integer wsValidNum) {
    this.wsValidNum = wsValidNum;
    }
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public Boolean getPackageType() {
    return this.packageType;
    }
    public void setPackageType(Boolean packageType) {
    this.packageType = packageType;
    }
        public AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopNationalQuoteConfiguration getAeopNationalQuoteConfiguration() {
    return this.aeopNationalQuoteConfiguration;
    }
    public void setAeopNationalQuoteConfiguration(AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopNationalQuoteConfiguration aeopNationalQuoteConfiguration) {
    this.aeopNationalQuoteConfiguration = aeopNationalQuoteConfiguration;
    }
        public String getSubject() {
    return this.subject;
    }
    public void setSubject(String subject) {
    this.subject = subject;
    }
        public Integer getBaseUnit() {
    return this.baseUnit;
    }
    public void setBaseUnit(Integer baseUnit) {
    this.baseUnit = baseUnit;
    }
        public Integer getPackageLength() {
    return this.packageLength;
    }
    public void setPackageLength(Integer packageLength) {
    this.packageLength = packageLength;
    }
        public String getMobileDetail() {
    return this.mobileDetail;
    }
    public void setMobileDetail(String mobileDetail) {
    this.mobileDetail = mobileDetail;
    }
        public Integer getPackageHeight() {
    return this.packageHeight;
    }
    public void setPackageHeight(Integer packageHeight) {
    this.packageHeight = packageHeight;
    }
        public Integer getPackageWidth() {
    return this.packageWidth;
    }
    public void setPackageWidth(Integer packageWidth) {
    this.packageWidth = packageWidth;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getImageURLs() {
    return this.imageURLs;
    }
    public void setImageURLs(String imageURLs) {
    this.imageURLs = imageURLs;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    }
        public String getProductPrice() {
    return this.productPrice;
    }
    public void setProductPrice(String productPrice) {
    this.productPrice = productPrice;
    }
        public String getItemOfferSiteSalePrice() {
    return this.itemOfferSiteSalePrice;
    }
    public void setItemOfferSiteSalePrice(String itemOfferSiteSalePrice) {
    this.itemOfferSiteSalePrice = itemOfferSiteSalePrice;
    }
        public Long getTotalAvailableStock() {
    return this.totalAvailableStock;
    }
    public void setTotalAvailableStock(Long totalAvailableStock) {
    this.totalAvailableStock = totalAvailableStock;
    }
        public AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopStoreInfo getStoreInfo() {
    return this.storeInfo;
    }
    public void setStoreInfo(AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopStoreInfo storeInfo) {
    this.storeInfo = storeInfo;
    }
    }