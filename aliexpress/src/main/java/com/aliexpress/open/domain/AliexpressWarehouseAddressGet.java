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

public class AliexpressWarehouseAddressGet implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 语言 */
                @ApiField("locale")
            private String locale;
        /** 仓Code */
                @ApiField("warehouseCode")
            private String warehouseCode;
        /** 货主ID */
                @ApiField("goodsOwnerId")
            private String goodsOwnerId;
        /** 仓类型 */
                @ApiField("addressType")
            private String addressType;
        /** 国家二字码 */
                @ApiField("countryISOCode")
            private String countryISOCode;
        /** province */
                @ApiField("province")
            private String province;
        /** city */
                @ApiField("city")
            private String city;
        /** 区域 */
                @ApiField("district")
            private String district;
        /** street */
                @ApiField("street")
            private String street;
        /** detailAddress */
                @ApiField("detailAddress")
            private String detailAddress;
        /** email */
                @ApiField("email")
            private String email;
        /** zipCode */
                @ApiField("zipCode")
            private String zipCode;
        /** name */
                @ApiField("name")
            private String name;
        /** phone */
                @ApiField("phone")
            private String phone;
    
        public String getLocale() {
    return this.locale;
    }
    public void setLocale(String locale) {
    this.locale = locale;
    }
        public String getWarehouseCode() {
    return this.warehouseCode;
    }
    public void setWarehouseCode(String warehouseCode) {
    this.warehouseCode = warehouseCode;
    }
        public String getGoodsOwnerId() {
    return this.goodsOwnerId;
    }
    public void setGoodsOwnerId(String goodsOwnerId) {
    this.goodsOwnerId = goodsOwnerId;
    }
        public String getAddressType() {
    return this.addressType;
    }
    public void setAddressType(String addressType) {
    this.addressType = addressType;
    }
        public String getCountryISOCode() {
    return this.countryISOCode;
    }
    public void setCountryISOCode(String countryISOCode) {
    this.countryISOCode = countryISOCode;
    }
        public String getProvince() {
    return this.province;
    }
    public void setProvince(String province) {
    this.province = province;
    }
        public String getCity() {
    return this.city;
    }
    public void setCity(String city) {
    this.city = city;
    }
        public String getDistrict() {
    return this.district;
    }
    public void setDistrict(String district) {
    this.district = district;
    }
        public String getStreet() {
    return this.street;
    }
    public void setStreet(String street) {
    this.street = street;
    }
        public String getDetailAddress() {
    return this.detailAddress;
    }
    public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
    }
        public String getEmail() {
    return this.email;
    }
    public void setEmail(String email) {
    this.email = email;
    }
        public String getZipCode() {
    return this.zipCode;
    }
    public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
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
    }