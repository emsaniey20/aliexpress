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

public class AliexpressSolutionProductEditSkuInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** stock. Maximum:999999, minumum:1 */
                @ApiField("inventory")
            private Long inventory;
        /** price. Maximum:999999, minumum:0.01 */
                @ApiField("price")
            private String price;
        /** sku attribute list. Some categories don't have sku attributes, then sku_attributes_list should be empty.When there are more than one sku in the sku_info_list, sku_attributes_list is required for each of them, please do not let them empty */
                @ApiListField("sku_attributes_list")
            private List<AliexpressSolutionProductEditSkuAttributeDTO> skuAttributesList;
        /** Code for merchant's sku, important reference to maintain the relationship between merchant and Aliexpress's system. */
                @ApiField("sku_code")
            private String skuCode;
        /** discount price for the sku. discount_price should be cheaper than price. */
                @ApiField("discount_price")
            private String discountPrice;
        /** extra params. Configured some special products */
                @ApiField("extra_params")
            private String extraParams;
        /** EAN or EAN13, stands for international product number (formerly European product number). It is an extension of UPC codes, and you will find them as barcodes on most everyday products. It will be empty if you don't fill it in */
                @ApiField("ean_code")
            private String eanCode;
    
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
        public List<AliexpressSolutionProductEditSkuAttributeDTO> getSkuAttributesList() {
    return this.skuAttributesList;
    }
    public void setSkuAttributesList(List<AliexpressSolutionProductEditSkuAttributeDTO> skuAttributesList) {
    this.skuAttributesList = skuAttributesList;
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