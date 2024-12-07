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
*  arise.product.online
*/
public class AriseProductOnlineRequest extends BaseGopRequest<AriseProductOnlineResponse> {

    /** 渠道sleeler id（可以在这个API中查询：global.seller.relation.query） */
    private Long channelSellerId;
    /** 渠道商品id */
    private List<Long> productIds;
    /** 渠道（可以在这个API中查询：global.seller.relation.query） */
    private String channel;

    public Long getChannelSellerId(){
        return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId){
        this.channelSellerId = channelSellerId;
        }
    public List<Long> getProductIds(){
        return this.productIds;
    }
    public void setProductIds(List<Long> productIds){
        this.productIds = productIds;
        }
    public String getChannel(){
        return this.channel;
    }
    public void setChannel(String channel){
        this.channel = channel;
        }

    @Override
    public String getApiName() {
        return "arise.product.online";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (channelSellerId != null) {
                        super.addApiParameter("channel_seller_id", channelSellerId.toString());
                    }
                            if (productIds != null) {
                        super.addApiParameter("product_ids", new JSONWriter(true, false).write(productIds));
                    }
                            if (channel != null) {
                        super.addApiParameter("channel", channel.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AriseProductOnlineResponse> getResponseClass() {
        return AriseProductOnlineResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}