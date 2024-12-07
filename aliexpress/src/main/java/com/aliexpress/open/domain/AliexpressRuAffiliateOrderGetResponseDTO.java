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

public class AliexpressRuAffiliateOrderGetResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Result */
                @ApiField("result")
            private AliexpressRuAffiliateOrderGetTrafficOrderResultDTO result;
        /** Response status message */
                @ApiField("msg")
            private String msg;
        /** Response status code */
                @ApiField("code")
            private Integer code;
    
        public AliexpressRuAffiliateOrderGetTrafficOrderResultDTO getResult() {
    return this.result;
    }
    public void setResult(AliexpressRuAffiliateOrderGetTrafficOrderResultDTO result) {
    this.result = result;
    }
        public String getMsg() {
    return this.msg;
    }
    public void setMsg(String msg) {
    this.msg = msg;
    }
        public Integer getCode() {
    return this.code;
    }
    public void setCode(Integer code) {
    this.code = code;
    }
    }