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

public class AriseReverseOrderQueryOpenApiQueryReverseOrder4SellerParam implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 履约状态 */
                @ApiListField("ofc_status_list")
            private List<String> ofcStatusList;
        /** 毫秒时间戳，逆向单时间范围起始时间 */
                @ApiField("reverse_order_line_time_range_start_time_stamp")
            private Long reverseOrderLineTimeRangeStartTimeStamp;
        /** 逆向主单id */
                @ApiField("reverse_order_id")
            private Long reverseOrderId;
        /** 正向主单id */
                @ApiField("trade_order_id")
            private Long tradeOrderId;
        /** page size */
                @ApiField("page_size")
            private Integer pageSize;
        /** 毫秒时间戳，逆向单时间范围结束时间 */
                @ApiField("reverse_order_line_time_range_end_time_stamp")
            private Long reverseOrderLineTimeRangeEndTimeStamp;
        /** 渠道（可以在这个API中查询：global.seller.relation.query） */
                @ApiField("channel")
            private String channel;
        /** 毫秒时间戳，正向单时间范围起始时间 */
                @ApiField("trade_order_time_range_start_time_stamp")
            private Long tradeOrderTimeRangeStartTimeStamp;
        /** 毫秒时间戳，正向单时间范围结束时间 */
                @ApiField("trade_order_time_range_end_time_stamp")
            private Long tradeOrderTimeRangeEndTimeStamp;
        /** page no */
                @ApiField("page_no")
            private Integer pageNo;
        /** 在仲裁流程中 */
                @ApiField("dispute_in_progress")
            private Boolean disputeInProgress;
        /** 逆向物流单号 */
                @ApiField("tracking_number")
            private String trackingNumber;
        /** 逆向状态列表 */
                @ApiListField("reverse_status_list")
            private List<String> reverseStatusList;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query） */
                @ApiField("channel_seller_id")
            private Long channelSellerId;
    
        public List<String> getOfcStatusList() {
    return this.ofcStatusList;
    }
    public void setOfcStatusList(List<String> ofcStatusList) {
    this.ofcStatusList = ofcStatusList;
    }
        public Long getReverseOrderLineTimeRangeStartTimeStamp() {
    return this.reverseOrderLineTimeRangeStartTimeStamp;
    }
    public void setReverseOrderLineTimeRangeStartTimeStamp(Long reverseOrderLineTimeRangeStartTimeStamp) {
    this.reverseOrderLineTimeRangeStartTimeStamp = reverseOrderLineTimeRangeStartTimeStamp;
    }
        public Long getReverseOrderId() {
    return this.reverseOrderId;
    }
    public void setReverseOrderId(Long reverseOrderId) {
    this.reverseOrderId = reverseOrderId;
    }
        public Long getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
        public Long getReverseOrderLineTimeRangeEndTimeStamp() {
    return this.reverseOrderLineTimeRangeEndTimeStamp;
    }
    public void setReverseOrderLineTimeRangeEndTimeStamp(Long reverseOrderLineTimeRangeEndTimeStamp) {
    this.reverseOrderLineTimeRangeEndTimeStamp = reverseOrderLineTimeRangeEndTimeStamp;
    }
        public String getChannel() {
    return this.channel;
    }
    public void setChannel(String channel) {
    this.channel = channel;
    }
        public Long getTradeOrderTimeRangeStartTimeStamp() {
    return this.tradeOrderTimeRangeStartTimeStamp;
    }
    public void setTradeOrderTimeRangeStartTimeStamp(Long tradeOrderTimeRangeStartTimeStamp) {
    this.tradeOrderTimeRangeStartTimeStamp = tradeOrderTimeRangeStartTimeStamp;
    }
        public Long getTradeOrderTimeRangeEndTimeStamp() {
    return this.tradeOrderTimeRangeEndTimeStamp;
    }
    public void setTradeOrderTimeRangeEndTimeStamp(Long tradeOrderTimeRangeEndTimeStamp) {
    this.tradeOrderTimeRangeEndTimeStamp = tradeOrderTimeRangeEndTimeStamp;
    }
        public Integer getPageNo() {
    return this.pageNo;
    }
    public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
    }
        public Boolean getDisputeInProgress() {
    return this.disputeInProgress;
    }
    public void setDisputeInProgress(Boolean disputeInProgress) {
    this.disputeInProgress = disputeInProgress;
    }
        public String getTrackingNumber() {
    return this.trackingNumber;
    }
    public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    }
        public List<String> getReverseStatusList() {
    return this.reverseStatusList;
    }
    public void setReverseStatusList(List<String> reverseStatusList) {
    this.reverseStatusList = reverseStatusList;
    }
        public Long getChannelSellerId() {
    return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId) {
    this.channelSellerId = channelSellerId;
    }
    }