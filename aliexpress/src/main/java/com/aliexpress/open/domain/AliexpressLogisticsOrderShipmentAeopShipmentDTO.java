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

public class AliexpressLogisticsOrderShipmentAeopShipmentDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 运单号 */
                @ApiField("logistics_no")
            private String logisticsNo;
        /** 物流方案编码 */
                @ApiField("service_name")
            private String serviceName;
        /** 运单号轨迹查询地址-物流方案为自定义(OTHER开头)的时候必填 */
                @ApiField("tracking_web_site")
            private String trackingWebSite;
        /** 实际承运商-物流方案为自定义(OTHER开头)的时候必填 */
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
        public String getServiceName() {
    return this.serviceName;
    }
    public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
    }
        public String getTrackingWebSite() {
    return this.trackingWebSite;
    }
    public void setTrackingWebSite(String trackingWebSite) {
    this.trackingWebSite = trackingWebSite;
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