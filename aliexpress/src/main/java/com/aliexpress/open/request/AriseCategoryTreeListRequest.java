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
*  arise.category.tree.list
*/
public class AriseCategoryTreeListRequest extends BaseGopRequest<AriseCategoryTreeListResponse> {

    /** 渠道账号ID */
    private Long channelSellerId;
    /** 渠道 */
    private String channel;
    /** 语言 。 目前支持中文 ：zh_CN  、 英文：en_US   西班牙语 ：es_ES */
    private String locale;
    /** 渠道类目ID。 查询一级类目时 category_id 不需要传 */
    private Long categoryId;

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
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }
    public Long getCategoryId(){
        return this.categoryId;
    }
    public void setCategoryId(Long categoryId){
        this.categoryId = categoryId;
        }

    @Override
    public String getApiName() {
        return "arise.category.tree.list";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (channelSellerId != null) {
                        super.addApiParameter("channel_seller_id", channelSellerId.toString());
                    }
                            if (channel != null) {
                        super.addApiParameter("channel", channel.toString());
                    }
                            if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                            if (categoryId != null) {
                        super.addApiParameter("category_id", categoryId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AriseCategoryTreeListResponse> getResponseClass() {
        return AriseCategoryTreeListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "GET";
    }
}