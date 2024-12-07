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

public class AliexpressTradeOrderQueryOrder implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 扩展信息 */
                @ApiField("extra_map")
            private HashMap<String, Object> extraMap;
        /** 订单结束原因 */
                @ApiField("end_reason")
            private String endReason;
        /** AE订单ID */
                @ApiField("trade_order_id")
            private String tradeOrderId;
        /** AE订单支付状态 */
                @ApiField("pay_status")
            private String payStatus;
        /** AE订单状态 */
                @ApiField("status")
            private String status;
    
        public HashMap<String, Object> getExtraMap() {
    return this.extraMap;
    }
    public void setExtraMap(HashMap<String, Object> extraMap) {
    this.extraMap = extraMap;
    }
        public String getEndReason() {
    return this.endReason;
    }
    public void setEndReason(String endReason) {
    this.endReason = endReason;
    }
        public String getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(String tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
        public String getPayStatus() {
    return this.payStatus;
    }
    public void setPayStatus(String payStatus) {
    this.payStatus = payStatus;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
    }