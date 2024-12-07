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
*  global.publish.task.create
*/
public class GlobalPublishTaskCreateRequest extends BaseGopRequest<GlobalPublishTaskCreateResponse> {

    /** 铺货任务备注 */
    private String remark;
    /** 渠道商家id, 通过global.seller.relation.query获得 */
    private Long channelSellerId;
    /** AE_GLOBAL,ARISE_ES,ARISE_FR */
    private String channel;
    /** 全球商品id,通过global.product.create获得 */
    private Long globalProductId;

    public String getRemark(){
        return this.remark;
    }
    public void setRemark(String remark){
        this.remark = remark;
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
    public Long getGlobalProductId(){
        return this.globalProductId;
    }
    public void setGlobalProductId(Long globalProductId){
        this.globalProductId = globalProductId;
        }

    @Override
    public String getApiName() {
        return "global.publish.task.create";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (remark != null) {
                        super.addApiParameter("remark", remark.toString());
                    }
                            if (channelSellerId != null) {
                        super.addApiParameter("channel_seller_id", channelSellerId.toString());
                    }
                            if (channel != null) {
                        super.addApiParameter("channel", channel.toString());
                    }
                            if (globalProductId != null) {
                        super.addApiParameter("global_product_id", globalProductId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<GlobalPublishTaskCreateResponse> getResponseClass() {
        return GlobalPublishTaskCreateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}