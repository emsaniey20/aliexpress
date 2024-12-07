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

public class AliexpressMessageList2AeImMessageDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 消息id */
                @ApiField("message_id")
            private String messageId;
        /** json格式的消息内容 */
                @ApiField("content")
            private String content;
        /** 发送方id */
                @ApiField("from_account_id")
            private String fromAccountId;
        /** 发送方账户类型, 11代表买家, 12 代表卖家 */
                @ApiField("from_account_type")
            private Integer fromAccountType;
        /** 消息发送时间戳 */
                @ApiField("send_time")
            private Long sendTime;
        /** 消息模版id 1： 正常文本消息 3： 图片消息 10006：表示商品卡片 10007：表示订单卡片 21004：优惠券卡片 */
                @ApiField("template_id")
            private Long templateId;
        /** 接收方账户类型, 11 代表买家, 12 代表卖家 */
                @ApiField("to_account_type")
            private Integer toAccountType;
        /** 接收方id */
                @ApiField("to_account_id")
            private String toAccountId;
        /** 1： 消息来自用户 2： 消息来自系统 */
                @ApiField("type")
            private Integer type;
    
        public String getMessageId() {
    return this.messageId;
    }
    public void setMessageId(String messageId) {
    this.messageId = messageId;
    }
        public String getContent() {
    return this.content;
    }
    public void setContent(String content) {
    this.content = content;
    }
        public String getFromAccountId() {
    return this.fromAccountId;
    }
    public void setFromAccountId(String fromAccountId) {
    this.fromAccountId = fromAccountId;
    }
        public Integer getFromAccountType() {
    return this.fromAccountType;
    }
    public void setFromAccountType(Integer fromAccountType) {
    this.fromAccountType = fromAccountType;
    }
        public Long getSendTime() {
    return this.sendTime;
    }
    public void setSendTime(Long sendTime) {
    this.sendTime = sendTime;
    }
        public Long getTemplateId() {
    return this.templateId;
    }
    public void setTemplateId(Long templateId) {
    this.templateId = templateId;
    }
        public Integer getToAccountType() {
    return this.toAccountType;
    }
    public void setToAccountType(Integer toAccountType) {
    this.toAccountType = toAccountType;
    }
        public String getToAccountId() {
    return this.toAccountId;
    }
    public void setToAccountId(String toAccountId) {
    this.toAccountId = toAccountId;
    }
        public Integer getType() {
    return this.type;
    }
    public void setType(Integer type) {
    this.type = type;
    }
    }