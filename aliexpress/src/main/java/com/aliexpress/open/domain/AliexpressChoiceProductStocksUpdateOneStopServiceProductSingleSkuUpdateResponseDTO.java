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

public class AliexpressChoiceProductStocksUpdateOneStopServiceProductSingleSkuUpdateResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 单sku仓库下列表 */
                @ApiListField("sku_warehouse_stock_list")
            private List<AliexpressChoiceProductStocksUpdateOneStopServiceSingleWarehouseStockUpdateResponseDTO> skuWarehouseStockList;
        /** sku id */
                @ApiField("sku_id")
            private String skuId;
    
        public List<AliexpressChoiceProductStocksUpdateOneStopServiceSingleWarehouseStockUpdateResponseDTO> getSkuWarehouseStockList() {
    return this.skuWarehouseStockList;
    }
    public void setSkuWarehouseStockList(List<AliexpressChoiceProductStocksUpdateOneStopServiceSingleWarehouseStockUpdateResponseDTO> skuWarehouseStockList) {
    this.skuWarehouseStockList = skuWarehouseStockList;
    }
        public String getSkuId() {
    return this.skuId;
    }
    public void setSkuId(String skuId) {
    this.skuId = skuId;
    }
    }