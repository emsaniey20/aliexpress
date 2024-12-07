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

public class AliexpressDraftProductEditAeopAEProduct implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品包装宽度。取值范围:1-700,单位:厘米。 */
                @ApiField("package_width")
            private Integer packageWidth;
        /** 商品多媒体信息，该属性主要包含商品的视频列表 */
                @ApiField("aeop_a_e_multimedia")
            private AliexpressDraftProductEditAeopAEMultimedia aeopAEMultimedia;
        /** 商品单位 (存储单位编号) 100000000:袋 (bag/bags)100000001:桶 (barrel/barrels)100000002:蒲式耳 (bushel/bushels)100078580:箱 (carton)100078581:厘米 (centimeter)100000003:立方米 (cubic meter)100000004:打 (dozen)100078584:英尺 (feet)100000005:加仑 (gallon)100000006:克 (gram)100078587:英寸 (inch)100000007:千克 (kilogram)100078589:千升 (kiloliter)100000008:千米 (kilometer)100078559:升 (liter/liters)100000009:英吨 (long ton)100000010:米 (meter)100000011:公吨 (metric ton)100078560:毫克 (milligram)100078596:毫升 (milliliter)100078597:毫米 (millimeter)100000012:盎司 (ounce)100000014:包 (pack/packs)100000013:双 (pair)100000015:件/个 (piece/pieces)100000016:磅 (pound)100078603:夸脱 (quart)100000017:套 (set/sets)100000018:美吨 (short ton)100078606:平方英尺 (square feet)100078607:平方英寸 (square inch)100000019:平方米 (square meter)100078609:平方码 (square yard)100000020:吨 (ton)100078558:码 (yard/yards) */
                @ApiField("product_unit")
            private Integer productUnit;
        /** 打包销售: true 非打包销售:false */
                @ApiField("package_type")
            private Boolean packageType;
        /** 产品属性，以json格式进行封装后提交。参看aeopAeProductPropertys数据结构。此字段是否必填，需从类目接口getAttributesResultByCateId获取（即获取到的required来判断属性是否必填），该项只输入普通类目属性数据，不可输入sku类目属性。对于类目属性包含子类目属性的情况，此处不确认父属性和子属性，即选择任何属性，都以该对象提交。对于一个属性多个选中值的情况，以多个该对象存放。其中"attrNameId","attrValueId"为整型(Integer), "attrName", "attrValue"为字符串类型(String)。         i).  当设置一些系统属性时，如果类目自定义了一些候选值，只需要提供"attrNameId"和"attrValueId"即可。例如：{"attrNameId":494, "attrValueId":284}。         ii). 当设置一些需要手工输入属性内容时，只需要提供"attrNameId"和"attrValue"即可。例如：{"attrNameId": 1000, "attrValue": "test"}         iii）当设置自定义属性时，需要提供"attrName"和"attrValue"即可。例如: {"attrName": "Color", "attrValue": "red"}         iv） 当设置一个Other属性时，需要提供"attrNameId", "attrValueId", "attrValue"三个参数。例如：{"attrNameId": 1000, "attrValueId": 4, "attrValue": "Other Value"}。 */
                @ApiListField("aeop_ae_product_propertys")
            private List<AliexpressDraftProductEditAeopAeProductProperty> aeopAeProductPropertys;
        /** 自定义计重的基本产品件数，isPackSell为true时,此项必填。购买几件以内不增加运费。取值范围1-1000 */
                @ApiField("base_unit")
            private Integer baseUnit;
        /** 服务模板ID。如果不填，则为新手模板ID。 */
                @ApiField("promise_template_id")
            private Long promiseTemplateId;
        /** 多语言详描 */
                @ApiListField("detail_source_list")
            private List<AliexpressDraftProductEditDetailSource> detailSourceList;
        /** 编辑产品ID */
                @ApiField("product_id")
            private Long productId;
        /** 产品所关联的尺码模版ID */
                @ApiField("sizechart_id")
            private Long sizechartId;
        /** json格式，做扩展传递参数。 deleteMarketImageFlag：删除营销图,deleteQualificationFlag：删除商品资质信息默认"false"，注意删除商品资质信息会导致商品不合规被下架处罚，请不要删除商品资质信息。edit_reason: 商品诊断优化操作：默认为空。 */
                @ApiField("ext_param")
            private String extParam;
        /** 是否自定义计重.true为自定义计重,false反之. */
                @ApiField("is_pack_sell")
            private Boolean isPackSell;
        /** 商品包装高度。取值范围:1-700,单位:厘米。 */
                @ApiField("package_height")
            private Integer packageHeight;
        /** 运费模版ID。通过运费接口listFreightTemplate获取。 */
                @ApiField("freight_template_id")
            private Long freightTemplateId;
        /** 资质信息。注意删除商品资质信息会导致商品不合规被下架处罚，请不要删除商品资质信息 */
                @ApiListField("aeop_qualification_struct_list")
            private List<AliexpressDraftProductEditAeopQualificationStructDTO> aeopQualificationStructList;
        /** 欧盟责任人id，需要调用查询欧盟责任人列表接口：aliexpress.category.eu.responsible.persons.list，获取对应的欧盟责任人列表 */
                @ApiField("msr_eu_id")
            private Long msrEuId;
        /** 商品一口价。取值范围:0-100000,保留两位小数;单位:美元。如:200.07，表示:200美元7分。需要在正确的价格区间内。 */
                @ApiField("product_price")
            private String productPrice;
        /** 批发最小数量 。取值范围2-100000。批发最小数量和批发折扣需同时有值或无值。 */
                @ApiField("bulk_order")
            private Integer bulkOrder;
        /** 备货期。取值范围:1-7;单位:天。 */
                @ApiField("delivery_time")
            private Integer deliveryTime;
        /** 库存扣减策略，两种策略：place_order_withhold（下单减库存）或payment_success_deduct（支付减库存） */
                @ApiField("reduce_strategy")
            private String reduceStrategy;
        /** 列表类型，以json格式来表达。参看aeopAeProductSKUs数据结构。特别提示：新增SKU实际可售库存属性ipmSkuStock，该属性值的合理取值范围为0~999999，如该商品有SKU时，请确保至少有一个SKU是有货状态，也就是ipmSkuStock取值是1~999999，在整个商品纬度库存值的取值范围是1~999999。 */
                @ApiListField("aeop_ae_product_s_k_us")
            private List<AliexpressDraftProductEditAeopAEProductSKU> aeopAeProductSKUs;
        /** 批发折扣。扩大100倍，存整数。取值范围:1-99。注意：这是折扣，不是打折率。 如,打68折,则存32。批发最小数量和批发折扣需同时有值或无值。 */
                @ApiField("bulk_discount")
            private Integer bulkDiscount;
        /** 商品初始发布语种标记 */
                @ApiField("locale")
            private String locale;
        /** isPackSell为true时,此项必填。  每增加件数.取值范围1-1000。 */
                @ApiField("add_unit")
            private Integer addUnit;
        /** 营销图列表 */
                @ApiListField("market_images")
            private List<AliexpressDraftProductEditMarketImage> marketImages;
        /** 商品包装长度。取值范围:1-700,单位:厘米。产品包装尺寸的最大值+2×（第二大值+第三大值）不能超过2700厘米。 */
                @ApiField("package_length")
            private Integer packageLength;
        /** 商品分国家报价的配置，想删除分国家报价需要传指定的参数： configuration_type = delete：{"configurationType":"delete","configurationData":""}，计算之后的分国家报价不能小于 sku价格（sku_price和aeop_s_k_u_national_discount_price）的 50%，计算后的分国家报价不能小于0也不能为"null"，请isv做好前置校验 */
                @ApiField("aeop_national_quote_configuration")
            private AliexpressDraftProductEditAeopNationalQuoteConfiguration aeopNationalQuoteConfiguration;
        /** 多语言标题 */
                @ApiListField("subject_list")
            private List<AliexpressDraftProductEditSubject> subjectList;
        /** 商品有效天数。取值范围:1-30,单位:天。 */
                @ApiField("ws_valid_num")
            private Integer wsValidNum;
        /** 每包件数。  打包销售情况，lotNum>1,非打包销售情况,lotNum=1 */
                @ApiField("lot_num")
            private Integer lotNum;
        /** isPackSell为true时,此项必填。  对应增加的重量.取值范围:0.001-500.000,保留三位小数,采用进位制,单位:公斤。 */
                @ApiField("add_weight")
            private String addWeight;
        /** 商品毛重,取值范围:0.001-500.000,保留三位小数,采用进位制,单位:公斤。 */
                @ApiField("gross_weight")
            private String grossWeight;
        /** 图片URL.静态单图主图个数为1,动态多图主图个数为2-6.可从图片接口uploadTempImage上传，也可以从图片银行引入.  多个图片url用‘;’分隔符连接。 */
                @ApiField("image_u_r_ls")
            private String imageURLs;
        /** 货币单位。如果不提供该值信息，则默认为"USD"；非俄罗斯卖家这个属性值可以不提供。对于俄罗斯海外卖家，该单位值必须提供，如: "RUB"。 */
                @ApiField("currency_code")
            private String currencyCode;
        /** 商品所属类目ID。必须是叶子类目，通过类目接口获取。 */
                @ApiField("category_id")
            private Long categoryId;
        /** 模特尺码数据 */
                @ApiListField("mode_size_chart_list")
            private List<AliexpressDraftProductEditAeopAEModeSizeChartDTO> modeSizeChartList;
    
        public Integer getPackageWidth() {
    return this.packageWidth;
    }
    public void setPackageWidth(Integer packageWidth) {
    this.packageWidth = packageWidth;
    }
        public AliexpressDraftProductEditAeopAEMultimedia getAeopAEMultimedia() {
    return this.aeopAEMultimedia;
    }
    public void setAeopAEMultimedia(AliexpressDraftProductEditAeopAEMultimedia aeopAEMultimedia) {
    this.aeopAEMultimedia = aeopAEMultimedia;
    }
        public Integer getProductUnit() {
    return this.productUnit;
    }
    public void setProductUnit(Integer productUnit) {
    this.productUnit = productUnit;
    }
        public Boolean getPackageType() {
    return this.packageType;
    }
    public void setPackageType(Boolean packageType) {
    this.packageType = packageType;
    }
        public List<AliexpressDraftProductEditAeopAeProductProperty> getAeopAeProductPropertys() {
    return this.aeopAeProductPropertys;
    }
    public void setAeopAeProductPropertys(List<AliexpressDraftProductEditAeopAeProductProperty> aeopAeProductPropertys) {
    this.aeopAeProductPropertys = aeopAeProductPropertys;
    }
        public Integer getBaseUnit() {
    return this.baseUnit;
    }
    public void setBaseUnit(Integer baseUnit) {
    this.baseUnit = baseUnit;
    }
        public Long getPromiseTemplateId() {
    return this.promiseTemplateId;
    }
    public void setPromiseTemplateId(Long promiseTemplateId) {
    this.promiseTemplateId = promiseTemplateId;
    }
        public List<AliexpressDraftProductEditDetailSource> getDetailSourceList() {
    return this.detailSourceList;
    }
    public void setDetailSourceList(List<AliexpressDraftProductEditDetailSource> detailSourceList) {
    this.detailSourceList = detailSourceList;
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
        public Integer getPackageHeight() {
    return this.packageHeight;
    }
    public void setPackageHeight(Integer packageHeight) {
    this.packageHeight = packageHeight;
    }
        public Long getFreightTemplateId() {
    return this.freightTemplateId;
    }
    public void setFreightTemplateId(Long freightTemplateId) {
    this.freightTemplateId = freightTemplateId;
    }
        public List<AliexpressDraftProductEditAeopQualificationStructDTO> getAeopQualificationStructList() {
    return this.aeopQualificationStructList;
    }
    public void setAeopQualificationStructList(List<AliexpressDraftProductEditAeopQualificationStructDTO> aeopQualificationStructList) {
    this.aeopQualificationStructList = aeopQualificationStructList;
    }
        public Long getMsrEuId() {
    return this.msrEuId;
    }
    public void setMsrEuId(Long msrEuId) {
    this.msrEuId = msrEuId;
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
        public Integer getDeliveryTime() {
    return this.deliveryTime;
    }
    public void setDeliveryTime(Integer deliveryTime) {
    this.deliveryTime = deliveryTime;
    }
        public String getReduceStrategy() {
    return this.reduceStrategy;
    }
    public void setReduceStrategy(String reduceStrategy) {
    this.reduceStrategy = reduceStrategy;
    }
        public List<AliexpressDraftProductEditAeopAEProductSKU> getAeopAeProductSKUs() {
    return this.aeopAeProductSKUs;
    }
    public void setAeopAeProductSKUs(List<AliexpressDraftProductEditAeopAEProductSKU> aeopAeProductSKUs) {
    this.aeopAeProductSKUs = aeopAeProductSKUs;
    }
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
        public Integer getAddUnit() {
    return this.addUnit;
    }
    public void setAddUnit(Integer addUnit) {
    this.addUnit = addUnit;
    }
        public List<AliexpressDraftProductEditMarketImage> getMarketImages() {
    return this.marketImages;
    }
    public void setMarketImages(List<AliexpressDraftProductEditMarketImage> marketImages) {
    this.marketImages = marketImages;
    }
        public Integer getPackageLength() {
    return this.packageLength;
    }
    public void setPackageLength(Integer packageLength) {
    this.packageLength = packageLength;
    }
        public AliexpressDraftProductEditAeopNationalQuoteConfiguration getAeopNationalQuoteConfiguration() {
    return this.aeopNationalQuoteConfiguration;
    }
    public void setAeopNationalQuoteConfiguration(AliexpressDraftProductEditAeopNationalQuoteConfiguration aeopNationalQuoteConfiguration) {
    this.aeopNationalQuoteConfiguration = aeopNationalQuoteConfiguration;
    }
        public List<AliexpressDraftProductEditSubject> getSubjectList() {
    return this.subjectList;
    }
    public void setSubjectList(List<AliexpressDraftProductEditSubject> subjectList) {
    this.subjectList = subjectList;
    }
        public Integer getWsValidNum() {
    return this.wsValidNum;
    }
    public void setWsValidNum(Integer wsValidNum) {
    this.wsValidNum = wsValidNum;
    }
        public Integer getLotNum() {
    return this.lotNum;
    }
    public void setLotNum(Integer lotNum) {
    this.lotNum = lotNum;
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
        public String getImageURLs() {
    return this.imageURLs;
    }
    public void setImageURLs(String imageURLs) {
    this.imageURLs = imageURLs;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public Long getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
    }
        public List<AliexpressDraftProductEditAeopAEModeSizeChartDTO> getModeSizeChartList() {
    return this.modeSizeChartList;
    }
    public void setModeSizeChartList(List<AliexpressDraftProductEditAeopAEModeSizeChartDTO> modeSizeChartList) {
    this.modeSizeChartList = modeSizeChartList;
    }
    }