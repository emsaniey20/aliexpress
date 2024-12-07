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

public class AliexpressSolutionOrderInfoGetGlobalAeopTpOrderMsgDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** order creation time */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** order modification time */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** business order id */
                @ApiField("business_order_id")
            private Integer businessOrderId;
        /** message status */
                @ApiField("status")
            private String status;
        /** meesage content */
                @ApiField("content")
            private String content;
        /** message sender ( buyer; seller) */
                @ApiField("poster")
            private String poster;
        /** sender login ID */
                @ApiField("sender_login_id")
            private String senderLoginId;
        /** sender account seq */
                @ApiField("sender_seq")
            private Long senderSeq;
        /** sender admin account seq */
                @ApiField("sender_admin_seq")
            private Long senderAdminSeq;
        /** sender first name */
                @ApiField("sender_first_name")
            private String senderFirstName;
        /** send last name */
                @ApiField("sender_last_name")
            private String senderLastName;
        /** receiver ID */
                @ApiField("receiver_login_id")
            private String receiverLoginId;
        /** receiver account seq */
                @ApiField("receiver_seq")
            private Long receiverSeq;
        /** receiver admin account seq */
                @ApiField("receiver_admin_seq")
            private Long receiverAdminSeq;
        /** receiver first name */
                @ApiField("receiver_first_name")
            private String receiverFirstName;
        /** receiver last name */
                @ApiField("receiver_last_name")
            private String receiverLastName;
        /** order id */
                @ApiField("id")
            private Long id;
    
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
        public Integer getBusinessOrderId() {
    return this.businessOrderId;
    }
    public void setBusinessOrderId(Integer businessOrderId) {
    this.businessOrderId = businessOrderId;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public String getContent() {
    return this.content;
    }
    public void setContent(String content) {
    this.content = content;
    }
        public String getPoster() {
    return this.poster;
    }
    public void setPoster(String poster) {
    this.poster = poster;
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
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
    }