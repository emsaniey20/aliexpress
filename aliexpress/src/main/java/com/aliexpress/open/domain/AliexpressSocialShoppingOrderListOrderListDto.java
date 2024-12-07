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

public class AliexpressSocialShoppingOrderListOrderListDto implements Serializable {
    private static final long serialVersionUID = 1L;
        /** current_page */
                @ApiField("current_page")
            private Long currentPage;
        /** has_next_page */
                @ApiField("has_next_page")
            private Boolean hasNextPage;
        /** order_view_list */
                @ApiListField("order_view_list")
            private List<AliexpressSocialShoppingOrderListOrderDto> orderViewList;
        /** page_size */
                @ApiField("page_size")
            private Long pageSize;
        /** pre_sale_order_count */
                @ApiField("pre_sale_order_count")
            private Long preSaleOrderCount;
        /** time_zone */
                @ApiField("time_zone")
            private String timeZone;
        /** time_zone_offset_of_minutes */
                @ApiField("time_zone_offset_of_minutes")
            private Integer timeZoneOffsetOfMinutes;
        /** total_num */
                @ApiField("total_num")
            private Long totalNum;
    
        public Long getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Long currentPage) {
    this.currentPage = currentPage;
    }
        public Boolean getHasNextPage() {
    return this.hasNextPage;
    }
    public void setHasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
    }
        public List<AliexpressSocialShoppingOrderListOrderDto> getOrderViewList() {
    return this.orderViewList;
    }
    public void setOrderViewList(List<AliexpressSocialShoppingOrderListOrderDto> orderViewList) {
    this.orderViewList = orderViewList;
    }
        public Long getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    }
        public Long getPreSaleOrderCount() {
    return this.preSaleOrderCount;
    }
    public void setPreSaleOrderCount(Long preSaleOrderCount) {
    this.preSaleOrderCount = preSaleOrderCount;
    }
        public String getTimeZone() {
    return this.timeZone;
    }
    public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
    }
        public Integer getTimeZoneOffsetOfMinutes() {
    return this.timeZoneOffsetOfMinutes;
    }
    public void setTimeZoneOffsetOfMinutes(Integer timeZoneOffsetOfMinutes) {
    this.timeZoneOffsetOfMinutes = timeZoneOffsetOfMinutes;
    }
        public Long getTotalNum() {
    return this.totalNum;
    }
    public void setTotalNum(Long totalNum) {
    this.totalNum = totalNum;
    }
    }