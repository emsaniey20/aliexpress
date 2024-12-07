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

public class AliexpressAscpFfoQueryPageQueryResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** dto list */
                @ApiListField("data_list")
            private List<AliexpressAscpFfoQueryErpFulfillmentForwardDTO> dataList;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
        /** 错误信息 */
                @ApiField("error_msg")
            private String errorMsg;
        /** 分页页码 */
                @ApiField("page_index")
            private Long pageIndex;
        /** 分页大小 */
                @ApiField("page_size")
            private Long pageSize;
        /** 是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 数量 */
                @ApiField("total_count")
            private Long totalCount;
    
        public List<AliexpressAscpFfoQueryErpFulfillmentForwardDTO> getDataList() {
    return this.dataList;
    }
    public void setDataList(List<AliexpressAscpFfoQueryErpFulfillmentForwardDTO> dataList) {
    this.dataList = dataList;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
        public Long getPageIndex() {
    return this.pageIndex;
    }
    public void setPageIndex(Long pageIndex) {
    this.pageIndex = pageIndex;
    }
        public Long getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public Long getTotalCount() {
    return this.totalCount;
    }
    public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
    }
    }