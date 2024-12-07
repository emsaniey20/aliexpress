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

public class AliexpressMerchantPrivateFileGetBaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 错误code */
                @ApiField("code")
            private String code;
        /** 返回对象 */
                @ApiField("data")
            private AliexpressMerchantPrivateFileGetSellerPrivateFileDTO data;
        /** 请求结果 */
                @ApiField("ret_success")
            private Boolean retSuccess;
        /** error_message */
                @ApiField("error_message")
            private String errorMessage;
    
        public String getCode() {
    return this.code;
    }
    public void setCode(String code) {
    this.code = code;
    }
        public AliexpressMerchantPrivateFileGetSellerPrivateFileDTO getData() {
    return this.data;
    }
    public void setData(AliexpressMerchantPrivateFileGetSellerPrivateFileDTO data) {
    this.data = data;
    }
        public Boolean getRetSuccess() {
    return this.retSuccess;
    }
    public void setRetSuccess(Boolean retSuccess) {
    this.retSuccess = retSuccess;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
    }