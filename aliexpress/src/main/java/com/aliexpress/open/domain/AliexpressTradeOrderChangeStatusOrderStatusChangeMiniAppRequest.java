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

public class AliexpressTradeOrderChangeStatusOrderStatusChangeMiniAppRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** AE订单号 */
                @ApiField("trade_order_id")
            private String tradeOrderId;
        /** 操作类型 */
                @ApiField("action")
            private String action;
    
        public String getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(String tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
        public String getAction() {
    return this.action;
    }
    public void setAction(String action) {
    this.action = action;
    }
    }