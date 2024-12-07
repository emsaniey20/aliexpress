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

public class AliexpressTradeRedefiningFindloanlistqueryFundloanRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 放款时间截止值，格式: mm/dd/yyyy hh:mm:ss,如10/09/2013 00:00:00。时间需精确到秒，否则条件无效。 */
                @ApiField("create_date_end")
            private String createDateEnd;
        /** 放款时间起始值，格式: mm/dd/yyyy hh:mm:ss,如10/08/2013 00:00:00。时间需精确到秒，否则条件无效。 */
                @ApiField("create_date_start")
            private String createDateStart;
        /** 订单放款状态：wait_loan 未放款，loan_ok已放款。 */
                @ApiField("loan_status")
            private String loanStatus;
        /** 当前页码.。 */
                @ApiField("page")
            private Integer page;
        /** 每页个数，最大200。 */
                @ApiField("page_size")
            private Integer pageSize;
        /** 主订单id，一次只能查询一个. */
                @ApiField("order_id")
            private Long orderId;
    
        public String getCreateDateEnd() {
    return this.createDateEnd;
    }
    public void setCreateDateEnd(String createDateEnd) {
    this.createDateEnd = createDateEnd;
    }
        public String getCreateDateStart() {
    return this.createDateStart;
    }
    public void setCreateDateStart(String createDateStart) {
    this.createDateStart = createDateStart;
    }
        public String getLoanStatus() {
    return this.loanStatus;
    }
    public void setLoanStatus(String loanStatus) {
    this.loanStatus = loanStatus;
    }
        public Integer getPage() {
    return this.page;
    }
    public void setPage(Integer page) {
    this.page = page;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
    }