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

public class AliexpressAscpScitemCreateWriteResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 创建成功时返回货品Id，失败时为空 */
                @ApiField("data")
            private Long data;
        /** 接口调用是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 错误编码 */
                @ApiField("error_code")
            private String errorCode;
        /** 货品创建请求序列号，用于问题排查 */
                @ApiField("request_no")
            private String requestNo;
        /** 错误描述 */
                @ApiField("error_msg")
            private String errorMsg;
    
        public Long getData() {
    return this.data;
    }
    public void setData(Long data) {
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