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

public class AliexpressCarmodelGetArticleArticlesQueryRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 查询条件 */
                @ApiField("search_query")
            private String searchQuery;
        /** 语言 */
                @ApiField("language")
            private String language;
        /** 查询条件类型 */
                @ApiField("search_type")
            private Integer searchType;
        /** 页大小 */
                @ApiField("page_size")
            private String pageSize;
        /** 页数 */
                @ApiField("current")
            private String current;
    
        public String getSearchQuery() {
    return this.searchQuery;
    }
    public void setSearchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
    }
        public String getLanguage() {
    return this.language;
    }
    public void setLanguage(String language) {
    this.language = language;
    }
        public Integer getSearchType() {
    return this.searchType;
    }
    public void setSearchType(Integer searchType) {
    this.searchType = searchType;
    }
        public String getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
    }
        public String getCurrent() {
    return this.current;
    }
    public void setCurrent(String current) {
    this.current = current;
    }
    }