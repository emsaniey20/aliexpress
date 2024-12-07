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

public class AliexpressOfferRedefiningQuerybundleAeopOfferBundleQueryCondition implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 当前页码 */
                @ApiField("current_page")
            private Integer currentPage;
        /** 搭配主商品ID,必填 */
                @ApiField("item_id")
            private Long itemId;
        /** 搭配主商品标题 */
                @ApiField("item_subject")
            private String itemSubject;
        /** 每页大小 */
                @ApiField("page_size")
            private Integer pageSize;
    
        public Integer getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    }
        public Long getItemId() {
    return this.itemId;
    }
    public void setItemId(Long itemId) {
    this.itemId = itemId;
    }
        public String getItemSubject() {
    return this.itemSubject;
    }
    public void setItemSubject(String itemSubject) {
    this.itemSubject = itemSubject;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
    }