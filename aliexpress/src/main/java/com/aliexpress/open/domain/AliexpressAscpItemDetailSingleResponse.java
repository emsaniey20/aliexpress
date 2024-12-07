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

public class AliexpressAscpItemDetailSingleResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("data")
            private AliexpressAscpItemDetailErpScItemDetailDTO data;
        /** 错误码 */
                @ApiField("err_code")
            private String errCode;
        /** 网络是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 错误信息 */
                @ApiField("err_message")
            private String errMessage;
    
        public AliexpressAscpItemDetailErpScItemDetailDTO getData() {
    return this.data;
    }
    public void setData(AliexpressAscpItemDetailErpScItemDetailDTO data) {
    this.data = data;
    }
        public String getErrCode() {
    return this.errCode;
    }
    public void setErrCode(String errCode) {
    this.errCode = errCode;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getErrMessage() {
    return this.errMessage;
    }
    public void setErrMessage(String errMessage) {
    this.errMessage = errMessage;
    }
    }