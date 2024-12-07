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

public class AliexpressDsProductGetAeStoreInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Product description, 1-5 stars */
                @ApiField("item_as_described_rating")
            private String itemAsDescribedRating;
        /** Seller service, 1-5 stars */
                @ApiField("communication_rating")
            private String communicationRating;
        /** Logistics, 1-5 stars */
                @ApiField("shipping_speed_rating")
            private String shippingSpeedRating;
        /** Shop name */
                @ApiField("store_name")
            private String storeName;
        /** Store ID */
                @ApiField("store_id")
            private Long storeId;
        /** store country code, can be used as 'ship from' country of the sku */
                @ApiField("store_country_code")
            private String storeCountryCode;
    
        public String getItemAsDescribedRating() {
    return this.itemAsDescribedRating;
    }
    public void setItemAsDescribedRating(String itemAsDescribedRating) {
    this.itemAsDescribedRating = itemAsDescribedRating;
    }
        public String getCommunicationRating() {
    return this.communicationRating;
    }
    public void setCommunicationRating(String communicationRating) {
    this.communicationRating = communicationRating;
    }
        public String getShippingSpeedRating() {
    return this.shippingSpeedRating;
    }
    public void setShippingSpeedRating(String shippingSpeedRating) {
    this.shippingSpeedRating = shippingSpeedRating;
    }
        public String getStoreName() {
    return this.storeName;
    }
    public void setStoreName(String storeName) {
    this.storeName = storeName;
    }
        public Long getStoreId() {
    return this.storeId;
    }
    public void setStoreId(Long storeId) {
    this.storeId = storeId;
    }
        public String getStoreCountryCode() {
    return this.storeCountryCode;
    }
    public void setStoreCountryCode(String storeCountryCode) {
    this.storeCountryCode = storeCountryCode;
    }
    }