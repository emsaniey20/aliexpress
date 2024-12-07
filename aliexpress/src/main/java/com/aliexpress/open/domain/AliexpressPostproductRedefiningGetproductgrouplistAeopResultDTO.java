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

public class AliexpressPostproductRedefiningGetproductgrouplistAeopResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 错误代码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
        /** 接口的调用结果。true/false分别表示成功和失败。 */
                @ApiField("success")
            private Boolean success;
        /** 产品分组信息 */
                @ApiListField("target_list")
            private List<AliexpressPostproductRedefiningGetproductgrouplistAeopAEProductTreeGroup> targetList;
        /** 调用接口的时间戳 */
                @ApiField("time_stamp")
            private String timeStamp;
    
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public List<AliexpressPostproductRedefiningGetproductgrouplistAeopAEProductTreeGroup> getTargetList() {
    return this.targetList;
    }
    public void setTargetList(List<AliexpressPostproductRedefiningGetproductgrouplistAeopAEProductTreeGroup> targetList) {
    this.targetList = targetList;
    }
        public String getTimeStamp() {
    return this.timeStamp;
    }
    public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    }
    }