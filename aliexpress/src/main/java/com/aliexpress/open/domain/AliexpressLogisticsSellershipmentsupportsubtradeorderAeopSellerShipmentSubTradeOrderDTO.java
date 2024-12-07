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

public class AliexpressLogisticsSellershipmentsupportsubtradeorderAeopSellerShipmentSubTradeOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** part / all */
                @ApiField("send_type")
            private String sendType;
        /** 子订单序号，从1开始 */
                @ApiField("sub_trade_order_index")
            private Long subTradeOrderIndex;
        /** ioss税号 */
                @ApiField("ioss")
            private String ioss;
        /** 1 */
                @ApiListField("shipment_list")
            private List<AliexpressLogisticsSellershipmentsupportsubtradeorderAeopShipmentDTO> shipmentList;
    
        public String getSendType() {
    return this.sendType;
    }
    public void setSendType(String sendType) {
    this.sendType = sendType;
    }
        public Long getSubTradeOrderIndex() {
    return this.subTradeOrderIndex;
    }
    public void setSubTradeOrderIndex(Long subTradeOrderIndex) {
    this.subTradeOrderIndex = subTradeOrderIndex;
    }
        public String getIoss() {
    return this.ioss;
    }
    public void setIoss(String ioss) {
    this.ioss = ioss;
    }
        public List<AliexpressLogisticsSellershipmentsupportsubtradeorderAeopShipmentDTO> getShipmentList() {
    return this.shipmentList;
    }
    public void setShipmentList(List<AliexpressLogisticsSellershipmentsupportsubtradeorderAeopShipmentDTO> shipmentList) {
    this.shipmentList = shipmentList;
    }
    }