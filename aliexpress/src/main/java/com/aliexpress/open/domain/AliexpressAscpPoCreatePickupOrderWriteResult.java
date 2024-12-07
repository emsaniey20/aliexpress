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

public class AliexpressAscpPoCreatePickupOrderWriteResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 接口调用成功时返回揽货单号，失败是为空 */
                @ApiField("data")
            private String data;
        /** 接口调用是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 错误编码 */
                @ApiField("error_code")
            private String errorCode;
        /** 入参中的请求外部单号，用于错误排查 */
                @ApiField("request_no")
            private String requestNo;
        /** 错误描述 */
                @ApiField("error_msg")
            private String errorMsg;
    
        public String getData() {
    return this.data;
    }
    public void setData(String data) {
    this.data = data;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getRequestNo() {
    return this.requestNo;
    }
    public void setRequestNo(String requestNo) {
    this.requestNo = requestNo;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
    }