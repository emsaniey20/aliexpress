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

public class AliexpressSolutionProductPostPostProductRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Indicate when the inventory of a specific product will be deducted:  1) place_order_withhold: the inventory is deducted just after the order is placed by customer.  2) payment_success_deduct: the stock is deducted after the payment is done successfully by the customer. */
                @ApiField("inventory_deduction_strategy")
            private String inventoryDeductionStrategy;
        /** freight template ID. After the merchant has created an freight template in the backend: freighttemplate.aliexpress.com, the id could be obtained in the backend(freighttemplate.aliexpress.com) directly or thourgh the API: aliexpress.freight.redefining.listfreighttemplate.Please note that the default template with id:1000 is not applicable to oversea sellers. */
                @ApiField("freight_template_id")
            private Long freightTemplateId;
        /** Deprecated. Please use  multi_language_subject_list. 1-218 length, support multi language. Check the field "language" to find the supported languages. */
                @ApiField("subject")
            private String subject;
        /** Deprecated. Please use aliexpress_category_id */
                @ApiField("category_id")
            private String categoryId;
        /** merchant's size chart id, more used in the category of shoes and clothes. */
                @ApiField("size_chart_id")
            private Long sizeChartId;
        /** Brand name after applying in https://sellerjoin.aliexpress.com/oversea/getBrandList.htm. If the seller has not applied any brand permission, please leave this field blank. */
                @ApiField("brand_name")
            private String brandName;
        /** refer to the preparation period of merchant before the package could be dispatched to the customer. Minimum:1 */
                @ApiField("shipping_lead_time")
            private Integer shippingLeadTime;
        /** Weight of the product, including package. Measured in Kilograms (Kg) with a maximum 500 and minumum 0.001 */
                @ApiField("weight")
            private String weight;
        /** Main image that represents the product. The url should be accesible and there is a maximum of 6 pictures. The url can point to a seller's server or to AliExpress photobank. In order to obtain more information about the photobank and how to upload images, please visit the following page: https://developers.aliexpress.com/en/doc.htm?docId=30186&docType=2 */
                @ApiListField("main_image_urls_list")
            private List<String> mainImageUrlsList;
        /** Package length, measured in centimeters (cm). Maximum 700 cm, minumum: 1 cm */
                @ApiField("package_length")
            private Integer packageLength;
        /** There are 4 types of how to fill in the content of each element in this attribute list. 1). When filling in the standard dropdown/multi-dropdown attributes, fill in "aliexpress_attribute_name_id" and "aliexpress_attribute_value_id"(For multi-dropdown, splitting them into multiple elements)  2). When filling in the attributes in which the value needs to be manually entered, fill in "aliexpress_attribute_name_id" and "attribute_value" in the element. 3). There exists a special kind of "aliexpress_attribute_value_id" of which the value represents for "Other". When encoutering this scenario, please fill in "aliexpress_attribute_name_id", "aliexpress_attribute_value_id" and "attribute_value". 4). Besides the three types mentioned above, if the seller would like to fully customized all the atttributes, fill in  "attribute name" and "attribute_value" in the element. */
                @ApiListField("attribute_list")
            private List<AliexpressSolutionProductPostAttributeDTO> attributeList;
        /** Deprecated, please use product description, support html format and multi languages. Check the field language to find the supported languages. */
                @ApiField("description")
            private String description;
        /** Package height measured in centimeters (cm). Maximum 700 cm, minumum: 1cm */
                @ApiField("package_height")
            private Integer packageHeight;
        /** All the skus included in one product. */
                @ApiListField("sku_info_list")
            private List<AliexpressSolutionProductPostSkuInfoDTO> skuInfoList;
        /** service policy id, which could be set and obtained in the seller's background(https://cn.ae.aliexpress.com/sellerpromise/sellerPromiseHome.htm). If the merchant would like to use the default setting, pass "0" to this parameter. */
                @ApiField("service_policy_id")
            private Long servicePolicyId;
        /** The main language of the product. Aliexpress will depend on the subject and detail in main language to translate to other languages, if not filled in by sellers. Main language could not be modified after product has been uploaded. Support: en(English) ru(Russian) es(Spanish) fr(French) it(Italian) tr(Turkish) pt(Portuguese) de(German) nl(Dutch) in(Indonesian) ar(Arabic) ja(Japanese) ko(Korean) th(Thai) vi(Vietnamese) iw(Hebrew) */
                @ApiField("language")
            private String language;
        /** Package width measured in centimeters (cm). Maximum 700 cm, minumum: 1cm */
                @ApiField("package_width")
            private Integer packageWidth;
        /** Aliexpress leaf category ID, obtained through https://developers.aliexpress.com/en/doc.htm?docId=46042&docType=2 */
                @ApiField("aliexpress_category_id")
            private Long aliexpressCategoryId;
        /** Product Unit ID, Most common-used ID: 100000015 piece/pieces; 100000000:bag/bags; 100000001:barrel/barrels; 100000002:bushel/bushels; 100078580:carton; 100078581:centimeter; 100000003:cubic meter; 100000004:dozen; 100078584:feet; 100000005:gallon; 100000006:gram; 100078587:inch; 100000007:kilogram; 100078589:kiloliter; 100000008:kilometer; 100078559:liter/liters; 100000009:long ton; 100000010:meter; 100000011:metric ton; 100078560:milligram; 100078596:milliliter; 100078597:millimeter; 100000012:ounce; 100000014:pack/packs; 100000013:pair; 100000016:pound; 100078603:quart; 100000017:set/sets; 100000018:short ton; 100078606:square feet; 100078607:square inch; 100000019:square meter; 100078609:square yard; 100000020:ton; 100078558:yard/yards */
                @ApiField("product_unit")
            private Integer productUnit;
        /** Please refer to https://developers.aliexpress.com/en/doc.htm?docId=108976&docType=1 */
                @ApiListField("multi_language_description_list")
            private List<AliexpressSolutionProductPostSingleLanguageDescriptionDTO> multiLanguageDescriptionList;
        /** Please refer to https://developers.aliexpress.com/en/doc.htm?docId=108976&docType=1 */
                @ApiListField("multi_language_subject_list")
            private List<AliexpressSolutionProductPostSingleLanguageTitleDTO> multiLanguageSubjectList;
        /** group id, you can get group list from aliexpress.product.productgroups.get */
                @ApiField("group_id")
            private Long groupId;
        /** multi country price configuration */
                @ApiField("multi_country_price_configuration")
            private AliexpressSolutionProductPostMultiCountryPriceConfigurationDTO multiCountryPriceConfiguration;
        /** extra params. Configured some special products */
                @ApiField("extra_params")
            private String extraParams;
        /** marketing images for product. Currently supported 2 types: 1 represents 3:4 rectangle(resolution at least 750*1000) image while 2 represents 1:1 square image(Resolution at least 800*800). The image url needs to be obtained via uploading the image through Aliexpress API: aliexpress.photobank.redefining.uploadimageforsdk(https://developers.aliexpress.com/en/doc.htm?docId=30186&docType=2) */
                @ApiListField("marketing_images")
            private List<AliexpressSolutionProductPostMarketImageDTO> marketingImages;
        /** More information of the request. */
                @ApiField("developer_features")
            private String developerFeatures;
    
        public String getInventoryDeductionStrategy() {
    return this.inventoryDeductionStrategy;
    }
    public void setInventoryDeductionStrategy(String inventoryDeductionStrategy) {
    this.inventoryDeductionStrategy = inventoryDeductionStrategy;
    }
        public Long getFreightTemplateId() {
    return this.freightTemplateId;
    }
    public void setFreightTemplateId(Long freightTemplateId) {
    this.freightTemplateId = freightTemplateId;
    }
        public String getSubject() {
    return this.subject;
    }
    public void setSubject(String subject) {
    this.subject = subject;
    }
        public String getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
    }
        public Long getSizeChartId() {
    return this.sizeChartId;
    }
    public void setSizeChartId(Long sizeChartId) {
    this.sizeChartId = sizeChartId;
    }
        public String getBrandName() {
    return this.brandName;
    }
    public void setBrandName(String brandName) {
    this.brandName = brandName;
    }
        public Integer getShippingLeadTime() {
    return this.shippingLeadTime;
    }
    public void setShippingLeadTime(Integer shippingLeadTime) {
    this.shippingLeadTime = shippingLeadTime;
    }
        public String getWeight() {
    return this.weight;
    }
    public void setWeight(String weight) {
    this.weight = weight;
    }
        public List<String> getMainImageUrlsList() {
    return this.mainImageUrlsList;
    }
    public void setMainImageUrlsList(List<String> mainImageUrlsList) {
    this.mainImageUrlsList = mainImageUrlsList;
    }
        public Integer getPackageLength() {
    return this.packageLength;
    }
    public void setPackageLength(Integer packageLength) {
    this.packageLength = packageLength;
    }
        public List<AliexpressSolutionProductPostAttributeDTO> getAttributeList() {
    return this.attributeList;
    }
    public void setAttributeList(List<AliexpressSolutionProductPostAttributeDTO> attributeList) {
    this.attributeList = attributeList;
    }
        public String getDescription() {
    return this.description;
    }
    public void setDescription(String description) {
    this.description = description;
    }
        public Integer getPackageHeight() {
    return this.packageHeight;
    }
    public void setPackageHeight(Integer packageHeight) {
    this.packageHeight = packageHeight;
    }
        public List<AliexpressSolutionProductPostSkuInfoDTO> getSkuInfoList() {
    return this.skuInfoList;
    }
    public void setSkuInfoList(List<AliexpressSolutionProductPostSkuInfoDTO> skuInfoList) {
    this.skuInfoList = skuInfoList;
    }
        public Long getServicePolicyId() {
    return this.servicePolicyId;
    }
    public void setServicePolicyId(Long servicePolicyId) {
    this.servicePolicyId = servicePolicyId;
    }
        public String getLanguage() {
    return this.language;
    }
    public void setLanguage(String language) {
    this.language = language;
    }
        public Integer getPackageWidth() {
    return this.packageWidth;
    }
    public void setPackageWidth(Integer packageWidth) {
    this.packageWidth = packageWidth;
    }
        public Long getAliexpressCategoryId() {
    return this.aliexpressCategoryId;
    }
    public void setAliexpressCategoryId(Long aliexpressCategoryId) {
    this.aliexpressCategoryId = aliexpressCategoryId;
    }
        public Integer getProductUnit() {
    return this.productUnit;
    }
    public void setProductUnit(Integer productUnit) {
    this.productUnit = productUnit;
    }
        public List<AliexpressSolutionProductPostSingleLanguageDescriptionDTO> getMultiLanguageDescriptionList() {
    return this.multiLanguageDescriptionList;
    }
    public void setMultiLanguageDescriptionList(List<AliexpressSolutionProductPostSingleLanguageDescriptionDTO> multiLanguageDescriptionList) {
    this.multiLanguageDescriptionList = multiLanguageDescriptionList;
    }
        public List<AliexpressSolutionProductPostSingleLanguageTitleDTO> getMultiLanguageSubjectList() {
    return this.multiLanguageSubjectList;
    }
    public void setMultiLanguageSubjectList(List<AliexpressSolutionProductPostSingleLanguageTitleDTO> multiLanguageSubjectList) {
    this.multiLanguageSubjectList = multiLanguageSubjectList;
    }
        public Long getGroupId() {
    return this.groupId;
    }
    public void setGroupId(Long groupId) {
    this.groupId = groupId;
    }
        public AliexpressSolutionProductPostMultiCountryPriceConfigurationDTO getMultiCountryPriceConfiguration() {
    return this.multiCountryPriceConfiguration;
    }
    public void setMultiCountryPriceConfiguration(AliexpressSolutionProductPostMultiCountryPriceConfigurationDTO multiCountryPriceConfiguration) {
    this.multiCountryPriceConfiguration = multiCountryPriceConfiguration;
    }
        public String getExtraParams() {
    return this.extraParams;
    }
    public void setExtraParams(String extraParams) {
    this.extraParams = extraParams;
    }
        public List<AliexpressSolutionProductPostMarketImageDTO> getMarketingImages() {
    return this.marketingImages;
    }
    public void setMarketingImages(List<AliexpressSolutionProductPostMarketImageDTO> marketingImages) {
    this.marketingImages = marketingImages;
    }
        public String getDeveloperFeatures() {
    return this.developerFeatures;
    }
    public void setDeveloperFeatures(String developerFeatures) {
    this.developerFeatures = developerFeatures;
    }
    }