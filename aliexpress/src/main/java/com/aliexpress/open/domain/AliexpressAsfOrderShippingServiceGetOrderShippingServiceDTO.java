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

public class AliexpressAsfOrderShippingServiceGetOrderShippingServiceDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** tradeOrderItemId */
                @ApiField("tradeOrderItemId")
            private String tradeOrderItemId;
        /** shipmentServiceCode */
                @ApiField("shipmentServiceCode")
            private String shipmentServiceCode;
        /** shipmentServiceName */
                @ApiField("shipmentServiceName")
            private String shipmentServiceName;
        /** shipmentServiceDeliveryMode */
                @ApiField("shipmentServiceDeliveryMode")
            private String shipmentServiceDeliveryMode;
    
        public String getTradeOrderItemId() {
    return this.tradeOrderItemId;
    }
    public void setTradeOrderItemId(String tradeOrderItemId) {
    this.tradeOrderItemId = tradeOrderItemId;
    }
        public String getShipmentServiceCode() {
    return this.shipmentServiceCode;
    }
    public void setShipmentServiceCode(String shipmentServiceCode) {
    this.shipmentServiceCode = shipmentServiceCode;
    }
        public String getShipmentServiceName() {
    return this.shipmentServiceName;
    }
    public void setShipmentServiceName(String shipmentServiceName) {
    this.shipmentServiceName = shipmentServiceName;
    }
        public String getShipmentServiceDeliveryMode() {
    return this.shipmentServiceDeliveryMode;
    }
    public void setShipmentServiceDeliveryMode(String shipmentServiceDeliveryMode) {
    this.shipmentServiceDeliveryMode = shipmentServiceDeliveryMode;
    }
    }