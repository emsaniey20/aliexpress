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

public class AliexpressMarketingStorepromotionProductsQueryPromotionProductQueryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 页码,从1开始 */
                @ApiField("page_no")
            private Integer pageNo;
        /** 页大小 */
                @ApiField("page_size")
            private Integer pageSize;
        /** 活动ID */
                @ApiField("promotion_id")
            private Long promotionId;
    
        public Integer getPageNo() {
    return this.pageNo;
    }
    public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
        public Long getPromotionId() {
    return this.promotionId;
    }
    public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
    }
    }