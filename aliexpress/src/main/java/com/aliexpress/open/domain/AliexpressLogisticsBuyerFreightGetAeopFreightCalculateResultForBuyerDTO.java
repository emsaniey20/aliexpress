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

public class AliexpressLogisticsBuyerFreightGetAeopFreightCalculateResultForBuyerDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 预估运达时效 */
                @ApiField("estimated_delivery_time")
            private String estimatedDeliveryTime;
        /** 物流方式 */
                @ApiField("shipping_method")
            private String shippingMethod;
        /** 运费对象 */
                @ApiField("freight")
            private AliexpressLogisticsBuyerFreightGetMoney freight;
        /** 错误吗 */
                @ApiField("error_code")
            private Long errorCode;
        /** 是否可tracking */
                @ApiField("tracking_available")
            private Boolean trackingAvailable;
        /** 线路服务名称 */
                @ApiField("service_name")
            private String serviceName;
    
        public String getEstimatedDeliveryTime() {
    return this.estimatedDeliveryTime;
    }
    public void setEstimatedDeliveryTime(String estimatedDeliveryTime) {
    this.estimatedDeliveryTime = estimatedDeliveryTime;
    }
        public String getShippingMethod() {
    return this.shippingMethod;
    }
    public void setShippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
    }
        public AliexpressLogisticsBuyerFreightGetMoney getFreight() {
    return this.freight;
    }
    public void setFreight(AliexpressLogisticsBuyerFreightGetMoney freight) {
    this.freight = freight;
    }
        public Long getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Long errorCode) {
    this.errorCode = errorCode;
    }
        public Boolean getTrackingAvailable() {
    return this.trackingAvailable;
    }
    public void setTrackingAvailable(Boolean trackingAvailable) {
    this.trackingAvailable = trackingAvailable;
    }
        public String getServiceName() {
    return this.serviceName;
    }
    public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
    }
    }