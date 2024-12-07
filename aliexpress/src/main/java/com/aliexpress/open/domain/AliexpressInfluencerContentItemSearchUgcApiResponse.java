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

public class AliexpressInfluencerContentItemSearchUgcApiResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 成功标识 */
                @ApiField("fail")
            private Boolean fail;
        /** 数据 */
                @ApiField("data")
            private AliexpressInfluencerContentItemSearchPaginationList data;
        /** 成功标识 */
                @ApiField("success")
            private Boolean success;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
    
        public Boolean getFail() {
    return this.fail;
    }
    public void setFail(Boolean fail) {
    this.fail = fail;
    }
        public AliexpressInfluencerContentItemSearchPaginationList getData() {
    return this.data;
    }
    public void setData(AliexpressInfluencerContentItemSearchPaginationList data) {
    this.data = data;
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
    }