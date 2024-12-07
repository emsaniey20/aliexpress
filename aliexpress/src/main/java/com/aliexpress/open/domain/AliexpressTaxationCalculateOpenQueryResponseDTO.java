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

public class AliexpressTaxationCalculateOpenQueryResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 数据 */
                @ApiField("data")
            private AliexpressTaxationCalculateOpenQueryHjTaxCalculateResultDTO data;
        /** 错误编码 */
                @ApiField("error_code")
            private String errorCode;
        /** 成功标记 */
                @ApiField("succeeded")
            private Boolean succeeded;
        /** 错误信息 */
                @ApiField("error_msg")
            private String errorMsg;
    
        public AliexpressTaxationCalculateOpenQueryHjTaxCalculateResultDTO getData() {
    return this.data;
    }
    public void setData(AliexpressTaxationCalculateOpenQueryHjTaxCalculateResultDTO data) {
    this.data = data;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public Boolean getSucceeded() {
    return this.succeeded;
    }
    public void setSucceeded(Boolean succeeded) {
    this.succeeded = succeeded;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
    }