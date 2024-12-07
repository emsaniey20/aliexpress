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

public class AliexpressLogisticsQuerylogisticsorderdetailAeopLogisticsOrderDetailQueryResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 当前页 */
                @ApiField("current_page")
            private Integer currentPage;
        /** 错误描述 */
                @ApiField("error_desc")
            private String errorDesc;
        /** result */
                @ApiListField("result_list")
            private List<AliexpressLogisticsQuerylogisticsorderdetailAeopLogisticsOrderDetailDTO> resultList;
        /** success */
                @ApiField("success")
            private Boolean success;
        /** totalPage */
                @ApiField("total_page")
            private Integer totalPage;
    
        public Integer getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    }
        public String getErrorDesc() {
    return this.errorDesc;
    }
    public void setErrorDesc(String errorDesc) {
    this.errorDesc = errorDesc;
    }
        public List<AliexpressLogisticsQuerylogisticsorderdetailAeopLogisticsOrderDetailDTO> getResultList() {
    return this.resultList;
    }
    public void setResultList(List<AliexpressLogisticsQuerylogisticsorderdetailAeopLogisticsOrderDetailDTO> resultList) {
    this.resultList = resultList;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public Integer getTotalPage() {
    return this.totalPage;
    }
    public void setTotalPage(Integer totalPage) {
    this.totalPage = totalPage;
    }
    }