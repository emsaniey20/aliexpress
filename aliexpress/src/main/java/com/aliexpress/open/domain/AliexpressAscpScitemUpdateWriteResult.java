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

public class AliexpressAscpScitemUpdateWriteResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 货品编辑是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 货品创建请求序列号，用于问题排查 */
                @ApiField("request_no")
            private String requestNo;
        /** 错误编码 */
                @ApiField("error_code")
            private String errorCode;
        /** 错误描述 */
                @ApiField("error_msg")
            private String errorMsg;
    
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getRequestNo() {
    return this.requestNo;
    }
    public void setRequestNo(String requestNo) {
    this.requestNo = requestNo;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
    }