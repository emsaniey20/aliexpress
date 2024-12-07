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

public class CainiaoGlobalHandoverContentQueryOpenParcelOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 小包物流订单编码 */
                @ApiField("order_code")
            private String orderCode;
        /** 小包状态code */
                @ApiField("status")
            private String status;
        /** 小包异常码 */
                @ApiField("exception_code")
            private String exceptionCode;
        /** 小包状态名称 */
                @ApiField("status_name")
            private String statusName;
    
        public String getOrderCode() {
    return this.orderCode;
    }
    public void setOrderCode(String orderCode) {
    this.orderCode = orderCode;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public String getExceptionCode() {
    return this.exceptionCode;
    }
    public void setExceptionCode(String exceptionCode) {
    this.exceptionCode = exceptionCode;
    }
        public String getStatusName() {
    return this.statusName;
    }
    public void setStatusName(String statusName) {
    this.statusName = statusName;
    }
    }