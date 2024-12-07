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

public class AliexpressSocialShoppingOrderConfirmShopcartQueryShopcartSellerItem implements Serializable {
    private static final long serialVersionUID = 1L;
        /** freight amount */
                @ApiField("freight_amount_cents")
            private Long freightAmountCents;
        /** items amount */
                @ApiField("items_amount_cents")
            private Long itemsAmountCents;
        /** Seller name */
                @ApiField("seller_name")
            private String sellerName;
        /** Shopcart products */
                @ApiListField("shopcart_items")
            private List<AliexpressSocialShoppingOrderConfirmShopcartQueryShopcartItem> shopcartItems;
        /** Freight amount */
                @ApiField("total_actual_freight_amount_cents")
            private Long totalActualFreightAmountCents;
        /** Total amount */
                @ApiField("total_amount_cents")
            private Long totalAmountCents;
    
        public Long getFreightAmountCents() {
    return this.freightAmountCents;
    }
    public void setFreightAmountCents(Long freightAmountCents) {
    this.freightAmountCents = freightAmountCents;
    }
        public Long getItemsAmountCents() {
    return this.itemsAmountCents;
    }
    public void setItemsAmountCents(Long itemsAmountCents) {
    this.itemsAmountCents = itemsAmountCents;
    }
        public String getSellerName() {
    return this.sellerName;
    }
    public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
    }
        public List<AliexpressSocialShoppingOrderConfirmShopcartQueryShopcartItem> getShopcartItems() {
    return this.shopcartItems;
    }
    public void setShopcartItems(List<AliexpressSocialShoppingOrderConfirmShopcartQueryShopcartItem> shopcartItems) {
    this.shopcartItems = shopcartItems;
    }
        public Long getTotalActualFreightAmountCents() {
    return this.totalActualFreightAmountCents;
    }
    public void setTotalActualFreightAmountCents(Long totalActualFreightAmountCents) {
    this.totalActualFreightAmountCents = totalActualFreightAmountCents;
    }
        public Long getTotalAmountCents() {
    return this.totalAmountCents;
    }
    public void setTotalAmountCents(Long totalAmountCents) {
    this.totalAmountCents = totalAmountCents;
    }
    }