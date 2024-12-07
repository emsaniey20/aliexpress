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

public class AriseLogisticsShipmentProviderQueryShipmentProviderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 物流服务商名称 */
                @ApiField("shipment_provider_name")
            private String shipmentProviderName;
        /** 物流服务商编码 */
                @ApiField("shipment_provider_code")
            private String shipmentProviderCode;
    
        public String getShipmentProviderName() {
    return this.shipmentProviderName;
    }
    public void setShipmentProviderName(String shipmentProviderName) {
    this.shipmentProviderName = shipmentProviderName;
    }
        public String getShipmentProviderCode() {
    return this.shipmentProviderCode;
    }
    public void setShipmentProviderCode(String shipmentProviderCode) {
    this.shipmentProviderCode = shipmentProviderCode;
    }
    }