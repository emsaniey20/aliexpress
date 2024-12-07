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

public class AliexpressRuAffiliateOrderGetTrafficOrderResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Orders */
                @ApiListField("orders")
            private List<AliexpressRuAffiliateOrderGetTrafficOrderEffectDTO> orders;
        /** Count of pages */
                @ApiField("total_page_no")
            private Integer totalPageNo;
        /** Current page number */
                @ApiField("current_page_no")
            private Integer currentPageNo;
        /** Count of records */
                @ApiField("total_record_count")
            private Integer totalRecordCount;
        /** Count of records on the current page */
                @ApiField("current_record_count")
            private Integer currentRecordCount;
        /** Empty */
                @ApiField("min_query_index_id")
            private String minQueryIndexId;
        /** Empty */
                @ApiField("max_query_index_id")
            private String maxQueryIndexId;
    
        public List<AliexpressRuAffiliateOrderGetTrafficOrderEffectDTO> getOrders() {
    return this.orders;
    }
    public void setOrders(List<AliexpressRuAffiliateOrderGetTrafficOrderEffectDTO> orders) {
    this.orders = orders;
    }
        public Integer getTotalPageNo() {
    return this.totalPageNo;
    }
    public void setTotalPageNo(Integer totalPageNo) {
    this.totalPageNo = totalPageNo;
    }
        public Integer getCurrentPageNo() {
    return this.currentPageNo;
    }
    public void setCurrentPageNo(Integer currentPageNo) {
    this.currentPageNo = currentPageNo;
    }
        public Integer getTotalRecordCount() {
    return this.totalRecordCount;
    }
    public void setTotalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
    }
        public Integer getCurrentRecordCount() {
    return this.currentRecordCount;
    }
    public void setCurrentRecordCount(Integer currentRecordCount) {
    this.currentRecordCount = currentRecordCount;
    }
        public String getMinQueryIndexId() {
    return this.minQueryIndexId;
    }
    public void setMinQueryIndexId(String minQueryIndexId) {
    this.minQueryIndexId = minQueryIndexId;
    }
        public String getMaxQueryIndexId() {
    return this.maxQueryIndexId;
    }
    public void setMaxQueryIndexId(String maxQueryIndexId) {
    this.maxQueryIndexId = maxQueryIndexId;
    }
    }