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

public class AliexpressLogisticsBuyerFreightCalculateAeopFreightCalculateForBuyerDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** skuId must be passed when calculating the choice product */
                @ApiField("sku_id")
            private String skuId;
        /** city code */
                @ApiField("city_code")
            private String cityCode;
        /** country code */
                @ApiField("country_code")
            private String countryCode;
        /** Product ID */
                @ApiField("product_id")
            private Long productId;
        /** Product count */
                @ApiField("product_num")
            private Integer productNum;
        /** Province code */
                @ApiField("province_code")
            private String provinceCode;
        /** Shipping country */
                @ApiField("send_goods_country_code")
            private String sendGoodsCountryCode;
        /** commodity price */
                @ApiField("price")
            private String price;
        /** commodity price currency */
                @ApiField("price_currency")
            private String priceCurrency;
    
        public String getSkuId() {
    return this.skuId;
    }
    public void setSkuId(String skuId) {
    this.skuId = skuId;
    }
        public String getCityCode() {
    return this.cityCode;
    }
    public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
    }
        public String getCountryCode() {
    return this.countryCode;
    }
    public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public Integer getProductNum() {
    return this.productNum;
    }
    public void setProductNum(Integer productNum) {
    this.productNum = productNum;
    }
        public String getProvinceCode() {
    return this.provinceCode;
    }
    public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
    }
        public String getSendGoodsCountryCode() {
    return this.sendGoodsCountryCode;
    }
    public void setSendGoodsCountryCode(String sendGoodsCountryCode) {
    this.sendGoodsCountryCode = sendGoodsCountryCode;
    }
        public String getPrice() {
    return this.price;
    }
    public void setPrice(String price) {
    this.price = price;
    }
        public String getPriceCurrency() {
    return this.priceCurrency;
    }
    public void setPriceCurrency(String priceCurrency) {
    this.priceCurrency = priceCurrency;
    }
    }