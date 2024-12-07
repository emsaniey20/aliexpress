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

public class DsProductGetAeopAEProductSKU implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 111 */
                @ApiField("package_length")
            private Integer packageLength;
        /** 111 */
                @ApiListField("aeop_skuproperty")
            private List<DsProductGetAeopSKUProperty> aeopSkuproperty;
        /** 111 */
                @ApiField("id")
            private String id;
        /** 111 */
                @ApiField("s_kuavailable_stock")
            private Long sKuavailableStock;
        /** 111 */
                @ApiField("currency_code")
            private String currencyCode;
        /** 111 */
                @ApiField("barcode")
            private String barcode;
        /** 111 */
                @ApiField("sku_id")
            private Long skuId;
        /** 111 */
                @ApiField("sku_code")
            private String skuCode;
        /** 111 */
                @ApiField("ipm_sku_stock")
            private Long ipmSkuStock;
        /** 111 */
                @ApiListField("aeop_skunational_discount_price")
            private List<DsProductGetAeopSKUNationalDiscountPrice> aeopSkunationalDiscountPrice;
        /** 111 */
                @ApiField("ext_param")
            private String extParam;
        /** 111 */
                @ApiField("sku_price")
            private String skuPrice;
        /** 111 */
                @ApiField("sku_stock")
            private Boolean skuStock;
        /** 111 */
                @ApiField("offer_sale_price")
            private String offerSalePrice;
        /** 111 */
                @ApiField("package_width")
            private Integer packageWidth;
        /** 111 */
                @ApiField("package_height")
            private Integer packageHeight;
        /** 111 */
                @ApiField("gross_weight")
            private String grossWeight;
        /** 111 */
                @ApiField("sku_discount_price")
            private String skuDiscountPrice;
        /** 111 */
                @ApiField("offer_bulk_sale_price")
            private String offerBulkSalePrice;
        /** 111 */
                @ApiField("sku_bulk_order")
            private Integer skuBulkOrder;
    
        public Integer getPackageLength() {
    return this.packageLength;
    }
    public void setPackageLength(Integer packageLength) {
    this.packageLength = packageLength;
    }
        public List<DsProductGetAeopSKUProperty> getAeopSkuproperty() {
    return this.aeopSkuproperty;
    }
    public void setAeopSkuproperty(List<DsProductGetAeopSKUProperty> aeopSkuproperty) {
    this.aeopSkuproperty = aeopSkuproperty;
    }
        public String getId() {
    return this.id;
    }
    public void setId(String id) {
    this.id = id;
    }
        public Long getSKuavailableStock() {
    return this.sKuavailableStock;
    }
    public void setSKuavailableStock(Long sKuavailableStock) {
    this.sKuavailableStock = sKuavailableStock;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public String getBarcode() {
    return this.barcode;
    }
    public void setBarcode(String barcode) {
    this.barcode = barcode;
    }
        public Long getSkuId() {
    return this.skuId;
    }
    public void setSkuId(Long skuId) {
    this.skuId = skuId;
    }
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public Long getIpmSkuStock() {
    return this.ipmSkuStock;
    }
    public void setIpmSkuStock(Long ipmSkuStock) {
    this.ipmSkuStock = ipmSkuStock;
    }
        public List<DsProductGetAeopSKUNationalDiscountPrice> getAeopSkunationalDiscountPrice() {
    return this.aeopSkunationalDiscountPrice;
    }
    public void setAeopSkunationalDiscountPrice(List<DsProductGetAeopSKUNationalDiscountPrice> aeopSkunationalDiscountPrice) {
    this.aeopSkunationalDiscountPrice = aeopSkunationalDiscountPrice;
    }
        public String getExtParam() {
    return this.extParam;
    }
    public void setExtParam(String extParam) {
    this.extParam = extParam;
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
        public String getOfferSalePrice() {
    return this.offerSalePrice;
    }
    public void setOfferSalePrice(String offerSalePrice) {
    this.offerSalePrice = offerSalePrice;
    }
        public Integer getPackageWidth() {
    return this.packageWidth;
    }
    public void setPackageWidth(Integer packageWidth) {
    this.packageWidth = packageWidth;
    }
        public Integer getPackageHeight() {
    return this.packageHeight;
    }
    public void setPackageHeight(Integer packageHeight) {
    this.packageHeight = packageHeight;
    }
        public String getGrossWeight() {
    return this.grossWeight;
    }
    public void setGrossWeight(String grossWeight) {
    this.grossWeight = grossWeight;
    }
        public String getSkuDiscountPrice() {
    return this.skuDiscountPrice;
    }
    public void setSkuDiscountPrice(String skuDiscountPrice) {
    this.skuDiscountPrice = skuDiscountPrice;
    }
        public String getOfferBulkSalePrice() {
    return this.offerBulkSalePrice;
    }
    public void setOfferBulkSalePrice(String offerBulkSalePrice) {
    this.offerBulkSalePrice = offerBulkSalePrice;
    }
        public Integer getSkuBulkOrder() {
    return this.skuBulkOrder;
    }
    public void setSkuBulkOrder(Integer skuBulkOrder) {
    this.skuBulkOrder = skuBulkOrder;
    }
    }