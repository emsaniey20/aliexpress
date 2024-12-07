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

public class AliexpressRuAffiliateProductdetailGetResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Response code */
                @ApiField("code")
            private Long code;
        /** Response message */
                @ApiField("msg")
            private String msg;
        /** Result */
                @ApiField("result")
            private AliexpressRuAffiliateProductdetailGetTrafficProductResultDTO result;
        /** Is success */
                @ApiField("success")
            private Boolean success;
    
        public Long getCode() {
    return this.code;
    }
    public void setCode(Long code) {
    this.code = code;
    }
        public String getMsg() {
    return this.msg;
    }
    public void setMsg(String msg) {
    this.msg = msg;
    }
        public AliexpressRuAffiliateProductdetailGetTrafficProductResultDTO getResult() {
    return this.result;
    }
    public void setResult(AliexpressRuAffiliateProductdetailGetTrafficProductResultDTO result) {
    this.result = result;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
    }