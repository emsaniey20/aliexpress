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

public class AliexpressOfferProductQueryAeopFindProductResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 资质信息 */
                @ApiListField("aeop_qualification_struct_list")
            private List<AliexpressOfferProductQueryAeopQualificationStructDTO> aeopQualificationStructList;
        /** 欧盟责任人id，需要调用查询欧盟责任人列表接口：aliexpress.category.eu.responsible.persons.list，获取对应的欧盟责任人列表 */
                @ApiField("msr_eu_id")
            private String msrEuId;
        /** 商品分国家报价的配置，想删除分国家报价需要传指定的参数： configuration_type = delete：{"configurationType":"delete","configurationData":""}，计算之后的分国家报价不能小于 sku价格（sku_price和aeop_s_k_u_national_discount_price）的 50%，计算后的分国家报价不能小于0也不能为"null"，请isv做好前置校验 */
                @ApiField("aeop_national_quote_configuration")
            private AliexpressOfferProductQueryAeopNationalQuoteConfiguration aeopNationalQuoteConfiguration;
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
        /** 产品的货币单位。美元: USD, 卢布: RUB */
                @ApiField("currency_code")
            private String currencyCode;
        /** 商品的备货期 */
                @ApiField("delivery_time")
            private Integer deliveryTime;
        /** 产品的毛重 */
                @ApiField("gross_weight")
            private String grossWeight;
        /** 产品所在的产品分组列表 */
                @ApiListField("group_ids")
            private List<Long> groupIds;
        /** 产品的主图列表 */
                @ApiField("image_u_r_ls")
            private String imageURLs;
        /** 是否支持是自定义计重 */
                @ApiField("is_pack_sell")
            private Boolean isPackSell;
        /** 关键字 */
                @ApiField("keyword")
            private String keyword;
        /** 每包的数量 */
                @ApiField("lot_num")
            private Integer lotNum;
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
        /** 产品的下架原因，包括user_offline：手动下架，expire_offline：到期下架，punish_offline：网规处罚下架，violate_offline：交易违规下架，degrade_offline：降级下架，industry_offline：未续约下架 */
                @ApiField("ws_display")
            private String wsDisplay;
        /** 产品的下架日期 */
                @ApiField("ws_offline_date")
            private String wsOfflineDate;
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
        /** 多语言详描 */
                @ApiListField("detail_source_list")
            private List<AliexpressOfferProductQueryDetailSource> detailSourceList;
        /** 多语言标题 */
                @ApiListField("subject_list")
            private List<AliexpressOfferProductQuerySubject> subjectList;
        /** 商品初始发布locale */
                @ApiField("locale")
            private String locale;
        /** 营销图列表 */
                @ApiListField("market_images")
            private List<AliexpressOfferProductQueryMarketImage> marketImages;
        /** 产品关联的运费模版ID */
                @ApiField("freight_template_id")
            private Long freightTemplateId;
        /** 模特尺码数据  单位 CM */
                @ApiListField("mode_size_chart_list")
            private List<AliexpressOfferProductQueryAeopAEModeSizeChartDTO> modeSizeChartList;
        /** 每增加件数.取值范围1-1000。 */
                @ApiField("add_unit")
            private Integer addUnit;
        /** 对应增加的重量.取值范围:0.001-500.000,保留三位小数,采用进位制,单位:公斤。 */
                @ApiField("add_weight")
            private String addWeight;
        /** 商品多媒体信息，该属性主要包含商品的视频列表 */
                @ApiField("aeop_a_e_multimedia")
            private AliexpressOfferProductQueryAeopAEMultimedia aeopAEMultimedia;
        /** 商品的类目属性 */
                @ApiListField("aeop_ae_product_propertys")
            private List<AliexpressOfferProductQueryAeopAeProductProperty> aeopAeProductPropertys;
        /** 商品的SKU信息 */
                @ApiListField("aeop_ae_product_s_k_us")
            private List<AliexpressOfferProductQueryAeopAEProductSKU> aeopAeProductSKUs;
    
        public List<AliexpressOfferProductQueryAeopQualificationStructDTO> getAeopQualificationStructList() {
    return this.aeopQualificationStructList;
    }
    public void setAeopQualificationStructList(List<AliexpressOfferProductQueryAeopQualificationStructDTO> aeopQualificationStructList) {
    this.aeopQualificationStructList = aeopQualificationStructList;
    }
        public String getMsrEuId() {
    return this.msrEuId;
    }
    public void setMsrEuId(String msrEuId) {
    this.msrEuId = msrEuId;
    }
        public AliexpressOfferProductQueryAeopNationalQuoteConfiguration getAeopNationalQuoteConfiguration() {
    return this.aeopNationalQuoteConfiguration;
    }
    public void setAeopNationalQuoteConfiguration(AliexpressOfferProductQueryAeopNationalQuoteConfiguration aeopNationalQuoteConfiguration) {
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
        public String getGrossWeight() {
    return this.grossWeight;
    }
    public void setGrossWeight(String grossWeight) {
    this.grossWeight = grossWeight;
    }
        public List<Long> getGroupIds() {
    return this.groupIds;
    }
    public void setGroupIds(List<Long> groupIds) {
    this.groupIds = groupIds;
    }
        public String getImageURLs() {
    return this.imageURLs;
    }
    public void setImageURLs(String imageURLs) {
    this.imageURLs = imageURLs;
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
        public List<AliexpressOfferProductQueryDetailSource> getDetailSourceList() {
    return this.detailSourceList;
    }
    public void setDetailSourceList(List<AliexpressOfferProductQueryDetailSource> detailSourceList) {
    this.detailSourceList = detailSourceList;
    }
        public List<AliexpressOfferProductQuerySubject> getSubjectList() {
    return this.subjectList;
    }
    public void setSubjectList(List<AliexpressOfferProductQuerySubject> subjectList) {
    this.subjectList = subjectList;
    }
        public String getLocale() {
    return this.locale;
    }
    public void setLocale(String locale) {
    this.locale = locale;
    }
        public List<AliexpressOfferProductQueryMarketImage> getMarketImages() {
    return this.marketImages;
    }
    public void setMarketImages(List<AliexpressOfferProductQueryMarketImage> marketImages) {
    this.marketImages = marketImages;
    }
        public Long getFreightTemplateId() {
    return this.freightTemplateId;
    }
    public void setFreightTemplateId(Long freightTemplateId) {
    this.freightTemplateId = freightTemplateId;
    }
        public List<AliexpressOfferProductQueryAeopAEModeSizeChartDTO> getModeSizeChartList() {
    return this.modeSizeChartList;
    }
    public void setModeSizeChartList(List<AliexpressOfferProductQueryAeopAEModeSizeChartDTO> modeSizeChartList) {
    this.modeSizeChartList = modeSizeChartList;
    }
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
        public AliexpressOfferProductQueryAeopAEMultimedia getAeopAEMultimedia() {
    return this.aeopAEMultimedia;
    }
    public void setAeopAEMultimedia(AliexpressOfferProductQueryAeopAEMultimedia aeopAEMultimedia) {
    this.aeopAEMultimedia = aeopAEMultimedia;
    }
        public List<AliexpressOfferProductQueryAeopAeProductProperty> getAeopAeProductPropertys() {
    return this.aeopAeProductPropertys;
    }
    public void setAeopAeProductPropertys(List<AliexpressOfferProductQueryAeopAeProductProperty> aeopAeProductPropertys) {
    this.aeopAeProductPropertys = aeopAeProductPropertys;
    }
        public List<AliexpressOfferProductQueryAeopAEProductSKU> getAeopAeProductSKUs() {
    return this.aeopAeProductSKUs;
    }
    public void setAeopAeProductSKUs(List<AliexpressOfferProductQueryAeopAEProductSKU> aeopAeProductSKUs) {
    this.aeopAeProductSKUs = aeopAeProductSKUs;
    }
    }