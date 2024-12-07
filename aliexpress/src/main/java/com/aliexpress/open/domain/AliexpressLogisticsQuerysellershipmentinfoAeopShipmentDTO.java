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

public class AliexpressLogisticsQuerysellershipmentinfoAeopShipmentDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** logisticsNo */
                @ApiField("logistics_no")
            private String logisticsNo;
        /** trackingWebSite */
                @ApiField("tracking_web_site")
            private String trackingWebSite;
        /** errorCode */
                @ApiField("error_code")
            private String errorCode;
        /** errorMsg */
                @ApiField("error_msg")
            private String errorMsg;
        /** serviceName */
                @ApiField("service_name")
            private String serviceName;
    
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
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
        public String getServiceName() {
    return this.serviceName;
    }
    public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
    }
    }