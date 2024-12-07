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

public class AliexpressTradeNewRedefiningcopy2AeopResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("time_stamp")
            private Long timeStamp;
        /** 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1 */
                @ApiField("success")
            private Boolean success;
        /** 11sa sad sdafsd11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf afasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("error_message")
            private String errorMessage;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("error_code")
            private String errorCode;
        /** 11sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf  */
                @ApiField("target")
            private AliexpressTradeNewRedefiningcopy2AeopTpOrderDetailDTO target;
    
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
        public AliexpressTradeNewRedefiningcopy2AeopTpOrderDetailDTO getTarget() {
    return this.target;
    }
    public void setTarget(AliexpressTradeNewRedefiningcopy2AeopTpOrderDetailDTO target) {
    this.target = target;
    }
    }