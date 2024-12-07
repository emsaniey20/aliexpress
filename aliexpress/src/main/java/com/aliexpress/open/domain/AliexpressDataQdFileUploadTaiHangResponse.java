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

public class AliexpressDataQdFileUploadTaiHangResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 调用是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 本例中固定为空 */
                @ApiField("module")
            private String module;
        /** 错误代码，1 - 文件过大；2 - 传参错误；3 - 分区文件数据超上限，单分区文件数量上限512，容量上限1G; 4 - 系统错误 */
                @ApiField("errorcode")
            private Integer errorcode;
        /** 错误信息 */
                @ApiField("error_msg")
            private String errorMsg;
    
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getModule() {
    return this.module;
    }
    public void setModule(String module) {
    this.module = module;
    }
        public Integer getErrorcode() {
    return this.errorcode;
    }
    public void setErrorcode(Integer errorcode) {
    this.errorcode = errorcode;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
    }