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

public class AliexpressReverseApplyCancelIssueCancelOrderOperatorResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** AE侧订单号 */
                @ApiField("order_id")
            private Long orderId;
        /** 成功失败 */
                @ApiField("operator_result")
            private Boolean operatorResult;
        /** 结果code */
                @ApiField("result_code")
            private String resultCode;
        /** 结果msg */
                @ApiField("result_message")
            private String resultMessage;
    
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public Boolean getOperatorResult() {
    return this.operatorResult;
    }
    public void setOperatorResult(Boolean operatorResult) {
    this.operatorResult = operatorResult;
    }
        public String getResultCode() {
    return this.resultCode;
    }
    public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
    }
        public String getResultMessage() {
    return this.resultMessage;
    }
    public void setResultMessage(String resultMessage) {
    this.resultMessage = resultMessage;
    }
    }