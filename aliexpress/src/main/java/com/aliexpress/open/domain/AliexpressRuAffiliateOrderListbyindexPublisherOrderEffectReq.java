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

public class AliexpressRuAffiliateOrderListbyindexPublisherOrderEffectReq implements Serializable {
    private static final long serialVersionUID = 1L;
        /** To */
                @ApiField("end_time")
            private String endTime;
        /** Site */
                @ApiField("locale_site")
            private String localeSite;
        /** Page number */
                @ApiField("page_no")
            private Long pageNo;
        /** Page size */
                @ApiField("page_size")
            private Long pageSize;
        /** Query index start value: if it is not passed, only the first page can be checked */
                @ApiField("start_query_index_id")
            private String startQueryIndexId;
        /** From */
                @ApiField("start_time")
            private String startTime;
        /** Order status: Payment Completed, Buyer Confirmed Receipt */
                @ApiField("status")
            private String status;
        /** Time type */
                @ApiField("time_type")
            private String timeType;
        /** Track id */
                @ApiField("track_id")
            private String trackId;
    
        public String getEndTime() {
    return this.endTime;
    }
    public void setEndTime(String endTime) {
    this.endTime = endTime;
    }
        public String getLocaleSite() {
    return this.localeSite;
    }
    public void setLocaleSite(String localeSite) {
    this.localeSite = localeSite;
    }
        public Long getPageNo() {
    return this.pageNo;
    }
    public void setPageNo(Long pageNo) {
    this.pageNo = pageNo;
    }
        public Long getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    }
        public String getStartQueryIndexId() {
    return this.startQueryIndexId;
    }
    public void setStartQueryIndexId(String startQueryIndexId) {
    this.startQueryIndexId = startQueryIndexId;
    }
        public String getStartTime() {
    return this.startTime;
    }
    public void setStartTime(String startTime) {
    this.startTime = startTime;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public String getTimeType() {
    return this.timeType;
    }
    public void setTimeType(String timeType) {
    this.timeType = timeType;
    }
        public String getTrackId() {
    return this.trackId;
    }
    public void setTrackId(String trackId) {
    this.trackId = trackId;
    }
    }