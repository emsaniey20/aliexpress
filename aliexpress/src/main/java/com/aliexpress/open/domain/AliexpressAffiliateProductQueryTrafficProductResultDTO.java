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

public class AliexpressAffiliateProductQueryTrafficProductResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** current page number */
                @ApiField("current_page_no")
            private Long currentPageNo;
        /** Record count in current page */
                @ApiField("current_record_count")
            private Long currentRecordCount;
        /** Product list */
                @ApiListField("products")
            private List<AliexpressAffiliateProductQueryTrafficProductDTO> products;
        /** total page number */
                @ApiField("total_page_no")
            private Long totalPageNo;
        /** total record count */
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
        public List<AliexpressAffiliateProductQueryTrafficProductDTO> getProducts() {
    return this.products;
    }
    public void setProducts(List<AliexpressAffiliateProductQueryTrafficProductDTO> products) {
    this.products = products;
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