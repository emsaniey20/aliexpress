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

public class AliexpressOfferDraftproductsGetAeopAEProductListQuery implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 需要商品的当前页数。默认第一页。 */
                @ApiField("current_page")
            private Integer currentPage;
        /** 每页查询商品数量。输入值小于100，默认20。 */
                @ApiField("page_size")
            private Integer pageSize;
    
        public Integer getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
    }