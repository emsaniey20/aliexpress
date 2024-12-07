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

public class AliexpressDsCommissionorderListbyindexTrafficOrderResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** max query index start value: if not passed, You can only check the first page */
                @ApiField("max_query_index_id")
            private String maxQueryIndexId;
        /** current record count */
                @ApiField("current_record_count")
            private Integer currentRecordCount;
        /** orders object list */
                @ApiListField("orders")
            private List<AliexpressDsCommissionorderListbyindexTrafficOrderEffectDTO> orders;
        /** min query index start value: if not passed, You can only check the first page */
                @ApiField("min_query_index_id")
            private String minQueryIndexId;
        /** current page number */
                @ApiField("current_page_no")
            private Integer currentPageNo;
    
        public String getMaxQueryIndexId() {
    return this.maxQueryIndexId;
    }
    public void setMaxQueryIndexId(String maxQueryIndexId) {
    this.maxQueryIndexId = maxQueryIndexId;
    }
        public Integer getCurrentRecordCount() {
    return this.currentRecordCount;
    }
    public void setCurrentRecordCount(Integer currentRecordCount) {
    this.currentRecordCount = currentRecordCount;
    }
        public List<AliexpressDsCommissionorderListbyindexTrafficOrderEffectDTO> getOrders() {
    return this.orders;
    }
    public void setOrders(List<AliexpressDsCommissionorderListbyindexTrafficOrderEffectDTO> orders) {
    this.orders = orders;
    }
        public String getMinQueryIndexId() {
    return this.minQueryIndexId;
    }
    public void setMinQueryIndexId(String minQueryIndexId) {
    this.minQueryIndexId = minQueryIndexId;
    }
        public Integer getCurrentPageNo() {
    return this.currentPageNo;
    }
    public void setCurrentPageNo(Integer currentPageNo) {
    this.currentPageNo = currentPageNo;
    }
    }