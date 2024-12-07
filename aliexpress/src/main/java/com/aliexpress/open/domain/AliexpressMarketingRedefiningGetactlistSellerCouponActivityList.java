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

public class AliexpressMarketingRedefiningGetactlistSellerCouponActivityList implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 每页展示记录数 */
                @ApiField("page_size")
            private Long pageSize;
        /** 活动总数 */
                @ApiField("total_item")
            private Long totalItem;
        /** 总页面 */
                @ApiField("total_page")
            private Long totalPage;
        /** 活动列表 */
                @ApiListField("activity_list")
            private List<AliexpressMarketingRedefiningGetactlistSellerCouponActivity> activityList;
        /** 当前页面 */
                @ApiField("current_page")
            private Long currentPage;
    
        public Long getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    }
        public Long getTotalItem() {
    return this.totalItem;
    }
    public void setTotalItem(Long totalItem) {
    this.totalItem = totalItem;
    }
        public Long getTotalPage() {
    return this.totalPage;
    }
    public void setTotalPage(Long totalPage) {
    this.totalPage = totalPage;
    }
        public List<AliexpressMarketingRedefiningGetactlistSellerCouponActivity> getActivityList() {
    return this.activityList;
    }
    public void setActivityList(List<AliexpressMarketingRedefiningGetactlistSellerCouponActivity> activityList) {
    this.activityList = activityList;
    }
        public Long getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Long currentPage) {
    this.currentPage = currentPage;
    }
    }