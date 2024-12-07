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
*  arise.product.price.update
*/
public class AriseProductPriceUpdateRequest extends BaseGopRequest<AriseProductPriceUpdateResponse> {

    /** 渠道seller id （可以在这个API中查询：global.seller.relation.query） */
    private Long channelSellerId;
    /** 渠道商品id */
    private Long productId;
    /** 渠道 （可以在这个API中查询：global.seller.relation.query） */
    private String channel;
    /** 价格模块 */
    private List<AriseProductPriceUpdateSkuPriceModel> skuPriceModelList;

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
    public List<AriseProductPriceUpdateSkuPriceModel> getSkuPriceModelList(){
        return this.skuPriceModelList;
    }
    public void setSkuPriceModelList(List<AriseProductPriceUpdateSkuPriceModel> skuPriceModelList){
        this.skuPriceModelList = skuPriceModelList;
        }

    @Override
    public String getApiName() {
        return "arise.product.price.update";
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
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AriseProductPriceUpdateResponse> getResponseClass() {
        return AriseProductPriceUpdateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}