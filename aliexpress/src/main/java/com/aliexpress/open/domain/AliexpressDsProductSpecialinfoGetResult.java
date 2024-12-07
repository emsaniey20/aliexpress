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

public class AliexpressDsProductSpecialinfoGetResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** bool to tag if it is success */
                @ApiField("ret")
            private Boolean ret;
        /** error code  */
                @ApiField("code")
            private String code;
        /** data_demo */
                @ApiField("data")
            private AliexpressDsProductSpecialinfoGetItemSpecialData data;
        /** error message */
                @ApiField("err_message")
            private String errMessage;
    
        public Boolean getRet() {
    return this.ret;
    }
    public void setRet(Boolean ret) {
    this.ret = ret;
    }
        public String getCode() {
    return this.code;
    }
    public void setCode(String code) {
    this.code = code;
    }
        public AliexpressDsProductSpecialinfoGetItemSpecialData getData() {
    return this.data;
    }
    public void setData(AliexpressDsProductSpecialinfoGetItemSpecialData data) {
    this.data = data;
    }
        public String getErrMessage() {
    return this.errMessage;
    }
    public void setErrMessage(String errMessage) {
    this.errMessage = errMessage;
    }
    }