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

public class AliexpressSocialProductFulldetailQuerySkuOpenApiVO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** actul sku price */
                @ApiField("act_sku_bulk_cal_price")
            private String actSkuBulkCalPrice;
        /** actual sku deposit bulk price */
                @ApiField("act_sku_deposit_bulk_price")
            private String actSkuDepositBulkPrice;
        /** actual sku deposit price */
                @ApiField("act_sku_deposit_price")
            private String actSkuDepositPrice;
        /** actual sku multicurrency bulk price */
                @ApiField("act_sku_multi_currency_bulk_price")
            private String actSkuMultiCurrencyBulkPrice;
        /** is activity */
                @ApiField("activity")
            private Boolean activity;
        /** stock */
                @ApiField("avail_quantity")
            private Long availQuantity;
        /** bulk orders count */
                @ApiField("bulk_order")
            private Integer bulkOrder;
        /** formatted activity amount */
                @ApiField("formatted_sku_activity_amount")
            private String formattedSkuActivityAmount;
        /** Formatted amount */
                @ApiField("formatted_sku_amount")
            private String formattedSkuAmount;
        /** stock */
                @ApiField("inventory")
            private Long inventory;
        /** sku attributes */
                @ApiField("sku_attr")
            private String skuAttr;
        /** sale price */
                @ApiField("sku_big_sale_price")
            private String skuBigSalePrice;
        /** deposit amount */
                @ApiField("sku_deposit_amount")
            private String skuDepositAmount;
        /** skuId */
                @ApiField("sku_id")
            private Long skuId;
        /** properties */
                @ApiField("sku_prop_ids")
            private String skuPropIds;
        /** Sku price in subcurrency */
                @ApiField("original_price_cents")
            private Integer originalPriceCents;
        /** Sku discount price in subcurrency */
                @ApiField("discount_price_cents")
            private Integer discountPriceCents;
    
        public String getActSkuBulkCalPrice() {
    return this.actSkuBulkCalPrice;
    }
    public void setActSkuBulkCalPrice(String actSkuBulkCalPrice) {
    this.actSkuBulkCalPrice = actSkuBulkCalPrice;
    }
        public String getActSkuDepositBulkPrice() {
    return this.actSkuDepositBulkPrice;
    }
    public void setActSkuDepositBulkPrice(String actSkuDepositBulkPrice) {
    this.actSkuDepositBulkPrice = actSkuDepositBulkPrice;
    }
        public String getActSkuDepositPrice() {
    return this.actSkuDepositPrice;
    }
    public void setActSkuDepositPrice(String actSkuDepositPrice) {
    this.actSkuDepositPrice = actSkuDepositPrice;
    }
        public String getActSkuMultiCurrencyBulkPrice() {
    return this.actSkuMultiCurrencyBulkPrice;
    }
    public void setActSkuMultiCurrencyBulkPrice(String actSkuMultiCurrencyBulkPrice) {
    this.actSkuMultiCurrencyBulkPrice = actSkuMultiCurrencyBulkPrice;
    }
        public Boolean getActivity() {
    return this.activity;
    }
    public void setActivity(Boolean activity) {
    this.activity = activity;
    }
        public Long getAvailQuantity() {
    return this.availQuantity;
    }
    public void setAvailQuantity(Long availQuantity) {
    this.availQuantity = availQuantity;
    }
        public Integer getBulkOrder() {
    return this.bulkOrder;
    }
    public void setBulkOrder(Integer bulkOrder) {
    this.bulkOrder = bulkOrder;
    }
        public String getFormattedSkuActivityAmount() {
    return this.formattedSkuActivityAmount;
    }
    public void setFormattedSkuActivityAmount(String formattedSkuActivityAmount) {
    this.formattedSkuActivityAmount = formattedSkuActivityAmount;
    }
        public String getFormattedSkuAmount() {
    return this.formattedSkuAmount;
    }
    public void setFormattedSkuAmount(String formattedSkuAmount) {
    this.formattedSkuAmount = formattedSkuAmount;
    }
        public Long getInventory() {
    return this.inventory;
    }
    public void setInventory(Long inventory) {
    this.inventory = inventory;
    }
        public String getSkuAttr() {
    return this.skuAttr;
    }
    public void setSkuAttr(String skuAttr) {
    this.skuAttr = skuAttr;
    }
        public String getSkuBigSalePrice() {
    return this.skuBigSalePrice;
    }
    public void setSkuBigSalePrice(String skuBigSalePrice) {
    this.skuBigSalePrice = skuBigSalePrice;
    }
        public String getSkuDepositAmount() {
    return this.skuDepositAmount;
    }
    public void setSkuDepositAmount(String skuDepositAmount) {
    this.skuDepositAmount = skuDepositAmount;
    }
        public Long getSkuId() {
    return this.skuId;
    }
    public void setSkuId(Long skuId) {
    this.skuId = skuId;
    }
        public String getSkuPropIds() {
    return this.skuPropIds;
    }
    public void setSkuPropIds(String skuPropIds) {
    this.skuPropIds = skuPropIds;
    }
        public Integer getOriginalPriceCents() {
    return this.originalPriceCents;
    }
    public void setOriginalPriceCents(Integer originalPriceCents) {
    this.originalPriceCents = originalPriceCents;
    }
        public Integer getDiscountPriceCents() {
    return this.discountPriceCents;
    }
    public void setDiscountPriceCents(Integer discountPriceCents) {
    this.discountPriceCents = discountPriceCents;
    }
    }