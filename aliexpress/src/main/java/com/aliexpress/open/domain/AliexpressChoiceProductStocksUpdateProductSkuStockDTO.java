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

public class AliexpressChoiceProductStocksUpdateProductSkuStockDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sku不同仓 对应库存列表 */
                @ApiListField("sku_warehouse_stock_list")
            private List<AliexpressChoiceProductStocksUpdateProductSkuWarehouseStockDTO> skuWarehouseStockList;
        /** sku唯一标识，调用商品列表接口获取：aliexpress.choice.products.list */
                @ApiField("sku_id")
            private Long skuId;
    
        public List<AliexpressChoiceProductStocksUpdateProductSkuWarehouseStockDTO> getSkuWarehouseStockList() {
    return this.skuWarehouseStockList;
    }
    public void setSkuWarehouseStockList(List<AliexpressChoiceProductStocksUpdateProductSkuWarehouseStockDTO> skuWarehouseStockList) {
    this.skuWarehouseStockList = skuWarehouseStockList;
    }
        public Long getSkuId() {
    return this.skuId;
    }
    public void setSkuId(Long skuId) {
    this.skuId = skuId;
    }
    }