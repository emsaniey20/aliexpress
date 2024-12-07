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

public class AliexpressMessageHistoryBuyerListAeImQuerySessionDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 获取第一页时可能为空，获取下一页时请输入上一页响应字段last_buyer_id */
                @ApiField("last_buyer_id")
            private Long lastBuyerId;
        /** 页面大小 */
                @ApiField("page_size")
            private Integer pageSize;
        /** 当请求第一页时，请输入当前时间戳，获取下一页，请输入上一页响应字段next_start_time */
                @ApiField("start_time")
            private Long startTime;
    
        public Long getLastBuyerId() {
    return this.lastBuyerId;
    }
    public void setLastBuyerId(Long lastBuyerId) {
    this.lastBuyerId = lastBuyerId;
    }
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
    }