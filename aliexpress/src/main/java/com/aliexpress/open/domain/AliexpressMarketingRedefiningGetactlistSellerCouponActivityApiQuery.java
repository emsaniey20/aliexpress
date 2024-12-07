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

public class AliexpressMarketingRedefiningGetactlistSellerCouponActivityApiQuery implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 活动名称，支持模糊搜索 */
                @ApiField("activity_name")
            private String activityName;
        /** 活动开始时间区间--最大值，允许格式："mm/dd/yyyy HH:mm:ss" */
                @ApiField("max_activity_start_date")
            private String maxActivityStartDate;
        /** 活动开始时间区间--最小值，允许格式"mm/dd/yyyy HH:mm:ss" */
                @ApiField("min_activity_start_date")
            private String minActivityStartDate;
        /** 活动状态，可取值：["not_started", "releasing", "release_end", "closed"] */
                @ApiField("status")
            private String status;
    
        public String getActivityName() {
    return this.activityName;
    }
    public void setActivityName(String activityName) {
    this.activityName = activityName;
    }
        public String getMaxActivityStartDate() {
    return this.maxActivityStartDate;
    }
    public void setMaxActivityStartDate(String maxActivityStartDate) {
    this.maxActivityStartDate = maxActivityStartDate;
    }
        public String getMinActivityStartDate() {
    return this.minActivityStartDate;
    }
    public void setMinActivityStartDate(String minActivityStartDate) {
    this.minActivityStartDate = minActivityStartDate;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
    }