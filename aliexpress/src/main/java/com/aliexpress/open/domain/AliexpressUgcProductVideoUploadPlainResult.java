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

public class AliexpressUgcProductVideoUploadPlainResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 数据 */
                @ApiField("data")
            private String data;
        /** 消息 */
                @ApiField("message")
            private String message;
        /** 是否成功 */
                @ApiField("success")
            private Boolean success;
    
        public String getData() {
    return this.data;
    }
    public void setData(String data) {
    this.data = data;
    }
        public String getMessage() {
    return this.message;
    }
    public void setMessage(String message) {
    this.message = message;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
    }