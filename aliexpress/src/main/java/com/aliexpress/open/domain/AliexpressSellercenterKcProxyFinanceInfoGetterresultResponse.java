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

public class AliexpressSellercenterKcProxyFinanceInfoGetterresultResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Message */
                @ApiField("msg")
            private String msg;
        /** 默认描述 */
                @ApiField("code")
            private String code;
        /** Success */
                @ApiField("success")
            private Boolean success;
        /** data */
                @ApiField("value")
            private AliexpressSellercenterKcProxyFinanceInfoGetterFinanceInfoForTOP value;
    
        public String getMsg() {
    return this.msg;
    }
    public void setMsg(String msg) {
    this.msg = msg;
    }
        public String getCode() {
    return this.code;
    }
    public void setCode(String code) {
    this.code = code;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public AliexpressSellercenterKcProxyFinanceInfoGetterFinanceInfoForTOP getValue() {
    return this.value;
    }
    public void setValue(AliexpressSellercenterKcProxyFinanceInfoGetterFinanceInfoForTOP value) {
    this.value = value;
    }
    }