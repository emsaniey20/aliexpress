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

public class AliexpressSolutionOrderDeliveryInfoGetOrderAddressDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** zip code */
                @ApiField("zip")
            private String zip;
        /** passport no */
                @ApiField("passport_no")
            private String passportNo;
        /** passport issued authority */
                @ApiField("passport_issue_authority")
            private String passportIssueAuthority;
        /** birtyday in passport */
                @ApiField("passport_birthday")
            private String passportBirthday;
        /** country code of buyer */
                @ApiField("country")
            private String country;
        /** address */
                @ApiField("address")
            private String address;
        /** city */
                @ApiField("city")
            private String city;
        /** supplementary of address or detailAddress */
                @ApiField("address2")
            private String address2;
        /** contact person */
                @ApiField("contact_person")
            private String contactPerson;
        /** tax number */
                @ApiField("tax_number")
            private String taxNumber;
        /** mobile no */
                @ApiField("mobile_no")
            private String mobileNo;
        /** phone country */
                @ApiField("phone_country")
            private String phoneCountry;
        /** phone number */
                @ApiField("phone_number")
            private String phoneNumber;
        /** province */
                @ApiField("province")
            private String province;
        /** passport first name */
                @ApiField("passport_first_name")
            private String passportFirstName;
        /** passport middle name */
                @ApiField("passport_last_name")
            private String passportLastName;
        /** detail address */
                @ApiField("detail_address")
            private String detailAddress;
        /** phone area */
                @ApiField("phone_area")
            private String phoneArea;
        /** passport middle name */
                @ApiField("passport_middle_name")
            private String passportMiddleName;
        /** passport issue date */
                @ApiField("passport_issue_date")
            private String passportIssueDate;
        /** country full name */
                @ApiField("country_name")
            private String countryName;
    
        public String getZip() {
    return this.zip;
    }
    public void setZip(String zip) {
    this.zip = zip;
    }
        public String getPassportNo() {
    return this.passportNo;
    }
    public void setPassportNo(String passportNo) {
    this.passportNo = passportNo;
    }
        public String getPassportIssueAuthority() {
    return this.passportIssueAuthority;
    }
    public void setPassportIssueAuthority(String passportIssueAuthority) {
    this.passportIssueAuthority = passportIssueAuthority;
    }
        public String getPassportBirthday() {
    return this.passportBirthday;
    }
    public void setPassportBirthday(String passportBirthday) {
    this.passportBirthday = passportBirthday;
    }
        public String getCountry() {
    return this.country;
    }
    public void setCountry(String country) {
    this.country = country;
    }
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
        public String getAddress2() {
    return this.address2;
    }
    public void setAddress2(String address2) {
    this.address2 = address2;
    }
        public String getContactPerson() {
    return this.contactPerson;
    }
    public void setContactPerson(String contactPerson) {
    this.contactPerson = contactPerson;
    }
        public String getTaxNumber() {
    return this.taxNumber;
    }
    public void setTaxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
    }
        public String getMobileNo() {
    return this.mobileNo;
    }
    public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
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
        public String getPassportFirstName() {
    return this.passportFirstName;
    }
    public void setPassportFirstName(String passportFirstName) {
    this.passportFirstName = passportFirstName;
    }
        public String getPassportLastName() {
    return this.passportLastName;
    }
    public void setPassportLastName(String passportLastName) {
    this.passportLastName = passportLastName;
    }
        public String getDetailAddress() {
    return this.detailAddress;
    }
    public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
    }
        public String getPhoneArea() {
    return this.phoneArea;
    }
    public void setPhoneArea(String phoneArea) {
    this.phoneArea = phoneArea;
    }
        public String getPassportMiddleName() {
    return this.passportMiddleName;
    }
    public void setPassportMiddleName(String passportMiddleName) {
    this.passportMiddleName = passportMiddleName;
    }
        public String getPassportIssueDate() {
    return this.passportIssueDate;
    }
    public void setPassportIssueDate(String passportIssueDate) {
    this.passportIssueDate = passportIssueDate;
    }
        public String getCountryName() {
    return this.countryName;
    }
    public void setCountryName(String countryName) {
    this.countryName = countryName;
    }
    }