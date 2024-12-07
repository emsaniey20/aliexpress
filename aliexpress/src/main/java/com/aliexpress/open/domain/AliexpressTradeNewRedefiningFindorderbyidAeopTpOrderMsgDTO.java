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

public class AliexpressTradeNewRedefiningFindorderbyidAeopTpOrderMsgDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 订单号 */
                @ApiField("business_order_id")
            private Integer businessOrderId;
        /** 留言内容 */
                @ApiField("content")
            private String content;
        /** 创建时间 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 修改时间 */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** id */
                @ApiField("id")
            private Long id;
        /** 信息发送方( buyer; seller) */
                @ApiField("poster")
            private String poster;
        /** 接收者主帐号序号 */
                @ApiField("receiver_admin_seq")
            private Long receiverAdminSeq;
        /** 接收者FirstName */
                @ApiField("receiver_first_name")
            private String receiverFirstName;
        /** 接收者LastName */
                @ApiField("receiver_last_name")
            private String receiverLastName;
        /** 接收者帐号ID */
                @ApiField("receiver_login_id")
            private String receiverLoginId;
        /** 接收者帐号序号 */
                @ApiField("receiver_seq")
            private Long receiverSeq;
        /** 发送者主帐号序号 */
                @ApiField("sender_admin_seq")
            private Long senderAdminSeq;
        /** 发送者FirstName */
                @ApiField("sender_first_name")
            private String senderFirstName;
        /** 发送者LastName */
                @ApiField("sender_last_name")
            private String senderLastName;
        /** 发送者帐号ID */
                @ApiField("sender_login_id")
            private String senderLoginId;
        /** 发送者帐号序号 */
                @ApiField("sender_seq")
            private Long senderSeq;
        /** 留言状态 */
                @ApiField("status")
            private String status;
    
        public Integer getBusinessOrderId() {
    return this.businessOrderId;
    }
    public void setBusinessOrderId(Integer businessOrderId) {
    this.businessOrderId = businessOrderId;
    }
        public String getContent() {
    return this.content;
    }
    public void setContent(String content) {
    this.content = content;
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
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public String getPoster() {
    return this.poster;
    }
    public void setPoster(String poster) {
    this.poster = poster;
    }
        public Long getReceiverAdminSeq() {
    return this.receiverAdminSeq;
    }
    public void setReceiverAdminSeq(Long receiverAdminSeq) {
    this.receiverAdminSeq = receiverAdminSeq;
    }
        public String getReceiverFirstName() {
    return this.receiverFirstName;
    }
    public void setReceiverFirstName(String receiverFirstName) {
    this.receiverFirstName = receiverFirstName;
    }
        public String getReceiverLastName() {
    return this.receiverLastName;
    }
    public void setReceiverLastName(String receiverLastName) {
    this.receiverLastName = receiverLastName;
    }
        public String getReceiverLoginId() {
    return this.receiverLoginId;
    }
    public void setReceiverLoginId(String receiverLoginId) {
    this.receiverLoginId = receiverLoginId;
    }
        public Long getReceiverSeq() {
    return this.receiverSeq;
    }
    public void setReceiverSeq(Long receiverSeq) {
    this.receiverSeq = receiverSeq;
    }
        public Long getSenderAdminSeq() {
    return this.senderAdminSeq;
    }
    public void setSenderAdminSeq(Long senderAdminSeq) {
    this.senderAdminSeq = senderAdminSeq;
    }
        public String getSenderFirstName() {
    return this.senderFirstName;
    }
    public void setSenderFirstName(String senderFirstName) {
    this.senderFirstName = senderFirstName;
    }
        public String getSenderLastName() {
    return this.senderLastName;
    }
    public void setSenderLastName(String senderLastName) {
    this.senderLastName = senderLastName;
    }
        public String getSenderLoginId() {
    return this.senderLoginId;
    }
    public void setSenderLoginId(String senderLoginId) {
    this.senderLoginId = senderLoginId;
    }
        public Long getSenderSeq() {
    return this.senderSeq;
    }
    public void setSenderSeq(Long senderSeq) {
    this.senderSeq = senderSeq;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
    }