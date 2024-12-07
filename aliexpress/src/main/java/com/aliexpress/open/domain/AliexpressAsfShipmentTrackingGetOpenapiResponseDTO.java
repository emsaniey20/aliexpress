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

public class AliexpressAsfShipmentTrackingGetOpenapiResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** errorCode */
                @ApiField("errorCode")
            private String errorCode;
        /** errorMessage */
                @ApiField("errorMessage")
            private String errorMessage;
        /** success */
                @ApiField("success")
            private Boolean success;
        /** data */
                @ApiField("data")
            private AliexpressAsfShipmentTrackingGetTrackingQueryResponse data;
    
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
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public AliexpressAsfShipmentTrackingGetTrackingQueryResponse getData() {
    return this.data;
    }
    public void setData(AliexpressAsfShipmentTrackingGetTrackingQueryResponse data) {
    this.data = data;
    }
    }