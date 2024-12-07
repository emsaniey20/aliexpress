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

public class AliexpressAffiliateOrderListTrafficOrderResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** total page number */
                @ApiField("total_page_no")
            private Long totalPageNo;
        /** total record number */
                @ApiField("total_record_count")
            private Long totalRecordCount;
        /** current page number */
                @ApiField("current_page_no")
            private Long currentPageNo;
        /** records count in current page */
                @ApiField("current_record_count")
            private Long currentRecordCount;
        /** order list */
                @ApiListField("orders")
            private List<AliexpressAffiliateOrderListTrafficOrderEffectDTO> orders;
    
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
        public List<AliexpressAffiliateOrderListTrafficOrderEffectDTO> getOrders() {
    return this.orders;
    }
    public void setOrders(List<AliexpressAffiliateOrderListTrafficOrderEffectDTO> orders) {
    this.orders = orders;
    }
    }