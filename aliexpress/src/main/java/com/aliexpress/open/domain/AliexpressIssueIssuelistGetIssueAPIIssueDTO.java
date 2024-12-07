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

public class AliexpressIssueIssuelistGetIssueAPIIssueDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 买家登录id */
                @ApiField("buyer_login_id")
            private String buyerLoginId;
        /** 创建时间 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 最后修改时间 */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** 纠纷id */
                @ApiField("issue_id")
            private Long issueId;
        /** 纠纷状态 处理中 processing、 纠纷取消canceled_issue、纠纷完结,退款处理完成finish */
                @ApiField("issue_status")
            private String issueStatus;
        /** 订单id */
                @ApiField("order_id")
            private Long orderId;
        /** 子订单id */
                @ApiField("parent_order_id")
            private Long parentOrderId;
        /** 纠纷原因中文 */
                @ApiField("reason_chinese")
            private String reasonChinese;
        /** 纠纷原因英文 */
                @ApiField("reason_english")
            private String reasonEnglish;
    
        public String getBuyerLoginId() {
    return this.buyerLoginId;
    }
    public void setBuyerLoginId(String buyerLoginId) {
    this.buyerLoginId = buyerLoginId;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
    }
        public Long getIssueId() {
    return this.issueId;
    }
    public void setIssueId(Long issueId) {
    this.issueId = issueId;
    }
        public String getIssueStatus() {
    return this.issueStatus;
    }
    public void setIssueStatus(String issueStatus) {
    this.issueStatus = issueStatus;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public Long getParentOrderId() {
    return this.parentOrderId;
    }
    public void setParentOrderId(Long parentOrderId) {
    this.parentOrderId = parentOrderId;
    }
        public String getReasonChinese() {
    return this.reasonChinese;
    }
    public void setReasonChinese(String reasonChinese) {
    this.reasonChinese = reasonChinese;
    }
        public String getReasonEnglish() {
    return this.reasonEnglish;
    }
    public void setReasonEnglish(String reasonEnglish) {
    this.reasonEnglish = reasonEnglish;
    }
    }