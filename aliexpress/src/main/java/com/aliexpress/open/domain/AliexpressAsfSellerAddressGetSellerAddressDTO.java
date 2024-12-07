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

public class AliexpressAsfSellerAddressGetSellerAddressDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** addressId */
                @ApiField("addressId")
            private Long addressId;
        /** city */
                @ApiField("city")
            private String city;
        /** country */
                @ApiField("country")
            private String country;
        /** province */
                @ApiField("province")
            private String province;
        /** defaultAddress */
                @ApiField("defaultAddress")
            private Boolean defaultAddress;
        /** memberType */
                @ApiField("memberType")
            private String memberType;
        /** name */
                @ApiField("name")
            private String name;
        /** phone */
                @ApiField("phone")
            private String phone;
        /** postCode */
                @ApiField("postCode")
            private String postCode;
        /** email */
                @ApiField("email")
            private String email;
        /** streetAddress */
                @ApiField("streetAddress")
            private String streetAddress;
    
        public Long getAddressId() {
    return this.addressId;
    }
    public void setAddressId(Long addressId) {
    this.addressId = addressId;
    }
        public String getCity() {
    return this.city;
    }
    public void setCity(String city) {
    this.city = city;
    }
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
        public Boolean getDefaultAddress() {
    return this.defaultAddress;
    }
    public void setDefaultAddress(Boolean defaultAddress) {
    this.defaultAddress = defaultAddress;
    }
        public String getMemberType() {
    return this.memberType;
    }
    public void setMemberType(String memberType) {
    this.memberType = memberType;
    }
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
        public String getPhone() {
    return this.phone;
    }
    public void setPhone(String phone) {
    this.phone = phone;
    }
        public String getPostCode() {
    return this.postCode;
    }
    public void setPostCode(String postCode) {
    this.postCode = postCode;
    }
        public String getEmail() {
    return this.email;
    }
    public void setEmail(String email) {
    this.email = email;
    }
        public String getStreetAddress() {
    return this.streetAddress;
    }
    public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    }
    }