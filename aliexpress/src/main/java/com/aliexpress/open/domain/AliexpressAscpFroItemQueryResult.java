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

public class AliexpressAscpFroItemQueryResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** dto */
                @ApiListField("data_list")
            private List<AliexpressAscpFroItemQueryString> dataList;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
        /** 错误信息 */
                @ApiField("error_msg")
            private String errorMsg;
        /** 是否成功 */
                @ApiField("success")
            private Boolean success;
    
        public List<AliexpressAscpFroItemQueryString> getDataList() {
    return this.dataList;
    }
    public void setDataList(List<AliexpressAscpFroItemQueryString> dataList) {
    this.dataList = dataList;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
    }