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

public class GlobalProductPublishedChannelsListGlobalProductPublishedChannelDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 渠道商家id */
                @ApiField("channel_seller_id")
            private Long channelSellerId;
        /** 渠道名 */
                @ApiField("channel")
            private String channel;
        /** 渠道商品id */
                @ApiField("channel_product_id")
            private Long channelProductId;
    
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
        public Long getChannelProductId() {
    return this.channelProductId;
    }
    public void setChannelProductId(Long channelProductId) {
    this.channelProductId = channelProductId;
    }
    }