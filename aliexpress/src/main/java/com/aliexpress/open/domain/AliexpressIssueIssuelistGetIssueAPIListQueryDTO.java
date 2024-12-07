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

public class AliexpressIssueIssuelistGetIssueAPIListQueryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 买家登录id */
                @ApiField("buyer_login_id")
            private String buyerLoginId;
        /** 当前页 */
                @ApiField("current_page")
            private Integer currentPage;
        /** 纠纷状态 处理中processing、 纠纷取消canceled_issue、纠纷完结,退款处理完成finish */
                @ApiField("issue_status")
            private String issueStatus;
        /** 订单号 */
                @ApiField("order_no")
            private Long orderNo;
        /** 每页大小，不要大于50. */
                @ApiField("page_size")
            private Integer pageSize;
    
        public String getBuyerLoginId() {
    return this.buyerLoginId;
    }
    public void setBuyerLoginId(String buyerLoginId) {
    this.buyerLoginId = buyerLoginId;
    }
        public Integer getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    }
        public String getIssueStatus() {
    return this.issueStatus;
    }
    public void setIssueStatus(String issueStatus) {
    this.issueStatus = issueStatus;
    }
        public Long getOrderNo() {
    return this.orderNo;
    }
    public void setOrderNo(Long orderNo) {
    this.orderNo = orderNo;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
    }