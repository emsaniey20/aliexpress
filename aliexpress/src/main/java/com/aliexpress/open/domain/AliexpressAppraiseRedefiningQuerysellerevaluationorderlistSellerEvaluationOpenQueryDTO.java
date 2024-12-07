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

public class AliexpressAppraiseRedefiningQuerysellerevaluationorderlistSellerEvaluationOpenQueryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 每页获取记录数 */
                @ApiField("page_size")
            private Integer pageSize;
        /** 无效参数，订单结束时间，查询起始值，格式:MM/dd/yyyy */
                @ApiField("order_finish_time_end")
            private String orderFinishTimeEnd;
        /** 无效参数，订单结束时间，查询截止值，格式:MM/dd/yyyy */
                @ApiField("order_finish_time_start")
            private String orderFinishTimeStart;
        /** 无效参数，卖家留评状态：yes：已留评；no：未留评；all：所有状态；默认未留评 */
                @ApiField("seller_feedback_status")
            private String sellerFeedbackStatus;
        /** 当前页 */
                @ApiField("current_page")
            private Integer currentPage;
        /** 父订单号，多个用英文逗号分隔 */
                @ApiField("order_ids")
            private String orderIds;
        /** 无效参数，子订单号，多个用英文逗号分隔 */
                @ApiField("child_order_ids")
            private String childOrderIds;
    
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
        public String getOrderFinishTimeEnd() {
    return this.orderFinishTimeEnd;
    }
    public void setOrderFinishTimeEnd(String orderFinishTimeEnd) {
    this.orderFinishTimeEnd = orderFinishTimeEnd;
    }
        public String getOrderFinishTimeStart() {
    return this.orderFinishTimeStart;
    }
    public void setOrderFinishTimeStart(String orderFinishTimeStart) {
    this.orderFinishTimeStart = orderFinishTimeStart;
    }
        public String getSellerFeedbackStatus() {
    return this.sellerFeedbackStatus;
    }
    public void setSellerFeedbackStatus(String sellerFeedbackStatus) {
    this.sellerFeedbackStatus = sellerFeedbackStatus;
    }
        public Integer getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    }
        public String getOrderIds() {
    return this.orderIds;
    }
    public void setOrderIds(String orderIds) {
    this.orderIds = orderIds;
    }
        public String getChildOrderIds() {
    return this.childOrderIds;
    }
    public void setChildOrderIds(String childOrderIds) {
    this.childOrderIds = childOrderIds;
    }
    }