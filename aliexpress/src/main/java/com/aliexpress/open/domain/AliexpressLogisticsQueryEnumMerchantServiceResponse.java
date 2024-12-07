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

public class AliexpressLogisticsQueryEnumMerchantServiceResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** mode */
                @ApiField("mode")
            private AliexpressLogisticsQueryEnumQueryLocOrdersEnumDTO mode;
        /** 是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 错误信息 */
                @ApiField("error_info")
            private String errorInfo;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
    
        public AliexpressLogisticsQueryEnumQueryLocOrdersEnumDTO getMode() {
    return this.mode;
    }
    public void setMode(AliexpressLogisticsQueryEnumQueryLocOrdersEnumDTO mode) {
    this.mode = mode;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getErrorInfo() {
    return this.errorInfo;
    }
    public void setErrorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
    }