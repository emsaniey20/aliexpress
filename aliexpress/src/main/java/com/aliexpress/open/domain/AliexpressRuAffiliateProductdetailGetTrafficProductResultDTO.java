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

public class AliexpressRuAffiliateProductdetailGetTrafficProductResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Page number */
                @ApiField("current_page_no")
            private Integer currentPageNo;
        /** Count of records on the page */
                @ApiField("current_record_count")
            private Integer currentRecordCount;
        /** Is finished */
                @ApiField("is_finished")
            private Boolean isFinished;
        /** Product list */
                @ApiListField("products")
            private List<AliexpressRuAffiliateProductdetailGetTrafficProductDTO> products;
        /** Total pages count */
                @ApiField("total_page_no")
            private Integer totalPageNo;
        /** Total records count */
                @ApiField("total_record_count")
            private Integer totalRecordCount;
    
        public Integer getCurrentPageNo() {
    return this.currentPageNo;
    }
    public void setCurrentPageNo(Integer currentPageNo) {
    this.currentPageNo = currentPageNo;
    }
        public Integer getCurrentRecordCount() {
    return this.currentRecordCount;
    }
    public void setCurrentRecordCount(Integer currentRecordCount) {
    this.currentRecordCount = currentRecordCount;
    }
        public Boolean getIsFinished() {
    return this.isFinished;
    }
    public void setIsFinished(Boolean isFinished) {
    this.isFinished = isFinished;
    }
        public List<AliexpressRuAffiliateProductdetailGetTrafficProductDTO> getProducts() {
    return this.products;
    }
    public void setProducts(List<AliexpressRuAffiliateProductdetailGetTrafficProductDTO> products) {
    this.products = products;
    }
        public Integer getTotalPageNo() {
    return this.totalPageNo;
    }
    public void setTotalPageNo(Integer totalPageNo) {
    this.totalPageNo = totalPageNo;
    }
        public Integer getTotalRecordCount() {
    return this.totalRecordCount;
    }
    public void setTotalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
    }
    }