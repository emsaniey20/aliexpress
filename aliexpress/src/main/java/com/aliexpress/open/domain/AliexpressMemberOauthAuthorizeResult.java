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

public class AliexpressMemberOauthAuthorizeResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** return_object */
                @ApiField("return_object")
            private AliexpressMemberOauthAuthorizeAuthToken returnObject;
        /** code */
                @ApiField("code")
            private Integer code;
        /** code info */
                @ApiField("code_info")
            private String codeInfo;
    
        public AliexpressMemberOauthAuthorizeAuthToken getReturnObject() {
    return this.returnObject;
    }
    public void setReturnObject(AliexpressMemberOauthAuthorizeAuthToken returnObject) {
    this.returnObject = returnObject;
    }
        public Integer getCode() {
    return this.code;
    }
    public void setCode(Integer code) {
    this.code = code;
    }
        public String getCodeInfo() {
    return this.codeInfo;
    }
    public void setCodeInfo(String codeInfo) {
    this.codeInfo = codeInfo;
    }
    }