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

public class AriseLogisticsShipmentProviderQueryShipmentProviderApiRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query） */
                @ApiField("seller_id")
            private Long sellerId;
        /** 操作方式：SELF_MAILING/EXPRESS_COLLECTION 自寄/上门揽，仅当发货方式为平台发货时需要设置该值 */
                @ApiField("operate_way")
            private String operateWay;
        /** 交易单号 */
                @ApiField("trade_order_id")
            private String tradeOrderId;
        /** 交易子单号 */
                @ApiListField("trade_order_item_id_list")
            private List<String> tradeOrderItemIdList;
        /** 渠道（可以在这个API中查询：global.seller.relation.query） */
                @ApiField("channel_type")
            private String channelType;
    
        public Long getSellerId() {
    return this.sellerId;
    }
    public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
    }
        public String getOperateWay() {
    return this.operateWay;
    }
    public void setOperateWay(String operateWay) {
    this.operateWay = operateWay;
    }
        public String getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(String tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
        public List<String> getTradeOrderItemIdList() {
    return this.tradeOrderItemIdList;
    }
    public void setTradeOrderItemIdList(List<String> tradeOrderItemIdList) {
    this.tradeOrderItemIdList = tradeOrderItemIdList;
    }
        public String getChannelType() {
    return this.channelType;
    }
    public void setChannelType(String channelType) {
    this.channelType = channelType;
    }
    }