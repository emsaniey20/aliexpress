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

public class AliexpressPostproductRedefiningCreateproductgroupAeopResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 创建失败时的错误信息 */
                @ApiField("error_message")
            private String errorMessage;
        /** 创建产品分组的时间 */
                @ApiField("time_stamp")
            private String timeStamp;
        /** 新创建的产品组ID */
                @ApiField("target")
            private String target;
        /** 错误代码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 接口调用结果。true/false分别表示成功和失败。 */
                @ApiField("success")
            private Boolean success;
    
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public String getTimeStamp() {
    return this.timeStamp;
    }
    public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    }
        public String getTarget() {
    return this.target;
    }
    public void setTarget(String target) {
    this.target = target;
    }
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
    }