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

public class AliexpressPopChoiceProductStocksUpdatePopChoiceSkuStockDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 仓库库存列表 */
                @ApiListField("pop_choice_sku_warehouse_stock_list")
            private List<AliexpressPopChoiceProductStocksUpdatePopChoiceSkuWarehouseStock> popChoiceSkuWarehouseStockList;
        /** sku id */
                @ApiField("sku_id")
            private String skuId;
    
        public List<AliexpressPopChoiceProductStocksUpdatePopChoiceSkuWarehouseStock> getPopChoiceSkuWarehouseStockList() {
    return this.popChoiceSkuWarehouseStockList;
    }
    public void setPopChoiceSkuWarehouseStockList(List<AliexpressPopChoiceProductStocksUpdatePopChoiceSkuWarehouseStock> popChoiceSkuWarehouseStockList) {
    this.popChoiceSkuWarehouseStockList = popChoiceSkuWarehouseStockList;
    }
        public String getSkuId() {
    return this.skuId;
    }
    public void setSkuId(String skuId) {
    this.skuId = skuId;
    }
    }