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

public class AliexpressIssuePartnerOrderIssuesGetAeopIssueInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 纠纷创建时间，格式为yyyy-MM-dd HH:mm:ss，为美国太平洋时间 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 纠纷修改时间，格式为：yyyy-MM-dd HH:mm:ss，为美国太平洋时间 */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** 纠纷ID */
                @ApiField("id")
            private Long id;
        /** 纠纷状态 */
                @ApiField("issue_status")
            private String issueStatus;
        /** 子订单id */
                @ApiField("order_id")
            private Long orderId;
        /** 父订单id */
                @ApiField("parent_order_id")
            private Long parentOrderId;
        /** 纠纷原因中文描述 */
                @ApiField("reason_chinese")
            private String reasonChinese;
        /** 纠纷原因英文描述 */
                @ApiField("reason_english")
            private String reasonEnglish;
    
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
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
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