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

public class AliexpressLogisticsValueaddedInsuranceEstimateGlspResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 返回实体,包含四个字段:1.是否校验通过，2.保费，3投保金额下限，4投保金额上限，5高货值保险类型 */
                @ApiField("result")
            private String result;
        /** 错误栈 */
                @ApiListField("error_info_details")
            private List<String> errorInfoDetails;
        /** 错误信息 */
                @ApiField("error_info")
            private AliexpressLogisticsValueaddedInsuranceEstimateErrorInfo errorInfo;
        /** 是否重试 */
                @ApiField("retry")
            private Boolean retry;
        /** 是否成功 */
                @ApiField("is_success")
            private Boolean isSuccess;
    
        public String getResult() {
    return this.result;
    }
    public void setResult(String result) {
    this.result = result;
    }
        public List<String> getErrorInfoDetails() {
    return this.errorInfoDetails;
    }
    public void setErrorInfoDetails(List<String> errorInfoDetails) {
    this.errorInfoDetails = errorInfoDetails;
    }
        public AliexpressLogisticsValueaddedInsuranceEstimateErrorInfo getErrorInfo() {
    return this.errorInfo;
    }
    public void setErrorInfo(AliexpressLogisticsValueaddedInsuranceEstimateErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    }
        public Boolean getRetry() {
    return this.retry;
    }
    public void setRetry(Boolean retry) {
    this.retry = retry;
    }
        public Boolean getIsSuccess() {
    return this.isSuccess;
    }
    public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    }
    }