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

public class AliexpressTradeBuyPlaceorderPlaceOrderRes4OpenApiDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** errorCode */
                @ApiField("error_code")
            private String errorCode;
        /** errorMsg */
                @ApiField("error_msg")
            private String errorMsg;
        /** orderList */
                @ApiListField("order_list")
            private List<Long> orderList;
        /** success */
                @ApiField("is_success")
            private Boolean isSuccess;
    
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
        public List<Long> getOrderList() {
    return this.orderList;
    }
    public void setOrderList(List<Long> orderList) {
    this.orderList = orderList;
    }
        public Boolean getIsSuccess() {
    return this.isSuccess;
    }
    public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    }
    }