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

public class AliexpressChoiceProductsListOneStopServiceProductSearchApiResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 总页数 */
                @ApiField("total_page")
            private Long totalPage;
        /** 请求结果：成功。失败 */
                @ApiField("success")
            private Boolean success;
        /** 每页商品数 */
                @ApiField("page_size")
            private Long pageSize;
        /** 总商品数 */
                @ApiField("total_count")
            private Long totalCount;
        /** 当前页 */
                @ApiField("current_page")
            private Long currentPage;
        /** 商品列表 */
                @ApiListField("product_list")
            private List<AliexpressChoiceProductsListOneStopServiceProductSearchBaseResultDTO> productList;
    
        public Long getTotalPage() {
    return this.totalPage;
    }
    public void setTotalPage(Long totalPage) {
    this.totalPage = totalPage;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public Long getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    }
        public Long getTotalCount() {
    return this.totalCount;
    }
    public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
    }
        public Long getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Long currentPage) {
    this.currentPage = currentPage;
    }
        public List<AliexpressChoiceProductsListOneStopServiceProductSearchBaseResultDTO> getProductList() {
    return this.productList;
    }
    public void setProductList(List<AliexpressChoiceProductsListOneStopServiceProductSearchBaseResultDTO> productList) {
    this.productList = productList;
    }
    }