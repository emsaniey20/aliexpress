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

public class CainiaoGlobalSolutionServiceResourceQueryGlspResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 查询是否成功 */
                @ApiField("is_success")
            private Boolean isSuccess;
        /** 错误信息 */
                @ApiField("error_info")
            private CainiaoGlobalSolutionServiceResourceQueryErrorInfo errorInfo;
        /** 请求结果 */
                @ApiField("result")
            private CainiaoGlobalSolutionServiceResourceQueryOpenSolutionServiceResQueryResponse result;
    
        public Boolean getIsSuccess() {
    return this.isSuccess;
    }
    public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    }
        public CainiaoGlobalSolutionServiceResourceQueryErrorInfo getErrorInfo() {
    return this.errorInfo;
    }
    public void setErrorInfo(CainiaoGlobalSolutionServiceResourceQueryErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    }
        public CainiaoGlobalSolutionServiceResourceQueryOpenSolutionServiceResQueryResponse getResult() {
    return this.result;
    }
    public void setResult(CainiaoGlobalSolutionServiceResourceQueryOpenSolutionServiceResQueryResponse result) {
    this.result = result;
    }
    }