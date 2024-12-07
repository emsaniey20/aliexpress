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

public class AliexpressPostproductRedefiningGetsizechartinfobycategoryidAeopAEProductSizeChartResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 错误信息 */
                @ApiField("error_msg")
            private String errorMsg;
        /** 尺码标模版列表 */
                @ApiListField("sizechart_d_t_o_list")
            private List<AliexpressPostproductRedefiningGetsizechartinfobycategoryidString> sizechartDTOList;
        /** 调用方法成功标识，true/false分别代表成功和失败 */
                @ApiField("success")
            private Boolean success;
        /** 错误代码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 系统异常信息 */
                @ApiField("error_message")
            private String errorMessage;
    
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
        public List<AliexpressPostproductRedefiningGetsizechartinfobycategoryidString> getSizechartDTOList() {
    return this.sizechartDTOList;
    }
    public void setSizechartDTOList(List<AliexpressPostproductRedefiningGetsizechartinfobycategoryidString> sizechartDTOList) {
    this.sizechartDTOList = sizechartDTOList;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
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