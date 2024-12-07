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

public class AliexpressSellercenterProxyVkshopsSellerStatusUpdateresultResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Error code */
                @ApiField("code")
            private String code;
        /** Error msg */
                @ApiField("msg")
            private String msg;
        /** Is request success? */
                @ApiField("success")
            private Boolean success;
        /** Value */
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