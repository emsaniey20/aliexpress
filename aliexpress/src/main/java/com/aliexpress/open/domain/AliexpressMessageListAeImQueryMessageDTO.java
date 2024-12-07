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

public class AliexpressMessageListAeImQueryMessageDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 页面大小，限 20 */
                @ApiField("page_size")
            private Integer pageSize;
        /** 开始时间戳，当请求第一页时，请输入当前时间戳，获取下一页，请输入上一页响应字段next_start_time */
                @ApiField("start_time")
            private Long startTime;
        /** 最后一条消息的ID，获取第一页时可能为空，获取下一页时请输入上一页响应字段last_message_id */
                @ApiField("last_message_id")
            private String lastMessageId;
        /** 买家id */
                @ApiField("buyer_id")
            private Long buyerId;
    
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
        public Long getStartTime() {
    return this.startTime;
    }
    public void setStartTime(Long startTime) {
    this.startTime = startTime;
    }
        public String getLastMessageId() {
    return this.lastMessageId;
    }
    public void setLastMessageId(String lastMessageId) {
    this.lastMessageId = lastMessageId;
    }
        public Long getBuyerId() {
    return this.buyerId;
    }
    public void setBuyerId(Long buyerId) {
    this.buyerId = buyerId;
    }
    }