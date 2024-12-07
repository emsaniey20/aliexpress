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

public class AliexpressCategoryRedefiningGetPropValueFeatureAeopResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** request success or not */
                @ApiField("success")
            private Boolean success;
        /** target object */
                @ApiField("target")
            private AliexpressCategoryRedefiningGetPropValueFeatureAeopFeatureDTO target;
        /** error code */
                @ApiField("errorCode")
            private String errorCode;
        /** error message */
                @ApiField("errorMessage")
            private String errorMessage;
    
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public AliexpressCategoryRedefiningGetPropValueFeatureAeopFeatureDTO getTarget() {
    return this.target;
    }
    public void setTarget(AliexpressCategoryRedefiningGetPropValueFeatureAeopFeatureDTO target) {
    this.target = target;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
    }