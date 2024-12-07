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

public class AliexpressLogisticsOrderModifyshipmentAeopSellerShipmentSubTradeOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** shipment list */
                @ApiListField("shipment_list")
            private List<AliexpressLogisticsOrderModifyshipmentAeopShipmentDTO> shipmentList;
        /** sub trade order index */
                @ApiField("sub_trade_order_index")
            private Long subTradeOrderIndex;
        /** all/part */
                @ApiField("send_type")
            private String sendType;
    
        public List<AliexpressLogisticsOrderModifyshipmentAeopShipmentDTO> getShipmentList() {
    return this.shipmentList;
    }
    public void setShipmentList(List<AliexpressLogisticsOrderModifyshipmentAeopShipmentDTO> shipmentList) {
    this.shipmentList = shipmentList;
    }
        public Long getSubTradeOrderIndex() {
    return this.subTradeOrderIndex;
    }
    public void setSubTradeOrderIndex(Long subTradeOrderIndex) {
    this.subTradeOrderIndex = subTradeOrderIndex;
    }
        public String getSendType() {
    return this.sendType;
    }
    public void setSendType(String sendType) {
    this.sendType = sendType;
    }
    }