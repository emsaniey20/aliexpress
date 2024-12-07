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

public class AliexpressReverseApplyRefundDadaResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 成功/失败 */
                @ApiField("success")
            private String success;
        /** 错误code */
                @ApiField("errorCode")
            private String errorCode;
        /** 错误信息 */
                @ApiField("error")
            private String error;
        /** 成功信息 */
                @ApiField("data")
            private String data;
    
        public String getSuccess() {
    return this.success;
    }
    public void setSuccess(String success) {
    this.success = success;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getError() {
    return this.error;
    }
    public void setError(String error) {
    this.error = error;
    }
        public String getData() {
    return this.data;
    }
    public void setData(String data) {
    this.data = data;
    }
    }