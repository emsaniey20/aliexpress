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

public class AliexpressSolutionOrderInfoGetcopy1692615547969BaseResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** error message */
                @ApiField("error_message")
            private String errorMessage;
        /** time stamp */
                @ApiField("time_stamp")
            private String timeStamp;
        /** error code */
                @ApiField("error_code")
            private String errorCode;
        /** data */
                @ApiField("data")
            private AliexpressSolutionOrderInfoGetcopy1692615547969GlobalAeopTpOrderDetailDTO data;
    
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public String getTimeStamp() {
    return this.timeStamp;
    }
    public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public AliexpressSolutionOrderInfoGetcopy1692615547969GlobalAeopTpOrderDetailDTO getData() {
    return this.data;
    }
    public void setData(AliexpressSolutionOrderInfoGetcopy1692615547969GlobalAeopTpOrderDetailDTO data) {
    this.data = data;
    }
    }