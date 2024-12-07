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

public class AliexpressSellercenterProxyChatMessageReadresultResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 默认描述 */
                @ApiField("code")
            private String code;
        /** msg */
                @ApiField("msg")
            private String msg;
        /** if success */
                @ApiField("success")
            private Boolean success;
        /** service value */
                @ApiField("value")
            private Boolean value;
    
        public String getCode() {
    return this.code;
    }
    public void setCode(String code) {
    this.code = code;
    }
        public String getMsg() {
    return this.msg;
    }
    public void setMsg(String msg) {
    this.msg = msg;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public Boolean getValue() {
    return this.value;
    }
    public void setValue(Boolean value) {
    this.value = value;
    }
    }