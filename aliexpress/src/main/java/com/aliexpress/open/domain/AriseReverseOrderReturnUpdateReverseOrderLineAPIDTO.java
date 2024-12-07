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

public class AriseReverseOrderReturnUpdateReverseOrderLineAPIDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 交易主单 */
                @ApiField("order_id")
            private Long orderId;
        /** 逆向主单 */
                @ApiField("reverse_order_id")
            private Long reverseOrderId;
        /** 申请原因 */
                @ApiField("apply_reason")
            private String applyReason;
        /** 逆向子单 */
                @ApiField("reverse_order_line_id")
            private Long reverseOrderLineId;
        /** 正向订单子单号 */
                @ApiField("order_line_id")
            private String orderLineId;
        /** 退款金额，单位：分 */
                @ApiField("refund_amount")
            private Integer refundAmount;
    
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public Long getReverseOrderId() {
    return this.reverseOrderId;
    }
    public void setReverseOrderId(Long reverseOrderId) {
    this.reverseOrderId = reverseOrderId;
    }
        public String getApplyReason() {
    return this.applyReason;
    }
    public void setApplyReason(String applyReason) {
    this.applyReason = applyReason;
    }
        public Long getReverseOrderLineId() {
    return this.reverseOrderLineId;
    }
    public void setReverseOrderLineId(Long reverseOrderLineId) {
    this.reverseOrderLineId = reverseOrderLineId;
    }
        public String getOrderLineId() {
    return this.orderLineId;
    }
    public void setOrderLineId(String orderLineId) {
    this.orderLineId = orderLineId;
    }
        public Integer getRefundAmount() {
    return this.refundAmount;
    }
    public void setRefundAmount(Integer refundAmount) {
    this.refundAmount = refundAmount;
    }
    }