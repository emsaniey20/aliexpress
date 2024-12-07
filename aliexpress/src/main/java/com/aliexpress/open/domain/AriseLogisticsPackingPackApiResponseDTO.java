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

public class AriseLogisticsPackingPackApiResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 打包明细结果 */
                @ApiListField("package_dto_list")
            private List<AriseLogisticsPackingPackingDTO> packageDtoList;
        /** 接口调用结果，true代表成功，false代表失败 */
                @ApiField("success")
            private Boolean success;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
        /** 错误码描述 */
                @ApiField("error_message")
            private String errorMessage;
    
        public List<AriseLogisticsPackingPackingDTO> getPackageDtoList() {
    return this.packageDtoList;
    }
    public void setPackageDtoList(List<AriseLogisticsPackingPackingDTO> packageDtoList) {
    this.packageDtoList = packageDtoList;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
    }