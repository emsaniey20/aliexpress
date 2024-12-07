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

public class AriseLogisticsShipmentUpdatePackageUpdateDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 包裹单号 */
                @ApiField("package_id")
            private String packageId;
        /** 物流服务商编码 */
                @ApiField("shipment_provider_code")
            private String shipmentProviderCode;
        /** 运单号 */
                @ApiField("tracking_number")
            private String trackingNumber;
    
        public String getPackageId() {
    return this.packageId;
    }
    public void setPackageId(String packageId) {
    this.packageId = packageId;
    }
        public String getShipmentProviderCode() {
    return this.shipmentProviderCode;
    }
    public void setShipmentProviderCode(String shipmentProviderCode) {
    this.shipmentProviderCode = shipmentProviderCode;
    }
        public String getTrackingNumber() {
    return this.trackingNumber;
    }
    public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    }
    }