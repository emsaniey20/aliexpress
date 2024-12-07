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

public class AliexpressOfferRedefiningGetsizetemplatesbycategoryidAeProductQuerySizeTemplateResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 本次查询总记录数 */
                @ApiField("total")
            private Integer total;
        /** 响应错误信息 */
                @ApiField("error_message")
            private String errorMessage;
        /** 响应时间 */
                @ApiField("time_stamp")
            private String timeStamp;
        /** 分页一页最大记录数 */
                @ApiField("size_page")
            private Integer sizePage;
        /** 响应错误码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 当前分页页数,从1开始 */
                @ApiField("current_page")
            private Integer currentPage;
        /** 调用是否成功 */
                @ApiField("is_success")
            private Boolean isSuccess;
        /** 返回查询到的尺码模版列表 */
                @ApiListField("sizechart_d_t_o_list")
            private List<AliexpressOfferRedefiningGetsizetemplatesbycategoryidAeProductSizeTemplateQuerySimpleInfo> sizechartDTOList;
    
        public Integer getTotal() {
    return this.total;
    }
    public void setTotal(Integer total) {
    this.total = total;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public String getTimeStamp() {
    return this.timeStamp;
    }
    public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    }
        public Integer getSizePage() {
    return this.sizePage;
    }
    public void setSizePage(Integer sizePage) {
    this.sizePage = sizePage;
    }
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    }
        public Integer getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    }
        public Boolean getIsSuccess() {
    return this.isSuccess;
    }
    public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    }
        public List<AliexpressOfferRedefiningGetsizetemplatesbycategoryidAeProductSizeTemplateQuerySimpleInfo> getSizechartDTOList() {
    return this.sizechartDTOList;
    }
    public void setSizechartDTOList(List<AliexpressOfferRedefiningGetsizetemplatesbycategoryidAeProductSizeTemplateQuerySimpleInfo> sizechartDTOList) {
    this.sizechartDTOList = sizechartDTOList;
    }
    }