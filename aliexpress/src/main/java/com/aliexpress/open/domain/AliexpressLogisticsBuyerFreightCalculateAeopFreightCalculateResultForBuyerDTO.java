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

public class AliexpressLogisticsBuyerFreightCalculateAeopFreightCalculateResultForBuyerDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** tracking available */
                @ApiField("tracking_available")
            private String trackingAvailable;
        /** errorCode */
                @ApiField("error_code")
            private Long errorCode;
        /** Estimated delivery time */
                @ApiField("estimated_delivery_time")
            private String estimatedDeliveryTime;
        /** freight */
                @ApiField("freight")
            private AliexpressLogisticsBuyerFreightCalculateMoney freight;
        /** serviceName */
                @ApiField("service_name")
            private String serviceName;
    
        public String getTrackingAvailable() {
    return this.trackingAvailable;
    }
    public void setTrackingAvailable(String trackingAvailable) {
    this.trackingAvailable = trackingAvailable;
    }
        public Long getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Long errorCode) {
    this.errorCode = errorCode;
    }
        public String getEstimatedDeliveryTime() {
    return this.estimatedDeliveryTime;
    }
    public void setEstimatedDeliveryTime(String estimatedDeliveryTime) {
    this.estimatedDeliveryTime = estimatedDeliveryTime;
    }
        public AliexpressLogisticsBuyerFreightCalculateMoney getFreight() {
    return this.freight;
    }
    public void setFreight(AliexpressLogisticsBuyerFreightCalculateMoney freight) {
    this.freight = freight;
    }
        public String getServiceName() {
    return this.serviceName;
    }
    public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
    }
    }