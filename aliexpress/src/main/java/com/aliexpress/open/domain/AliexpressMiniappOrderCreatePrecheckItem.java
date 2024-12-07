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

public class AliexpressMiniappOrderCreatePrecheckItem implements Serializable {
    private static final long serialVersionUID = 1L;
        /** quantity */
                @ApiField("quantity")
            private Integer quantity;
        /** price object */
                @ApiField("price")
            private AliexpressMiniappOrderCreatePrecheckPrice price;
        /** skuId */
                @ApiField("sku_id")
            private Long skuId;
        /** item id */
                @ApiField("item_id")
            private Long itemId;
    
        public Integer getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Integer quantity) {
    this.quantity = quantity;
    }
        public AliexpressMiniappOrderCreatePrecheckPrice getPrice() {
    return this.price;
    }
    public void setPrice(AliexpressMiniappOrderCreatePrecheckPrice price) {
    this.price = price;
    }
        public Long getSkuId() {
    return this.skuId;
    }
    public void setSkuId(Long skuId) {
    this.skuId = skuId;
    }
        public Long getItemId() {
    return this.itemId;
    }
    public void setItemId(Long itemId) {
    this.itemId = itemId;
    }
    }