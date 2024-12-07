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

public class AliexpressSolutionProductListGetItemListResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** error message */
                @ApiField("error_message")
            private String errorMessage;
        /** error code */
                @ApiField("error_code")
            private Integer errorCode;
        /** total page */
                @ApiField("total_page")
            private Long totalPage;
        /** success or not */
                @ApiField("success")
            private Boolean success;
        /** products total count */
                @ApiField("product_count")
            private Long productCount;
        /** error msg */
                @ApiField("error_msg")
            private String errorMsg;
        /** current page */
                @ApiField("current_page")
            private Long currentPage;
        /** product list */
                @ApiListField("aeop_a_e_product_display_d_t_o_list")
            private List<AliexpressSolutionProductListGetItemDisplayDTO> aeopAEProductDisplayDTOList;
    
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
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
        public Long getProductCount() {
    return this.productCount;
    }
    public void setProductCount(Long productCount) {
    this.productCount = productCount;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
        public Long getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Long currentPage) {
    this.currentPage = currentPage;
    }
        public List<AliexpressSolutionProductListGetItemDisplayDTO> getAeopAEProductDisplayDTOList() {
    return this.aeopAEProductDisplayDTOList;
    }
    public void setAeopAEProductDisplayDTOList(List<AliexpressSolutionProductListGetItemDisplayDTO> aeopAEProductDisplayDTOList) {
    this.aeopAEProductDisplayDTOList = aeopAEProductDisplayDTOList;
    }
    }