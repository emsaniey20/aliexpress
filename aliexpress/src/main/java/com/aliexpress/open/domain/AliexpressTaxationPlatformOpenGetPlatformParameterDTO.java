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

public class AliexpressTaxationPlatformOpenGetPlatformParameterDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 发货人/平台公司名称 */
                @ApiField("company_name")
            private String companyName;
        /** 发货人/平台联系人姓名 */
                @ApiField("contactor_name")
            private String contactorName;
        /** 发货人/平台国家 */
                @ApiField("country")
            private String country;
        /** 发货人/平台详细地址 */
                @ApiField("address")
            private String address;
        /** 发货人/平台城市 */
                @ApiField("city")
            private String city;
        /** ISO国家编码 */
                @ApiField("country_code")
            private String countryCode;
        /** 发货人/平台电话 */
                @ApiField("contact_number")
            private String contactNumber;
        /** 发货人/平台邮箱 */
                @ApiField("email_address")
            private String emailAddress;
        /** IOSS 平台税号 */
                @ApiField("ioss_number")
            private String iossNumber;
    
        public String getCompanyName() {
    return this.companyName;
    }
    public void setCompanyName(String companyName) {
    this.companyName = companyName;
    }
        public String getContactorName() {
    return this.contactorName;
    }
    public void setContactorName(String contactorName) {
    this.contactorName = contactorName;
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
        public String getCountryCode() {
    return this.countryCode;
    }
    public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
    }
        public String getContactNumber() {
    return this.contactNumber;
    }
    public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
    }
        public String getEmailAddress() {
    return this.emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    }
        public String getIossNumber() {
    return this.iossNumber;
    }
    public void setIossNumber(String iossNumber) {
    this.iossNumber = iossNumber;
    }
    }