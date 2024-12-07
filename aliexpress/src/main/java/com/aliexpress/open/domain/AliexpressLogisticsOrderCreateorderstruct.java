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

public class AliexpressLogisticsOrderCreateorderstruct implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 电话 */
                @ApiField("phone")
            private String phone;
        /** 传真 */
                @ApiField("fax")
            private String fax;
        /** 类型 */
                @ApiField("member_type")
            private String memberType;
        /** 旺旺 */
                @ApiField("trademanage_id")
            private String trademanageId;
        /** 邮编 */
                @ApiField("post_code")
            private String postCode;
        /** 街道 */
                @ApiField("street")
            private String street;
        /** 国家 */
                @ApiField("country")
            private String country;
        /** 城市 */
                @ApiField("city")
            private String city;
        /** 区 */
                @ApiField("county")
            private String county;
        /** 邮箱 */
                @ApiField("email")
            private String email;
        /** 卖家后台地址id,用来获取卖家详细地址信息，传入值为Long型；传入addressId后，其余字段值无效。 */
                @ApiField("address_id")
            private Long addressId;
        /** 姓名 */
                @ApiField("name")
            private String name;
        /** 省份 */
                @ApiField("province")
            private String province;
        /** 详细地址 */
                @ApiField("street_address")
            private String streetAddress;
        /** 电话 */
                @ApiField("mobile")
            private String mobile;
    
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
        public String getMemberType() {
    return this.memberType;
    }
    public void setMemberType(String memberType) {
    this.memberType = memberType;
    }
        public String getTrademanageId() {
    return this.trademanageId;
    }
    public void setTrademanageId(String trademanageId) {
    this.trademanageId = trademanageId;
    }
        public String getPostCode() {
    return this.postCode;
    }
    public void setPostCode(String postCode) {
    this.postCode = postCode;
    }
        public String getStreet() {
    return this.street;
    }
    public void setStreet(String street) {
    this.street = street;
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
        public String getCounty() {
    return this.county;
    }
    public void setCounty(String county) {
    this.county = county;
    }
        public String getEmail() {
    return this.email;
    }
    public void setEmail(String email) {
    this.email = email;
    }
        public Long getAddressId() {
    return this.addressId;
    }
    public void setAddressId(Long addressId) {
    this.addressId = addressId;
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
        public String getStreetAddress() {
    return this.streetAddress;
    }
    public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    }
        public String getMobile() {
    return this.mobile;
    }
    public void setMobile(String mobile) {
    this.mobile = mobile;
    }
    }