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

public class AliexpressPostproductRedefiningFindaeproductbyidfordropshipperAeopStoreInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 卖家服务，1-5星 */
                @ApiField("communication_rating")
            private String communicationRating;
        /** 商品描述，1-5星 */
                @ApiField("item_as_descriped_rating")
            private String itemAsDescripedRating;
        /** 物流，1-5星 */
                @ApiField("shipping_speed_rating")
            private String shippingSpeedRating;
        /** 店铺ID */
                @ApiField("store_id")
            private Integer storeId;
        /** 店铺名 */
                @ApiField("store_name")
            private String storeName;
    
        public String getCommunicationRating() {
    return this.communicationRating;
    }
    public void setCommunicationRating(String communicationRating) {
    this.communicationRating = communicationRating;
    }
        public String getItemAsDescripedRating() {
    return this.itemAsDescripedRating;
    }
    public void setItemAsDescripedRating(String itemAsDescripedRating) {
    this.itemAsDescripedRating = itemAsDescripedRating;
    }
        public String getShippingSpeedRating() {
    return this.shippingSpeedRating;
    }
    public void setShippingSpeedRating(String shippingSpeedRating) {
    this.shippingSpeedRating = shippingSpeedRating;
    }
        public Integer getStoreId() {
    return this.storeId;
    }
    public void setStoreId(Integer storeId) {
    this.storeId = storeId;
    }
        public String getStoreName() {
    return this.storeName;
    }
    public void setStoreName(String storeName) {
    this.storeName = storeName;
    }
    }