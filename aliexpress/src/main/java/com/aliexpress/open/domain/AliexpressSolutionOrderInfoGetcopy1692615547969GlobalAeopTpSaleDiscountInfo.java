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

public class AliexpressSolutionOrderInfoGetcopy1692615547969GlobalAeopTpSaleDiscountInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** discount detail */
                @ApiField("discount_detail")
            private AliexpressSolutionOrderInfoGetcopy1692615547969GlobalMoneyStr discountDetail;
        /** Promotion owner, can be Seller, Platform or Mix. */
                @ApiField("promotion_owner")
            private String promotionOwner;
        /** promotion type */
                @ApiField("promotion_type")
            private String promotionType;
        /** promotion ID */
                @ApiField("promotion_id")
            private String promotionId;
    
        public AliexpressSolutionOrderInfoGetcopy1692615547969GlobalMoneyStr getDiscountDetail() {
    return this.discountDetail;
    }
    public void setDiscountDetail(AliexpressSolutionOrderInfoGetcopy1692615547969GlobalMoneyStr discountDetail) {
    this.discountDetail = discountDetail;
    }
        public String getPromotionOwner() {
    return this.promotionOwner;
    }
    public void setPromotionOwner(String promotionOwner) {
    this.promotionOwner = promotionOwner;
    }
        public String getPromotionType() {
    return this.promotionType;
    }
    public void setPromotionType(String promotionType) {
    this.promotionType = promotionType;
    }
        public String getPromotionId() {
    return this.promotionId;
    }
    public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
    }
    }