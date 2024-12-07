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

public class AliexpressPostproductRedefiningFindaeproductdetailmodulelistbyqureyAeopFindModuleListResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 模块信息列表 */
                @ApiListField("aeop_detail_module_list")
            private List<AliexpressPostproductRedefiningFindaeproductdetailmodulelistbyqureyString> aeopDetailModuleList;
        /** 当前页号 */
                @ApiField("current_page")
            private Long currentPage;
        /** 错误信息 */
                @ApiField("error_msg")
            private String errorMsg;
        /** 接口调用结果。true/false分别表示成功和失败。 */
                @ApiField("success")
            private Boolean success;
        /** 总页数 */
                @ApiField("total_page")
            private Long totalPage;
        /** 错误代码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** error_message */
                @ApiField("error_message")
            private String errorMessage;
    
        public List<AliexpressPostproductRedefiningFindaeproductdetailmodulelistbyqureyString> getAeopDetailModuleList() {
    return this.aeopDetailModuleList;
    }
    public void setAeopDetailModuleList(List<AliexpressPostproductRedefiningFindaeproductdetailmodulelistbyqureyString> aeopDetailModuleList) {
    this.aeopDetailModuleList = aeopDetailModuleList;
    }
        public Long getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Long currentPage) {
    this.currentPage = currentPage;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public Long getTotalPage() {
    return this.totalPage;
    }
    public void setTotalPage(Long totalPage) {
    this.totalPage = totalPage;
    }
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
    }