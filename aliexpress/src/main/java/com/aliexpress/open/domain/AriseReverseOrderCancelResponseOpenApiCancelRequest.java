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

public class AriseReverseOrderCancelResponseOpenApiCancelRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 正向子单列表。处理用户取消订单申请时（无论同意/拒绝），都需要传入trade_order_id（主订单号）及主订单号下相同包裹下order_status=waitSellerConfirmCancel的子订单号（trade_orderline_id），这个包裹号对应的子订单号的集合需要一次性传入，不能分多几次执行同意/拒绝。同时，不同包裹号的子订单不能一次性传入，一次响应只能响应一个包裹号对应的子订单。 */
                @ApiListField("trade_order_line_ids")
            private List<Long> tradeOrderLineIds;
        /** 图片信息，当操作为refuseCancel必填 */
                @ApiListField("image_infos")
            private List<String> imageInfos;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query） */
                @ApiField("channel_seller_id")
            private Long channelSellerId;
        /** 商家拒绝原因，当操作为refuseCancel必填 */
                @ApiField("reason_id")
            private Long reasonId;
        /** 渠道（可以在这个API中查询：global.seller.relation.query） */
                @ApiField("channel")
            private String channel;
        /** 操作 agreeCancel： 表示同意买家取消；refuseCancel： 拒绝买家取消； */
                @ApiField("action")
            private String action;
        /** 否（当操作为refuseCancel必填） */
                @ApiField("comment")
            private String comment;
        /** 正向交易订单号 */
                @ApiField("trade_order_id")
            private Long tradeOrderId;
    
        public List<Long> getTradeOrderLineIds() {
    return this.tradeOrderLineIds;
    }
    public void setTradeOrderLineIds(List<Long> tradeOrderLineIds) {
    this.tradeOrderLineIds = tradeOrderLineIds;
    }
        public List<String> getImageInfos() {
    return this.imageInfos;
    }
    public void setImageInfos(List<String> imageInfos) {
    this.imageInfos = imageInfos;
    }
        public Long getChannelSellerId() {
    return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId) {
    this.channelSellerId = channelSellerId;
    }
        public Long getReasonId() {
    return this.reasonId;
    }
    public void setReasonId(Long reasonId) {
    this.reasonId = reasonId;
    }
        public String getChannel() {
    return this.channel;
    }
    public void setChannel(String channel) {
    this.channel = channel;
    }
        public String getAction() {
    return this.action;
    }
    public void setAction(String action) {
    this.action = action;
    }
        public String getComment() {
    return this.comment;
    }
    public void setComment(String comment) {
    this.comment = comment;
    }
        public Long getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
    }