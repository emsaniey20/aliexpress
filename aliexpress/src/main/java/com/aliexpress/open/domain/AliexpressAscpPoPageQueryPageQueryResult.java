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

public class AliexpressAscpPoPageQueryPageQueryResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 是否失败 */
                @ApiField("fail")
            private Boolean fail;
        /** --- */
                @ApiListField("data")
            private List<AliexpressAscpPoPageQueryErpPurchaseOrderDTO> data;
        /** -- */
                @ApiField("page_index")
            private Integer pageIndex;
        /** -- */
                @ApiField("success")
            private Boolean success;
        /** -- */
                @ApiField("page_size")
            private Integer pageSize;
        /** -- */
                @ApiField("total_count")
            private Integer totalCount;
    
        public Boolean getFail() {
    return this.fail;
    }
    public void setFail(Boolean fail) {
    this.fail = fail;
    }
        public List<AliexpressAscpPoPageQueryErpPurchaseOrderDTO> getData() {
    return this.data;
    }
    public void setData(List<AliexpressAscpPoPageQueryErpPurchaseOrderDTO> data) {
    this.data = data;
    }
        public Integer getPageIndex() {
    return this.pageIndex;
    }
    public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
        public Integer getTotalCount() {
    return this.totalCount;
    }
    public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
    }
    }