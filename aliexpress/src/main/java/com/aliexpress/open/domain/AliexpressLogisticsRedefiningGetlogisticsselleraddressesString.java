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

public class AliexpressLogisticsRedefiningGetlogisticsselleraddressesString implements Serializable {
    private static final long serialVersionUID = 1L;
        /** streetAddress */
                @ApiField("street_address")
            private String streetAddress;
        /** phone */
                @ApiField("phone")
            private String phone;
        /** fax */
                @ApiField("fax")
            private String fax;
        /** NeedToUpdate */
                @ApiField("need_to_update")
            private Boolean needToUpdate;
        /** street */
                @ApiField("street")
            private String street;
        /** memberType */
                @ApiField("member_type")
            private String memberType;
        /** postcode */
                @ApiField("postcode")
            private String postcode;
        /** addressId */
                @ApiField("address_id")
            private Long addressId;
        /** trademanageId */
                @ApiField("trademanage_id")
            private String trademanageId;
        /** country */
                @ApiField("country")
            private String country;
        /** city */
                @ApiField("city")
            private String city;
        /** isDefault */
                @ApiField("is_default")
            private Long isDefault;
        /** email */
                @ApiField("email")
            private String email;
        /** county */
                @ApiField("county")
            private String county;
        /** name */
                @ApiField("name")
            private String name;
        /** province */
                @ApiField("province")
            private String province;
        /** mobile */
                @ApiField("mobile")
            private String mobile;
        /** language */
                @ApiField("language")
            private String language;
    
        public String getStreetAddress() {
    return this.streetAddress;
    }
    public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    }
        public String getPhone() {
    return this.phone;
    }
    public void setPhone(String phone) {
    this.phone = phone;
    }
        public String getFax() {
    return this.fax;
    }
    public void setFax(String fax) {
    this.fax = fax;
    }
        public Boolean getNeedToUpdate() {
    return this.needToUpdate;
    }
    public void setNeedToUpdate(Boolean needToUpdate) {
    this.needToUpdate = needToUpdate;
    }
        public String getStreet() {
    return this.street;
    }
    public void setStreet(String street) {
    this.street = street;
    }
        public String getMemberType() {
    return this.memberType;
    }
    public void setMemberType(String memberType) {
    this.memberType = memberType;
    }
        public String getPostcode() {
    return this.postcode;
    }
    public void setPostcode(String postcode) {
    this.postcode = postcode;
    }
        public Long getAddressId() {
    return this.addressId;
    }
    public void setAddressId(Long addressId) {
    this.addressId = addressId;
    }
        public String getTrademanageId() {
    return this.trademanageId;
    }
    public void setTrademanageId(String trademanageId) {
    this.trademanageId = trademanageId;
    }
        public String getCountry() {
    return this.country;
    }
    public void setCountry(String country) {
    this.country = country;
    }
        public String getCity() {
    return this.city;
    }
    public void setCity(String city) {
    this.city = city;
    }
        public Long getIsDefault() {
    return this.isDefault;
    }
    public void setIsDefault(Long isDefault) {
    this.isDefault = isDefault;
    }
        public String getEmail() {
    return this.email;
    }
    public void setEmail(String email) {
    this.email = email;
    }
        public String getCounty() {
    return this.county;
    }
    public void setCounty(String county) {
    this.county = county;
    }
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
        public String getProvince() {
    return this.province;
    }
    public void setProvince(String province) {
    this.province = province;
    }
        public String getMobile() {
    return this.mobile;
    }
    public void setMobile(String mobile) {
    this.mobile = mobile;
    }
        public String getLanguage() {
    return this.language;
    }
    public void setLanguage(String language) {
    this.language = language;
    }
    }