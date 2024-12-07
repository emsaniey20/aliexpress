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

public class AliexpressProductDiagnosisResultListOptimizedProductResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 已优化商品列表 */
                @ApiListField("optimized_product_list")
            private List<AliexpressProductDiagnosisResultListOptimizedProductDTO> optimizedProductList;
        /** 本次查询是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 页面大小 */
                @ApiField("page_size")
            private Integer pageSize;
        /** 已优化商品总数 */
                @ApiField("total_count")
            private Integer totalCount;
        /** 当前页数 */
                @ApiField("current_page")
            private Integer currentPage;
    
        public List<AliexpressProductDiagnosisResultListOptimizedProductDTO> getOptimizedProductList() {
    return this.optimizedProductList;
    }
    public void setOptimizedProductList(List<AliexpressProductDiagnosisResultListOptimizedProductDTO> optimizedProductList) {
    this.optimizedProductList = optimizedProductList;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
        public Integer getTotalCount() {
    return this.totalCount;
    }
    public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
    }
        public Integer getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    }
    }