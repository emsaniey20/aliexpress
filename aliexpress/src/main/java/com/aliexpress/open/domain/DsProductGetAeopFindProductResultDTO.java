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

public class DsProductGetAeopFindProductResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 111 */
                @ApiField("bulk_discount")
            private Integer bulkDiscount;
        /** 111 */
                @ApiField("locale")
            private String locale;
        /** 111 */
                @ApiField("avg_evaluation_rating")
            private String avgEvaluationRating;
        /** 111 */
                @ApiField("add_unit")
            private Integer addUnit;
        /** 111 */
                @ApiField("sizechart_spec_attr_json")
            private String sizechartSpecAttrJson;
        /** 111 */
                @ApiListField("market_images")
            private List<DsProductGetMarketImage> marketImages;
        /** 111 */
                @ApiField("owner_member_seq_long")
            private Long ownerMemberSeqLong;
        /** 111 */
                @ApiField("package_length")
            private Integer packageLength;
        /** 111 */
                @ApiField("aeop_national_quote_configuration")
            private DsProductGetAeopNationalQuoteConfiguration aeopNationalQuoteConfiguration;
        /** 111 */
                @ApiField("is_success")
            private Boolean isSuccess;
        /** 111 */
                @ApiField("summary")
            private String summary;
        /** 111 */
                @ApiField("product_more_keywords2")
            private String productMoreKeywords2;
        /** 111 */
                @ApiListField("subject_list")
            private List<DsProductGetSubject> subjectList;
        /** 111 */
                @ApiField("ws_valid_num")
            private Integer wsValidNum;
        /** 111 */
                @ApiField("freight_template_id")
            private Integer freightTemplateId;
        /** 111 */
                @ApiField("src")
            private String src;
        /** 111 */
                @ApiField("product_more_keywords1")
            private String productMoreKeywords1;
        /** 111 */
                @ApiField("lot_num")
            private Integer lotNum;
        /** 111 */
                @ApiField("owner_member_id")
            private String ownerMemberId;
        /** 111 */
                @ApiField("order_count")
            private Integer orderCount;
        /** 111 */
                @ApiField("error_message")
            private String errorMessage;
        /** 111 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 111 */
                @ApiField("time_stamp")
            private String timeStamp;
        /** 111 */
                @ApiField("add_weight")
            private String addWeight;
        /** 111 */
                @ApiField("gross_weight")
            private String grossWeight;
        /** 111 */
                @ApiField("item_offer_site_sale_price")
            private String itemOfferSiteSalePrice;
        /** 111 */
                @ApiField("image_urls")
            private String imageUrls;
        /** 111 */
                @ApiField("dp_bulk_order")
            private Integer dpBulkOrder;
        /** 111 */
                @ApiField("store_info")
            private DsProductGetAeopStoreInfo storeInfo;
        /** 111 */
                @ApiField("currency_code")
            private String currencyCode;
        /** 111 */
                @ApiField("coupon_start_date")
            private String couponStartDate;
        /** 111 */
                @ApiField("category_id")
            private Integer categoryId;
        /** 111 */
                @ApiField("category_id_long")
            private Long categoryIdLong;
        /** 111 */
                @ApiField("subject")
            private String subject;
        /** 111 */
                @ApiField("group_id")
            private Long groupId;
        /** 111 */
                @ApiField("coupon_end_date")
            private String couponEndDate;
        /** 111 */
                @ApiField("package_width")
            private Integer packageWidth;
        /** 111 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 111 */
                @ApiField("aeop_aemultimedia")
            private DsProductGetAeopAEMultimedia aeopAemultimedia;
        /** 111 */
                @ApiField("product_unit")
            private Integer productUnit;
        /** 111 */
                @ApiField("mobile_detail")
            private String mobileDetail;
        /** 111 */
                @ApiField("package_type")
            private Boolean packageType;
        /** 111 */
                @ApiListField("aeop_ae_product_propertys")
            private List<DsProductGetAeopAeProductProperty> aeopAeProductPropertys;
        /** 111 */
                @ApiField("base_unit")
            private Integer baseUnit;
        /** 111 */
                @ApiField("ws_display")
            private String wsDisplay;
        /** 111 */
                @ApiField("ws_offline_date")
            private String wsOfflineDate;
        /** 111 */
                @ApiListField("group_ids")
            private List<Long> groupIds;
        /** 111 */
                @ApiField("promise_template_id")
            private Long promiseTemplateId;
        /** 111 */
                @ApiField("keyword")
            private String keyword;
        /** 111 */
                @ApiListField("detail_source_list")
            private List<DsProductGetDetailSource> detailSourceList;
        /** 111 */
                @ApiField("dp_bulk_discount")
            private Integer dpBulkDiscount;
        /** 111 */
                @ApiField("product_id")
            private Long productId;
        /** 111 */
                @ApiField("sizechart_id")
            private Long sizechartId;
        /** 111 */
                @ApiField("ext_param")
            private String extParam;
        /** 111 */
                @ApiField("is_pack_sell")
            private Boolean isPackSell;
        /** 111 */
                @ApiField("error_code_str")
            private String errorCodeStr;
        /** 111 */
                @ApiField("package_height")
            private Integer packageHeight;
        /** 111 */
                @ApiField("freight_template_id_long")
            private Long freightTemplateIdLong;
        /** 111 */
                @ApiField("evaluation_count")
            private Integer evaluationCount;
        /** 111 */
                @ApiField("src_detail_url")
            private String srcDetailUrl;
        /** 111 */
                @ApiField("detail")
            private String detail;
        /** 111 */
                @ApiField("owner_member_seq")
            private Integer ownerMemberSeq;
        /** 111 */
                @ApiField("product_price")
            private String productPrice;
        /** 111 */
                @ApiField("bulk_order")
            private Integer bulkOrder;
        /** 111 */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** 111 */
                @ApiField("is_image_dynamic")
            private Boolean isImageDynamic;
        /** 111 */
                @ApiField("delivery_time")
            private Integer deliveryTime;
        /** 111 */
                @ApiField("total_available_stock")
            private Long totalAvailableStock;
        /** 111 */
                @ApiField("product_status_type")
            private String productStatusType;
        /** 111 */
                @ApiField("reduce_strategy")
            private String reduceStrategy;
        /** 111 */
                @ApiListField("aeop_ae_product_skus")
            private List<DsProductGetAeopAEProductSKU> aeopAeProductSkus;
    
        public Integer getBulkDiscount() {
    return this.bulkDiscount;
    }
    public void setBulkDiscount(Integer bulkDiscount) {
    this.bulkDiscount = bulkDiscount;
    }
        public String getLocale() {
    return this.locale;
    }
    public void setLocale(String locale) {
    this.locale = locale;
    }
        public String getAvgEvaluationRating() {
    return this.avgEvaluationRating;
    }
    public void setAvgEvaluationRating(String avgEvaluationRating) {
    this.avgEvaluationRating = avgEvaluationRating;
    }
        public Integer getAddUnit() {
    return this.addUnit;
    }
    public void setAddUnit(Integer addUnit) {
    this.addUnit = addUnit;
    }
        public String getSizechartSpecAttrJson() {
    return this.sizechartSpecAttrJson;
    }
    public void setSizechartSpecAttrJson(String sizechartSpecAttrJson) {
    this.sizechartSpecAttrJson = sizechartSpecAttrJson;
    }
        public List<DsProductGetMarketImage> getMarketImages() {
    return this.marketImages;
    }
    public void setMarketImages(List<DsProductGetMarketImage> marketImages) {
    this.marketImages = marketImages;
    }
        public Long getOwnerMemberSeqLong() {
    return this.ownerMemberSeqLong;
    }
    public void setOwnerMemberSeqLong(Long ownerMemberSeqLong) {
    this.ownerMemberSeqLong = ownerMemberSeqLong;
    }
        public Integer getPackageLength() {
    return this.packageLength;
    }
    public void setPackageLength(Integer packageLength) {
    this.packageLength = packageLength;
    }
        public DsProductGetAeopNationalQuoteConfiguration getAeopNationalQuoteConfiguration() {
    return this.aeopNationalQuoteConfiguration;
    }
    public void setAeopNationalQuoteConfiguration(DsProductGetAeopNationalQuoteConfiguration aeopNationalQuoteConfiguration) {
    this.aeopNationalQuoteConfiguration = aeopNationalQuoteConfiguration;
    }
        public Boolean getIsSuccess() {
    return this.isSuccess;
    }
    public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    }
        public String getSummary() {
    return this.summary;
    }
    public void setSummary(String summary) {
    this.summary = summary;
    }
        public String getProductMoreKeywords2() {
    return this.productMoreKeywords2;
    }
    public void setProductMoreKeywords2(String productMoreKeywords2) {
    this.productMoreKeywords2 = productMoreKeywords2;
    }
        public List<DsProductGetSubject> getSubjectList() {
    return this.subjectList;
    }
    public void setSubjectList(List<DsProductGetSubject> subjectList) {
    this.subjectList = subjectList;
    }
        public Integer getWsValidNum() {
    return this.wsValidNum;
    }
    public void setWsValidNum(Integer wsValidNum) {
    this.wsValidNum = wsValidNum;
    }
        public Integer getFreightTemplateId() {
    return this.freightTemplateId;
    }
    public void setFreightTemplateId(Integer freightTemplateId) {
    this.freightTemplateId = freightTemplateId;
    }
        public String getSrc() {
    return this.src;
    }
    public void setSrc(String src) {
    this.src = src;
    }
        public String getProductMoreKeywords1() {
    return this.productMoreKeywords1;
    }
    public void setProductMoreKeywords1(String productMoreKeywords1) {
    this.productMoreKeywords1 = productMoreKeywords1;
    }
        public Integer getLotNum() {
    return this.lotNum;
    }
    public void setLotNum(Integer lotNum) {
    this.lotNum = lotNum;
    }
        public String getOwnerMemberId() {
    return this.ownerMemberId;
    }
    public void setOwnerMemberId(String ownerMemberId) {
    this.ownerMemberId = ownerMemberId;
    }
        public Integer getOrderCount() {
    return this.orderCount;
    }
    public void setOrderCount(Integer orderCount) {
    this.orderCount = orderCount;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getTimeStamp() {
    return this.timeStamp;
    }
    public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    }
        public String getAddWeight() {
    return this.addWeight;
    }
    public void setAddWeight(String addWeight) {
    this.addWeight = addWeight;
    }
        public String getGrossWeight() {
    return this.grossWeight;
    }
    public void setGrossWeight(String grossWeight) {
    this.grossWeight = grossWeight;
    }
        public String getItemOfferSiteSalePrice() {
    return this.itemOfferSiteSalePrice;
    }
    public void setItemOfferSiteSalePrice(String itemOfferSiteSalePrice) {
    this.itemOfferSiteSalePrice = itemOfferSiteSalePrice;
    }
        public String getImageUrls() {
    return this.imageUrls;
    }
    public void setImageUrls(String imageUrls) {
    this.imageUrls = imageUrls;
    }
        public Integer getDpBulkOrder() {
    return this.dpBulkOrder;
    }
    public void setDpBulkOrder(Integer dpBulkOrder) {
    this.dpBulkOrder = dpBulkOrder;
    }
        public DsProductGetAeopStoreInfo getStoreInfo() {
    return this.storeInfo;
    }
    public void setStoreInfo(DsProductGetAeopStoreInfo storeInfo) {
    this.storeInfo = storeInfo;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public String getCouponStartDate() {
    return this.couponStartDate;
    }
    public void setCouponStartDate(String couponStartDate) {
    this.couponStartDate = couponStartDate;
    }
        public Integer getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
    }
        public Long getCategoryIdLong() {
    return this.categoryIdLong;
    }
    public void setCategoryIdLong(Long categoryIdLong) {
    this.categoryIdLong = categoryIdLong;
    }
        public String getSubject() {
    return this.subject;
    }
    public void setSubject(String subject) {
    this.subject = subject;
    }
        public Long getGroupId() {
    return this.groupId;
    }
    public void setGroupId(Long groupId) {
    this.groupId = groupId;
    }
        public String getCouponEndDate() {
    return this.couponEndDate;
    }
    public void setCouponEndDate(String couponEndDate) {
    this.couponEndDate = couponEndDate;
    }
        public Integer getPackageWidth() {
    return this.packageWidth;
    }
    public void setPackageWidth(Integer packageWidth) {
    this.packageWidth = packageWidth;
    }
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    }
        public DsProductGetAeopAEMultimedia getAeopAemultimedia() {
    return this.aeopAemultimedia;
    }
    public void setAeopAemultimedia(DsProductGetAeopAEMultimedia aeopAemultimedia) {
    this.aeopAemultimedia = aeopAemultimedia;
    }
        public Integer getProductUnit() {
    return this.productUnit;
    }
    public void setProductUnit(Integer productUnit) {
    this.productUnit = productUnit;
    }
        public String getMobileDetail() {
    return this.mobileDetail;
    }
    public void setMobileDetail(String mobileDetail) {
    this.mobileDetail = mobileDetail;
    }
        public Boolean getPackageType() {
    return this.packageType;
    }
    public void setPackageType(Boolean packageType) {
    this.packageType = packageType;
    }
        public List<DsProductGetAeopAeProductProperty> getAeopAeProductPropertys() {
    return this.aeopAeProductPropertys;
    }
    public void setAeopAeProductPropertys(List<DsProductGetAeopAeProductProperty> aeopAeProductPropertys) {
    this.aeopAeProductPropertys = aeopAeProductPropertys;
    }
        public Integer getBaseUnit() {
    return this.baseUnit;
    }
    public void setBaseUnit(Integer baseUnit) {
    this.baseUnit = baseUnit;
    }
        public String getWsDisplay() {
    return this.wsDisplay;
    }
    public void setWsDisplay(String wsDisplay) {
    this.wsDisplay = wsDisplay;
    }
        public String getWsOfflineDate() {
    return this.wsOfflineDate;
    }
    public void setWsOfflineDate(String wsOfflineDate) {
    this.wsOfflineDate = wsOfflineDate;
    }
        public List<Long> getGroupIds() {
    return this.groupIds;
    }
    public void setGroupIds(List<Long> groupIds) {
    this.groupIds = groupIds;
    }
        public Long getPromiseTemplateId() {
    return this.promiseTemplateId;
    }
    public void setPromiseTemplateId(Long promiseTemplateId) {
    this.promiseTemplateId = promiseTemplateId;
    }
        public String getKeyword() {
    return this.keyword;
    }
    public void setKeyword(String keyword) {
    this.keyword = keyword;
    }
        public List<DsProductGetDetailSource> getDetailSourceList() {
    return this.detailSourceList;
    }
    public void setDetailSourceList(List<DsProductGetDetailSource> detailSourceList) {
    this.detailSourceList = detailSourceList;
    }
        public Integer getDpBulkDiscount() {
    return this.dpBulkDiscount;
    }
    public void setDpBulkDiscount(Integer dpBulkDiscount) {
    this.dpBulkDiscount = dpBulkDiscount;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public Long getSizechartId() {
    return this.sizechartId;
    }
    public void setSizechartId(Long sizechartId) {
    this.sizechartId = sizechartId;
    }
        public String getExtParam() {
    return this.extParam;
    }
    public void setExtParam(String extParam) {
    this.extParam = extParam;
    }
        public Boolean getIsPackSell() {
    return this.isPackSell;
    }
    public void setIsPackSell(Boolean isPackSell) {
    this.isPackSell = isPackSell;
    }
        public String getErrorCodeStr() {
    return this.errorCodeStr;
    }
    public void setErrorCodeStr(String errorCodeStr) {
    this.errorCodeStr = errorCodeStr;
    }
        public Integer getPackageHeight() {
    return this.packageHeight;
    }
    public void setPackageHeight(Integer packageHeight) {
    this.packageHeight = packageHeight;
    }
        public Long getFreightTemplateIdLong() {
    return this.freightTemplateIdLong;
    }
    public void setFreightTemplateIdLong(Long freightTemplateIdLong) {
    this.freightTemplateIdLong = freightTemplateIdLong;
    }
        public Integer getEvaluationCount() {
    return this.evaluationCount;
    }
    public void setEvaluationCount(Integer evaluationCount) {
    this.evaluationCount = evaluationCount;
    }
        public String getSrcDetailUrl() {
    return this.srcDetailUrl;
    }
    public void setSrcDetailUrl(String srcDetailUrl) {
    this.srcDetailUrl = srcDetailUrl;
    }
        public String getDetail() {
    return this.detail;
    }
    public void setDetail(String detail) {
    this.detail = detail;
    }
        public Integer getOwnerMemberSeq() {
    return this.ownerMemberSeq;
    }
    public void setOwnerMemberSeq(Integer ownerMemberSeq) {
    this.ownerMemberSeq = ownerMemberSeq;
    }
        public String getProductPrice() {
    return this.productPrice;
    }
    public void setProductPrice(String productPrice) {
    this.productPrice = productPrice;
    }
        public Integer getBulkOrder() {
    return this.bulkOrder;
    }
    public void setBulkOrder(Integer bulkOrder) {
    this.bulkOrder = bulkOrder;
    }
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
    }
        public Boolean getIsImageDynamic() {
    return this.isImageDynamic;
    }
    public void setIsImageDynamic(Boolean isImageDynamic) {
    this.isImageDynamic = isImageDynamic;
    }
        public Integer getDeliveryTime() {
    return this.deliveryTime;
    }
    public void setDeliveryTime(Integer deliveryTime) {
    this.deliveryTime = deliveryTime;
    }
        public Long getTotalAvailableStock() {
    return this.totalAvailableStock;
    }
    public void setTotalAvailableStock(Long totalAvailableStock) {
    this.totalAvailableStock = totalAvailableStock;
    }
        public String getProductStatusType() {
    return this.productStatusType;
    }
    public void setProductStatusType(String productStatusType) {
    this.productStatusType = productStatusType;
    }
        public String getReduceStrategy() {
    return this.reduceStrategy;
    }
    public void setReduceStrategy(String reduceStrategy) {
    this.reduceStrategy = reduceStrategy;
    }
        public List<DsProductGetAeopAEProductSKU> getAeopAeProductSkus() {
    return this.aeopAeProductSkus;
    }
    public void setAeopAeProductSkus(List<DsProductGetAeopAEProductSKU> aeopAeProductSkus) {
    this.aeopAeProductSkus = aeopAeProductSkus;
    }
    }