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

public class AliexpressLogisticsOrderModifyshipmentAeopShipmentDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** New logistics id */
                @ApiField("logistics_no")
            private String logisticsNo;
        /** tracking site */
                @ApiField("tracking_web_site")
            private String trackingWebSite;
        /** logistics service */
                @ApiField("service_name")
            private String serviceName;
        /** service_name是other时需要的实际承运商 */
                @ApiField("actual_carrier")
            private String actualCarrier;
        /** 合单的时候传 consolidation */
                @ApiField("package_type")
            private String packageType;
    
        public String getLogisticsNo() {
    return this.logisticsNo;
    }
    public void setLogisticsNo(String logisticsNo) {
    this.logisticsNo = logisticsNo;
    }
        public String getTrackingWebSite() {
    return this.trackingWebSite;
    }
    public void setTrackingWebSite(String trackingWebSite) {
    this.trackingWebSite = trackingWebSite;
    }
        public String getServiceName() {
    return this.serviceName;
    }
    public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
    }
        public String getActualCarrier() {
    return this.actualCarrier;
    }
    public void setActualCarrier(String actualCarrier) {
    this.actualCarrier = actualCarrier;
    }
        public String getPackageType() {
    return this.packageType;
    }
    public void setPackageType(String packageType) {
    this.packageType = packageType;
    }
    }