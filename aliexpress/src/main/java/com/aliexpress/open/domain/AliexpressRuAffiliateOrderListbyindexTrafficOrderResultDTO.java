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

public class AliexpressRuAffiliateOrderListbyindexTrafficOrderResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Current page */
                @ApiField("current_page_no")
            private Long currentPageNo;
        /** Record count on the current page */
                @ApiField("current_record_count")
            private Long currentRecordCount;
        /** Min index */
                @ApiField("max_query_index_id")
            private String maxQueryIndexId;
        /** Max index */
                @ApiField("min_query_index_id")
            private String minQueryIndexId;
        /** Orders */
                @ApiListField("orders")
            private List<AliexpressRuAffiliateOrderListbyindexTrafficOrderEffectDTO> orders;
        /** 3 */
                @ApiField("total_page_no")
            private Long totalPageNo;
        /** 60 */
                @ApiField("total_record_count")
            private Long totalRecordCount;
    
        public Long getCurrentPageNo() {
    return this.currentPageNo;
    }
    public void setCurrentPageNo(Long currentPageNo) {
    this.currentPageNo = currentPageNo;
    }
        public Long getCurrentRecordCount() {
    return this.currentRecordCount;
    }
    public void setCurrentRecordCount(Long currentRecordCount) {
    this.currentRecordCount = currentRecordCount;
    }
        public String getMaxQueryIndexId() {
    return this.maxQueryIndexId;
    }
    public void setMaxQueryIndexId(String maxQueryIndexId) {
    this.maxQueryIndexId = maxQueryIndexId;
    }
        public String getMinQueryIndexId() {
    return this.minQueryIndexId;
    }
    public void setMinQueryIndexId(String minQueryIndexId) {
    this.minQueryIndexId = minQueryIndexId;
    }
        public List<AliexpressRuAffiliateOrderListbyindexTrafficOrderEffectDTO> getOrders() {
    return this.orders;
    }
    public void setOrders(List<AliexpressRuAffiliateOrderListbyindexTrafficOrderEffectDTO> orders) {
    this.orders = orders;
    }
        public Long getTotalPageNo() {
    return this.totalPageNo;
    }
    public void setTotalPageNo(Long totalPageNo) {
    this.totalPageNo = totalPageNo;
    }
        public Long getTotalRecordCount() {
    return this.totalRecordCount;
    }
    public void setTotalRecordCount(Long totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
    }
    }