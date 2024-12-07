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

public class AliexpressSocialShoppingOrderDetailsOrderProductDto implements Serializable {
    private static final long serialVersionUID = 1L;
        /** - */
                @ApiField("amount_cents")
            private Long amountCents;
        /** - */
                @ApiField("currency")
            private String currency;
        /** - */
                @ApiField("delivery_time_days")
            private String deliveryTimeDays;
        /** - */
                @ApiField("product_id")
            private String productId;
        /** - */
                @ApiField("product_img_url")
            private String productImgUrl;
        /** - */
                @ApiField("properties")
            private HashMap<String, Object> properties;
    
        public Long getAmountCents() {
    return this.amountCents;
    }
    public void setAmountCents(Long amountCents) {
    this.amountCents = amountCents;
    }
        public String getCurrency() {
    return this.currency;
    }
    public void setCurrency(String currency) {
    this.currency = currency;
    }
        public String getDeliveryTimeDays() {
    return this.deliveryTimeDays;
    }
    public void setDeliveryTimeDays(String deliveryTimeDays) {
    this.deliveryTimeDays = deliveryTimeDays;
    }
        public String getProductId() {
    return this.productId;
    }
    public void setProductId(String productId) {
    this.productId = productId;
    }
        public String getProductImgUrl() {
    return this.productImgUrl;
    }
    public void setProductImgUrl(String productImgUrl) {
    this.productImgUrl = productImgUrl;
    }
        public HashMap<String, Object> getProperties() {
    return this.properties;
    }
    public void setProperties(HashMap<String, Object> properties) {
    this.properties = properties;
    }
    }