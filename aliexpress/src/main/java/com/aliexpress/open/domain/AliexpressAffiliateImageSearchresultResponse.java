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

public class AliexpressAffiliateImageSearchresultResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Status description of response result */
                @ApiField("msg")
            private String msg;
        /** Status code of Response results */
                @ApiField("resp_code")
            private String respCode;
        /** Search result */
                @ApiField("data")
            private AliexpressAffiliateImageSearchTrafficImageSearchResultDTO data;
    
        public String getMsg() {
    return this.msg;
    }
    public void setMsg(String msg) {
    this.msg = msg;
    }
        public String getRespCode() {
    return this.respCode;
    }
    public void setRespCode(String respCode) {
    this.respCode = respCode;
    }
        public AliexpressAffiliateImageSearchTrafficImageSearchResultDTO getData() {
    return this.data;
    }
    public void setData(AliexpressAffiliateImageSearchTrafficImageSearchResultDTO data) {
    this.data = data;
    }
    }