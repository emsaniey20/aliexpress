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
*  aliexpress.offer.redefining.getsizetemplatesbycategoryid
*/
public class AliexpressOfferRedefiningGetsizetemplatesbycategoryidRequest extends BaseGopRequest<AliexpressOfferRedefiningGetsizetemplatesbycategoryidResponse> {

    /** 不传默认查询对应的AE的普通账号数据，渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
    private String channelSellerId;
    /** 渠道（可以在这个API中查询：global.seller.relation.query） */
    private String channel;
    /** 叶子类目ID */
    private Long leafCategoryId;
    /** 当前页码,从1开始 */
    private Long currentPage;

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
    public Long getLeafCategoryId(){
        return this.leafCategoryId;
    }
    public void setLeafCategoryId(Long leafCategoryId){
        this.leafCategoryId = leafCategoryId;
        }
    public Long getCurrentPage(){
        return this.currentPage;
    }
    public void setCurrentPage(Long currentPage){
        this.currentPage = currentPage;
        }

    @Override
    public String getApiName() {
        return "aliexpress.offer.redefining.getsizetemplatesbycategoryid";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (channelSellerId != null) {
                        super.addApiParameter("channel_seller_id", channelSellerId.toString());
                    }
                            if (channel != null) {
                        super.addApiParameter("channel", channel.toString());
                    }
                            if (leafCategoryId != null) {
                        super.addApiParameter("leaf_category_id", leafCategoryId.toString());
                    }
                            if (currentPage != null) {
                        super.addApiParameter("current_page", currentPage.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressOfferRedefiningGetsizetemplatesbycategoryidResponse> getResponseClass() {
        return AliexpressOfferRedefiningGetsizetemplatesbycategoryidResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}