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

public class AliexpressTradeRedefiningFindorderbaseinfoOrderBaseInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 订单修改时间,此事件为美国太平洋时间。 */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** 冻结状态("NO_FROZEN":无冻结;"IN_FROZEN":冻结中) */
                @ApiField("frozen_status")
            private String frozenStatus;
        /** 纠纷状态("NO_ISSUE":无纠纷;"IN_ISSUE":纠纷中;"END_ISSUE":纠纷结束) */
                @ApiField("issue_status")
            private String issueStatus;
        /** 物流状态("WAIT_SELLER_SEND_GOODS":等待卖家发货; "SELLER_SEND_PART_GOODS": 卖家部分发货;"SELLER_SEND_GOODS":卖家已发货;"BUYER_ACCEPT_GOODS":买家确认收货;"NO_LOGISTICS":无物流) */
                @ApiField("logistics_status")
            private String logisticsStatus;
        /** 订单创建时间，此时间为美国太平洋时间。 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 订单放款状态("wait_loan":未放款;"loan_ok":已放款) */
                @ApiField("loan_status")
            private String loanStatus;
        /** 负责人账号ID */
                @ApiField("seller_operator_login_id")
            private String sellerOperatorLoginId;
        /** 资金状态("NOT_PAY":未付款;"PAY_SUCCESS":付款成功;"WAIT_SELLER_CHECK":等待卖家验款) */
                @ApiField("fund_status")
            private String fundStatus;
        /** 卖家全名 */
                @ApiField("seller_signer_fullname")
            private String sellerSignerFullname;
        /** 订单状态 */
                @ApiField("order_status")
            private String orderStatus;
    
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
    }
        public String getFrozenStatus() {
    return this.frozenStatus;
    }
    public void setFrozenStatus(String frozenStatus) {
    this.frozenStatus = frozenStatus;
    }
        public String getIssueStatus() {
    return this.issueStatus;
    }
    public void setIssueStatus(String issueStatus) {
    this.issueStatus = issueStatus;
    }
        public String getLogisticsStatus() {
    return this.logisticsStatus;
    }
    public void setLogisticsStatus(String logisticsStatus) {
    this.logisticsStatus = logisticsStatus;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getLoanStatus() {
    return this.loanStatus;
    }
    public void setLoanStatus(String loanStatus) {
    this.loanStatus = loanStatus;
    }
        public String getSellerOperatorLoginId() {
    return this.sellerOperatorLoginId;
    }
    public void setSellerOperatorLoginId(String sellerOperatorLoginId) {
    this.sellerOperatorLoginId = sellerOperatorLoginId;
    }
        public String getFundStatus() {
    return this.fundStatus;
    }
    public void setFundStatus(String fundStatus) {
    this.fundStatus = fundStatus;
    }
        public String getSellerSignerFullname() {
    return this.sellerSignerFullname;
    }
    public void setSellerSignerFullname(String sellerSignerFullname) {
    this.sellerSignerFullname = sellerSignerFullname;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
    }