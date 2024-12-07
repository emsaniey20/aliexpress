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

public class AliexpressPostproductRedefiningEditaeproductAeopAEProduct implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品包装长度。取值范围:1-700,单位:厘米。产品包装尺寸的最大值+2×（第二大值+第三大值）不能超过2700厘米。 */
                @ApiField("package_length")
            private Integer packageLength;
        /** 打包销售: true 非打包销售:false */
                @ApiField("package_type")
            private Boolean packageType;
        /** 商品包装宽度。取值范围:1-700,单位:厘米。 */
                @ApiField("package_width")
            private Integer packageWidth;
        /** 编辑产品ID */
                @ApiField("product_id")
            private Long productId;
        /** product_more_keywords1 */
                @ApiField("product_more_keywords1")
            private String productMoreKeywords1;
        /** product_more_keywords2 */
                @ApiField("product_more_keywords2")
            private String productMoreKeywords2;
        /** 商品一口价。取值范围:0-100000,保留两位小数;单位:美元。如:200.07，表示:200美元7分。需要在正确的价格区间内。 */
                @ApiField("product_price")
            private String productPrice;
        /** 产品的状态，包括onSelling（正在销售），offline（已下架），auditing（审核中），editingRequired（审核不通过） */
                @ApiField("product_status_type")
            private String productStatusType;
        /** 商品单位 (存储单位编号) 100000000:袋 (bag/bags)100000001:桶 (barrel/barrels)100000002:蒲式耳 (bushel/bushels)100078580:箱 (carton)100078581:厘米 (centimeter)100000003:立方米 (cubic meter)100000004:打 (dozen)100078584:英尺 (feet)100000005:加仑 (gallon)100000006:克 (gram)100078587:英寸 (inch)100000007:千克 (kilogram)100078589:千升 (kiloliter)100000008:千米 (kilometer)100078559:升 (liter/liters)100000009:英吨 (long ton)100000010:米 (meter)100000011:公吨 (metric ton)100078560:毫克 (milligram)100078596:毫升 (milliliter)100078597:毫米 (millimeter)100000012:盎司 (ounce)100000014:包 (pack/packs)100000013:双 (pair)100000015:件/个 (piece/pieces)100000016:磅 (pound)100078603:夸脱 (quart)100000017:套 (set/sets)100000018:美吨 (short ton)100078606:平方英尺 (square feet)100078607:平方英寸 (square inch)100000019:平方米 (square meter)100078609:平方码 (square yard)100000020:吨 (ton)100078558:码 (yard/yards) */
                @ApiField("product_unit")
            private Integer productUnit;
        /** 服务模板ID。如果不填，则为新手模板ID。 */
                @ApiField("promise_template_id")
            private Long promiseTemplateId;
        /** 库存扣减策略，两种策略：place_order_withhold（下单减库存）或payment_success_deduct（支付减库存） */
                @ApiField("reduce_strategy")
            private String reduceStrategy;
        /** 产品所关联的尺码模版ID */
                @ApiField("sizechart_id")
            private Long sizechartId;
        /** 产品的来源 */
                @ApiField("src")
            private String src;
        /** 商品标题  长度在1-128之间英文。 */
                @ApiField("subject")
            private String subject;
        /** 商品概要 */
                @ApiField("summary")
            private String summary;
        /** 产品的下架原因，包括user_offline：手动下架，expire_offline：到期下架，punish_offline：网规处罚下架，violate_offline：交易违规下架，degrade_offline：降级下架，industry_offline：未续约下架 */
                @ApiField("ws_display")
            private String wsDisplay;
        /** 产品的下架日期 */
                @ApiField("ws_offline_date")
            private String wsOfflineDate;
        /** 商品有效天数。取值范围:1-30,单位:天。 */
                @ApiField("ws_valid_num")
            private Integer wsValidNum;
        /** isPackSell为true时,此项必填。  每增加件数.取值范围1-1000。 */
                @ApiField("add_unit")
            private Integer addUnit;
        /** isPackSell为true时,此项必填。  对应增加的重量.取值范围:0.001-500.000,保留三位小数,采用进位制,单位:公斤。 */
                @ApiField("add_weight")
            private String addWeight;
        /** 商品多媒体信息，该属性主要包含商品的视频列表。商品再商家上传了视频的，通过接口编辑时必须按格式回传商品视频，不传默认删除该商品视频。 */
                @ApiField("aeop_a_e_multimedia")
            private AliexpressPostproductRedefiningEditaeproductAeopAEMultimedia aeopAEMultimedia;
        /** 产品属性，以json格式进行封装后提交。参看aeopAeProductPropertys数据结构。此字段是否必填，需从类目接口getAttributesResultByCateId获取（即获取到的required来判断属性是否必填），该项只输入普通类目属性数据，不可输入sku类目属性。对于类目属性包含子类目属性的情况，此处不确认父属性和子属性，即选择任何属性，都以该对象提交。对于一个属性多个选中值的情况，以多个该对象存放。其中"attrNameId","attrValueId"为整型(Integer), "attrName", "attrValue"为字符串类型(String)。         i).  当设置一些系统属性时，如果类目自定义了一些候选值，只需要提供"attrNameId"和"attrValueId"即可。例如：{"attrNameId":494, "attrValueId":284}。         ii). 当设置一些需要手工输入属性内容时，只需要提供"attrNameId"和"attrValue"即可。例如：{"attrNameId": 1000, "attrValue": "test"}         iii）当设置自定义属性时，需要提供"attrName"和"attrValue"即可。例如: {"attrName": "Color", "attrValue": "red"}         iv） 当设置一个Other属性时，需要提供"attrNameId", "attrValueId", "attrValue"三个参数。例如：{"attrNameId": 1000, "attrValueId": 4, "attrValue": "Other Value"}。 */
                @ApiListField("aeop_ae_product_propertys")
            private List<AliexpressPostproductRedefiningEditaeproductAeopAeProductProperty> aeopAeProductPropertys;
        /** 列表类型，以json格式来表达。参看aeopAeProductSKUs数据结构。特别提示：新增SKU实际可售库存属性ipmSkuStock，该属性值的合理取值范围为0~999999，如该商品有SKU时，请确保至少有一个SKU是有货状态，也就是ipmSkuStock取值是1~999999，在整个商品纬度库存值的取值范围是1~999999。 */
                @ApiListField("aeop_ae_product_s_k_us")
            private List<AliexpressPostproductRedefiningEditaeproductAeopAEProductSKU> aeopAeProductSKUs;
        /** 商品分国家定价规则数据，建议使用新格式，请参考：https://developers.aliexpress.com/doc.htm?docId=109575&docType=1。另外，商品本身设置了分国家报价的，编辑是也必须回传分国家报价数据，不传默认删除分国家报价。 */
                @ApiField("aeop_national_quote_configuration")
            private AliexpressPostproductRedefiningEditaeproductAeopNationalQuoteConfiguration aeopNationalQuoteConfiguration;
        /** 自定义计重的基本产品件数，isPackSell为true时,此项必填。购买几件以内不增加运费。取值范围1-1000 */
                @ApiField("base_unit")
            private Integer baseUnit;
        /** 批发折扣。扩大100倍，存整数。取值范围:1-99。注意：这是折扣，不是打折率。 如,打68折,则存32。批发最小数量和批发折扣需同时有值或无值。 */
                @ApiField("bulk_discount")
            private Integer bulkDiscount;
        /** 批发最小数量 。取值范围2-100000。批发最小数量和批发折扣需同时有值或无值。 */
                @ApiField("bulk_order")
            private Integer bulkOrder;
        /** 商品所属类目ID。必须是叶子类目，通过类目接口获取。 */
                @ApiField("category_id")
            private Integer categoryId;
        /** 卡券商品结束有效期 */
                @ApiField("coupon_end_date")
            private String couponEndDate;
        /** 卡券商品开始有效期 */
                @ApiField("coupon_start_date")
            private String couponStartDate;
        /** 货币单位，USD、RUB、EUR，必填，可通过aliexpress.merchant.profile.get( 查询卖家资料 )查商家币种。https://developers.aliexpress.com/doc.htm?docId=43062&docType=2 */
                @ApiField("currency_code")
            private String currencyCode;
        /** 备货期。取值范围:1-60;单位:天。 */
                @ApiField("delivery_time")
            private Integer deliveryTime;
        /** Detail详情。以下内容会被过滤，但不影响产品提交:(1)含有script\textarea\style\iframe\frame\input\pre\button均被过滤.(2)a标签href属性只允许是aliexpress.com域名连接,否则被过滤.(3)img标签src只允许alibaba.com或者aliimg.com域名链接.(4)任意具有style属性的html标签，其style受检查，只允许一般简单的样式.不允许的内容将被过滤.(5)如果发现html内容标签缺失，会自动补全标签. */
                @ApiField("detail")
            private String detail;
        /** 商品关联的运费模板ID */
                @ApiField("freight_template_id")
            private Long freightTemplateId;
        /** 商品毛重,取值范围:0.001-500.000,保留三位小数,采用进位制,单位:公斤。 */
                @ApiField("gross_weight")
            private String grossWeight;
        /** 产品分组ID */
                @ApiField("group_id")
            private Long groupId;
        /** 图片URL.静态单图主图个数为1,动态多图主图个数为2-6.可从图片接口uploadTempImage上传，也可以从图片银行引入.  多个图片url用‘;’分隔符连接。 */
                @ApiField("image_u_r_ls")
            private String imageURLs;
        /** 是否是动态图产品 */
                @ApiField("is_image_dynamic")
            private Boolean isImageDynamic;
        /** 是否自定义计重.true为自定义计重,false反之. */
                @ApiField("is_pack_sell")
            private Boolean isPackSell;
        /** 关键字 */
                @ApiField("keyword")
            private String keyword;
        /** 每包件数。  打包销售情况，lotNum>1,非打包销售情况,lotNum=1 */
                @ApiField("lot_num")
            private Integer lotNum;
        /** mobile Detail详情。以下内容会被过滤，但不影响产品提交:(1)含有script\textarea\style\iframe\frame\input\pre\button均被过滤.(2)a标签href属性只允许是aliexpress.com域名连接,否则被过滤.(3)img标签src只允许alibaba.com或者aliimg.com域名链接.(4)任意具有style属性的html标签，其style受检查，只允许一般简单的样式.不允许的内容将被过滤.(5)如果发现html内容标签缺失，会自动补全标签. */
                @ApiField("mobile_detail")
            private String mobileDetail;
        /** 商品拥有者的login_id */
                @ApiField("owner_member_id")
            private String ownerMemberId;
        /** 商品拥有者的ID */
                @ApiField("owner_member_seq")
            private Integer ownerMemberSeq;
        /** 商品包装高度。取值范围:1-700,单位:厘米。 */
                @ApiField("package_height")
            private Integer packageHeight;
        /** 模特尺码数据，最多5个，单位厘米 */
                @ApiListField("mode_size_chart_list")
            private List<AliexpressPostproductRedefiningEditaeproductAeopAEModeSizeChartDTO> modeSizeChartList;
    
        public Integer getPackageLength() {
    return this.packageLength;
    }
    public void setPackageLength(Integer packageLength) {
    this.packageLength = packageLength;
    }
        public Boolean getPackageType() {
    return this.packageType;
    }
    public void setPackageType(Boolean packageType) {
    this.packageType = packageType;
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
        public AliexpressPostproductRedefiningEditaeproductAeopAEMultimedia getAeopAEMultimedia() {
    return this.aeopAEMultimedia;
    }
    public void setAeopAEMultimedia(AliexpressPostproductRedefiningEditaeproductAeopAEMultimedia aeopAEMultimedia) {
    this.aeopAEMultimedia = aeopAEMultimedia;
    }
        public List<AliexpressPostproductRedefiningEditaeproductAeopAeProductProperty> getAeopAeProductPropertys() {
    return this.aeopAeProductPropertys;
    }
    public void setAeopAeProductPropertys(List<AliexpressPostproductRedefiningEditaeproductAeopAeProductProperty> aeopAeProductPropertys) {
    this.aeopAeProductPropertys = aeopAeProductPropertys;
    }
        public List<AliexpressPostproductRedefiningEditaeproductAeopAEProductSKU> getAeopAeProductSKUs() {
    return this.aeopAeProductSKUs;
    }
    public void setAeopAeProductSKUs(List<AliexpressPostproductRedefiningEditaeproductAeopAEProductSKU> aeopAeProductSKUs) {
    this.aeopAeProductSKUs = aeopAeProductSKUs;
    }
        public AliexpressPostproductRedefiningEditaeproductAeopNationalQuoteConfiguration getAeopNationalQuoteConfiguration() {
    return this.aeopNationalQuoteConfiguration;
    }
    public void setAeopNationalQuoteConfiguration(AliexpressPostproductRedefiningEditaeproductAeopNationalQuoteConfiguration aeopNationalQuoteConfiguration) {
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
        public Long getGroupId() {
    return this.groupId;
    }
    public void setGroupId(Long groupId) {
    this.groupId = groupId;
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
        public List<AliexpressPostproductRedefiningEditaeproductAeopAEModeSizeChartDTO> getModeSizeChartList() {
    return this.modeSizeChartList;
    }
    public void setModeSizeChartList(List<AliexpressPostproductRedefiningEditaeproductAeopAEModeSizeChartDTO> modeSizeChartList) {
    this.modeSizeChartList = modeSizeChartList;
    }
    }