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

public class AliexpressSolutionBatchProductPriceUpdateSingleSkuPriceByCountryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sku_code, must existed in  multiple_sku_update_list */
                @ApiField("sku_code")
            private String skuCode;
        /** Value of price configuration. If the price of a specific country is set, it must be greater than or equal to 70% of the original sku price in multiple_sku_update_list */
                @ApiField("price")
            private String price;
        /** Value of discount_price for each country */
                @ApiField("discount_price")
            private String discountPrice;
    
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
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