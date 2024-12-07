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

public class CainiaoGlobalPickupResourceRecommendAddressDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 国家 */
                @ApiField("country")
            private String country;
        /** 省 */
                @ApiField("province")
            private String province;
        /** 市 */
                @ApiField("city")
            private String city;
        /** 区 */
                @ApiField("district")
            private String district;
        /** 街道 */
                @ApiField("street")
            private String street;
        /** 详细地址 */
                @ApiField("detail_address")
            private String detailAddress;
    
        public String getCountry() {
    return this.country;
    }
    public void setCountry(String country) {
    this.country = country;
    }
        public String getProvince() {
    return this.province;
    }
    public void setProvince(String province) {
    this.province = province;
    }
        public String getCity() {
    return this.city;
    }
    public void setCity(String city) {
    this.city = city;
    }
        public String getDistrict() {
    return this.district;
    }
    public void setDistrict(String district) {
    this.district = district;
    }
        public String getStreet() {
    return this.street;
    }
    public void setStreet(String street) {
    this.street = street;
    }
        public String getDetailAddress() {
    return this.detailAddress;
    }
    public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
    }
    }