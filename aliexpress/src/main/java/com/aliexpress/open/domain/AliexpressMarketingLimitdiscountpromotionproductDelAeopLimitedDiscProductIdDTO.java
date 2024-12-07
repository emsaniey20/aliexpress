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

public class AliexpressMarketingLimitdiscountpromotionproductDelAeopLimitedDiscProductIdDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 要删除的商品id集合 */
                @ApiListField("product_id_list")
            private List<Long> productIdList;
        /** 活动id */
                @ApiField("promotion_id")
            private Long promotionId;
    
        public List<Long> getProductIdList() {
    return this.productIdList;
    }
    public void setProductIdList(List<Long> productIdList) {
    this.productIdList = productIdList;
    }
        public Long getPromotionId() {
    return this.promotionId;
    }
    public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
    }
    }