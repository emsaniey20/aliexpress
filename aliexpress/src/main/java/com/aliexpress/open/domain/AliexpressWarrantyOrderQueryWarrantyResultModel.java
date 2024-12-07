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

public class AliexpressWarrantyOrderQueryWarrantyResultModel implements Serializable {
    private static final long serialVersionUID = 1L;
        /** isSuccessed */
                @ApiField("is_successed")
            private Boolean isSuccessed;
        /** returnValue */
                @ApiField("return_value")
            private String returnValue;
        /** exceptionDesc */
                @ApiField("exception_desc")
            private String exceptionDesc;
        /** exceptionCode */
                @ApiField("exception_code")
            private String exceptionCode;
    
        public Boolean getIsSuccessed() {
    return this.isSuccessed;
    }
    public void setIsSuccessed(Boolean isSuccessed) {
    this.isSuccessed = isSuccessed;
    }
        public String getReturnValue() {
    return this.returnValue;
    }
    public void setReturnValue(String returnValue) {
    this.returnValue = returnValue;
    }
        public String getExceptionDesc() {
    return this.exceptionDesc;
    }
    public void setExceptionDesc(String exceptionDesc) {
    this.exceptionDesc = exceptionDesc;
    }
        public String getExceptionCode() {
    return this.exceptionCode;
    }
    public void setExceptionCode(String exceptionCode) {
    this.exceptionCode = exceptionCode;
    }
    }