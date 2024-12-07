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

public class AliexpressSolutionProductInfoGetGlobalAeopAEProductSKU implements Serializable {
    private static final long serialVersionUID = 1L;
        /** List of SKU attributes */
                @ApiListField("aeop_s_k_u_property_list")
            private List<AliexpressSolutionProductInfoGetGlobalAeopSKUProperty> aeopSKUPropertyList;
        /** all of warehouse goods will return barcode */
                @ApiField("barcode")
            private String barcode;
        /** The Currency code. "USD" will be used as the default value if this information is not provided; Currency code is mandatory for Russian sellers(RUB) and Spanish sellers(EUR). */
                @ApiField("currency_code")
            private String currencyCode;
        /** SKU ID. Can uniquely represent a SKU within a product range. */
                @ApiField("id")
            private String id;
        /** Ranges from 1 to 999999 for one sku. The total stock of the entire product within multiple skus should also be in the range of 1 to 999999. */
                @ApiField("ipm_sku_stock")
            private Long ipmSkuStock;
        /** Sku merchant code from the seller's system. Format: alphanumeric, length 20, does not contain spaces greater than and less than sign. If you only fill in the product price and product code, you need to create a complete SKU record submission, otherwise the product code can not be saved. The system will consider that only the retail price is submitted, but no SKU, resulting in product editing is not saved. */
                @ApiField("sku_code")
            private String skuCode;
        /** Sku price. Value range: 0.01-100000; Such as: 200.07 means 200 US dollars 7 cents(if other currency_code is used, referring to the corresponding price in that currency, e.g., 200.07 Euros). */
                @ApiField("sku_price")
            private String skuPrice;
        /** True means stock available for the sku, false means out of stock. The stock of at least one should be available. */
                @ApiField("sku_stock")
            private Boolean skuStock;
        /** SKU discount price, also called sale price, value range: 0.01 - 100000. */
                @ApiField("sku_discount_price")
            private String skuDiscountPrice;
        /** EAN, or EAN13, stands for International Article Number (originally European Article Number). It is an extension of the UPC codes and you'll find them as barcodes on most everyday products. Sometimes the barcode is also called GTIN or GTIN13 (Global Trade Identifier) */
                @ApiField("ean_code")
            private String eanCode;
    
        public List<AliexpressSolutionProductInfoGetGlobalAeopSKUProperty> getAeopSKUPropertyList() {
    return this.aeopSKUPropertyList;
    }
    public void setAeopSKUPropertyList(List<AliexpressSolutionProductInfoGetGlobalAeopSKUProperty> aeopSKUPropertyList) {
    this.aeopSKUPropertyList = aeopSKUPropertyList;
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
        public String getId() {
    return this.id;
    }
    public void setId(String id) {
    this.id = id;
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
        public String getSkuPrice() {
    return this.skuPrice;
    }
    public void setSkuPrice(String skuPrice) {
    this.skuPrice = skuPrice;
    }
        public Boolean getSkuStock() {
    return this.skuStock;
    }
    public void setSkuStock(Boolean skuStock) {
    this.skuStock = skuStock;
    }
        public String getSkuDiscountPrice() {
    return this.skuDiscountPrice;
    }
    public void setSkuDiscountPrice(String skuDiscountPrice) {
    this.skuDiscountPrice = skuDiscountPrice;
    }
        public String getEanCode() {
    return this.eanCode;
    }
    public void setEanCode(String eanCode) {
    this.eanCode = eanCode;
    }
    }