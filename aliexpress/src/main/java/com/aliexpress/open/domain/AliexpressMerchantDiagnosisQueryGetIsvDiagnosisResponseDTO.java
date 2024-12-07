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

public class AliexpressMerchantDiagnosisQueryGetIsvDiagnosisResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 调用结果 */
                @ApiField("success")
            private Boolean success;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
        /** 体检结果 */
                @ApiField("diagnosisResult")
            private AliexpressMerchantDiagnosisQueryIsvMerchantDiagnosisResultDTO diagnosisResult;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
    
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public AliexpressMerchantDiagnosisQueryIsvMerchantDiagnosisResultDTO getDiagnosisResult() {
    return this.diagnosisResult;
    }
    public void setDiagnosisResult(AliexpressMerchantDiagnosisQueryIsvMerchantDiagnosisResultDTO diagnosisResult) {
    this.diagnosisResult = diagnosisResult;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
    }