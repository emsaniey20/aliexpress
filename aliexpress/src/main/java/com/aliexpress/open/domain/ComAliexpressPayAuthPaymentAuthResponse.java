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

public class ComAliexpressPayAuthPaymentAuthResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 授权码 */
                @ApiField("auth_code")
            private String authCode;
        /** 1 */
                @ApiField("response_message")
            private String responseMessage;
        /** 1 */
                @ApiField("response_id")
            private String responseId;
        /** 1 */
                @ApiField("succeeded")
            private Boolean succeeded;
        /** 1 */
                @ApiField("response_code")
            private String responseCode;
    
        public String getAuthCode() {
    return this.authCode;
    }
    public void setAuthCode(String authCode) {
    this.authCode = authCode;
    }
        public String getResponseMessage() {
    return this.responseMessage;
    }
    public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
    }
        public String getResponseId() {
    return this.responseId;
    }
    public void setResponseId(String responseId) {
    this.responseId = responseId;
    }
        public Boolean getSucceeded() {
    return this.succeeded;
    }
    public void setSucceeded(Boolean succeeded) {
    this.succeeded = succeeded;
    }
        public String getResponseCode() {
    return this.responseCode;
    }
    public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
    }
    }