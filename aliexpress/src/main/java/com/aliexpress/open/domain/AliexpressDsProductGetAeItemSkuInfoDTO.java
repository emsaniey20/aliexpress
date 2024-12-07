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

public class AliexpressDsProductGetAeItemSkuInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** The actual saleable inventory attribute of SKU is ipmSkuStock. The reasonable value range of this attribute value is 0~999999. If the product has SKU, please make sure that at least one SKU is in stock, that is, the value of ipmSkuStock is 1~999999. The range of the inventory value of the entire product latitude is 1~999999. If the skuStock attribute is set at the same time, the system will give priority to the ipmSkuStock attribute; if the ipmSkuStock attribute is not set, the system will set the inventory according to the skuStock attribute, true means 999, false means 0. */
                @ApiField("ipm_sku_stock")
            private Integer ipmSkuStock;
        /** SKU bulk discount price */
                @ApiField("offer_bulk_sale_price")
            private String offerBulkSalePrice;
        /** SKU inventory */
                @ApiField("sku_available_stock")
            private Integer skuAvailableStock;
        /** Minimum number of batches */
                @ApiField("sku_bulk_order")
            private Integer skuBulkOrder;
        /** SKU inventory, the data format is true if stock is available, false if no stock is available; at least one sku record is available. */
                @ApiField("sku_stock")
            private Boolean skuStock;
        /** Origin SKU price. Value range: 0.01-100000; Unit: USD. Such as: 200.07, which means: 200 US dollars 7 points. Need to be in the correct price range. */
                @ApiField("sku_price")
            private String skuPrice;
        /** SKU discount price */
                @ApiField("offer_sale_price")
            private String offerSalePrice;
        /** sku attribute  unique key */
                @ApiField("id")
            private String id;
        /** SKU attribute object */
                @ApiListField("ae_sku_property_dtos")
            private List<AliexpressDsProductGetAeSkuPropertyDTO> aeSkuPropertyDtos;
        /** Commodity barcode */
                @ApiField("barcode")
            private String barcode;
        /** The currency unit of the product. U.S. Dollar: USD, Ruble: RUB */
                @ApiField("currency_code")
            private String currencyCode;
        /** SKU merchant code. Format: single-byte alphanumeric characters, length 20, excluding spaces greater than and less than signs. If the user only fills in the retail price (productprice) and product code, a complete SKU record needs to be generated and submitted, otherwise the product code cannot be saved. The system will think that only the retail price has been submitted, but there is no SKU, resulting in unsaved product editing. */
                @ApiField("sku_code")
            private String skuCode;
        /** sku id, can be used for aliexpress.logistics.buyer.freight.calculate request */
                @ApiField("sku_id")
            private String skuId;
    
        public Integer getIpmSkuStock() {
    return this.ipmSkuStock;
    }
    public void setIpmSkuStock(Integer ipmSkuStock) {
    this.ipmSkuStock = ipmSkuStock;
    }
        public String getOfferBulkSalePrice() {
    return this.offerBulkSalePrice;
    }
    public void setOfferBulkSalePrice(String offerBulkSalePrice) {
    this.offerBulkSalePrice = offerBulkSalePrice;
    }
        public Integer getSkuAvailableStock() {
    return this.skuAvailableStock;
    }
    public void setSkuAvailableStock(Integer skuAvailableStock) {
    this.skuAvailableStock = skuAvailableStock;
    }
        public Integer getSkuBulkOrder() {
    return this.skuBulkOrder;
    }
    public void setSkuBulkOrder(Integer skuBulkOrder) {
    this.skuBulkOrder = skuBulkOrder;
    }
        public Boolean getSkuStock() {
    return this.skuStock;
    }
    public void setSkuStock(Boolean skuStock) {
    this.skuStock = skuStock;
    }
        public String getSkuPrice() {
    return this.skuPrice;
    }
    public void setSkuPrice(String skuPrice) {
    this.skuPrice = skuPrice;
    }
        public String getOfferSalePrice() {
    return this.offerSalePrice;
    }
    public void setOfferSalePrice(String offerSalePrice) {
    this.offerSalePrice = offerSalePrice;
    }
        public String getId() {
    return this.id;
    }
    public void setId(String id) {
    this.id = id;
    }
        public List<AliexpressDsProductGetAeSkuPropertyDTO> getAeSkuPropertyDtos() {
    return this.aeSkuPropertyDtos;
    }
    public void setAeSkuPropertyDtos(List<AliexpressDsProductGetAeSkuPropertyDTO> aeSkuPropertyDtos) {
    this.aeSkuPropertyDtos = aeSkuPropertyDtos;
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
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public String getSkuId() {
    return this.skuId;
    }
    public void setSkuId(String skuId) {
    this.skuId = skuId;
    }
    }