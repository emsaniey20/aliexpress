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

public class AriseLogisticsShipmentDeclareDeclareShipmentApiRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query） */
                @ApiField("seller_id")
            private Long sellerId;
        /** 交易单号 */
                @ApiField("trade_order_id")
            private String tradeOrderId;
        /** 交易子单号 */
                @ApiListField("trade_order_item_id_list")
            private List<String> tradeOrderItemIdList;
        /** 物流服务商编码 */
                @ApiField("shipment_provider_code")
            private String shipmentProviderCode;
        /** 渠道（可以在这个API中查询：global.seller.relation.query） */
                @ApiField("channel_type")
            private String channelType;
        /** 运单号 */
                @ApiField("tracking_number")
            private String trackingNumber;
    
        public Long getSellerId() {
    return this.sellerId;
    }
    public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
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
        public String getShipmentProviderCode() {
    return this.shipmentProviderCode;
    }
    public void setShipmentProviderCode(String shipmentProviderCode) {
    this.shipmentProviderCode = shipmentProviderCode;
    }
        public String getChannelType() {
    return this.channelType;
    }
    public void setChannelType(String channelType) {
    this.channelType = channelType;
    }
        public String getTrackingNumber() {
    return this.trackingNumber;
    }
    public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    }
    }