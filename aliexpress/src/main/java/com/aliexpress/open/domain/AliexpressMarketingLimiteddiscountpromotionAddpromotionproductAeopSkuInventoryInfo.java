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

public class AliexpressMarketingLimiteddiscountpromotionAddpromotionproductAeopSkuInventoryInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 限时限量更改为共享库存，当前该字段仅当部分sku不参加活动时设置为0 */
                @ApiField("quantity")
            private Integer quantity;
        /** sku属性 */
                @ApiField("sku_attr")
            private String skuAttr;
    
        public Integer getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Integer quantity) {
    this.quantity = quantity;
    }
        public String getSkuAttr() {
    return this.skuAttr;
    }
    public void setSkuAttr(String skuAttr) {
    this.skuAttr = skuAttr;
    }
    }