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

public class AliexpressLogisticsWarehouseQuerydetailResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 结果 */
                @ApiListField("result_list")
            private List<AliexpressLogisticsWarehouseQuerydetailString> resultList;
        /** totalPage */
                @ApiField("total_page")
            private Long totalPage;
        /** 是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 当前页 */
                @ApiField("current_page")
            private Long currentPage;
    
        public List<AliexpressLogisticsWarehouseQuerydetailString> getResultList() {
    return this.resultList;
    }
    public void setResultList(List<AliexpressLogisticsWarehouseQuerydetailString> resultList) {
    this.resultList = resultList;
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
        public Long getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Long currentPage) {
    this.currentPage = currentPage;
    }
    }