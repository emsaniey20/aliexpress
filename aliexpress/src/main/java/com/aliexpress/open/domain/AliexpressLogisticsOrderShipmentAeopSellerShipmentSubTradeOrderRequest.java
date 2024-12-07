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

public class AliexpressLogisticsOrderShipmentAeopSellerShipmentSubTradeOrderRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 子单列表 */
                @ApiListField("sub_trade_order_list")
            private List<AliexpressLogisticsOrderShipmentAeopSellerShipmentSubTradeOrderDTO> subTradeOrderList;
        /** 交易单号 */
                @ApiField("trade_order_id")
            private Long tradeOrderId;
    
        public List<AliexpressLogisticsOrderShipmentAeopSellerShipmentSubTradeOrderDTO> getSubTradeOrderList() {
    return this.subTradeOrderList;
    }
    public void setSubTradeOrderList(List<AliexpressLogisticsOrderShipmentAeopSellerShipmentSubTradeOrderDTO> subTradeOrderList) {
    this.subTradeOrderList = subTradeOrderList;
    }
        public Long getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
    }