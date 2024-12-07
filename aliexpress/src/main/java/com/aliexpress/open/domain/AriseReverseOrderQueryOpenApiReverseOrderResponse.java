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

public class AriseReverseOrderQueryOpenApiReverseOrderResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 逆向类型，如RETURN，ONLY_REFUND */
                @ApiField("request_type")
            private String requestType;
        /** {} */
                @ApiListField("reverse_order_line_dtolist")
            private List<AriseReverseOrderQueryOpenApiReverseOrderLineDTO> reverseOrderLineDtolist;
        /** 正向主单id */
                @ApiField("trade_order_id")
            private Long tradeOrderId;
        /** 逆向主单id */
                @ApiField("reverse_order_id")
            private Long reverseOrderId;
        /** 物流类型，如DROP_OFF */
                @ApiField("shipping_type")
            private String shippingType;
    
        public String getRequestType() {
    return this.requestType;
    }
    public void setRequestType(String requestType) {
    this.requestType = requestType;
    }
        public List<AriseReverseOrderQueryOpenApiReverseOrderLineDTO> getReverseOrderLineDtolist() {
    return this.reverseOrderLineDtolist;
    }
    public void setReverseOrderLineDtolist(List<AriseReverseOrderQueryOpenApiReverseOrderLineDTO> reverseOrderLineDtolist) {
    this.reverseOrderLineDtolist = reverseOrderLineDtolist;
    }
        public Long getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
        public Long getReverseOrderId() {
    return this.reverseOrderId;
    }
    public void setReverseOrderId(Long reverseOrderId) {
    this.reverseOrderId = reverseOrderId;
    }
        public String getShippingType() {
    return this.shippingType;
    }
    public void setShippingType(String shippingType) {
    this.shippingType = shippingType;
    }
    }