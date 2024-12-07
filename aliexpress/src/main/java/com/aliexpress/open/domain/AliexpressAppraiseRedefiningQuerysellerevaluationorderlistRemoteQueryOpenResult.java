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

public class AliexpressAppraiseRedefiningQuerysellerevaluationorderlistRemoteQueryOpenResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
        /** 订单列表 */
                @ApiListField("result_list")
            private List<String> resultList;
        /** 符合条件的总订单数 */
                @ApiField("total_item")
            private Integer totalItem;
        /** 错误码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 查询是否成功 */
                @ApiField("is_success")
            private Boolean isSuccess;
        /** 未使用 */
                @ApiField("object_result")
            private String objectResult;
    
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public List<String> getResultList() {
    return this.resultList;
    }
    public void setResultList(List<String> resultList) {
    this.resultList = resultList;
    }
        public Integer getTotalItem() {
    return this.totalItem;
    }
    public void setTotalItem(Integer totalItem) {
    this.totalItem = totalItem;
    }
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    }
        public Boolean getIsSuccess() {
    return this.isSuccess;
    }
    public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    }
        public String getObjectResult() {
    return this.objectResult;
    }
    public void setObjectResult(String objectResult) {
    this.objectResult = objectResult;
    }
    }