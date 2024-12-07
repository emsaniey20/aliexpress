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

public class ComAliexpressPayAuthPaymentAuthRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 支付产品码 */
                @ApiField("product_code")
            private String productCode;
        /** 订单列表 */
                @ApiListField("calculate_group_items")
            private List<ComAliexpressPayAuthCalculateGroupItem> calculateGroupItems;
        /** 意向币种 */
                @ApiField("intention_currency")
            private String intentionCurrency;
    
        public String getProductCode() {
    return this.productCode;
    }
    public void setProductCode(String productCode) {
    this.productCode = productCode;
    }
        public List<ComAliexpressPayAuthCalculateGroupItem> getCalculateGroupItems() {
    return this.calculateGroupItems;
    }
    public void setCalculateGroupItems(List<ComAliexpressPayAuthCalculateGroupItem> calculateGroupItems) {
    this.calculateGroupItems = calculateGroupItems;
    }
        public String getIntentionCurrency() {
    return this.intentionCurrency;
    }
    public void setIntentionCurrency(String intentionCurrency) {
    this.intentionCurrency = intentionCurrency;
    }
    }