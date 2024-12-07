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

public class AliexpressSocialShoppingOrderDetailsPackageInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** status */
                @ApiField("current_status_description")
            private String currentStatusDescription;
        /** max expected delivery time */
                @ApiField("max_expected_delivery_time")
            private String maxExpectedDeliveryTime;
        /** sent time */
                @ApiField("sent_time_epoch")
            private Long sentTimeEpoch;
        /** status code */
                @ApiField("status_code")
            private Integer statusCode;
        /** tracking number */
                @ApiField("tracking_code")
            private String trackingCode;
        /** tracking url */
                @ApiField("tracking_url")
            private String trackingUrl;
    
        public String getCurrentStatusDescription() {
    return this.currentStatusDescription;
    }
    public void setCurrentStatusDescription(String currentStatusDescription) {
    this.currentStatusDescription = currentStatusDescription;
    }
        public String getMaxExpectedDeliveryTime() {
    return this.maxExpectedDeliveryTime;
    }
    public void setMaxExpectedDeliveryTime(String maxExpectedDeliveryTime) {
    this.maxExpectedDeliveryTime = maxExpectedDeliveryTime;
    }
        public Long getSentTimeEpoch() {
    return this.sentTimeEpoch;
    }
    public void setSentTimeEpoch(Long sentTimeEpoch) {
    this.sentTimeEpoch = sentTimeEpoch;
    }
        public Integer getStatusCode() {
    return this.statusCode;
    }
    public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
    }
        public String getTrackingCode() {
    return this.trackingCode;
    }
    public void setTrackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
    }
        public String getTrackingUrl() {
    return this.trackingUrl;
    }
    public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    }
    }