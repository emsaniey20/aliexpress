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

public class AliexpressOfferProductPostAeopAEProductSKU implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sku分国家的日常促销价 */
                @ApiListField("aeop_s_k_u_national_discount_price")
            private List<AliexpressOfferProductPostAeopSKUNationalDiscountPrice> aeopSKUNationalDiscountPrice;
        /** sku属性列表 */
                @ApiListField("aeop_s_k_u_property")
            private List<AliexpressOfferProductPostAeopSKUProperty> aeopSKUProperty;
        /** 商品条形码 */
                @ApiField("barcode")
            private String barcode;
        /** 货币单位。如果不提供该值信息，则默认为"USD"；非俄罗斯卖家这个属性值可以不提供。对于俄罗斯海外卖家，该单位值必须提供，如: "RUB"。 */
                @ApiField("currency_code")
            private String currencyCode;
        /** sku库存 */
                @ApiField("ipm_sku_stock")
            private Long ipmSkuStock;
        /** 商品编码 */
                @ApiField("sku_code")
            private String skuCode;
        /** sku日常促销价 */
                @ApiField("sku_discount_price")
            private String skuDiscountPrice;
        /** sku价格 */
                @ApiField("sku_price")
            private String skuPrice;
        /** sku重量，单位公斤 */
                @ApiField("gross_weight")
            private String grossWeight;
        /** sku物流尺寸-高，单位cm */
                @ApiField("package_height")
            private Integer packageHeight;
        /** sku物流尺寸-宽，单位cm */
                @ApiField("package_width")
            private String packageWidth;
        /** sku物流尺寸-长，单位cm */
                @ApiField("package_length")
            private Integer packageLength;
        /** eanCode */
                @ApiField("ean_code")
            private String eanCode;
    
        public List<AliexpressOfferProductPostAeopSKUNationalDiscountPrice> getAeopSKUNationalDiscountPrice() {
    return this.aeopSKUNationalDiscountPrice;
    }
    public void setAeopSKUNationalDiscountPrice(List<AliexpressOfferProductPostAeopSKUNationalDiscountPrice> aeopSKUNationalDiscountPrice) {
    this.aeopSKUNationalDiscountPrice = aeopSKUNationalDiscountPrice;
    }
        public List<AliexpressOfferProductPostAeopSKUProperty> getAeopSKUProperty() {
    return this.aeopSKUProperty;
    }
    public void setAeopSKUProperty(List<AliexpressOfferProductPostAeopSKUProperty> aeopSKUProperty) {
    this.aeopSKUProperty = aeopSKUProperty;
    }
        public String getBarcode() {
    return this.barcode;
    }
    public void setBarcode(String barcode) {
    this.barcode = barcode;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public Long getIpmSkuStock() {
    return this.ipmSkuStock;
    }
    public void setIpmSkuStock(Long ipmSkuStock) {
    this.ipmSkuStock = ipmSkuStock;
    }
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public String getSkuDiscountPrice() {
    return this.skuDiscountPrice;
    }
    public void setSkuDiscountPrice(String skuDiscountPrice) {
    this.skuDiscountPrice = skuDiscountPrice;
    }
        public String getSkuPrice() {
    return this.skuPrice;
    }
    public void setSkuPrice(String skuPrice) {
    this.skuPrice = skuPrice;
    }
        public String getGrossWeight() {
    return this.grossWeight;
    }
    public void setGrossWeight(String grossWeight) {
    this.grossWeight = grossWeight;
    }
        public Integer getPackageHeight() {
    return this.packageHeight;
    }
    public void setPackageHeight(Integer packageHeight) {
    this.packageHeight = packageHeight;
    }
        public String getPackageWidth() {
    return this.packageWidth;
    }
    public void setPackageWidth(String packageWidth) {
    this.packageWidth = packageWidth;
    }
        public Integer getPackageLength() {
    return this.packageLength;
    }
    public void setPackageLength(Integer packageLength) {
    this.packageLength = packageLength;
    }
        public String getEanCode() {
    return this.eanCode;
    }
    public void setEanCode(String eanCode) {
    this.eanCode = eanCode;
    }
    }