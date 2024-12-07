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

public class AliexpressCategoryRedefiningGetallchildattributesresultAeopAttributeResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 发布属性list */
                @ApiListField("attributes")
            private List<AliexpressCategoryRedefiningGetallchildattributesresultAeopAttributeDTO> attributes;
        /** errorCode */
                @ApiField("error_code")
            private String errorCode;
        /** errorMessage */
                @ApiField("error_message")
            private String errorMessage;
        /** 服务调用是否成功 */
                @ApiField("success")
            private Boolean success;
    
        public List<AliexpressCategoryRedefiningGetallchildattributesresultAeopAttributeDTO> getAttributes() {
    return this.attributes;
    }
    public void setAttributes(List<AliexpressCategoryRedefiningGetallchildattributesresultAeopAttributeDTO> attributes) {
    this.attributes = attributes;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
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
    }