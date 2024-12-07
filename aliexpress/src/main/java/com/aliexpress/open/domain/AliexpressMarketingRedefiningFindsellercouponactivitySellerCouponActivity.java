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

public class AliexpressMarketingRedefiningFindsellercouponactivitySellerCouponActivity implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 定向类型 */
                @ApiField("range_type")
            private Integer rangeType;
        /** 活动状态。可选值(括号内为中文解释)：not_started(未开始) / releasing(活动中) / release_end(已结束) / closed(已关闭) */
                @ApiField("status")
            private String status;
        /** 总共发行数量 */
                @ApiField("total_release_num")
            private Long totalReleaseNum;
        /** coupon有效期，单位:秒 */
                @ApiField("consume_valid_time")
            private Long consumeValidTime;
        /** 卖家的adminID */
                @ApiField("seller_admin_id")
            private Long sellerAdminId;
        /** 扩展属性 */
                @ApiField("ext_attrs")
            private String extAttrs;
        /** 订单使用最小金额，单位:美分 */
                @ApiField("min_order_amount")
            private Long minOrderAmount;
        /** 活动类型 */
                @ApiField("type")
            private Long type;
        /** 是否有使用条件 */
                @ApiField("has_use_condtion")
            private Boolean hasUseCondtion;
        /** coupon活动ID */
                @ApiField("id")
            private Long id;
        /** 消费开始时间 */
                @ApiField("consume_start_date")
            private String consumeStartDate;
        /** coupon活动开始时间 */
                @ApiField("acquire_start_date")
            private String acquireStartDate;
        /** 已发行数量 */
                @ApiField("released_num")
            private Long releasedNum;
        /** 活动名称 */
                @ApiField("activity_name")
            private String activityName;
        /** coupon面额，单位:美分 */
                @ApiField("denomination")
            private Long denomination;
        /** coupon使用限制描述(denomination：coupon面额(单位：美分); hasUseCondtion：是否有使用条件(y/n); minOrderAmount：coupon使用最小订单金额(单位：美分)) */
                @ApiField("activity_desc")
            private String activityDesc;
        /** coupon活动结束时间 */
                @ApiField("acquire_end_date")
            private String acquireEndDate;
        /** 每买家限领张数 */
                @ApiField("num_per_buyer")
            private Long numPerBuyer;
        /** 消费结束时间 */
                @ApiField("consume_end_date")
            private String consumeEndDate;
    
        public Integer getRangeType() {
    return this.rangeType;
    }
    public void setRangeType(Integer rangeType) {
    this.rangeType = rangeType;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public Long getTotalReleaseNum() {
    return this.totalReleaseNum;
    }
    public void setTotalReleaseNum(Long totalReleaseNum) {
    this.totalReleaseNum = totalReleaseNum;
    }
        public Long getConsumeValidTime() {
    return this.consumeValidTime;
    }
    public void setConsumeValidTime(Long consumeValidTime) {
    this.consumeValidTime = consumeValidTime;
    }
        public Long getSellerAdminId() {
    return this.sellerAdminId;
    }
    public void setSellerAdminId(Long sellerAdminId) {
    this.sellerAdminId = sellerAdminId;
    }
        public String getExtAttrs() {
    return this.extAttrs;
    }
    public void setExtAttrs(String extAttrs) {
    this.extAttrs = extAttrs;
    }
        public Long getMinOrderAmount() {
    return this.minOrderAmount;
    }
    public void setMinOrderAmount(Long minOrderAmount) {
    this.minOrderAmount = minOrderAmount;
    }
        public Long getType() {
    return this.type;
    }
    public void setType(Long type) {
    this.type = type;
    }
        public Boolean getHasUseCondtion() {
    return this.hasUseCondtion;
    }
    public void setHasUseCondtion(Boolean hasUseCondtion) {
    this.hasUseCondtion = hasUseCondtion;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public String getConsumeStartDate() {
    return this.consumeStartDate;
    }
    public void setConsumeStartDate(String consumeStartDate) {
    this.consumeStartDate = consumeStartDate;
    }
        public String getAcquireStartDate() {
    return this.acquireStartDate;
    }
    public void setAcquireStartDate(String acquireStartDate) {
    this.acquireStartDate = acquireStartDate;
    }
        public Long getReleasedNum() {
    return this.releasedNum;
    }
    public void setReleasedNum(Long releasedNum) {
    this.releasedNum = releasedNum;
    }
        public String getActivityName() {
    return this.activityName;
    }
    public void setActivityName(String activityName) {
    this.activityName = activityName;
    }
        public Long getDenomination() {
    return this.denomination;
    }
    public void setDenomination(Long denomination) {
    this.denomination = denomination;
    }
        public String getActivityDesc() {
    return this.activityDesc;
    }
    public void setActivityDesc(String activityDesc) {
    this.activityDesc = activityDesc;
    }
        public String getAcquireEndDate() {
    return this.acquireEndDate;
    }
    public void setAcquireEndDate(String acquireEndDate) {
    this.acquireEndDate = acquireEndDate;
    }
        public Long getNumPerBuyer() {
    return this.numPerBuyer;
    }
    public void setNumPerBuyer(Long numPerBuyer) {
    this.numPerBuyer = numPerBuyer;
    }
        public String getConsumeEndDate() {
    return this.consumeEndDate;
    }
    public void setConsumeEndDate(String consumeEndDate) {
    this.consumeEndDate = consumeEndDate;
    }
    }