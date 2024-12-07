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

public class AliexpressPopChoiceProductsListPopChoiceProductListQueryRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品id */
                @ApiField("product_id")
            private Long productId;
        /** 修改时间结束于，yyyy-MM-dd hh:mm:ss */
                @ApiField("gmt_modified_end")
            private String gmtModifiedEnd;
        /** 商品标签，已加入"joined"  */
                @ApiField("joined_product_tab")
            private String joinedProductTab;
        /** 单页展示数量，默认20 */
                @ApiField("page_size")
            private Integer pageSize;
        /** 修改时间开始于，yyyy-MM-dd hh:mm:ss */
                @ApiField("gmt_modified_start")
            private String gmtModifiedStart;
        /** 当前页数 */
                @ApiField("current_page")
            private Integer currentPage;
        /** 类目id */
                @ApiField("leaf_category")
            private Long leafCategory;
    
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getGmtModifiedEnd() {
    return this.gmtModifiedEnd;
    }
    public void setGmtModifiedEnd(String gmtModifiedEnd) {
    this.gmtModifiedEnd = gmtModifiedEnd;
    }
        public String getJoinedProductTab() {
    return this.joinedProductTab;
    }
    public void setJoinedProductTab(String joinedProductTab) {
    this.joinedProductTab = joinedProductTab;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
        public String getGmtModifiedStart() {
    return this.gmtModifiedStart;
    }
    public void setGmtModifiedStart(String gmtModifiedStart) {
    this.gmtModifiedStart = gmtModifiedStart;
    }
        public Integer getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    }
        public Long getLeafCategory() {
    return this.leafCategory;
    }
    public void setLeafCategory(Long leafCategory) {
    this.leafCategory = leafCategory;
    }
    }