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

public class AliexpressPopChoiceProductsListPopChoiceProductListQueryResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品总数 */
                @ApiField("total_item")
            private Long totalItem;
        /** 页码总数 */
                @ApiField("total_page")
            private Integer totalPage;
        /** 请求是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 报错信息 */
                @ApiField("error_message")
            private String errorMessage;
        /** 半托管商品列表 */
                @ApiListField("pop_choice_product_list")
            private List<AliexpressPopChoiceProductsListPopChoiceProductSearchResultDTO> popChoiceProductList;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
        /** 当前页数 */
                @ApiField("current_page")
            private Integer currentPage;
    
        public Long getTotalItem() {
    return this.totalItem;
    }
    public void setTotalItem(Long totalItem) {
    this.totalItem = totalItem;
    }
        public Integer getTotalPage() {
    return this.totalPage;
    }
    public void setTotalPage(Integer totalPage) {
    this.totalPage = totalPage;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public List<AliexpressPopChoiceProductsListPopChoiceProductSearchResultDTO> getPopChoiceProductList() {
    return this.popChoiceProductList;
    }
    public void setPopChoiceProductList(List<AliexpressPopChoiceProductsListPopChoiceProductSearchResultDTO> popChoiceProductList) {
    this.popChoiceProductList = popChoiceProductList;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public Integer getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    }
    }