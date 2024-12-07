package com.aliexpress.open.domain;

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
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;

public class AliexpressCarmodelUpdateProductCarInfoCarInfoQueryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 不传默认查询对应的AE的普通账号数据，渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
                @ApiField("channel_seller_id")
            private Long channelSellerId;
        /** 商品id */
                @ApiField("product_id")
            private String productId;
        /** 渠道（可以在这个API中查询：global.seller.relation.query） */
                @ApiField("channel")
            private String channel;
        /** 新增绑定车型afid */
                @ApiListField("add_af_ids")
            private List<String> addAfIds;
        /** 删除绑定车型afid */
                @ApiListField("delete_af_ids")
            private List<String> deleteAfIds;
    
        public Long getChannelSellerId() {
    return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId) {
    this.channelSellerId = channelSellerId;
    }
        public String getProductId() {
    return this.productId;
    }
    public void setProductId(String productId) {
    this.productId = productId;
    }
        public String getChannel() {
    return this.channel;
    }
    public void setChannel(String channel) {
    this.channel = channel;
    }
        public List<String> getAddAfIds() {
    return this.addAfIds;
    }
    public void setAddAfIds(List<String> addAfIds) {
    this.addAfIds = addAfIds;
    }
        public List<String> getDeleteAfIds() {
    return this.deleteAfIds;
    }
    public void setDeleteAfIds(List<String> deleteAfIds) {
    this.deleteAfIds = deleteAfIds;
    }
    }