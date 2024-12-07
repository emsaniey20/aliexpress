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

public class AliexpressSocialShoppingOrderPlaceQuerySnsOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** [12345] */
                @ApiListField("item_ids")
            private List<Long> itemIds;
        /** Amount of the order */
                @ApiField("order_amount")
            private AliexpressSocialShoppingOrderPlaceQueryOrderAmount orderAmount;
        /** OrderId */
                @ApiField("order_id")
            private Long orderId;
    
        public List<Long> getItemIds() {
    return this.itemIds;
    }
    public void setItemIds(List<Long> itemIds) {
    this.itemIds = itemIds;
    }
        public AliexpressSocialShoppingOrderPlaceQueryOrderAmount getOrderAmount() {
    return this.orderAmount;
    }
    public void setOrderAmount(AliexpressSocialShoppingOrderPlaceQueryOrderAmount orderAmount) {
    this.orderAmount = orderAmount;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
    }