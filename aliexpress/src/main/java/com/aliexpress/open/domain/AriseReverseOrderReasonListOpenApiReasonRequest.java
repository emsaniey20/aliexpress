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

public class AriseReverseOrderReasonListOpenApiReasonRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 渠道（可以在这个API中查询：global.seller.relation.query） */
                @ApiField("channel")
            private String channel;
        /** 1：表示取消订单的拒绝原因列表，该字段和逆向子单id不能同时为空 */
                @ApiField("reverse_type")
            private Integer reverseType;
        /** 多语言，中文：zh_CN，英文：en_US，默认返回英文文案 */
                @ApiField("locale")
            private String locale;
        /** 逆向子单id，当这个字段不为空时，优先查询该子单对应的拒绝原因列表 */
                @ApiField("reverse_order_line_id")
            private Long reverseOrderLineId;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query） */
                @ApiField("channel_seller_id")
            private Long channelSellerId;
    
        public String getChannel() {
    return this.channel;
    }
    public void setChannel(String channel) {
    this.channel = channel;
    }
        public Integer getReverseType() {
    return this.reverseType;
    }
    public void setReverseType(Integer reverseType) {
    this.reverseType = reverseType;
    }
        public String getLocale() {
    return this.locale;
    }
    public void setLocale(String locale) {
    this.locale = locale;
    }
        public Long getReverseOrderLineId() {
    return this.reverseOrderLineId;
    }
    public void setReverseOrderLineId(Long reverseOrderLineId) {
    this.reverseOrderLineId = reverseOrderLineId;
    }
        public Long getChannelSellerId() {
    return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId) {
    this.channelSellerId = channelSellerId;
    }
    }