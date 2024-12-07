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

public class AliexpressLogisticsOrderShipmentAeopSellerShipmentSubTradeOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** ioss */
                @ApiField("ioss")
            private String ioss;
        /** 申明发货类型 part / all */
                @ApiField("send_type")
            private String sendType;
        /** 发货列表 */
                @ApiListField("shipment_list")
            private List<AliexpressLogisticsOrderShipmentAeopShipmentDTO> shipmentList;
        /** 子交易单序号 */
                @ApiField("sub_trade_order_index")
            private Long subTradeOrderIndex;
    
        public String getIoss() {
    return this.ioss;
    }
    public void setIoss(String ioss) {
    this.ioss = ioss;
    }
        public String getSendType() {
    return this.sendType;
    }
    public void setSendType(String sendType) {
    this.sendType = sendType;
    }
        public List<AliexpressLogisticsOrderShipmentAeopShipmentDTO> getShipmentList() {
    return this.shipmentList;
    }
    public void setShipmentList(List<AliexpressLogisticsOrderShipmentAeopShipmentDTO> shipmentList) {
    this.shipmentList = shipmentList;
    }
        public Long getSubTradeOrderIndex() {
    return this.subTradeOrderIndex;
    }
    public void setSubTradeOrderIndex(Long subTradeOrderIndex) {
    this.subTradeOrderIndex = subTradeOrderIndex;
    }
    }