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

public class CainiaoGlobalLogisticOrderCreateOpenAddressParam implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 最小区划地址库ID */
                @ApiField("division_id")
            private Long divisionId;
        /** 邮编 */
                @ApiField("zip_code")
            private String zipCode;
        /** 国家名称 */
                @ApiField("country_name")
            private String countryName;
        /** 省份 */
                @ApiField("province")
            private String province;
        /** 城市 */
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
        /** 国家二字码，CN：中国、RU：俄罗斯 */
                @ApiField("country_code")
            private String countryCode;
    
        public Long getDivisionId() {
    return this.divisionId;
    }
    public void setDivisionId(Long divisionId) {
    this.divisionId = divisionId;
    }
        public String getZipCode() {
    return this.zipCode;
    }
    public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
    }
        public String getCountryName() {
    return this.countryName;
    }
    public void setCountryName(String countryName) {
    this.countryName = countryName;
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
        public String getCountryCode() {
    return this.countryCode;
    }
    public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
    }
    }