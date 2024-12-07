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

public class AliexpressAffiliateOrderListbyindexTrafficOrderResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** records count in current page */
                @ApiField("current_record_count")
            private Long currentRecordCount;
        /** order list */
                @ApiListField("orders")
            private List<AliexpressAffiliateOrderListbyindexTrafficOrderEffectDTO> orders;
        /** max query index id */
                @ApiField("max_query_index_id")
            private String maxQueryIndexId;
        /** minimum query index id */
                @ApiField("min_query_index_id")
            private String minQueryIndexId;
    
        public Long getCurrentRecordCount() {
    return this.currentRecordCount;
    }
    public void setCurrentRecordCount(Long currentRecordCount) {
    this.currentRecordCount = currentRecordCount;
    }
        public List<AliexpressAffiliateOrderListbyindexTrafficOrderEffectDTO> getOrders() {
    return this.orders;
    }
    public void setOrders(List<AliexpressAffiliateOrderListbyindexTrafficOrderEffectDTO> orders) {
    this.orders = orders;
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
    }