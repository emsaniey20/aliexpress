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

public class AliexpressRuAffiliateOrderListbyindexResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Response status code */
                @ApiField("code")
            private Long code;
        /** Response status code */
                @ApiField("msg")
            private String msg;
        /** Response result */
                @ApiField("result")
            private AliexpressRuAffiliateOrderListbyindexTrafficOrderResultDTO result;
    
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
        public AliexpressRuAffiliateOrderListbyindexTrafficOrderResultDTO getResult() {
    return this.result;
    }
    public void setResult(AliexpressRuAffiliateOrderListbyindexTrafficOrderResultDTO result) {
    this.result = result;
    }
    }