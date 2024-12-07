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

public class AliexpressLogisticsLocalListlogisticsserviceLogisticsSolutionDO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** recommendOrder */
                @ApiField("recommend_order")
            private String recommendOrder;
        /** countryCode */
                @ApiField("country_code")
            private String countryCode;
        /** trackingNumberRegex */
                @ApiField("tracking_no_regex")
            private String trackingNoRegex;
        /** maxProcessDay */
                @ApiField("max_process_day")
            private Integer maxProcessDay;
        /** serviceName */
                @ApiField("service_name")
            private String serviceName;
        /** countryName */
                @ApiField("country_name")
            private String countryName;
        /** logisticsCompany */
                @ApiField("logistics_company")
            private String logisticsCompany;
        /** minProcessDay */
                @ApiField("min_process_day")
            private Integer minProcessDay;
        /** displayName */
                @ApiField("display_name")
            private String displayName;
    
        public String getRecommendOrder() {
    return this.recommendOrder;
    }
    public void setRecommendOrder(String recommendOrder) {
    this.recommendOrder = recommendOrder;
    }
        public String getCountryCode() {
    return this.countryCode;
    }
    public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
    }
        public String getTrackingNoRegex() {
    return this.trackingNoRegex;
    }
    public void setTrackingNoRegex(String trackingNoRegex) {
    this.trackingNoRegex = trackingNoRegex;
    }
        public Integer getMaxProcessDay() {
    return this.maxProcessDay;
    }
    public void setMaxProcessDay(Integer maxProcessDay) {
    this.maxProcessDay = maxProcessDay;
    }
        public String getServiceName() {
    return this.serviceName;
    }
    public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
    }
        public String getCountryName() {
    return this.countryName;
    }
    public void setCountryName(String countryName) {
    this.countryName = countryName;
    }
        public String getLogisticsCompany() {
    return this.logisticsCompany;
    }
    public void setLogisticsCompany(String logisticsCompany) {
    this.logisticsCompany = logisticsCompany;
    }
        public Integer getMinProcessDay() {
    return this.minProcessDay;
    }
    public void setMinProcessDay(Integer minProcessDay) {
    this.minProcessDay = minProcessDay;
    }
        public String getDisplayName() {
    return this.displayName;
    }
    public void setDisplayName(String displayName) {
    this.displayName = displayName;
    }
    }