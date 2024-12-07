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

public class AliexpressDsRecommendFeedGetTrafficProductResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** current record count */
                @ApiField("current_record_count")
            private Integer currentRecordCount;
        /** is finished */
                @ApiField("is_finished")
            private Boolean isFinished;
        /** total page number */
                @ApiField("total_page_no")
            private Integer totalPageNo;
        /** total page number */
                @ApiField("total_record_count")
            private Integer totalRecordCount;
        /** count page number */
                @ApiField("current_page_no")
            private Integer currentPageNo;
        /** products */
                @ApiListField("products")
            private List<AliexpressDsRecommendFeedGetTrafficProductDTO> products;
    
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
        public Integer getCurrentPageNo() {
    return this.currentPageNo;
    }
    public void setCurrentPageNo(Integer currentPageNo) {
    this.currentPageNo = currentPageNo;
    }
        public List<AliexpressDsRecommendFeedGetTrafficProductDTO> getProducts() {
    return this.products;
    }
    public void setProducts(List<AliexpressDsRecommendFeedGetTrafficProductDTO> products) {
    this.products = products;
    }
    }