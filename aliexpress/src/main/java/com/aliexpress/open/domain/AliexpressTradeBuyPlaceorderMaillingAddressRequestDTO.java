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

public class AliexpressTradeBuyPlaceorderMaillingAddressRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** address information */
                @ApiField("address")
            private String address;
        /** address extension information */
                @ApiField("address2")
            private String address2;
        /** city */
                @ApiField("city")
            private String city;
        /** contact person */
                @ApiField("contact_person")
            private String contactPerson;
        /** receiver country */
                @ApiField("country")
            private String country;
        /** taxpayer identification number */
                @ApiField("cpf")
            private String cpf;
        /** receiver full name */
                @ApiField("full_name")
            private String fullName;
        /** internationalization locale */
                @ApiField("locale")
            private String locale;
        /** mobile phone number */
                @ApiField("mobile_no")
            private String mobileNo;
        /** passport number */
                @ApiField("passport_no")
            private String passportNo;
        /** passport expiry date */
                @ApiField("passport_no_date")
            private String passportNoDate;
        /** passport issuing agency */
                @ApiField("passport_organization")
            private String passportOrganization;
        /** country code of the phone */
                @ApiField("phone_country")
            private String phoneCountry;
        /** province */
                @ApiField("province")
            private String province;
        /** tax number */
                @ApiField("tax_number")
            private String taxNumber;
        /** zip code */
                @ApiField("zip")
            private String zip;
        /** Chile tax number (not used) */
                @ApiField("rut_no")
            private String rutNo;
        /** foreign tax number (registration card number or passport number is required for Korean foreigners) */
                @ApiField("foreigner_passport_no")
            private String foreignerPassportNo;
        /** whether it is a foreigner */
                @ApiField("is_foreigner")
            private String isForeigner;
        /** vat tax number */
                @ApiField("vat_no")
            private String vatNo;
        /** company name */
                @ApiField("tax_company")
            private String taxCompany;
        /** location tree address id */
                @ApiField("location_tree_address_id")
            private String locationTreeAddressId;
    
        public String getAddress() {
    return this.address;
    }
    public void setAddress(String address) {
    this.address = address;
    }
        public String getAddress2() {
    return this.address2;
    }
    public void setAddress2(String address2) {
    this.address2 = address2;
    }
        public String getCity() {
    return this.city;
    }
    public void setCity(String city) {
    this.city = city;
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
        public String getCpf() {
    return this.cpf;
    }
    public void setCpf(String cpf) {
    this.cpf = cpf;
    }
        public String getFullName() {
    return this.fullName;
    }
    public void setFullName(String fullName) {
    this.fullName = fullName;
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
        public String getPassportNo() {
    return this.passportNo;
    }
    public void setPassportNo(String passportNo) {
    this.passportNo = passportNo;
    }
        public String getPassportNoDate() {
    return this.passportNoDate;
    }
    public void setPassportNoDate(String passportNoDate) {
    this.passportNoDate = passportNoDate;
    }
        public String getPassportOrganization() {
    return this.passportOrganization;
    }
    public void setPassportOrganization(String passportOrganization) {
    this.passportOrganization = passportOrganization;
    }
        public String getPhoneCountry() {
    return this.phoneCountry;
    }
    public void setPhoneCountry(String phoneCountry) {
    this.phoneCountry = phoneCountry;
    }
        public String getProvince() {
    return this.province;
    }
    public void setProvince(String province) {
    this.province = province;
    }
        public String getTaxNumber() {
    return this.taxNumber;
    }
    public void setTaxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
    }
        public String getZip() {
    return this.zip;
    }
    public void setZip(String zip) {
    this.zip = zip;
    }
        public String getRutNo() {
    return this.rutNo;
    }
    public void setRutNo(String rutNo) {
    this.rutNo = rutNo;
    }
        public String getForeignerPassportNo() {
    return this.foreignerPassportNo;
    }
    public void setForeignerPassportNo(String foreignerPassportNo) {
    this.foreignerPassportNo = foreignerPassportNo;
    }
        public String getIsForeigner() {
    return this.isForeigner;
    }
    public void setIsForeigner(String isForeigner) {
    this.isForeigner = isForeigner;
    }
        public String getVatNo() {
    return this.vatNo;
    }
    public void setVatNo(String vatNo) {
    this.vatNo = vatNo;
    }
        public String getTaxCompany() {
    return this.taxCompany;
    }
    public void setTaxCompany(String taxCompany) {
    this.taxCompany = taxCompany;
    }
        public String getLocationTreeAddressId() {
    return this.locationTreeAddressId;
    }
    public void setLocationTreeAddressId(String locationTreeAddressId) {
    this.locationTreeAddressId = locationTreeAddressId;
    }
    }