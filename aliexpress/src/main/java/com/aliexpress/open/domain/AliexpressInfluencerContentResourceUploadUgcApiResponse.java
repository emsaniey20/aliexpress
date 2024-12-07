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

public class AliexpressInfluencerContentResourceUploadUgcApiResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 业务数据 */
                @ApiField("data")
            private AliexpressInfluencerContentResourceUploadResourceResponseDTO data;
        /** 成功标识 */
                @ApiField("success")
            private String success;
        /** 错误提示 */
                @ApiField("error_message")
            private String errorMessage;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
        /** 扩展信息 */
                @ApiField("attributes")
            private String attributes;
    
        public AliexpressInfluencerContentResourceUploadResourceResponseDTO getData() {
    return this.data;
    }
    public void setData(AliexpressInfluencerContentResourceUploadResourceResponseDTO data) {
    this.data = data;
    }
        public String getSuccess() {
    return this.success;
    }
    public void setSuccess(String success) {
    this.success = success;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getAttributes() {
    return this.attributes;
    }
    public void setAttributes(String attributes) {
    this.attributes = attributes;
    }
    }