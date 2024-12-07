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

public class AliexpressSolutionProductInfoGetGlobalAeopFindProductResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Required when is_pack_sell equals to true. Value range for pieces to be added: 1-1000. Please refer to the field is_pack_sell for details. */
                @ApiField("add_unit")
            private Integer addUnit;
        /** Required when is_pack_sell equals to true. It means weight to be correspondingly added. Range value: 0.001-500.000, reserving three decimal places and applying scale; Unit: kilogram(s). Please refer to the field is_pack_sell for details. */
                @ApiField("add_weight")
            private String addWeight;
        /** Multimedia information */
                @ApiField("aeop_a_e_multimedia")
            private AliexpressSolutionProductInfoGetGlobalAeopAEMultimedia aeopAEMultimedia;
        /** Product properties */
                @ApiListField("aeop_ae_product_propertys")
            private List<AliexpressSolutionProductInfoGetGlobalAeopAeProductProperty> aeopAeProductPropertys;
        /** List for multiple skus of the product, expressed in json format. */
                @ApiListField("aeop_ae_product_s_k_us")
            private List<AliexpressSolutionProductInfoGetGlobalAeopAEProductSKU> aeopAeProductSKUs;
        /** Required when is_pack_sell equals to true. It means no additional freight will be charged when the number of pieces to be purchased is under the base unit. Value range: 1-1000. */
                @ApiField("base_unit")
            private Integer baseUnit;
        /** Bulk discount for wholesale. It must be multiplied by 100 and selected and saved as integer. Value range: 1-99. Note: It is discount, other than discount rate. For example, if the discount is 68, it should be selected and saved as 32. bulk_order and bulk_discount must have value or have no value simultaneously. */
                @ApiField("bulk_discount")
            private Integer bulkDiscount;
        /** Minimum bulk for wholesale. Value range: 2-100000. bulk_order and bulk_discount must have value or have no value simultaneously. */
                @ApiField("bulk_order")
            private Integer bulkOrder;
        /** Product category ID. It must be leaf category to be obtained from the category interface. */
                @ApiField("category_id")
            private Integer categoryId;
        /** the Currency code. "USD" will be used as the default value if this information is not provided; Currency code is mandatory for Russian sellers and Spanish sellers. For Russian sellers, RUB should be filled in while EUR for Spanish sellers. */
                @ApiField("currency_code")
            private String currencyCode;
        /** Stocking period. Value range: 1-60; Unit: day(s). Referring to the preparation time before the order could be dispatched. */
                @ApiField("delivery_time")
            private Integer deliveryTime;
        /** Deprecated, please use multi_language_description_list */
                @ApiField("detail")
            private String detail;
        /** shipping template id */
                @ApiField("freight_template_id")
            private Integer freightTemplateId;
        /** created time */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** modified time */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** Product gross weight. Range value: 0.001-500.000, reserving three decimal places and applying scale; Unit: kilogram(s). */
                @ApiField("gross_weight")
            private String grossWeight;
        /** Group ID that the product belongs to. */
                @ApiField("group_id")
            private Long groupId;
        /** All the groups that the product belongs to. */
                @ApiListField("group_ids")
            private List<Long> groupIds;
        /** image urls for the product */
                @ApiField("image_u_r_ls")
            private String imageURLs;
        /** Whether customized weighting is enabled or not. True means customized weighting enabled. When is_pack_sell equals to true, add_unit, add_weight and base_unit must be filled in. For example, base_unit equals to 5, add_unit equals to 2 and add_weight equals to 1.2. It means that Basic shipping cost will cover the first 5 pieces, freight calculating of which will base on a single product. For every additional 2 pieces, the shipping cost will be added to the total shipping cost for 1.2kg */
                @ApiField("is_pack_sell")
            private Boolean isPackSell;
        /** Number of piece(s) in each pack. In case of packing sale,lotNum>1, and in case of unpacking sale, lotNum=1. */
                @ApiField("lot_num")
            private Integer lotNum;
        /** mobile detail */
                @ApiField("mobile_detail")
            private String mobileDetail;
        /** Out of date, please ignore */
                @ApiField("owner_member_id")
            private String ownerMemberId;
        /** Out of date, please ignore. */
                @ApiField("owner_member_seq")
            private Integer ownerMemberSeq;
        /** package height */
                @ApiField("package_height")
            private Integer packageHeight;
        /** package length */
                @ApiField("package_length")
            private Integer packageLength;
        /** package width */
                @ApiField("package_width")
            private Integer packageWidth;
        /** product ID */
                @ApiField("product_id")
            private Long productId;
        /** Price for product */
                @ApiField("product_price")
            private String productPrice;
        /** product status type */
                @ApiField("product_status_type")
            private String productStatusType;
        /** Product unit */
                @ApiField("product_unit")
            private Integer productUnit;
        /** Service template ID which the product is associated with */
                @ApiField("promise_template_id")
            private Long promiseTemplateId;
        /** Stock reduction strategy. It is divided into 2 types: stock reduction after placing order (place_order_withhold) or stock reduction after payment (payment_success_deduct). */
                @ApiField("reduce_strategy")
            private String reduceStrategy;
        /** Size chart template ID that the product is associated with. */
                @ApiField("sizechart_id")
            private Long sizechartId;
        /** Deprecated, please use multi_language_subject_list */
                @ApiField("subject")
            private String subject;
        /** The offline date of the product */
                @ApiField("ws_offline_date")
            private String wsOfflineDate;
        /** Packing sale: true; Unpacking sale: false. */
                @ApiField("package_type")
            private Boolean packageType;
        /** multi language subject list */
                @ApiListField("multi_language_subject_list")
            private List<AliexpressSolutionProductInfoGetGlobalSubject> multiLanguageSubjectList;
        /** multo language description list */
                @ApiListField("multi_language_description_list")
            private List<AliexpressSolutionProductInfoGetGlobalDetailSource> multiLanguageDescriptionList;
        /** multi country price configuration */
                @ApiField("multi_country_price_configuration")
            private AliexpressSolutionProductInfoGetMultiCountryPriceConfigurationDTO multiCountryPriceConfiguration;
    
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
        public AliexpressSolutionProductInfoGetGlobalAeopAEMultimedia getAeopAEMultimedia() {
    return this.aeopAEMultimedia;
    }
    public void setAeopAEMultimedia(AliexpressSolutionProductInfoGetGlobalAeopAEMultimedia aeopAEMultimedia) {
    this.aeopAEMultimedia = aeopAEMultimedia;
    }
        public List<AliexpressSolutionProductInfoGetGlobalAeopAeProductProperty> getAeopAeProductPropertys() {
    return this.aeopAeProductPropertys;
    }
    public void setAeopAeProductPropertys(List<AliexpressSolutionProductInfoGetGlobalAeopAeProductProperty> aeopAeProductPropertys) {
    this.aeopAeProductPropertys = aeopAeProductPropertys;
    }
        public List<AliexpressSolutionProductInfoGetGlobalAeopAEProductSKU> getAeopAeProductSKUs() {
    return this.aeopAeProductSKUs;
    }
    public void setAeopAeProductSKUs(List<AliexpressSolutionProductInfoGetGlobalAeopAEProductSKU> aeopAeProductSKUs) {
    this.aeopAeProductSKUs = aeopAeProductSKUs;
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
        public String getDetail() {
    return this.detail;
    }
    public void setDetail(String detail) {
    this.detail = detail;
    }
        public Integer getFreightTemplateId() {
    return this.freightTemplateId;
    }
    public void setFreightTemplateId(Integer freightTemplateId) {
    this.freightTemplateId = freightTemplateId;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
    }
        public String getGrossWeight() {
    return this.grossWeight;
    }
    public void setGrossWeight(String grossWeight) {
    this.grossWeight = grossWeight;
    }
        public Long getGroupId() {
    return this.groupId;
    }
    public void setGroupId(Long groupId) {
    this.groupId = groupId;
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
        public String getSubject() {
    return this.subject;
    }
    public void setSubject(String subject) {
    this.subject = subject;
    }
        public String getWsOfflineDate() {
    return this.wsOfflineDate;
    }
    public void setWsOfflineDate(String wsOfflineDate) {
    this.wsOfflineDate = wsOfflineDate;
    }
        public Boolean getPackageType() {
    return this.packageType;
    }
    public void setPackageType(Boolean packageType) {
    this.packageType = packageType;
    }
        public List<AliexpressSolutionProductInfoGetGlobalSubject> getMultiLanguageSubjectList() {
    return this.multiLanguageSubjectList;
    }
    public void setMultiLanguageSubjectList(List<AliexpressSolutionProductInfoGetGlobalSubject> multiLanguageSubjectList) {
    this.multiLanguageSubjectList = multiLanguageSubjectList;
    }
        public List<AliexpressSolutionProductInfoGetGlobalDetailSource> getMultiLanguageDescriptionList() {
    return this.multiLanguageDescriptionList;
    }
    public void setMultiLanguageDescriptionList(List<AliexpressSolutionProductInfoGetGlobalDetailSource> multiLanguageDescriptionList) {
    this.multiLanguageDescriptionList = multiLanguageDescriptionList;
    }
        public AliexpressSolutionProductInfoGetMultiCountryPriceConfigurationDTO getMultiCountryPriceConfiguration() {
    return this.multiCountryPriceConfiguration;
    }
    public void setMultiCountryPriceConfiguration(AliexpressSolutionProductInfoGetMultiCountryPriceConfigurationDTO multiCountryPriceConfiguration) {
    this.multiCountryPriceConfiguration = multiCountryPriceConfiguration;
    }
    }