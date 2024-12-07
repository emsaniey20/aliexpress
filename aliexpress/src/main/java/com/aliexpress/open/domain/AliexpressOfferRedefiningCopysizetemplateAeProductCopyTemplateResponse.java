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

public class AliexpressOfferRedefiningCopysizetemplateAeProductCopyTemplateResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 响应时间 */
                @ApiField("time_stamp")
            private String timeStamp;
        /** 错误码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 复制后产生的尺码模版ID */
                @ApiField("size_template_id")
            private Long sizeTemplateId;
        /** 是否成功 */
                @ApiField("is_success")
            private Boolean isSuccess;
        /** 响应错误信息 */
                @ApiField("error_message")
            private String errorMessage;
    
        public String getTimeStamp() {
    return this.timeStamp;
    }
    public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    }
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    }
        public Long getSizeTemplateId() {
    return this.sizeTemplateId;
    }
    public void setSizeTemplateId(Long sizeTemplateId) {
    this.sizeTemplateId = sizeTemplateId;
    }
        public Boolean getIsSuccess() {
    return this.isSuccess;
    }
    public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
    }