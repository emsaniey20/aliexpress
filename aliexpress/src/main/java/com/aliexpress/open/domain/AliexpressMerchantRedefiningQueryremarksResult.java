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

public class AliexpressMerchantRedefiningQueryremarksResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** errorCode */
                @ApiField("error_code")
            private Integer errorCode;
        /** data */
                @ApiListField("datas")
            private List<AliexpressMerchantRedefiningQueryremarksString> datas;
    
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    }
        public List<AliexpressMerchantRedefiningQueryremarksString> getDatas() {
    return this.datas;
    }
    public void setDatas(List<AliexpressMerchantRedefiningQueryremarksString> datas) {
    this.datas = datas;
    }
    }