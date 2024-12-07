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

public class AliexpressMessageHistoryListFetchAeImMessageResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 消息列表 */
                @ApiListField("message_list")
            private List<AliexpressMessageHistoryListAeImMessageDTO> messageList;
        /** 标识是否有更多页面，使用此字段确定是否需要继续拉动 */
                @ApiField("has_more")
            private Boolean hasMore;
        /** 下一页的开始时间戳，当拉动下一页时，需要将其作为输入参数传入 */
                @ApiField("next_start_time")
            private Long nextStartTime;
        /** 此页面上最后一条消息的ID。拉动下一页时，需要将其作为输入参数传入 */
                @ApiField("last_message_id")
            private String lastMessageId;
    
        public List<AliexpressMessageHistoryListAeImMessageDTO> getMessageList() {
    return this.messageList;
    }
    public void setMessageList(List<AliexpressMessageHistoryListAeImMessageDTO> messageList) {
    this.messageList = messageList;
    }
        public Boolean getHasMore() {
    return this.hasMore;
    }
    public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    }
        public Long getNextStartTime() {
    return this.nextStartTime;
    }
    public void setNextStartTime(Long nextStartTime) {
    this.nextStartTime = nextStartTime;
    }
        public String getLastMessageId() {
    return this.lastMessageId;
    }
    public void setLastMessageId(String lastMessageId) {
    this.lastMessageId = lastMessageId;
    }
    }