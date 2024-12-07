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

public class AliexpressTradeOrderCreateCreateOrderMiniAppResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 返回msg */
                @ApiField("msg")
            private String msg;
        /** 是否处理成功 */
                @ApiField("success")
            private Boolean success;
        /** AE的订单ID */
                @ApiListField("order_list")
            private List<String> orderList;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
        /** 收银台token */
                @ApiField("payment_cashier_token")
            private String paymentCashierToken;
    
        public String getMsg() {
    return this.msg;
    }
    public void setMsg(String msg) {
    this.msg = msg;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public List<String> getOrderList() {
    return this.orderList;
    }
    public void setOrderList(List<String> orderList) {
    this.orderList = orderList;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getPaymentCashierToken() {
    return this.paymentCashierToken;
    }
    public void setPaymentCashierToken(String paymentCashierToken) {
    this.paymentCashierToken = paymentCashierToken;
    }
    }