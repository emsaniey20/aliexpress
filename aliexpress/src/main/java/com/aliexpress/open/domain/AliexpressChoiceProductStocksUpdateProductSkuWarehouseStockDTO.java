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

public class AliexpressChoiceProductStocksUpdateProductSkuWarehouseStockDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 仓库类型， 只有类型 =jit_warehouse 的仓才能编辑库存 */
                @ApiField("warehouse_type")
            private String warehouseType;
        /** 库存数量， 商品编辑库存只能增加，不能减少。 */
                @ApiField("sellable_quantity")
            private Long sellableQuantity;
        /** 仓库编码 */
                @ApiField("warehouse_code")
            private String warehouseCode;
    
        public String getWarehouseType() {
    return this.warehouseType;
    }
    public void setWarehouseType(String warehouseType) {
    this.warehouseType = warehouseType;
    }
        public Long getSellableQuantity() {
    return this.sellableQuantity;
    }
    public void setSellableQuantity(Long sellableQuantity) {
    this.sellableQuantity = sellableQuantity;
    }
        public String getWarehouseCode() {
    return this.warehouseCode;
    }
    public void setWarehouseCode(String warehouseCode) {
    this.warehouseCode = warehouseCode;
    }
    }