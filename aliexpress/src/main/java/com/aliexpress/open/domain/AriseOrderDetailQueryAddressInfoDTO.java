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

public class AriseOrderDetailQueryAddressInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 买家地址国家缩写 */
                @ApiField("country_code")
            private String countryCode;
        /** 买家地址国家名 */
                @ApiField("country_name")
            private String countryName;
        /** 买家地址邮编 */
                @ApiField("postcode")
            private String postcode;
        /** 买家地址所在城市 */
                @ApiField("city")
            private String city;
        /** 买家地址所在州 */
                @ApiField("state")
            private String state;
        /** 买家的详细地址，对应Street和Unit */
                @ApiField("detail_address")
            private String detailAddress;
        /** 买家地址的额外信息 */
                @ApiField("extend_address")
            private String extendAddress;
    
        public String getCountryCode() {
    return this.countryCode;
    }
    public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
    }
        public String getCountryName() {
    return this.countryName;
    }
    public void setCountryName(String countryName) {
    this.countryName = countryName;
    }
        public String getPostcode() {
    return this.postcode;
    }
    public void setPostcode(String postcode) {
    this.postcode = postcode;
    }
        public String getCity() {
    return this.city;
    }
    public void setCity(String city) {
    this.city = city;
    }
        public String getState() {
    return this.state;
    }
    public void setState(String state) {
    this.state = state;
    }
        public String getDetailAddress() {
    return this.detailAddress;
    }
    public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
    }
        public String getExtendAddress() {
    return this.extendAddress;
    }
    public void setExtendAddress(String extendAddress) {
    this.extendAddress = extendAddress;
    }
    }