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

public class AriseOrderListQueryPage implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 总页数 */
                @ApiField("total_page_count")
            private Integer totalPageCount;
        /** 每页订单数 */
                @ApiField("page_size")
            private Integer pageSize;
        /** 当前页号 */
                @ApiField("current_page")
            private Integer currentPage;
        /** 总订单数 */
                @ApiField("total_count")
            private Integer totalCount;
    
        public Integer getTotalPageCount() {
    return this.totalPageCount;
    }
    public void setTotalPageCount(Integer totalPageCount) {
    this.totalPageCount = totalPageCount;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
        public Integer getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    }
        public Integer getTotalCount() {
    return this.totalCount;
    }
    public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
    }
    }