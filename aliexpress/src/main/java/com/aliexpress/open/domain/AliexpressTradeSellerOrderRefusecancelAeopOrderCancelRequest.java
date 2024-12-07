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

public class AliexpressTradeSellerOrderRefusecancelAeopOrderCancelRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 买家登录帐号 */
                @ApiField("buyer_login_id")
            private String buyerLoginId;
        /** 拒绝原因 */
                @ApiField("memo")
            private String memo;
        /** 订单id */
                @ApiField("order_id")
            private Long orderId;
    
        public String getBuyerLoginId() {
    return this.buyerLoginId;
    }
    public void setBuyerLoginId(String buyerLoginId) {
    this.buyerLoginId = buyerLoginId;
    }
        public String getMemo() {
    return this.memo;
    }
    public void setMemo(String memo) {
    this.memo = memo;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
    }