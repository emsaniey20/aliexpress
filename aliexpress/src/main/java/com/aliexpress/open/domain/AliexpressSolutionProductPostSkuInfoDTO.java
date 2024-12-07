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

public class AliexpressSolutionProductPostSkuInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sku attribute list. Some categories don't have sku attributes, then sku_attributes_list should be empty.When there are more than one sku in the sku_info_list, sku_attributes_list is required for each of them, please do not let them empty */
                @ApiListField("sku_attributes_list")
            private List<AliexpressSolutionProductPostSkuAttributeDTO> skuAttributesList;
        /** stock. Maximum:999999, minumum:1 */
                @ApiField("inventory")
            private Long inventory;
        /** price. Maximum: 999999, minumum:0.01 */
                @ApiField("price")
            private String price;
        /** barcode of the sku. Except some Russian sellers who will be fulfilled by Aliexpress, please ignore this field for other sellers. */
                @ApiField("bar_code")
            private String barCode;
        /** Merchant's identificator for the SKU. Important reference to maintain the sku relationship between merchant and Aliexpress. */
                @ApiField("sku_code")
            private String skuCode;
        /** discount price for the sku. discount_price should be cheaper than price. */
                @ApiField("discount_price")
            private String discountPrice;
        /** extra params. Configured some special products */
                @ApiField("extra_params")
            private String extraParams;
        /** EAN, or EAN13, stands for International Article Number (originally European Article Number). It is an extension of the UPC codes and you'll find them as barcodes on most everyday products. Sometimes the barcode is also called GTIN or GTIN13 (Global Trade Identifier) */
                @ApiField("ean_code")
            private String eanCode;
    
        public List<AliexpressSolutionProductPostSkuAttributeDTO> getSkuAttributesList() {
    return this.skuAttributesList;
    }
    public void setSkuAttributesList(List<AliexpressSolutionProductPostSkuAttributeDTO> skuAttributesList) {
    this.skuAttributesList = skuAttributesList;
    }
        public Long getInventory() {
    return this.inventory;
    }
    public void setInventory(Long inventory) {
    this.inventory = inventory;
    }
        public String getPrice() {
    return this.price;
    }
    public void setPrice(String price) {
    this.price = price;
    }
        public String getBarCode() {
    return this.barCode;
    }
    public void setBarCode(String barCode) {
    this.barCode = barCode;
    }
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public String getDiscountPrice() {
    return this.discountPrice;
    }
    public void setDiscountPrice(String discountPrice) {
    this.discountPrice = discountPrice;
    }
        public String getExtraParams() {
    return this.extraParams;
    }
    public void setExtraParams(String extraParams) {
    this.extraParams = extraParams;
    }
        public String getEanCode() {
    return this.eanCode;
    }
    public void setEanCode(String eanCode) {
    this.eanCode = eanCode;
    }
    }