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

public class UserdetailGetresultResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 结果失败 */
                @ApiField("not_success")
            private Boolean notSuccess;
        /** 结果成功 */
                @ApiField("success")
            private String success;
        /** 数据报文 */
                @ApiField("module")
            private UserdetailGetGlobalUserDTO module;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
    
        public Boolean getNotSuccess() {
    return this.notSuccess;
    }
    public void setNotSuccess(Boolean notSuccess) {
    this.notSuccess = notSuccess;
    }
        public String getSuccess() {
    return this.success;
    }
    public void setSuccess(String success) {
    this.success = success;
    }
        public UserdetailGetGlobalUserDTO getModule() {
    return this.module;
    }
    public void setModule(UserdetailGetGlobalUserDTO module) {
    this.module = module;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
    }