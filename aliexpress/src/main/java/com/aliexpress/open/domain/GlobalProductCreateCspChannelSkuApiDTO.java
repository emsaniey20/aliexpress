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

public class GlobalProductCreateCspChannelSkuApiDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query） */
                @ApiField("channel_seller_id")
            private Long channelSellerId;
        /** 渠道sku日常促销价 */
                @ApiField("sku_discount_price")
            private String skuDiscountPrice;
        /** 渠道（可以在这个API中查询：global.seller.relation.query）  	 */
                @ApiField("channel")
            private String channel;
        /** 渠道sku价格 */
                @ApiField("sku_price")
            private String skuPrice;
        /** 渠道sku库存 */
                @ApiField("sku_stock")
            private Long skuStock;
    
        public Long getChannelSellerId() {
    return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId) {
    this.channelSellerId = channelSellerId;
    }
        public String getSkuDiscountPrice() {
    return this.skuDiscountPrice;
    }
    public void setSkuDiscountPrice(String skuDiscountPrice) {
    this.skuDiscountPrice = skuDiscountPrice;
    }
        public String getChannel() {
    return this.channel;
    }
    public void setChannel(String channel) {
    this.channel = channel;
    }
        public String getSkuPrice() {
    return this.skuPrice;
    }
    public void setSkuPrice(String skuPrice) {
    this.skuPrice = skuPrice;
    }
        public Long getSkuStock() {
    return this.skuStock;
    }
    public void setSkuStock(Long skuStock) {
    this.skuStock = skuStock;
    }
    }