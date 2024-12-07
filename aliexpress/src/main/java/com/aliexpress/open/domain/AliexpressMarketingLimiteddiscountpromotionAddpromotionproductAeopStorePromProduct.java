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

public class AliexpressMarketingLimiteddiscountpromotionAddpromotionproductAeopStorePromProduct implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 每人限购数量(每人最多购买数量) */
                @ApiField("buy_max_num")
            private Integer buyMaxNum;
        /** 活动商品优惠信息 */
                @ApiListField("product_discount_list")
            private List<AliexpressMarketingLimiteddiscountpromotionAddpromotionproductAeopProductDiscountInfo> productDiscountList;
        /** 商品id */
                @ApiField("product_id")
            private Long productId;
        /** 商品sku信息 */
                @ApiListField("sku_inventory_list")
            private List<AliexpressMarketingLimiteddiscountpromotionAddpromotionproductAeopSkuInventoryInfo> skuInventoryList;
        /** 废弃：全局都是共享库存，废弃该字段，即使设置也不生效 */
                @ApiField("used_warehouse")
            private Boolean usedWarehouse;
    
        public Integer getBuyMaxNum() {
    return this.buyMaxNum;
    }
    public void setBuyMaxNum(Integer buyMaxNum) {
    this.buyMaxNum = buyMaxNum;
    }
        public List<AliexpressMarketingLimiteddiscountpromotionAddpromotionproductAeopProductDiscountInfo> getProductDiscountList() {
    return this.productDiscountList;
    }
    public void setProductDiscountList(List<AliexpressMarketingLimiteddiscountpromotionAddpromotionproductAeopProductDiscountInfo> productDiscountList) {
    this.productDiscountList = productDiscountList;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public List<AliexpressMarketingLimiteddiscountpromotionAddpromotionproductAeopSkuInventoryInfo> getSkuInventoryList() {
    return this.skuInventoryList;
    }
    public void setSkuInventoryList(List<AliexpressMarketingLimiteddiscountpromotionAddpromotionproductAeopSkuInventoryInfo> skuInventoryList) {
    this.skuInventoryList = skuInventoryList;
    }
        public Boolean getUsedWarehouse() {
    return this.usedWarehouse;
    }
    public void setUsedWarehouse(Boolean usedWarehouse) {
    this.usedWarehouse = usedWarehouse;
    }
    }