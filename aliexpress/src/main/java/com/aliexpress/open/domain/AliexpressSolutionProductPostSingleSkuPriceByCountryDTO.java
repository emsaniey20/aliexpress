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

public class AliexpressSolutionProductPostSingleSkuPriceByCountryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sku_code, must existed in sku_info_list */
                @ApiField("sku_code")
            private String skuCode;
        /** Deprecated. Will be offline. */
                @ApiField("value")
            private String value;
        /** Value of price configuration. If the price of a specific country is set, it must be greater than or equal to 70% of the original sku price */
                @ApiField("price")
            private String price;
        /** Value of discount_price for each country, should be less than the retailPrice and greater than or equal to 10% of it. */
                @ApiField("discount_price")
            private String discountPrice;
    
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public String getValue() {
    return this.value;
    }
    public void setValue(String value) {
    this.value = value;
    }
        public String getPrice() {
    return this.price;
    }
    public void setPrice(String price) {
    this.price = price;
    }
        public String getDiscountPrice() {
    return this.discountPrice;
    }
    public void setDiscountPrice(String discountPrice) {
    this.discountPrice = discountPrice;
    }
    }