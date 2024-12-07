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

public class AliexpressTradeNewRedefiningcopy3AeopResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("time_stamp")
            private Long timeStamp;
        /** 1 */
                @ApiField("success")
            private Boolean success;
        /** 1 */
                @ApiField("error_message")
            private String errorMessage;
        /** 1 */
                @ApiField("error_code")
            private String errorCode;
        /** 1 */
                @ApiField("target")
            private AliexpressTradeNewRedefiningcopy3AeopTpOrderDetailDTO target;
    
        public Long getTimeStamp() {
    return this.timeStamp;
    }
    public void setTimeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public AliexpressTradeNewRedefiningcopy3AeopTpOrderDetailDTO getTarget() {
    return this.target;
    }
    public void setTarget(AliexpressTradeNewRedefiningcopy3AeopTpOrderDetailDTO target) {
    this.target = target;
    }
    }