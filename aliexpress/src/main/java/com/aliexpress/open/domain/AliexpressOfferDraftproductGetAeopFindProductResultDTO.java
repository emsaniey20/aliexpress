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

public class AliexpressOfferDraftproductGetAeopFindProductResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 每增加件数.取值范围1-1000。 */
                @ApiField("add_unit")
            private Integer addUnit;
        /** 对应增加的重量.取值范围:0.001-500.000,保留三位小数,采用进位制,单位:公斤。 */
                @ApiField("add_weight")
            private String addWeight;
        /** 商品多媒体信息，该属性主要包含商品的视频列表 */
                @ApiField("aeop_a_e_multimedia")
            private AliexpressOfferDraftproductGetAeopAEMultimedia aeopAEMultimedia;
        /** 商品的类目属性 */
                @ApiListField("aeop_ae_product_propertys")
            private List<AliexpressOfferDraftproductGetAeopAeProductProperty> aeopAeProductPropertys;
        /** 商品的SKU信息 */
                @ApiListField("aeop_ae_product_s_k_us")
            private List<AliexpressOfferDraftproductGetAeopAEProductSKU> aeopAeProductSKUs;
        /** 商品分国家定价规则数据，建议使用新格式，请参考：https://developers.aliexpress.com/doc.htm?docId=109575&docType=1 */
                @ApiField("aeop_national_quote_configuration")
            private AliexpressOfferDraftproductGetAeopNationalQuoteConfiguration aeopNationalQuoteConfiguration;
        /** 自定义计重的基本产品件数 */
                @ApiField("base_unit")
            private Integer baseUnit;
        /** 产品的批发折扣 */
                @ApiField("bulk_discount")
            private Integer bulkDiscount;
        /** 享受批发价的产品数 */
                @ApiField("bulk_order")
            private Integer bulkOrder;
        /** 产品所在类目的ID */
                @ApiField("category_id")
            private Integer categoryId;
        /** 卡券商品结束有效期 */
                @ApiField("coupon_end_date")
            private String couponEndDate;
        /** 卡券商品开始有效期 */
                @ApiField("coupon_start_date")
            private String couponStartDate;
        /** 产品的货币单位。美元: USD, 卢布: RUB */
                @ApiField("currency_code")
            private String currencyCode;
        /** 商品的备货期 */
                @ApiField("delivery_time")
            private Integer deliveryTime;
        /** 商品详描 */
                @ApiField("detail")
            private String detail;
        /** 商品关联的运费模板Id */
                @ApiField("freight_template_id")
            private Long freightTemplateId;
        /** 产品的毛重 */
                @ApiField("gross_weight")
            private String grossWeight;
        /** 产品的主图列表 */
                @ApiField("image_u_r_ls")
            private String imageURLs;
        /** 是否是动态图产品 */
                @ApiField("is_image_dynamic")
            private Boolean isImageDynamic;
        /** 是否支持是自定义计重 */
                @ApiField("is_pack_sell")
            private Boolean isPackSell;
        /** 关键字 */
                @ApiField("keyword")
            private String keyword;
        /** 每包的数量 */
                @ApiField("lot_num")
            private Integer lotNum;
        /** 商品无线详描 */
                @ApiField("mobile_detail")
            private String mobileDetail;
        /** 商品拥有者的login_id */
                @ApiField("owner_member_id")
            private String ownerMemberId;
        /** 商品拥有者的ID */
                @ApiField("owner_member_seq")
            private Integer ownerMemberSeq;
        /** 产品的高度 */
                @ApiField("package_height")
            private Integer packageHeight;
        /** 产品的长度 */
                @ApiField("package_length")
            private Integer packageLength;
        /** 产品的宽度 */
                @ApiField("package_width")
            private Integer packageWidth;
        /** 产品ID */
                @ApiField("product_id")
            private Long productId;
        /** productMoreKeywords1 */
                @ApiField("product_more_keywords1")
            private String productMoreKeywords1;
        /** productMoreKeywords2 */
                @ApiField("product_more_keywords2")
            private String productMoreKeywords2;
        /** 单品产品的价格。 */
                @ApiField("product_price")
            private String productPrice;
        /** 产品的状态，包括onSelling（正在销售），offline（已下架），auditing（审核中），editingRequired（审核不通过） */
                @ApiField("product_status_type")
            private String productStatusType;
        /** 产品的单位 */
                @ApiField("product_unit")
            private Integer productUnit;
        /** 产品所关联的服务模版 */
                @ApiField("promise_template_id")
            private Long promiseTemplateId;
        /** 库存的扣减策略 */
                @ApiField("reduce_strategy")
            private String reduceStrategy;
        /** 产品所关联的尺码模版ID */
                @ApiField("sizechart_id")
            private Long sizechartId;
        /** 产品来源。'tdx'为淘宝代销产品，'1688'为1688分销商品，'isv'为通过API发布的商品。其他字符或空为普通产品。 */
                @ApiField("src")
            private String src;
        /** 产品的标题 */
                @ApiField("subject")
            private String subject;
        /** 商品概要 */
                @ApiField("summary")
            private String summary;
        /** 产品的有效期 */
                @ApiField("ws_valid_num")
            private Integer wsValidNum;
        /** 打包销售: true 非打包销售:false */
                @ApiField("package_type")
            private Boolean packageType;
        /** 修改日期 */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** 创建日期 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 产品来源的详情地址，目前仅支持1688 */
                @ApiField("src_detail_url")
            private String srcDetailUrl;
        /** Json字符串custom_imagem 分国家  vat_tags 含税标 */
                @ApiField("ext_param")
            private String extParam;
    
        public Integer getAddUnit() {
    return this.addUnit;
    }
    public void setAddUnit(Integer addUnit) {
    this.addUnit = addUnit;
    }
        public String getAddWeight() {
    return this.addWeight;
    }
    public void setAddWeight(String addWeight) {
    this.addWeight = addWeight;
    }
        public AliexpressOfferDraftproductGetAeopAEMultimedia getAeopAEMultimedia() {
    return this.aeopAEMultimedia;
    }
    public void setAeopAEMultimedia(AliexpressOfferDraftproductGetAeopAEMultimedia aeopAEMultimedia) {
    this.aeopAEMultimedia = aeopAEMultimedia;
    }
        public List<AliexpressOfferDraftproductGetAeopAeProductProperty> getAeopAeProductPropertys() {
    return this.aeopAeProductPropertys;
    }
    public void setAeopAeProductPropertys(List<AliexpressOfferDraftproductGetAeopAeProductProperty> aeopAeProductPropertys) {
    this.aeopAeProductPropertys = aeopAeProductPropertys;
    }
        public List<AliexpressOfferDraftproductGetAeopAEProductSKU> getAeopAeProductSKUs() {
    return this.aeopAeProductSKUs;
    }
    public void setAeopAeProductSKUs(List<AliexpressOfferDraftproductGetAeopAEProductSKU> aeopAeProductSKUs) {
    this.aeopAeProductSKUs = aeopAeProductSKUs;
    }
        public AliexpressOfferDraftproductGetAeopNationalQuoteConfiguration getAeopNationalQuoteConfiguration() {
    return this.aeopNationalQuoteConfiguration;
    }
    public void setAeopNationalQuoteConfiguration(AliexpressOfferDraftproductGetAeopNationalQuoteConfiguration aeopNationalQuoteConfiguration) {
    this.aeopNationalQuoteConfiguration = aeopNationalQuoteConfiguration;
    }
        public Integer getBaseUnit() {
    return this.baseUnit;
    }
    public void setBaseUnit(Integer baseUnit) {
    this.baseUnit = baseUnit;
    }
        public Integer getBulkDiscount() {
    return this.bulkDiscount;
    }
    public void setBulkDiscount(Integer bulkDiscount) {
    this.bulkDiscount = bulkDiscount;
    }
        public Integer getBulkOrder() {
    return this.bulkOrder;
    }
    public void setBulkOrder(Integer bulkOrder) {
    this.bulkOrder = bulkOrder;
    }
        public Integer getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
    }
        public String getCouponEndDate() {
    return this.couponEndDate;
    }
    public void setCouponEndDate(String couponEndDate) {
    this.couponEndDate = couponEndDate;
    }
        public String getCouponStartDate() {
    return this.couponStartDate;
    }
    public void setCouponStartDate(String couponStartDate) {
    this.couponStartDate = couponStartDate;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public Integer getDeliveryTime() {
    return this.deliveryTime;
    }
    public void setDeliveryTime(Integer deliveryTime) {
    this.deliveryTime = deliveryTime;
    }
        public String getDetail() {
    return this.detail;
    }
    public void setDetail(String detail) {
    this.detail = detail;
    }
        public Long getFreightTemplateId() {
    return this.freightTemplateId;
    }
    public void setFreightTemplateId(Long freightTemplateId) {
    this.freightTemplateId = freightTemplateId;
    }
        public String getGrossWeight() {
    return this.grossWeight;
    }
    public void setGrossWeight(String grossWeight) {
    this.grossWeight = grossWeight;
    }
        public String getImageURLs() {
    return this.imageURLs;
    }
    public void setImageURLs(String imageURLs) {
    this.imageURLs = imageURLs;
    }
        public Boolean getIsImageDynamic() {
    return this.isImageDynamic;
    }
    public void setIsImageDynamic(Boolean isImageDynamic) {
    this.isImageDynamic = isImageDynamic;
    }
        public Boolean getIsPackSell() {
    return this.isPackSell;
    }
    public void setIsPackSell(Boolean isPackSell) {
    this.isPackSell = isPackSell;
    }
        public String getKeyword() {
    return this.keyword;
    }
    public void setKeyword(String keyword) {
    this.keyword = keyword;
    }
        public Integer getLotNum() {
    return this.lotNum;
    }
    public void setLotNum(Integer lotNum) {
    this.lotNum = lotNum;
    }
        public String getMobileDetail() {
    return this.mobileDetail;
    }
    public void setMobileDetail(String mobileDetail) {
    this.mobileDetail = mobileDetail;
    }
        public String getOwnerMemberId() {
    return this.ownerMemberId;
    }
    public void setOwnerMemberId(String ownerMemberId) {
    this.ownerMemberId = ownerMemberId;
    }
        public Integer getOwnerMemberSeq() {
    return this.ownerMemberSeq;
    }
    public void setOwnerMemberSeq(Integer ownerMemberSeq) {
    this.ownerMemberSeq = ownerMemberSeq;
    }
        public Integer getPackageHeight() {
    return this.packageHeight;
    }
    public void setPackageHeight(Integer packageHeight) {
    this.packageHeight = packageHeight;
    }
        public Integer getPackageLength() {
    return this.packageLength;
    }
    public void setPackageLength(Integer packageLength) {
    this.packageLength = packageLength;
    }
        public Integer getPackageWidth() {
    return this.packageWidth;
    }
    public void setPackageWidth(Integer packageWidth) {
    this.packageWidth = packageWidth;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getProductMoreKeywords1() {
    return this.productMoreKeywords1;
    }
    public void setProductMoreKeywords1(String productMoreKeywords1) {
    this.productMoreKeywords1 = productMoreKeywords1;
    }
        public String getProductMoreKeywords2() {
    return this.productMoreKeywords2;
    }
    public void setProductMoreKeywords2(String productMoreKeywords2) {
    this.productMoreKeywords2 = productMoreKeywords2;
    }
        public String getProductPrice() {
    return this.productPrice;
    }
    public void setProductPrice(String productPrice) {
    this.productPrice = productPrice;
    }
        public String getProductStatusType() {
    return this.productStatusType;
    }
    public void setProductStatusType(String productStatusType) {
    this.productStatusType = productStatusType;
    }
        public Integer getProductUnit() {
    return this.productUnit;
    }
    public void setProductUnit(Integer productUnit) {
    this.productUnit = productUnit;
    }
        public Long getPromiseTemplateId() {
    return this.promiseTemplateId;
    }
    public void setPromiseTemplateId(Long promiseTemplateId) {
    this.promiseTemplateId = promiseTemplateId;
    }
        public String getReduceStrategy() {
    return this.reduceStrategy;
    }
    public void setReduceStrategy(String reduceStrategy) {
    this.reduceStrategy = reduceStrategy;
    }
        public Long getSizechartId() {
    return this.sizechartId;
    }
    public void setSizechartId(Long sizechartId) {
    this.sizechartId = sizechartId;
    }
        public String getSrc() {
    return this.src;
    }
    public void setSrc(String src) {
    this.src = src;
    }
        public String getSubject() {
    return this.subject;
    }
    public void setSubject(String subject) {
    this.subject = subject;
    }
        public String getSummary() {
    return this.summary;
    }
    public void setSummary(String summary) {
    this.summary = summary;
    }
        public Integer getWsValidNum() {
    return this.wsValidNum;
    }
    public void setWsValidNum(Integer wsValidNum) {
    this.wsValidNum = wsValidNum;
    }
        public Boolean getPackageType() {
    return this.packageType;
    }
    public void setPackageType(Boolean packageType) {
    this.packageType = packageType;
    }
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getSrcDetailUrl() {
    return this.srcDetailUrl;
    }
    public void setSrcDetailUrl(String srcDetailUrl) {
    this.srcDetailUrl = srcDetailUrl;
    }
        public String getExtParam() {
    return this.extParam;
    }
    public void setExtParam(String extParam) {
    this.extParam = extParam;
    }
    }