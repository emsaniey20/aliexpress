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

public class CainiaoGlobalPickupResourceRecommendPickupDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 揽收地址 */
                @ApiField("address")
            private CainiaoGlobalPickupResourceRecommendAddressDTO address;
        /** 地址id */
                @ApiField("address_id")
            private String addressId;
    
        public CainiaoGlobalPickupResourceRecommendAddressDTO getAddress() {
    return this.address;
    }
    public void setAddress(CainiaoGlobalPickupResourceRecommendAddressDTO address) {
    this.address = address;
    }
        public String getAddressId() {
    return this.addressId;
    }
    public void setAddressId(String addressId) {
    this.addressId = addressId;
    }
    }