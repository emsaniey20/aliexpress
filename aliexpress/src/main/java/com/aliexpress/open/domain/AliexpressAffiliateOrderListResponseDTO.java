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

public class AliexpressAffiliateOrderListResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Respond status code */
                @ApiField("resp_code")
            private Long respCode;
        /** Description of the respond status code */
                @ApiField("resp_msg")
            private String respMsg;
        /** Detail of the respond */
                @ApiField("result")
            private AliexpressAffiliateOrderListTrafficOrderResultDTO result;
    
        public Long getRespCode() {
    return this.respCode;
    }
    public void setRespCode(Long respCode) {
    this.respCode = respCode;
    }
        public String getRespMsg() {
    return this.respMsg;
    }
    public void setRespMsg(String respMsg) {
    this.respMsg = respMsg;
    }
        public AliexpressAffiliateOrderListTrafficOrderResultDTO getResult() {
    return this.result;
    }
    public void setResult(AliexpressAffiliateOrderListTrafficOrderResultDTO result) {
    this.result = result;
    }
    }