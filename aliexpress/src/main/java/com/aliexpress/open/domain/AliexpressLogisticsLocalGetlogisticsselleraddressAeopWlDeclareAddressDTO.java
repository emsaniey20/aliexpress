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

public class AliexpressLogisticsLocalGetlogisticsselleraddressAeopWlDeclareAddressDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** country */
                @ApiField("country")
            private String country;
        /** memberSeq */
                @ApiField("member_seq")
            private Long memberSeq;
        /** city */
                @ApiField("city")
            private String city;
        /** mobile */
                @ApiField("mobile")
            private String mobile;
        /** postcode */
                @ApiField("postcode")
            private String postcode;
        /** county */
                @ApiField("county")
            private String county;
        /** language */
                @ApiField("language")
            private String language;
        /** trademanageId */
                @ApiField("trademanage_id")
            private String trademanageId;
        /** addressId */
                @ApiField("address_id")
            private Long addressId;
        /** isDefault */
                @ApiField("is_default")
            private FileItem isDefault;
        /** province */
                @ApiField("province")
            private String province;
        /** fromWarehouseCode */
                @ApiField("from_warehouse_code")
            private String fromWarehouseCode;
        /** phone */
                @ApiField("phone")
            private String phone;
        /** streetAddress */
                @ApiField("street_address")
            private String streetAddress;
        /** street */
                @ApiField("street")
            private String street;
        /** name */
                @ApiField("name")
            private String name;
        /** memberType */
                @ApiField("member_type")
            private String memberType;
        /** isNeedToUpdate */
                @ApiField("is_need_to_update")
            private Boolean isNeedToUpdate;
        /** fax */
                @ApiField("fax")
            private String fax;
        /** email */
                @ApiField("email")
            private String email;
        /** adminMemberSeq */
                @ApiField("admin_member_seq")
            private Long adminMemberSeq;
    
        public String getCountry() {
    return this.country;
    }
    public void setCountry(String country) {
    this.country = country;
    }
        public Long getMemberSeq() {
    return this.memberSeq;
    }
    public void setMemberSeq(Long memberSeq) {
    this.memberSeq = memberSeq;
    }
        public String getCity() {
    return this.city;
    }
    public void setCity(String city) {
    this.city = city;
    }
        public String getMobile() {
    return this.mobile;
    }
    public void setMobile(String mobile) {
    this.mobile = mobile;
    }
        public String getPostcode() {
    return this.postcode;
    }
    public void setPostcode(String postcode) {
    this.postcode = postcode;
    }
        public String getCounty() {
    return this.county;
    }
    public void setCounty(String county) {
    this.county = county;
    }
        public String getLanguage() {
    return this.language;
    }
    public void setLanguage(String language) {
    this.language = language;
    }
        public String getTrademanageId() {
    return this.trademanageId;
    }
    public void setTrademanageId(String trademanageId) {
    this.trademanageId = trademanageId;
    }
        public Long getAddressId() {
    return this.addressId;
    }
    public void setAddressId(Long addressId) {
    this.addressId = addressId;
    }
        public FileItem getIsDefault() {
    return this.isDefault;
    }
    public void setIsDefault(FileItem isDefault) {
    this.isDefault = isDefault;
    }
        public String getProvince() {
    return this.province;
    }
    public void setProvince(String province) {
    this.province = province;
    }
        public String getFromWarehouseCode() {
    return this.fromWarehouseCode;
    }
    public void setFromWarehouseCode(String fromWarehouseCode) {
    this.fromWarehouseCode = fromWarehouseCode;
    }
        public String getPhone() {
    return this.phone;
    }
    public void setPhone(String phone) {
    this.phone = phone;
    }
        public String getStreetAddress() {
    return this.streetAddress;
    }
    public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    }
        public String getStreet() {
    return this.street;
    }
    public void setStreet(String street) {
    this.street = street;
    }
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
        public String getMemberType() {
    return this.memberType;
    }
    public void setMemberType(String memberType) {
    this.memberType = memberType;
    }
        public Boolean getIsNeedToUpdate() {
    return this.isNeedToUpdate;
    }
    public void setIsNeedToUpdate(Boolean isNeedToUpdate) {
    this.isNeedToUpdate = isNeedToUpdate;
    }
        public String getFax() {
    return this.fax;
    }
    public void setFax(String fax) {
    this.fax = fax;
    }
        public String getEmail() {
    return this.email;
    }
    public void setEmail(String email) {
    this.email = email;
    }
        public Long getAdminMemberSeq() {
    return this.adminMemberSeq;
    }
    public void setAdminMemberSeq(Long adminMemberSeq) {
    this.adminMemberSeq = adminMemberSeq;
    }
    }