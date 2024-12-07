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

public class AliexpressMarketingStorepromotionsListPromotionSimpleInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 活动状态：未开始:NotStarted;进行中:Ongoing;已暂停:Invalid;已结束:Finished; */
                @ApiField("status")
            private String status;
        /** 活动ID */
                @ApiField("promotion_id")
            private Long promotionId;
        /** 活动名称 */
                @ApiField("promotion_name")
            private String promotionName;
        /** 活动开始时间 */
                @ApiField("start_time")
            private String startTime;
        /** 活动结束时间 */
                @ApiField("end_time")
            private String endTime;
    
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public Long getPromotionId() {
    return this.promotionId;
    }
    public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
    }
        public String getPromotionName() {
    return this.promotionName;
    }
    public void setPromotionName(String promotionName) {
    this.promotionName = promotionName;
    }
        public String getStartTime() {
    return this.startTime;
    }
    public void setStartTime(String startTime) {
    this.startTime = startTime;
    }
        public String getEndTime() {
    return this.endTime;
    }
    public void setEndTime(String endTime) {
    this.endTime = endTime;
    }
    }