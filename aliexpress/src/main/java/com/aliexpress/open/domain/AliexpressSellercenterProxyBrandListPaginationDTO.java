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

public class AliexpressSellercenterProxyBrandListPaginationDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** brand list */
                @ApiListField("list")
            private List<AliexpressSellercenterProxyBrandListBrandDTO> list;
        /** page_num */
                @ApiField("page_num")
            private Integer pageNum;
        /** total_page_num */
                @ApiField("total_page_num")
            private Integer totalPageNum;
        /** total */
                @ApiField("total")
            private Integer total;
    
        public List<AliexpressSellercenterProxyBrandListBrandDTO> getList() {
    return this.list;
    }
    public void setList(List<AliexpressSellercenterProxyBrandListBrandDTO> list) {
    this.list = list;
    }
        public Integer getPageNum() {
    return this.pageNum;
    }
    public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
    }
        public Integer getTotalPageNum() {
    return this.totalPageNum;
    }
    public void setTotalPageNum(Integer totalPageNum) {
    this.totalPageNum = totalPageNum;
    }
        public Integer getTotal() {
    return this.total;
    }
    public void setTotal(Integer total) {
    this.total = total;
    }
    }