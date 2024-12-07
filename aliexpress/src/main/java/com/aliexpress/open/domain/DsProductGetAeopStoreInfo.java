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

public class DsProductGetAeopStoreInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 111 */
                @ApiField("item_as_descriped_rating")
            private String itemAsDescripedRating;
        /** 111 */
                @ApiField("communication_rating")
            private String communicationRating;
        /** 111 */
                @ApiField("shipping_speed_rating")
            private String shippingSpeedRating;
        /** 111 */
                @ApiField("store_id_long")
            private Long storeIdLong;
        /** 111 */
                @ApiField("store_name")
            private String storeName;
        /** 111 */
                @ApiField("store_id")
            private Integer storeId;
    
        public String getItemAsDescripedRating() {
    return this.itemAsDescripedRating;
    }
    public void setItemAsDescripedRating(String itemAsDescripedRating) {
    this.itemAsDescripedRating = itemAsDescripedRating;
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
        public Long getStoreIdLong() {
    return this.storeIdLong;
    }
    public void setStoreIdLong(Long storeIdLong) {
    this.storeIdLong = storeIdLong;
    }
        public String getStoreName() {
    return this.storeName;
    }
    public void setStoreName(String storeName) {
    this.storeName = storeName;
    }
        public Integer getStoreId() {
    return this.storeId;
    }
    public void setStoreId(Integer storeId) {
    this.storeId = storeId;
    }
    }