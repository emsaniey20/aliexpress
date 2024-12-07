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

public class AliexpressReverseApplyCancelPlainResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 成功失败 */
                @ApiField("success")
            private Boolean success;
        /** 错误code */
                @ApiField("error_code")
            private String errorCode;
        /** 错误msg */
                @ApiField("msg")
            private String msg;
        /** Object */
                @ApiField("data")
            private AliexpressReverseApplyCancelIssueCancelOrderOperatorResult data;
    
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getMsg() {
    return this.msg;
    }
    public void setMsg(String msg) {
    this.msg = msg;
    }
        public AliexpressReverseApplyCancelIssueCancelOrderOperatorResult getData() {
    return this.data;
    }
    public void setData(AliexpressReverseApplyCancelIssueCancelOrderOperatorResult data) {
    this.data = data;
    }
    }