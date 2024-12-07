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

public class AliexpressMarketingStorepromotionsListPromotionQueryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 活动名称 */
                @ApiField("promotion_name")
            private String promotionName;
        /** 活动类型：单品折扣:ProductDiscount;搭配套餐:BundleDeals;拼团:GroupBuy;满件折:OrderQuantityDiscount;满立减:OrderPriceDiscount;满包邮:FreeShipping; */
                @ApiField("promotion_type")
            private String promotionType;
        /** 页码 */
                @ApiField("current_page")
            private Integer currentPage;
        /** 页大小 */
                @ApiField("page_size")
            private Integer pageSize;
        /** 活动ID */
                @ApiField("promotion_id")
            private Long promotionId;
        /** 活动状态：未开始:NotStarted;进行中:Ongoing;已暂停:Invalid;已结束:Finished; */
                @ApiField("status")
            private String status;
    
        public String getPromotionName() {
    return this.promotionName;
    }
    public void setPromotionName(String promotionName) {
    this.promotionName = promotionName;
    }
        public String getPromotionType() {
    return this.promotionType;
    }
    public void setPromotionType(String promotionType) {
    this.promotionType = promotionType;
    }
        public Integer getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
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
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
    }