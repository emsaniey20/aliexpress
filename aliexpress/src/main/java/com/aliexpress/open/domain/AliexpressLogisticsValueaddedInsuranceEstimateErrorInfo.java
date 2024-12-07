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

public class AliexpressLogisticsValueaddedInsuranceEstimateErrorInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 内部错误信息 */
                @ApiField("internal_error_msg")
            private String internalErrorMsg;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
        /** 内部错误码 */
                @ApiField("internal_error_code")
            private String internalErrorCode;
        /** 是否重试 */
                @ApiField("retry")
            private Boolean retry;
        /** 错误信息 */
                @ApiField("error_msg")
            private String errorMsg;
    
        public String getInternalErrorMsg() {
    return this.internalErrorMsg;
    }
    public void setInternalErrorMsg(String internalErrorMsg) {
    this.internalErrorMsg = internalErrorMsg;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getInternalErrorCode() {
    return this.internalErrorCode;
    }
    public void setInternalErrorCode(String internalErrorCode) {
    this.internalErrorCode = internalErrorCode;
    }
        public Boolean getRetry() {
    return this.retry;
    }
    public void setRetry(Boolean retry) {
    this.retry = retry;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
    }