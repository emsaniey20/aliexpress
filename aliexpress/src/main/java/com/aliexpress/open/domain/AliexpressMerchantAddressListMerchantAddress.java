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

public class AliexpressMerchantAddressListMerchantAddress implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 国家 */
                @ApiField("country")
            private String country;
        /** 城市街道 地址：浙江省,杭州市,余杭区 */
                @ApiField("street_address")
            private String streetAddress;
        /** 国家编码 */
                @ApiField("country_iso_code")
            private String countryIsoCode;
        /** 城市，杭州市  */
                @ApiField("city")
            private String city;
        /** 地址类型：SALESRETURN（退货地址），WAREHOUSE（发货地址） */
                @ApiField("address_type")
            private String addressType;
        /** 联系人信息 */
                @ApiField("contact")
            private AliexpressMerchantAddressListContactDTO contact;
        /** 邮编 */
                @ApiField("postcode")
            private String postcode;
        /** 详细地址 */
                @ApiField("detail_address")
            private String detailAddress;
        /** 是否是默认地址 */
                @ApiField("default_address")
            private Boolean defaultAddress;
        /** 地址树最低一级的编码。可能是区可能是县的id  */
                @ApiField("location_id")
            private String locationId;
        /** 省或洲编码 */
                @ApiField("prov_code")
            private String provCode;
        /** 省 浙江省 */
                @ApiField("prov")
            private String prov;
        /** 城市编码  */
                @ApiField("city_code")
            private String cityCode;
        /** 区域编码：例如 330110 */
                @ApiField("area_code")
            private String areaCode;
        /** 区域 。余杭区 */
                @ApiField("area")
            private String area;
    
        public String getCountry() {
    return this.country;
    }
    public void setCountry(String country) {
    this.country = country;
    }
        public String getStreetAddress() {
    return this.streetAddress;
    }
    public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    }
        public String getCountryIsoCode() {
    return this.countryIsoCode;
    }
    public void setCountryIsoCode(String countryIsoCode) {
    this.countryIsoCode = countryIsoCode;
    }
        public String getCity() {
    return this.city;
    }
    public void setCity(String city) {
    this.city = city;
    }
        public String getAddressType() {
    return this.addressType;
    }
    public void setAddressType(String addressType) {
    this.addressType = addressType;
    }
        public AliexpressMerchantAddressListContactDTO getContact() {
    return this.contact;
    }
    public void setContact(AliexpressMerchantAddressListContactDTO contact) {
    this.contact = contact;
    }
        public String getPostcode() {
    return this.postcode;
    }
    public void setPostcode(String postcode) {
    this.postcode = postcode;
    }
        public String getDetailAddress() {
    return this.detailAddress;
    }
    public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
    }
        public Boolean getDefaultAddress() {
    return this.defaultAddress;
    }
    public void setDefaultAddress(Boolean defaultAddress) {
    this.defaultAddress = defaultAddress;
    }
        public String getLocationId() {
    return this.locationId;
    }
    public void setLocationId(String locationId) {
    this.locationId = locationId;
    }
        public String getProvCode() {
    return this.provCode;
    }
    public void setProvCode(String provCode) {
    this.provCode = provCode;
    }
        public String getProv() {
    return this.prov;
    }
    public void setProv(String prov) {
    this.prov = prov;
    }
        public String getCityCode() {
    return this.cityCode;
    }
    public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
    }
        public String getAreaCode() {
    return this.areaCode;
    }
    public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
    }
        public String getArea() {
    return this.area;
    }
    public void setArea(String area) {
    this.area = area;
    }
    }