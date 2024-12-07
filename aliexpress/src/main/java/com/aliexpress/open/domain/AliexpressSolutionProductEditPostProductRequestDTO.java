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

public class AliexpressSolutionProductEditPostProductRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** There are 4 types of how to fill in the content of each element in this attribute list. 1). When filling in the standard dropdown/multi-dropdown attributes, fill in "aliexpress_attribute_name_id" and "aliexpress_attribute_value_id"(For multi-dropdown, splitting them into multiple elements) 2). When filling in the attributes in which the value needs to be manually entered, fill in "aliexpress_attribute_name_id" and "attribute_value" in the element. 3). There exists a special kind of "aliexpress_attribute_value_id" of which the value represents for "Other". When encoutering this scenario, please fill in "aliexpress_attribute_name_id", "aliexpress_attribute_value_id" and "attribute_value". 4). Besides the three types mentioned above, if the seller would like to fully customized all the atttributes, fill in "attribute name" and "attribute_value" in the element. */
                @ApiListField("attribute_list")
            private List<AliexpressSolutionProductEditAttributeDTO> attributeList;
        /** merchant's brand name */
                @ApiField("brand_name")
            private String brandName;
        /** Deprecated. Please use aliexpress_category_id */
                @ApiField("category_id")
            private String categoryId;
        /** freight template ID. After the merchant has created an freight template in the backend: freighttemplate.aliexpress.com, the id could be obtained in the backend directly or thourgh the API: aliexpress.freight.redefining.listfreighttemplate */
                @ApiField("freight_template_id")
            private Long freightTemplateId;
        /** Weight of the product, including package. Measured in Kilograms (Kg) with a maximum 500 and minumum 0.001 */
                @ApiField("weight")
            private String weight;
        /** indicate when the inventory of a specific product will be deducted. place_order_withhold: the inventory is deducted just after the order is placed by customer. payment_success_deduct: the stock is deducted after the payment is done successfully by the customer. */
                @ApiField("inventory_deduction_strategy")
            private String inventoryDeductionStrategy;
        /** refer to the preparation period of merchant before the package could be dispatched to the customer. */
                @ApiField("shipping_lead_time")
            private Integer shippingLeadTime;
        /** Main image that represents the product. The url should be accesible and there is a maximum of 6 pictures. The url can point to a seller's server or to AliExpress photobank. In order to obtain more information about the photobank and how to upload images, please visit the following page: https://developers.aliexpress.com/en/doc.htm?docId=30186&docType=2 */
                @ApiListField("main_image_urls_list")
            private List<String> mainImageUrlsList;
        /** Package height measured in centimeters (cm). Maximum 700 cm, minumum: 1cm */
                @ApiField("package_height")
            private Integer packageHeight;
        /** Package length, measured in centimeters (cm). Maximum 700 cm, minumum: 1cm */
                @ApiField("package_length")
            private Integer packageLength;
        /** Package width measured in centimeters (cm). Maximum 700 cm, minumum: 1cm */
                @ApiField("package_width")
            private Integer packageWidth;
        /** aliexpress product Id */
                @ApiField("product_id")
            private Long productId;
        /** service policy id, which could be set and obtained in the seller's background. */
                @ApiField("service_policy_id")
            private Long servicePolicyId;
        /** merchant's size chart id, more used in the category of shoes and clothes. */
                @ApiField("size_chart_id")
            private Long sizeChartId;
        /** If specified this field, all the previous skus will be replaced by the new skus. */
                @ApiListField("sku_info_list")
            private List<AliexpressSolutionProductEditSkuInfoDTO> skuInfoList;
        /** Aliexpress leaf category ID obtained through https://developers.aliexpress.com/en/doc.htm?docId=46042&docType=2 */
                @ApiField("aliexpress_category_id")
            private Long aliexpressCategoryId;
        /** List for multi language subject. To learn how to set this field, please refer to the document:https://developers.aliexpress.com/en/doc.htm?docId=108976&docType=1 */
                @ApiListField("multi_language_subject_list")
            private List<AliexpressSolutionProductEditSingleLanguageTitleDTO> multiLanguageSubjectList;
        /** List for multi language description. To learn how to set this field, please refer to the document:https://developers.aliexpress.com/en/doc.htm?docId=108976&docType=1 */
                @ApiListField("multi_language_description_list")
            private List<AliexpressSolutionProductEditSingleLanguageDescriptionDTO> multiLanguageDescriptionList;
        /** group id, you can get group list from aliexpress.product.productgroups.get */
                @ApiField("group_id")
            private Long groupId;
        /** multi country price configuration */
                @ApiField("multi_country_price_configuration")
            private AliexpressSolutionProductEditMultiCountryPriceConfigurationDTO multiCountryPriceConfiguration;
        /** extra params. Configured some special products */
                @ApiField("extra_params")
            private String extraParams;
        /** marketing images for product. Currently supported 2 types: 1 represents 3:4 rectangle(resolution at least 750*1000) image while 2 represents 1:1 square image(Resolution at least 800*800). The image url needs to be obtained via uploading the image through Aliexpress API: aliexpress.photobank.redefining.uploadimageforsdk(https://developers.aliexpress.com/en/doc.htm?docId=30186&docType=2) */
                @ApiListField("marketing_images")
            private List<AliexpressSolutionProductEditMarketImageDTO> marketingImages;
        /** More information about the request. */
                @ApiField("developer_features")
            private String developerFeatures;
    
        public List<AliexpressSolutionProductEditAttributeDTO> getAttributeList() {
    return this.attributeList;
    }
    public void setAttributeList(List<AliexpressSolutionProductEditAttributeDTO> attributeList) {
    this.attributeList = attributeList;
    }
        public String getBrandName() {
    return this.brandName;
    }
    public void setBrandName(String brandName) {
    this.brandName = brandName;
    }
        public String getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
    }
        public Long getFreightTemplateId() {
    return this.freightTemplateId;
    }
    public void setFreightTemplateId(Long freightTemplateId) {
    this.freightTemplateId = freightTemplateId;
    }
        public String getWeight() {
    return this.weight;
    }
    public void setWeight(String weight) {
    this.weight = weight;
    }
        public String getInventoryDeductionStrategy() {
    return this.inventoryDeductionStrategy;
    }
    public void setInventoryDeductionStrategy(String inventoryDeductionStrategy) {
    this.inventoryDeductionStrategy = inventoryDeductionStrategy;
    }
        public Integer getShippingLeadTime() {
    return this.shippingLeadTime;
    }
    public void setShippingLeadTime(Integer shippingLeadTime) {
    this.shippingLeadTime = shippingLeadTime;
    }
        public List<String> getMainImageUrlsList() {
    return this.mainImageUrlsList;
    }
    public void setMainImageUrlsList(List<String> mainImageUrlsList) {
    this.mainImageUrlsList = mainImageUrlsList;
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
        public Long getServicePolicyId() {
    return this.servicePolicyId;
    }
    public void setServicePolicyId(Long servicePolicyId) {
    this.servicePolicyId = servicePolicyId;
    }
        public Long getSizeChartId() {
    return this.sizeChartId;
    }
    public void setSizeChartId(Long sizeChartId) {
    this.sizeChartId = sizeChartId;
    }
        public List<AliexpressSolutionProductEditSkuInfoDTO> getSkuInfoList() {
    return this.skuInfoList;
    }
    public void setSkuInfoList(List<AliexpressSolutionProductEditSkuInfoDTO> skuInfoList) {
    this.skuInfoList = skuInfoList;
    }
        public Long getAliexpressCategoryId() {
    return this.aliexpressCategoryId;
    }
    public void setAliexpressCategoryId(Long aliexpressCategoryId) {
    this.aliexpressCategoryId = aliexpressCategoryId;
    }
        public List<AliexpressSolutionProductEditSingleLanguageTitleDTO> getMultiLanguageSubjectList() {
    return this.multiLanguageSubjectList;
    }
    public void setMultiLanguageSubjectList(List<AliexpressSolutionProductEditSingleLanguageTitleDTO> multiLanguageSubjectList) {
    this.multiLanguageSubjectList = multiLanguageSubjectList;
    }
        public List<AliexpressSolutionProductEditSingleLanguageDescriptionDTO> getMultiLanguageDescriptionList() {
    return this.multiLanguageDescriptionList;
    }
    public void setMultiLanguageDescriptionList(List<AliexpressSolutionProductEditSingleLanguageDescriptionDTO> multiLanguageDescriptionList) {
    this.multiLanguageDescriptionList = multiLanguageDescriptionList;
    }
        public Long getGroupId() {
    return this.groupId;
    }
    public void setGroupId(Long groupId) {
    this.groupId = groupId;
    }
        public AliexpressSolutionProductEditMultiCountryPriceConfigurationDTO getMultiCountryPriceConfiguration() {
    return this.multiCountryPriceConfiguration;
    }
    public void setMultiCountryPriceConfiguration(AliexpressSolutionProductEditMultiCountryPriceConfigurationDTO multiCountryPriceConfiguration) {
    this.multiCountryPriceConfiguration = multiCountryPriceConfiguration;
    }
        public String getExtraParams() {
    return this.extraParams;
    }
    public void setExtraParams(String extraParams) {
    this.extraParams = extraParams;
    }
        public List<AliexpressSolutionProductEditMarketImageDTO> getMarketingImages() {
    return this.marketingImages;
    }
    public void setMarketingImages(List<AliexpressSolutionProductEditMarketImageDTO> marketingImages) {
    this.marketingImages = marketingImages;
    }
        public String getDeveloperFeatures() {
    return this.developerFeatures;
    }
    public void setDeveloperFeatures(String developerFeatures) {
    this.developerFeatures = developerFeatures;
    }
    }