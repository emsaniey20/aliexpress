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
*  aliexpress.postproduct.redefining.setsizechart
*/
public class AliexpressPostproductRedefiningSetsizechartRequest extends BaseGopRequest<AliexpressPostproductRedefiningSetsizechartResponse> {

    /** 不传默认查询对应的AE的普通账号数据，渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
    private String channelSellerId;
    /** 渠道（可以在这个API中查询：global.seller.relation.query） */
    private String channel;
    /** 商品Id */
    private Long productId;
    /** 尺码表模版Id, 必须与当前商品所在类目想对应。 */
    private Long sizechartId;

    public String getChannelSellerId(){
        return this.channelSellerId;
    }
    public void setChannelSellerId(String channelSellerId){
        this.channelSellerId = channelSellerId;
        }
    public String getChannel(){
        return this.channel;
    }
    public void setChannel(String channel){
        this.channel = channel;
        }
    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public Long getSizechartId(){
        return this.sizechartId;
    }
    public void setSizechartId(Long sizechartId){
        this.sizechartId = sizechartId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.setsizechart";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (channelSellerId != null) {
                        super.addApiParameter("channel_seller_id", channelSellerId.toString());
                    }
                            if (channel != null) {
                        super.addApiParameter("channel", channel.toString());
                    }
                            if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (sizechartId != null) {
                        super.addApiParameter("sizechart_id", sizechartId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningSetsizechartResponse> getResponseClass() {
        return AliexpressPostproductRedefiningSetsizechartResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}