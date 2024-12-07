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

public class CainiaoGlobalHandoverUpdateHsfResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 响应数据 */
                @ApiField("data")
            private CainiaoGlobalHandoverUpdateOpenHandoverUpdateResponse data;
        /** 错误信息 */
                @ApiField("error_msg")
            private String errorMsg;
        /** 异常码 */
                @ApiField("error_code")
            private String errorCode;
        /** 请求处理是否成功 */
                @ApiField("success")
            private Boolean success;
    
        public CainiaoGlobalHandoverUpdateOpenHandoverUpdateResponse getData() {
    return this.data;
    }
    public void setData(CainiaoGlobalHandoverUpdateOpenHandoverUpdateResponse data) {
    this.data = data;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
    }