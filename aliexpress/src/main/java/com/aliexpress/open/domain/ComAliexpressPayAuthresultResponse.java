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

public class ComAliexpressPayAuthresultResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("not_success")
            private Boolean notSuccess;
        /** 1 */
                @ApiField("success")
            private Boolean success;
        /** 1 */
                @ApiField("module")
            private ComAliexpressPayAuthPaymentAuthResponse module;
        /** 1 */
                @ApiField("error_code")
            private String errorCode;
        /** 1 */
                @ApiField("repeated")
            private Boolean repeated;
        /** 1 */
                @ApiField("retry")
            private Boolean retry;
    
        public Boolean getNotSuccess() {
    return this.notSuccess;
    }
    public void setNotSuccess(Boolean notSuccess) {
    this.notSuccess = notSuccess;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public ComAliexpressPayAuthPaymentAuthResponse getModule() {
    return this.module;
    }
    public void setModule(ComAliexpressPayAuthPaymentAuthResponse module) {
    this.module = module;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public Boolean getRepeated() {
    return this.repeated;
    }
    public void setRepeated(Boolean repeated) {
    this.repeated = repeated;
    }
        public Boolean getRetry() {
    return this.retry;
    }
    public void setRetry(Boolean retry) {
    this.retry = retry;
    }
    }