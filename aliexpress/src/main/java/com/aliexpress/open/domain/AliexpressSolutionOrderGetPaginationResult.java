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

public class AliexpressSolutionOrderGetPaginationResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** error massage */
                @ApiField("error_message")
            private String errorMessage;
        /** total count(SC order is not include the result） */
                @ApiField("total_count")
            private Long totalCount;
        /** target list */
                @ApiListField("target_list")
            private List<AliexpressSolutionOrderGetOrderDTO> targetList;
        /** the number of each page */
                @ApiField("page_size")
            private Long pageSize;
        /** error code */
                @ApiField("error_code")
            private String errorCode;
        /** current page */
                @ApiField("current_page")
            private Long currentPage;
        /** total page */
                @ApiField("total_page")
            private Long totalPage;
        /** success or not */
                @ApiField("success")
            private Boolean success;
        /** timeStamp */
                @ApiField("time_stamp")
            private String timeStamp;
    
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public Long getTotalCount() {
    return this.totalCount;
    }
    public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
    }
        public List<AliexpressSolutionOrderGetOrderDTO> getTargetList() {
    return this.targetList;
    }
    public void setTargetList(List<AliexpressSolutionOrderGetOrderDTO> targetList) {
    this.targetList = targetList;
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
        public Long getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Long currentPage) {
    this.currentPage = currentPage;
    }
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
        public String getTimeStamp() {
    return this.timeStamp;
    }
    public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    }
    }