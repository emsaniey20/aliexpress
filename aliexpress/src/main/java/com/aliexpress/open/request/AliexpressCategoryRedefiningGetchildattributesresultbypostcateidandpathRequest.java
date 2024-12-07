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
*  aliexpress.category.redefining.getchildattributesresultbypostcateidandpath
*/
public class AliexpressCategoryRedefiningGetchildattributesresultbypostcateidandpathRequest extends BaseGopRequest<AliexpressCategoryRedefiningGetchildattributesresultbypostcateidandpathResponse> {

    /** 渠道（可以在这个API中查询：global.seller.relation.query） */
    private String channel;
    /** 获取属性值文本对应的多语言信息：en_US */
    private String locale;
    /** 全托管商品备仓类型，channel_seller_id传全托管店铺id时生效， 枚举： 0（国内备仓），1（JIT类型），2（海外备仓）。目前的区别是 0和1 查询没有发货地属性，2 查询有发货地属性，并且海外仓发货地必填 */
    private String productType;
    /** 不传默认查询对应的AE的普通账号数据，渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
    private Long channelSellerId;
    /** 叶子类目ID。通过产品获取类目ID，如果只传cid，则返回一级属性。 */
    private Long param1;
    /** 类目子属性路径,由该子属性上层的类目属性id和类目属性值id组成,格式参考示例，多个用逗号隔开，第二个属性及为第一个的属性值的子属性，第三个属性为第二个属性的子属性，以此类推。如需返回此类目对应的子属性，则需同cateid一起进行提交。 */
    private List<String> param2;

    public String getChannel(){
        return this.channel;
    }
    public void setChannel(String channel){
        this.channel = channel;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }
    public String getProductType(){
        return this.productType;
    }
    public void setProductType(String productType){
        this.productType = productType;
        }
    public Long getChannelSellerId(){
        return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId){
        this.channelSellerId = channelSellerId;
        }
    public Long getParam1(){
        return this.param1;
    }
    public void setParam1(Long param1){
        this.param1 = param1;
        }
    public List<String> getParam2(){
        return this.param2;
    }
    public void setParam2(List<String> param2){
        this.param2 = param2;
        }

    @Override
    public String getApiName() {
        return "aliexpress.category.redefining.getchildattributesresultbypostcateidandpath";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (channel != null) {
                        super.addApiParameter("channel", channel.toString());
                    }
                            if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                            if (productType != null) {
                        super.addApiParameter("product_type", productType.toString());
                    }
                            if (channelSellerId != null) {
                        super.addApiParameter("channel_seller_id", channelSellerId.toString());
                    }
                            if (param1 != null) {
                        super.addApiParameter("param1", param1.toString());
                    }
                            if (param2 != null) {
                        super.addApiParameter("param2", new JSONWriter(true, false).write(param2));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressCategoryRedefiningGetchildattributesresultbypostcateidandpathResponse> getResponseClass() {
        return AliexpressCategoryRedefiningGetchildattributesresultbypostcateidandpathResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}