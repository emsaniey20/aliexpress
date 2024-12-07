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
*  aliexpress.choice.product.prices.edit
*/
public class AliexpressChoiceProductPricesEditRequest extends BaseGopRequest<AliexpressChoiceProductPricesEditResponse> {

    /** 渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
    private Long channelSellerId;
    /** 商品id */
    private Long productId;
    /** 渠道（可以在这个API中查询：global.seller.relation.query） */
    private String channel;
    /** sku价格列表 */
    private List<AliexpressChoiceProductPricesEditSkuPriceModel> skuPriceModelList;
    /** version 版本号。不传默认是1。 1只能编辑非商货融合的品， 2可以编辑商货融合的品。 */
    private String version;

    public Long getChannelSellerId(){
        return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId){
        this.channelSellerId = channelSellerId;
        }
    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public String getChannel(){
        return this.channel;
    }
    public void setChannel(String channel){
        this.channel = channel;
        }
    public List<AliexpressChoiceProductPricesEditSkuPriceModel> getSkuPriceModelList(){
        return this.skuPriceModelList;
    }
    public void setSkuPriceModelList(List<AliexpressChoiceProductPricesEditSkuPriceModel> skuPriceModelList){
        this.skuPriceModelList = skuPriceModelList;
        }
    public String getVersion(){
        return this.version;
    }
    public void setVersion(String version){
        this.version = version;
        }

    @Override
    public String getApiName() {
        return "aliexpress.choice.product.prices.edit";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (channelSellerId != null) {
                        super.addApiParameter("channel_seller_id", channelSellerId.toString());
                    }
                            if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (channel != null) {
                        super.addApiParameter("channel", channel.toString());
                    }
                            if (skuPriceModelList != null) {
                        super.addApiParameter("sku_price_model_list", new JSONWriter(true, false).write(skuPriceModelList));
                    }
                            if (version != null) {
                        super.addApiParameter("version", version.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressChoiceProductPricesEditResponse> getResponseClass() {
        return AliexpressChoiceProductPricesEditResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}