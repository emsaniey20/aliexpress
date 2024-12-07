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

public class AliexpressOfferRedefiningQuerybundleAeopBundleItemSku implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 搭配价格 */
                @ApiField("bundle_price")
            private String bundlePrice;
        /** 币种 */
                @ApiField("currency")
            private String currency;
        /** sku标签 */
                @ApiField("label")
            private String label;
        /** sku原价 */
                @ApiField("original_price")
            private String originalPrice;
        /** sku唯一标识 */
                @ApiField("sku_id")
            private Long skuId;
    
        public String getBundlePrice() {
    return this.bundlePrice;
    }
    public void setBundlePrice(String bundlePrice) {
    this.bundlePrice = bundlePrice;
    }
        public String getCurrency() {
    return this.currency;
    }
    public void setCurrency(String currency) {
    this.currency = currency;
    }
        public String getLabel() {
    return this.label;
    }
    public void setLabel(String label) {
    this.label = label;
    }
        public String getOriginalPrice() {
    return this.originalPrice;
    }
    public void setOriginalPrice(String originalPrice) {
    this.originalPrice = originalPrice;
    }
        public Long getSkuId() {
    return this.skuId;
    }
    public void setSkuId(Long skuId) {
    this.skuId = skuId;
    }
    }