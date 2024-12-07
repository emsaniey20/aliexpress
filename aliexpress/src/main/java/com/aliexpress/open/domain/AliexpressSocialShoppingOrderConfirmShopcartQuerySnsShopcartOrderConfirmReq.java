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

public class AliexpressSocialShoppingOrderConfirmShopcartQuerySnsShopcartOrderConfirmReq implements Serializable {
    private static final long serialVersionUID = 1L;
        /** address id */
                @ApiField("address_id")
            private Long addressId;
        /** Products for checkout */
                @ApiListField("bundle_items")
            private List<AliexpressSocialShoppingOrderConfirmShopcartQueryBundleItem> bundleItems;
        /** Country to deliver */
                @ApiField("country_code")
            private String countryCode;
        /** promocode */
                @ApiField("promocode")
            private String promocode;
        /** currency code */
                @ApiField("currency")
            private String currency;
        /** lang */
                @ApiField("lang")
            private String lang;
    
        public Long getAddressId() {
    return this.addressId;
    }
    public void setAddressId(Long addressId) {
    this.addressId = addressId;
    }
        public List<AliexpressSocialShoppingOrderConfirmShopcartQueryBundleItem> getBundleItems() {
    return this.bundleItems;
    }
    public void setBundleItems(List<AliexpressSocialShoppingOrderConfirmShopcartQueryBundleItem> bundleItems) {
    this.bundleItems = bundleItems;
    }
        public String getCountryCode() {
    return this.countryCode;
    }
    public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
    }
        public String getPromocode() {
    return this.promocode;
    }
    public void setPromocode(String promocode) {
    this.promocode = promocode;
    }
        public String getCurrency() {
    return this.currency;
    }
    public void setCurrency(String currency) {
    this.currency = currency;
    }
        public String getLang() {
    return this.lang;
    }
    public void setLang(String lang) {
    this.lang = lang;
    }
    }