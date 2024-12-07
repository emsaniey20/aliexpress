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

public class AliexpressTradeSellerOrderlistGetAeopPageResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
        /** 每页条数 */
                @ApiField("page_size")
            private Long pageSize;
        /** 是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 出参如下 */
                @ApiListField("target_list")
            private List<AliexpressTradeSellerOrderlistGetAeopOrderItemDTO> targetList;
        /** timeStamp */
                @ApiField("time_stamp")
            private String timeStamp;
        /** 总数量(SC订单不包含在结果中） */
                @ApiField("total_count")
            private Long totalCount;
        /** 总页数 */
                @ApiField("total_page")
            private Long totalPage;
        /** 页码 */
                @ApiField("current_page")
            private Long currentPage;
    
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
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
        public List<AliexpressTradeSellerOrderlistGetAeopOrderItemDTO> getTargetList() {
    return this.targetList;
    }
    public void setTargetList(List<AliexpressTradeSellerOrderlistGetAeopOrderItemDTO> targetList) {
    this.targetList = targetList;
    }
        public String getTimeStamp() {
    return this.timeStamp;
    }
    public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    }
        public Long getTotalCount() {
    return this.totalCount;
    }
    public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
    }
        public Long getTotalPage() {
    return this.totalPage;
    }
    public void setTotalPage(Long totalPage) {
    this.totalPage = totalPage;
    }
        public Long getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Long currentPage) {
    this.currentPage = currentPage;
    }
    }