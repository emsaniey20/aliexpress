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

public class AliexpressLogisticsRedefiningListlogisticsserviceAeopLogisticsServiceResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 推荐显示排序 */
                @ApiField("recommend_order")
            private Long recommendOrder;
        /** 物流追踪号码校验规则，采用正则表达 */
                @ApiField("tracking_no_regex")
            private String trackingNoRegex;
        /** 最小处理时间 */
                @ApiField("min_process_day")
            private Long minProcessDay;
        /** 物流公司 */
                @ApiField("logistics_company")
            private String logisticsCompany;
        /** 最大处理时间 */
                @ApiField("max_process_day")
            private Long maxProcessDay;
        /** 展示名称 */
                @ApiField("display_name")
            private String displayName;
        /** 物流服务key */
                @ApiField("service_name")
            private String serviceName;
    
        public Long getRecommendOrder() {
    return this.recommendOrder;
    }
    public void setRecommendOrder(Long recommendOrder) {
    this.recommendOrder = recommendOrder;
    }
        public String getTrackingNoRegex() {
    return this.trackingNoRegex;
    }
    public void setTrackingNoRegex(String trackingNoRegex) {
    this.trackingNoRegex = trackingNoRegex;
    }
        public Long getMinProcessDay() {
    return this.minProcessDay;
    }
    public void setMinProcessDay(Long minProcessDay) {
    this.minProcessDay = minProcessDay;
    }
        public String getLogisticsCompany() {
    return this.logisticsCompany;
    }
    public void setLogisticsCompany(String logisticsCompany) {
    this.logisticsCompany = logisticsCompany;
    }
        public Long getMaxProcessDay() {
    return this.maxProcessDay;
    }
    public void setMaxProcessDay(Long maxProcessDay) {
    this.maxProcessDay = maxProcessDay;
    }
        public String getDisplayName() {
    return this.displayName;
    }
    public void setDisplayName(String displayName) {
    this.displayName = displayName;
    }
        public String getServiceName() {
    return this.serviceName;
    }
    public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
    }
    }