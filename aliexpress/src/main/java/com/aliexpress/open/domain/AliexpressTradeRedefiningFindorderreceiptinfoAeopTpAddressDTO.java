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

public class AliexpressTradeRedefiningFindorderreceiptinfoAeopTpAddressDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 加密OAID */
                @ApiField("oaid")
            private String oaid;
        /** 传真区号 */
                @ApiField("fax_area")
            private String faxArea;
        /** 邮编 */
                @ApiField("zip")
            private String zip;
        /** 传真国家/地区码 */
                @ApiField("fax_country")
            private String faxCountry;
        /** 地址2 */
                @ApiField("address2")
            private String address2;
        /** 国家/地区编码 */
                @ApiField("country")
            private String country;
        /** 城市 */
                @ApiField("city")
            private String city;
        /** 街道详细地址 */
                @ApiField("detail_address")
            private String detailAddress;
        /** 传真号 */
                @ApiField("fax_number")
            private String faxNumber;
        /** 电话 */
                @ApiField("phone_number")
            private String phoneNumber;
        /** 地址1 */
                @ApiField("address")
            private String address;
        /** 省份 */
                @ApiField("province")
            private String province;
        /** 区号 */
                @ApiField("phone_area")
            private String phoneArea;
        /** 国家/地区码 */
                @ApiField("phone_country")
            private String phoneCountry;
        /** 收件人 */
                @ApiField("contact_person")
            private String contactPerson;
        /** 手机 */
                @ApiField("mobile_no")
            private String mobileNo;
        /** 国家/地区全称 */
                @ApiField("country_name")
            private String countryName;
        /** 个人税号 */
                @ApiField("cpf_no")
            private String cpfNo;
    
        public String getOaid() {
    return this.oaid;
    }
    public void setOaid(String oaid) {
    this.oaid = oaid;
    }
        public String getFaxArea() {
    return this.faxArea;
    }
    public void setFaxArea(String faxArea) {
    this.faxArea = faxArea;
    }
        public String getZip() {
    return this.zip;
    }
    public void setZip(String zip) {
    this.zip = zip;
    }
        public String getFaxCountry() {
    return this.faxCountry;
    }
    public void setFaxCountry(String faxCountry) {
    this.faxCountry = faxCountry;
    }
        public String getAddress2() {
    return this.address2;
    }
    public void setAddress2(String address2) {
    this.address2 = address2;
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
        public String getDetailAddress() {
    return this.detailAddress;
    }
    public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
    }
        public String getFaxNumber() {
    return this.faxNumber;
    }
    public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    }
        public String getPhoneNumber() {
    return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    }
        public String getAddress() {
    return this.address;
    }
    public void setAddress(String address) {
    this.address = address;
    }
        public String getProvince() {
    return this.province;
    }
    public void setProvince(String province) {
    this.province = province;
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
        public String getContactPerson() {
    return this.contactPerson;
    }
    public void setContactPerson(String contactPerson) {
    this.contactPerson = contactPerson;
    }
        public String getMobileNo() {
    return this.mobileNo;
    }
    public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    }
        public String getCountryName() {
    return this.countryName;
    }
    public void setCountryName(String countryName) {
    this.countryName = countryName;
    }
        public String getCpfNo() {
    return this.cpfNo;
    }
    public void setCpfNo(String cpfNo) {
    this.cpfNo = cpfNo;
    }
    }