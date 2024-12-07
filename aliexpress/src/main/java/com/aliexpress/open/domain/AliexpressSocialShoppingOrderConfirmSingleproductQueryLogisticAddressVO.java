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

public class AliexpressSocialShoppingOrderConfirmSingleproductQueryLogisticAddressVO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Address */
                @ApiField("address")
            private String address;
        /** City to deliver */
                @ApiField("city")
            private String city;
        /** _ */
                @ApiField("city_code")
            private String cityCode;
        /** Person to deliver the order to */
                @ApiField("contact_person")
            private String contactPerson;
        /** Country */
                @ApiField("country")
            private String country;
        /** Country code */
                @ApiField("country_name")
            private String countryName;
        /** _ */
                @ApiField("field_error_message_string")
            private String fieldErrorMessageString;
        /** _ */
                @ApiField("full_name")
            private String fullName;
        /** _ */
                @ApiField("id")
            private Long id;
        /** _ */
                @ApiField("is_default")
            private Boolean isDefault;
        /** Locale */
                @ApiField("locale")
            private String locale;
        /** _ */
                @ApiField("mobile_no")
            private String mobileNo;
        /** _ */
                @ApiField("phone_area")
            private String phoneArea;
        /** _ */
                @ApiField("phone_country")
            private String phoneCountry;
        /** _ */
                @ApiField("phone_number")
            private String phoneNumber;
        /** Area */
                @ApiField("province")
            private String province;
        /** _ */
                @ApiField("province_code")
            private String provinceCode;
        /** ZIP code */
                @ApiField("zip")
            private String zip;
    
        public String getAddress() {
    return this.address;
    }
    public void setAddress(String address) {
    this.address = address;
    }
        public String getCity() {
    return this.city;
    }
    public void setCity(String city) {
    this.city = city;
    }
        public String getCityCode() {
    return this.cityCode;
    }
    public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
    }
        public String getContactPerson() {
    return this.contactPerson;
    }
    public void setContactPerson(String contactPerson) {
    this.contactPerson = contactPerson;
    }
        public String getCountry() {
    return this.country;
    }
    public void setCountry(String country) {
    this.country = country;
    }
        public String getCountryName() {
    return this.countryName;
    }
    public void setCountryName(String countryName) {
    this.countryName = countryName;
    }
        public String getFieldErrorMessageString() {
    return this.fieldErrorMessageString;
    }
    public void setFieldErrorMessageString(String fieldErrorMessageString) {
    this.fieldErrorMessageString = fieldErrorMessageString;
    }
        public String getFullName() {
    return this.fullName;
    }
    public void setFullName(String fullName) {
    this.fullName = fullName;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public Boolean getIsDefault() {
    return this.isDefault;
    }
    public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    }
        public String getLocale() {
    return this.locale;
    }
    public void setLocale(String locale) {
    this.locale = locale;
    }
        public String getMobileNo() {
    return this.mobileNo;
    }
    public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    }
        public String getPhoneArea() {
    return this.phoneArea;
    }
    public void setPhoneArea(String phoneArea) {
    this.phoneArea = phoneArea;
    }
        public String getPhoneCountry() {
    return this.phoneCountry;
    }
    public void setPhoneCountry(String phoneCountry) {
    this.phoneCountry = phoneCountry;
    }
        public String getPhoneNumber() {
    return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    }
        public String getProvince() {
    return this.province;
    }
    public void setProvince(String province) {
    this.province = province;
    }
        public String getProvinceCode() {
    return this.provinceCode;
    }
    public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
    }
        public String getZip() {
    return this.zip;
    }
    public void setZip(String zip) {
    this.zip = zip;
    }
    }