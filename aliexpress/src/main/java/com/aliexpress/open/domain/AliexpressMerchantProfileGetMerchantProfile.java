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

public class AliexpressMerchantProfileGetMerchantProfile implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 卖家sellerId 纯数字 */
                @ApiField("seller_id")
            private Long sellerId;
        /** 当前店铺商品数量(在线） */
                @ApiField("online_store_product_number")
            private String onlineStoreProductNumber;
        /** 当前店铺商品数量(审核中） */
                @ApiField("auth_store_product_number")
            private String authStoreProductNumber;
        /** 店铺最大商品数量限制。 发品前请做好前置校验 ，商家在线和审核中的商品数量加合要小于店铺最大商品数量限制。 limit_store_product_number > online_store_product_number + auth_store_product_number */
                @ApiField("limit_store_product_number")
            private String limitStoreProductNumber;
        /** 卖家所属国家 */
                @ApiField("country")
            private String country;
        /** 卖家可以使用的报价币种 */
                @ApiField("quotation_currency")
            private String quotationCurrency;
    
        public Long getSellerId() {
    return this.sellerId;
    }
    public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
    }
        public String getOnlineStoreProductNumber() {
    return this.onlineStoreProductNumber;
    }
    public void setOnlineStoreProductNumber(String onlineStoreProductNumber) {
    this.onlineStoreProductNumber = onlineStoreProductNumber;
    }
        public String getAuthStoreProductNumber() {
    return this.authStoreProductNumber;
    }
    public void setAuthStoreProductNumber(String authStoreProductNumber) {
    this.authStoreProductNumber = authStoreProductNumber;
    }
        public String getLimitStoreProductNumber() {
    return this.limitStoreProductNumber;
    }
    public void setLimitStoreProductNumber(String limitStoreProductNumber) {
    this.limitStoreProductNumber = limitStoreProductNumber;
    }
        public String getCountry() {
    return this.country;
    }
    public void setCountry(String country) {
    this.country = country;
    }
        public String getQuotationCurrency() {
    return this.quotationCurrency;
    }
    public void setQuotationCurrency(String quotationCurrency) {
    this.quotationCurrency = quotationCurrency;
    }
    }