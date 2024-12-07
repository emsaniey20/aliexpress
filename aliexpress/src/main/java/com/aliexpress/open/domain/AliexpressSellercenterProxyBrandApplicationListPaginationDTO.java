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

public class AliexpressSellercenterProxyBrandApplicationListPaginationDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** total values */
                @ApiField("total")
            private Integer total;
        /** total pages */
                @ApiField("total_page_num")
            private Integer totalPageNum;
        /** current page number */
                @ApiField("page_num")
            private Integer pageNum;
        /** list values */
                @ApiListField("lists")
            private List<AliexpressSellercenterProxyBrandApplicationListBrandDTO> lists;
    
        public Integer getTotal() {
    return this.total;
    }
    public void setTotal(Integer total) {
    this.total = total;
    }
        public Integer getTotalPageNum() {
    return this.totalPageNum;
    }
    public void setTotalPageNum(Integer totalPageNum) {
    this.totalPageNum = totalPageNum;
    }
        public Integer getPageNum() {
    return this.pageNum;
    }
    public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
    }
        public List<AliexpressSellercenterProxyBrandApplicationListBrandDTO> getLists() {
    return this.lists;
    }
    public void setLists(List<AliexpressSellercenterProxyBrandApplicationListBrandDTO> lists) {
    this.lists = lists;
    }
    }