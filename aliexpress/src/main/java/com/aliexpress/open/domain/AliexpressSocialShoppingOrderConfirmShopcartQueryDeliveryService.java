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

public class AliexpressSocialShoppingOrderConfirmShopcartQueryDeliveryService implements Serializable {
    private static final long serialVersionUID = 1L;
        /** delivery amount */
                @ApiField("amount_cents")
            private Long amountCents;
        /** Max delivery days */
                @ApiField("max_delivery_days")
            private Integer maxDeliveryDays;
        /** Min delivery days */
                @ApiField("min_delivery_days")
            private Integer minDeliveryDays;
        /** Service display name */
                @ApiField("service_display_name")
            private String serviceDisplayName;
        /** Service name */
                @ApiField("service_name")
            private String serviceName;
    
        public Long getAmountCents() {
    return this.amountCents;
    }
    public void setAmountCents(Long amountCents) {
    this.amountCents = amountCents;
    }
        public Integer getMaxDeliveryDays() {
    return this.maxDeliveryDays;
    }
    public void setMaxDeliveryDays(Integer maxDeliveryDays) {
    this.maxDeliveryDays = maxDeliveryDays;
    }
        public Integer getMinDeliveryDays() {
    return this.minDeliveryDays;
    }
    public void setMinDeliveryDays(Integer minDeliveryDays) {
    this.minDeliveryDays = minDeliveryDays;
    }
        public String getServiceDisplayName() {
    return this.serviceDisplayName;
    }
    public void setServiceDisplayName(String serviceDisplayName) {
    this.serviceDisplayName = serviceDisplayName;
    }
        public String getServiceName() {
    return this.serviceName;
    }
    public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
    }
    }