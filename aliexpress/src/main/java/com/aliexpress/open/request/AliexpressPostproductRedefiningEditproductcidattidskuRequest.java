package com.aliexpress.open.request;

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
import com.aliexpress.open.response.*;


/**
*  aliexpress.postproduct.redefining.editproductcidattidsku
*/
public class AliexpressPostproductRedefiningEditproductcidattidskuRequest extends BaseGopRequest<AliexpressPostproductRedefiningEditproductcidattidskuResponse> {

    /** 商品分国家报价(区域价)不传默认回填。想编辑分国家价格需要product_skus 这个参数不为空，才能编辑分国家报价。如果想删除分国家报价，只需将该对象的属性configurationType设为"delete" ，例如{"configurationType":"delete","configurationData":""};                        configuration_type : 分国家定价规则类型[percentage：基于基准价格按比例配置; relative:相对原价涨或跌多少；absolute：按照具体报价配置 ;delete ：删除分国家报价] ；                                                   configuration_data : jsonArray格式的分国家定价规则数据。 [{"absoluteQuoteMap":{"14:173":"1.0"},"shiptoCountry":"RU"},{"absoluteQuoteMap":{"14:173":"2.0"},"shiptoCountry":"US"}] 其中shiptoCountry：ISO两位的国家编码（目前支持国家：RU US CA ES FR UK NL IL BR CL AU UA BY JP TH SG KR ID MY PH VN IT DE SA AE PL TR）， absoluteQuoteMap：价格调整信息，为map结构，其中的key为商品查询sku中的id字段，示例为"<none>", "14:173", "14:173;3:2034781"；值则为具体的按照configuration_type设置的数据 percentage：相对于基准价的调价比例（百分比整数，支持负数，当前限制>=-50）; relative: 相对基准价的调整值，支持负数; absolute：直接设置具体数值，必须大于零。注意计算得到的分国家报价必须大于零，不能传空； */
    private String aeopNationalQuoteConfiguration;
    /** 必填，商品id，一次只能上传一个 */
    private Long productId;
    /** 产品类目ID，如果不想调整类目，则不要填写。 */
    private Long categoryId;
    /** 该产品新的类目SKU属性。如果没有指定categoryId, 则该SKU属性则为当前产品所属类目下的SKU属性，如果指定了categoryId, 则该SKU属性则为新类目下的SKU属性。特别提示：由于当前接口是全量编辑接口，如果修改了product_skus，那么product_skus下的数据会完全替换，需要isv每次调用都要把sku内部相关图片、销售属性、分国家报价参数填充完整，否则会出现商品数据丢失的情况。isv请充分测试后再使用。 */
    private List<AliexpressPostproductRedefiningEditproductcidattidskuAeopAEProductSKU> productSkus;
    /** 该产品新的类目属性。如果没有指定categoryId, 则该类目属性则为当前产品所属类目下的类目属性，如果指定了categoryId, 则该类目属性则为新类目下的类目属性。 */
    private List<AliexpressPostproductRedefiningEditproductcidattidskuAeopAeProductProperty> productProperties;

    public String getAeopNationalQuoteConfiguration(){
        return this.aeopNationalQuoteConfiguration;
    }
    public void setAeopNationalQuoteConfiguration(String aeopNationalQuoteConfiguration){
        this.aeopNationalQuoteConfiguration = aeopNationalQuoteConfiguration;
        }
    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public Long getCategoryId(){
        return this.categoryId;
    }
    public void setCategoryId(Long categoryId){
        this.categoryId = categoryId;
        }
    public List<AliexpressPostproductRedefiningEditproductcidattidskuAeopAEProductSKU> getProductSkus(){
        return this.productSkus;
    }
    public void setProductSkus(List<AliexpressPostproductRedefiningEditproductcidattidskuAeopAEProductSKU> productSkus){
        this.productSkus = productSkus;
        }
    public List<AliexpressPostproductRedefiningEditproductcidattidskuAeopAeProductProperty> getProductProperties(){
        return this.productProperties;
    }
    public void setProductProperties(List<AliexpressPostproductRedefiningEditproductcidattidskuAeopAeProductProperty> productProperties){
        this.productProperties = productProperties;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.editproductcidattidsku";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (aeopNationalQuoteConfiguration != null) {
                        super.addApiParameter("aeop_national_quote_configuration", aeopNationalQuoteConfiguration.toString());
                    }
                            if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (categoryId != null) {
                        super.addApiParameter("category_id", categoryId.toString());
                    }
                            if (productSkus != null) {
                        super.addApiParameter("product_skus", new JSONWriter(true, false).write(productSkus));
                    }
                            if (productProperties != null) {
                        super.addApiParameter("product_properties", new JSONWriter(true, false).write(productProperties));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningEditproductcidattidskuResponse> getResponseClass() {
        return AliexpressPostproductRedefiningEditproductcidattidskuResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}