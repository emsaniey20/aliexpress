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

public class AliexpressPhotobankRedefiningGetphotobankinfoAeopPhotoBankInfoResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 图片银行总容量，单位字节。 */
                @ApiField("capicity")
            private Long capicity;
        /** 图片银行已使用量，单位字节。 */
                @ApiField("useage")
            private Long useage;
        /** 错误代码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
    
        public Long getCapicity() {
    return this.capicity;
    }
    public void setCapicity(Long capicity) {
    this.capicity = capicity;
    }
        public Long getUseage() {
    return this.useage;
    }
    public void setUseage(Long useage) {
    this.useage = useage;
    }
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
    }