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

public class AriseReverseOrderQueryPagedResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 成功与否 */
                @ApiField("success")
            private Boolean success;
        /** {} */
                @ApiField("page_info")
            private AriseReverseOrderQueryPagedResult$PageInfo pageInfo;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
        /** 数据对象 */
                @ApiListField("data_source")
            private List<AriseReverseOrderQueryOpenApiReverseOrderResponse> dataSource;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
    
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public AriseReverseOrderQueryPagedResult$PageInfo getPageInfo() {
    return this.pageInfo;
    }
    public void setPageInfo(AriseReverseOrderQueryPagedResult$PageInfo pageInfo) {
    this.pageInfo = pageInfo;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public List<AriseReverseOrderQueryOpenApiReverseOrderResponse> getDataSource() {
    return this.dataSource;
    }
    public void setDataSource(List<AriseReverseOrderQueryOpenApiReverseOrderResponse> dataSource) {
    this.dataSource = dataSource;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
    }