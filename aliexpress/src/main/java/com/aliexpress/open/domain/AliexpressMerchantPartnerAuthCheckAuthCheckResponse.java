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

public class AliexpressMerchantPartnerAuthCheckAuthCheckResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 验证结果 */
                @ApiField("authed")
            private Boolean authed;
        /** 认证异常原因 */
                @ApiField("abnorm_desc")
            private String abnormDesc;
        /** 检验结果 */
                @ApiField("check_results")
            private String checkResults;
    
        public Boolean getAuthed() {
    return this.authed;
    }
    public void setAuthed(Boolean authed) {
    this.authed = authed;
    }
        public String getAbnormDesc() {
    return this.abnormDesc;
    }
    public void setAbnormDesc(String abnormDesc) {
    this.abnormDesc = abnormDesc;
    }
        public String getCheckResults() {
    return this.checkResults;
    }
    public void setCheckResults(String checkResults) {
    this.checkResults = checkResults;
    }
    }