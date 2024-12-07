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

public class AliexpressMiniappOrderCreatePrecheckMarketPreCheckResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** message */
                @ApiField("msg")
            private String msg;
        /** request trace ID for locating problem */
                @ApiField("request_trace")
            private String requestTrace;
        /** success or not */
                @ApiField("success")
            private Boolean success;
        /** errorcode */
                @ApiField("error_code")
            private AliexpressMiniappOrderCreatePrecheckErrorCode errorCode;
        /** generated order token */
                @ApiField("token")
            private String token;
    
        public String getMsg() {
    return this.msg;
    }
    public void setMsg(String msg) {
    this.msg = msg;
    }
        public String getRequestTrace() {
    return this.requestTrace;
    }
    public void setRequestTrace(String requestTrace) {
    this.requestTrace = requestTrace;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public AliexpressMiniappOrderCreatePrecheckErrorCode getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(AliexpressMiniappOrderCreatePrecheckErrorCode errorCode) {
    this.errorCode = errorCode;
    }
        public String getToken() {
    return this.token;
    }
    public void setToken(String token) {
    this.token = token;
    }
    }