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

public class CainiaoGlobalCommithandovercontentUpdateHsfResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 是否成功同result字段 */
                @ApiField("success")
            private Boolean success;
        /** 错误码 */
                @ApiField("internal_error_code")
            private String internalErrorCode;
        /** 错误信息 */
                @ApiField("error_msg")
            private String errorMsg;
        /** 返回对象 */
                @ApiField("data")
            private CainiaoGlobalCommithandovercontentUpdateOpenHandoverContentUpdateResponse data;
    
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getInternalErrorCode() {
    return this.internalErrorCode;
    }
    public void setInternalErrorCode(String internalErrorCode) {
    this.internalErrorCode = internalErrorCode;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
        public CainiaoGlobalCommithandovercontentUpdateOpenHandoverContentUpdateResponse getData() {
    return this.data;
    }
    public void setData(CainiaoGlobalCommithandovercontentUpdateOpenHandoverContentUpdateResponse data) {
    this.data = data;
    }
    }