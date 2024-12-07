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

public class AliexpressSocialItemSearchItemPickPagingResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 搜索结构封装 */
                @ApiListField("results")
            private List<AliexpressSocialItemSearchItemSearchResult> results;
        /** 页码 */
                @ApiField("page_no")
            private Long pageNo;
        /** 是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 每页数据条数 */
                @ApiField("page_size")
            private Long pageSize;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
        /** 总条数 */
                @ApiField("total_count")
            private Long totalCount;
        /** 错误信息 */
                @ApiField("error_msg")
            private String errorMsg;
    
        public List<AliexpressSocialItemSearchItemSearchResult> getResults() {
    return this.results;
    }
    public void setResults(List<AliexpressSocialItemSearchItemSearchResult> results) {
    this.results = results;
    }
        public Long getPageNo() {
    return this.pageNo;
    }
    public void setPageNo(Long pageNo) {
    this.pageNo = pageNo;
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
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public Long getTotalCount() {
    return this.totalCount;
    }
    public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
    }