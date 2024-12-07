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

public class GlobalSellerRelationQuerySellerRelationApiDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 渠道sellerId */
                @ApiField("channel_seller_id")
            private Long channelSellerId;
        /** 全球sellerId */
                @ApiField("seller_id")
            private Long sellerId;
        /** 渠道商品币种 */
                @ApiField("channel_currency")
            private String channelCurrency;
        /** 渠道标识 */
                @ApiField("channel")
            private String channel;
        /** 渠道店铺名称 */
                @ApiField("channel_shop_name")
            private String channelShopName;
        /** 业务类型： ONE_STOP_SERVICE ： 全托管店铺；        POP_CHOICE：POP与半托管店铺 */
                @ApiField("business_type")
            private String businessType;
    
        public Long getChannelSellerId() {
    return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId) {
    this.channelSellerId = channelSellerId;
    }
        public Long getSellerId() {
    return this.sellerId;
    }
    public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
    }
        public String getChannelCurrency() {
    return this.channelCurrency;
    }
    public void setChannelCurrency(String channelCurrency) {
    this.channelCurrency = channelCurrency;
    }
        public String getChannel() {
    return this.channel;
    }
    public void setChannel(String channel) {
    this.channel = channel;
    }
        public String getChannelShopName() {
    return this.channelShopName;
    }
    public void setChannelShopName(String channelShopName) {
    this.channelShopName = channelShopName;
    }
        public String getBusinessType() {
    return this.businessType;
    }
    public void setBusinessType(String businessType) {
    this.businessType = businessType;
    }
    }