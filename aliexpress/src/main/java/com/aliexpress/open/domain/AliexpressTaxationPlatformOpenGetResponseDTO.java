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

public class AliexpressTaxationPlatformOpenGetResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 数据 */
                @ApiField("data")
            private AliexpressTaxationPlatformOpenGetPlatformParameterDTO data;
        /** 错误代码 */
                @ApiField("error_code")
            private String errorCode;
        /** 是否成功 */
                @ApiField("succeeded")
            private Boolean succeeded;
        /** 错误信息 */
                @ApiField("error_msg")
            private String errorMsg;
    
        public AliexpressTaxationPlatformOpenGetPlatformParameterDTO getData() {
    return this.data;
    }
    public void setData(AliexpressTaxationPlatformOpenGetPlatformParameterDTO data) {
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