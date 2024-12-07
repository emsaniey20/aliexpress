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
*  arise.product.update
*/
public class AriseProductUpdateRequest extends BaseGopRequest<AriseProductUpdateResponse> {

    /** 商品模块 */
    private AriseProductUpdateAriseProductDTO product;
    /** 渠道seller id （可以在这个API中查询：global.seller.relation.query） */
    private Long channelSellerId;
    /** 渠道（可以在这个API中查询：global.seller.relation.query） */
    private String channel;

    public AriseProductUpdateAriseProductDTO getProduct(){
        return this.product;
    }
    public void setProduct(AriseProductUpdateAriseProductDTO product){
        this.product = product;
        }
    public Long getChannelSellerId(){
        return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId){
        this.channelSellerId = channelSellerId;
        }
    public String getChannel(){
        return this.channel;
    }
    public void setChannel(String channel){
        this.channel = channel;
        }

    @Override
    public String getApiName() {
        return "arise.product.update";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (product != null) {
                        super.addApiParameter("product", new JSONWriter(true, false).write(product));
                    }
                            if (channelSellerId != null) {
                        super.addApiParameter("channel_seller_id", channelSellerId.toString());
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
    public Class<AriseProductUpdateResponse> getResponseClass() {
        return AriseProductUpdateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}