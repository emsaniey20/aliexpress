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

public class AliexpressLogisticsBuyerFreightGetAeopFreightCalculateForBuyerDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品价格币种 */
                @ApiField("price_currency")
            private String priceCurrency;
        /** 商品id */
                @ApiField("product_id")
            private Long productId;
        /** 目的国家code */
                @ApiField("country_code")
            private String countryCode;
        /** 目的省市code */
                @ApiField("province_code")
            private String provinceCode;
        /** 目的城市code */
                @ApiField("city_code")
            private String cityCode;
        /** 发货国 */
                @ApiField("send_goods_country_code")
            private String sendGoodsCountryCode;
        /** 商品价格 */
                @ApiField("price")
            private String price;
        /** 商品购买数量 */
                @ApiField("product_num")
            private Integer productNum;
        /** skuId */
                @ApiField("sku_id")
            private Long skuId;
    
        public String getPriceCurrency() {
    return this.priceCurrency;
    }
    public void setPriceCurrency(String priceCurrency) {
    this.priceCurrency = priceCurrency;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getCountryCode() {
    return this.countryCode;
    }
    public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
    }
        public String getProvinceCode() {
    return this.provinceCode;
    }
    public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
    }
        public String getCityCode() {
    return this.cityCode;
    }
    public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
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
        public Integer getProductNum() {
    return this.productNum;
    }
    public void setProductNum(Integer productNum) {
    this.productNum = productNum;
    }
        public Long getSkuId() {
    return this.skuId;
    }
    public void setSkuId(Long skuId) {
    this.skuId = skuId;
    }
    }