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

public class AliexpressAftersaleInsuranceOrderinfoGetInsuranceResultModel implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 错误code */
                @ApiField("exception_code")
            private String exceptionCode;
        /** 错误描述 */
                @ApiField("exception_desc")
            private String exceptionDesc;
        /** 返回值 */
                @ApiField("return_value")
            private AliexpressAftersaleInsuranceOrderinfoGetAeOrderForPolicyDTO returnValue;
        /** 接口调用是否成功 */
                @ApiField("success")
            private Boolean success;
    
        public String getExceptionCode() {
    return this.exceptionCode;
    }
    public void setExceptionCode(String exceptionCode) {
    this.exceptionCode = exceptionCode;
    }
        public String getExceptionDesc() {
    return this.exceptionDesc;
    }
    public void setExceptionDesc(String exceptionDesc) {
    this.exceptionDesc = exceptionDesc;
    }
        public AliexpressAftersaleInsuranceOrderinfoGetAeOrderForPolicyDTO getReturnValue() {
    return this.returnValue;
    }
    public void setReturnValue(AliexpressAftersaleInsuranceOrderinfoGetAeOrderForPolicyDTO returnValue) {
    this.returnValue = returnValue;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
    }