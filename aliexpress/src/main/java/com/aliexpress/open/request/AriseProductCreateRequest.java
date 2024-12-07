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
*  arise.product.create
*/
public class AriseProductCreateRequest extends BaseGopRequest<AriseProductCreateResponse> {

    /** 商品模块 */
    private AriseProductCreateAriseProductDTO product;
    /** 渠道seller id （可以在这个API中查询：global.seller.relation.query） */
    private Long channelSellerId;
    /** 渠道（可以在这个API中查询：global.seller.relation.query） */
    private String channel;

    public AriseProductCreateAriseProductDTO getProduct(){
        return this.product;
    }
    public void setProduct(AriseProductCreateAriseProductDTO product){
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
        return "arise.product.create";
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
    public Class<AriseProductCreateResponse> getResponseClass() {
        return AriseProductCreateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}