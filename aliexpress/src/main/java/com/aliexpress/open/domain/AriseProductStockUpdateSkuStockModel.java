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

public class AriseProductStockUpdateSkuStockModel implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sku库存 */
                @ApiField("sku_stock")
            private Long skuStock;
        /** sku_id 需要与商品查询中的sku_id 保持一致 */
                @ApiField("sku_id")
            private Long skuId;
    
        public Long getSkuStock() {
    return this.skuStock;
    }
    public void setSkuStock(Long skuStock) {
    this.skuStock = skuStock;
    }
        public Long getSkuId() {
    return this.skuId;
    }
    public void setSkuId(Long skuId) {
    this.skuId = skuId;
    }
    }