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
*  aliexpress.category.tree.list
*/
public class AliexpressCategoryTreeListRequest extends BaseGopRequest<AliexpressCategoryTreeListResponse> {

    /** 不传默认查询对应的AE的普通账号数据，渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
    private Long channelSellerId;
    /** 是否只查询有权限的类目 */
    private Boolean onlyWithPermission;
    /** 渠道（可以在这个API中查询：global.seller.relation.query） */
    private String channel;
    /** 类目id */
    private Long categoryId;

    public Long getChannelSellerId(){
        return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId){
        this.channelSellerId = channelSellerId;
        }
    public Boolean getOnlyWithPermission(){
        return this.onlyWithPermission;
    }
    public void setOnlyWithPermission(Boolean onlyWithPermission){
        this.onlyWithPermission = onlyWithPermission;
        }
    public String getChannel(){
        return this.channel;
    }
    public void setChannel(String channel){
        this.channel = channel;
        }
    public Long getCategoryId(){
        return this.categoryId;
    }
    public void setCategoryId(Long categoryId){
        this.categoryId = categoryId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.category.tree.list";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (channelSellerId != null) {
                        super.addApiParameter("channel_seller_id", channelSellerId.toString());
                    }
                            if (onlyWithPermission != null) {
                        super.addApiParameter("only_with_permission", onlyWithPermission.toString());
                    }
                            if (channel != null) {
                        super.addApiParameter("channel", channel.toString());
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
    public Class<AliexpressCategoryTreeListResponse> getResponseClass() {
        return AliexpressCategoryTreeListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "GET";
    }
}