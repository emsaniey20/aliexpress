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

public class AliexpressTradeDsOrderGetAeopStoreInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** store id */
                @ApiField("store_id")
            private Integer storeId;
        /** store name */
                @ApiField("store_name")
            private String storeName;
        /** store url */
                @ApiField("store_url")
            private String storeUrl;
    
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
        public String getStoreUrl() {
    return this.storeUrl;
    }
    public void setStoreUrl(String storeUrl) {
    this.storeUrl = storeUrl;
    }
    }