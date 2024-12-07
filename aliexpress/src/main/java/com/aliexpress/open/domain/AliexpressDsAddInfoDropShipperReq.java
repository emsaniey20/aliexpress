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

public class AliexpressDsAddInfoDropShipperReq implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Extended Information */
                @ApiField("extend_info")
            private HashMap<String, Object> extendInfo;
        /** shop address */
                @ApiField("store_url")
            private String storeUrl;
        /** user signature */
                @ApiField("app_signature")
            private String appSignature;
    
        public HashMap<String, Object> getExtendInfo() {
    return this.extendInfo;
    }
    public void setExtendInfo(HashMap<String, Object> extendInfo) {
    this.extendInfo = extendInfo;
    }
        public String getStoreUrl() {
    return this.storeUrl;
    }
    public void setStoreUrl(String storeUrl) {
    this.storeUrl = storeUrl;
    }
        public String getAppSignature() {
    return this.appSignature;
    }
    public void setAppSignature(String appSignature) {
    this.appSignature = appSignature;
    }
    }