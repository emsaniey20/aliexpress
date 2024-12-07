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

public class AliexpressPostproductRedefiningFindproductinfolistqueryAeopFindProductListResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品基本信息列表 */
                @ApiListField("aeop_a_e_product_display_d_t_o_list")
            private List<AliexpressPostproductRedefiningFindproductinfolistqueryAeopAEProductDisplaySampleDTO> aeopAEProductDisplayDTOList;
        /** 当前页 */
                @ApiField("current_page")
            private Long currentPage;
        /** errorMsg */
                @ApiField("error_msg")
            private String errorMsg;
        /** 总商品数 */
                @ApiField("product_count")
            private Long productCount;
        /** 接口调用结果 */
                @ApiField("success")
            private Boolean success;
        /** 总页数 */
                @ApiField("total_page")
            private Long totalPage;
        /** 错误代码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
    
        public List<AliexpressPostproductRedefiningFindproductinfolistqueryAeopAEProductDisplaySampleDTO> getAeopAEProductDisplayDTOList() {
    return this.aeopAEProductDisplayDTOList;
    }
    public void setAeopAEProductDisplayDTOList(List<AliexpressPostproductRedefiningFindproductinfolistqueryAeopAEProductDisplaySampleDTO> aeopAEProductDisplayDTOList) {
    this.aeopAEProductDisplayDTOList = aeopAEProductDisplayDTOList;
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
        public Long getProductCount() {
    return this.productCount;
    }
    public void setProductCount(Long productCount) {
    this.productCount = productCount;
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