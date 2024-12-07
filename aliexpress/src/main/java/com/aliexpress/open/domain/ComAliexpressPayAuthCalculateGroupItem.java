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

public class ComAliexpressPayAuthCalculateGroupItem implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 卖家id */
                @ApiField("seller_id")
            private Long sellerId;
        /** 订单币种 */
                @ApiField("order_currency")
            private String orderCurrency;
        /** 订单号 */
                @ApiField("out_order_no")
            private String outOrderNo;
    
        public Long getSellerId() {
    return this.sellerId;
    }
    public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
    }
        public String getOrderCurrency() {
    return this.orderCurrency;
    }
    public void setOrderCurrency(String orderCurrency) {
    this.orderCurrency = orderCurrency;
    }
        public String getOutOrderNo() {
    return this.outOrderNo;
    }
    public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
    }
    }