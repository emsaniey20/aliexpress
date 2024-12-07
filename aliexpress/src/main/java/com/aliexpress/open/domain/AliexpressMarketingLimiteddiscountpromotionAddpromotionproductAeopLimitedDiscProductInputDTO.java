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

public class AliexpressMarketingLimiteddiscountpromotionAddpromotionproductAeopLimitedDiscProductInputDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 已存在的粉丝折扣 默认为0 */
                @ApiField("exist_store_fans_discount")
            private String existStoreFansDiscount;
        /** 活动商品对象列表 */
                @ApiListField("product_objects")
            private List<AliexpressMarketingLimiteddiscountpromotionAddpromotionproductAeopStorePromProduct> productObjects;
        /** 活动id */
                @ApiField("promotion_id")
            private Long promotionId;
        /** 粉丝折扣,与exist_store_fans_discount不同值时，才会更新粉丝折扣 */
                @ApiField("store_club_discount_rate")
            private String storeClubDiscountRate;
    
        public String getExistStoreFansDiscount() {
    return this.existStoreFansDiscount;
    }
    public void setExistStoreFansDiscount(String existStoreFansDiscount) {
    this.existStoreFansDiscount = existStoreFansDiscount;
    }
        public List<AliexpressMarketingLimiteddiscountpromotionAddpromotionproductAeopStorePromProduct> getProductObjects() {
    return this.productObjects;
    }
    public void setProductObjects(List<AliexpressMarketingLimiteddiscountpromotionAddpromotionproductAeopStorePromProduct> productObjects) {
    this.productObjects = productObjects;
    }
        public Long getPromotionId() {
    return this.promotionId;
    }
    public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
    }
        public String getStoreClubDiscountRate() {
    return this.storeClubDiscountRate;
    }
    public void setStoreClubDiscountRate(String storeClubDiscountRate) {
    this.storeClubDiscountRate = storeClubDiscountRate;
    }
    }