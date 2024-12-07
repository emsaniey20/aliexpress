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

public class AliexpressSolutionOrderInfoGetcopy1692615547969GlobalAeopTpAddressDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Fax area code */
                @ApiField("fax_area")
            private String faxArea;
        /** Postal code */
                @ApiField("zip")
            private String zip;
        /** Fax country/region code */
                @ApiField("fax_country")
            private String faxCountry;
        /** address 2 */
                @ApiField("address2")
            private String address2;
        /** detail address */
                @ApiField("detail_address")
            private String detailAddress;
        /** country/region */
                @ApiField("country")
            private String country;
        /** city */
                @ApiField("city")
            private String city;
        /** fax number */
                @ApiField("fax_number")
            private String faxNumber;
        /** phone number */
                @ApiField("phone_number")
            private String phoneNumber;
        /** address 1 */
                @ApiField("address")
            private String address;
        /** province */
                @ApiField("province")
            private String province;
        /** Phone area code */
                @ApiField("phone_area")
            private String phoneArea;
        /** Phone country/region code */
                @ApiField("phone_country")
            private String phoneCountry;
        /** Recipient */
                @ApiField("contact_person")
            private String contactPerson;
        /** mobile phone number */
                @ApiField("mobile_no")
            private String mobileNo;
        /** localized address, currently only used in Russia */
                @ApiField("localized_address")
            private String localizedAddress;
    
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
        public String getDetailAddress() {
    return this.detailAddress;
    }
    public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
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
        public String getLocalizedAddress() {
    return this.localizedAddress;
    }
    public void setLocalizedAddress(String localizedAddress) {
    this.localizedAddress = localizedAddress;
    }
    }