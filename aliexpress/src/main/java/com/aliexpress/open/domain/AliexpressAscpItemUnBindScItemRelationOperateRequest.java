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

public class AliexpressAscpItemUnBindScItemRelationOperateRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品id */
                @ApiField("item_id")
            private Long itemId;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
                @ApiField("channel_seller_id")
            private Long channelSellerId;
        /** 渠道（可以在这个API中查询：global.seller.relation.query） */
                @ApiField("channel")
            private String channel;
        /** 货品id */
                @ApiField("sc_item_id")
            private Long scItemId;
        /** skuId */
                @ApiField("sku_id")
            private Long skuId;
    
        public Long getItemId() {
    return this.itemId;
    }
    public void setItemId(Long itemId) {
    this.itemId = itemId;
    }
        public Long getChannelSellerId() {
    return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId) {
    this.channelSellerId = channelSellerId;
    }
        public String getChannel() {
    return this.channel;
    }
    public void setChannel(String channel) {
    this.channel = channel;
    }
        public Long getScItemId() {
    return this.scItemId;
    }
    public void setScItemId(Long scItemId) {
    this.scItemId = scItemId;
    }
        public Long getSkuId() {
    return this.skuId;
    }
    public void setSkuId(Long skuId) {
    this.skuId = skuId;
    }
    }