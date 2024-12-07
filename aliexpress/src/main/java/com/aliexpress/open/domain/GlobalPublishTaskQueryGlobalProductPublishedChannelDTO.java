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

public class GlobalPublishTaskQueryGlobalProductPublishedChannelDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 渠道商家id */
                @ApiField("channel_seller_id")
            private Long channelSellerId;
        /** 渠道名 */
                @ApiField("channel")
            private String channel;
        /** 若铺货成功，展示渠道商品id */
                @ApiField("channel_product_id")
            private Long channelProductId;
        /** 若铺货失败，展示失败原因 */
                @ApiField("failed_reason")
            private String failedReason;
        /** 全球商品id */
                @ApiField("global_product_id")
            private String globalProductId;
        /** 铺货状态：代表铺货的成功或失败。 1：初始化；   2：数据准备；    3：等待执行；  4：执行中；   5：执行失败；  6：执行成功 */
                @ApiField("assortment_status")
            private String assortmentStatus;
    
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
        public String getFailedReason() {
    return this.failedReason;
    }
    public void setFailedReason(String failedReason) {
    this.failedReason = failedReason;
    }
        public String getGlobalProductId() {
    return this.globalProductId;
    }
    public void setGlobalProductId(String globalProductId) {
    this.globalProductId = globalProductId;
    }
        public String getAssortmentStatus() {
    return this.assortmentStatus;
    }
    public void setAssortmentStatus(String assortmentStatus) {
    this.assortmentStatus = assortmentStatus;
    }
    }