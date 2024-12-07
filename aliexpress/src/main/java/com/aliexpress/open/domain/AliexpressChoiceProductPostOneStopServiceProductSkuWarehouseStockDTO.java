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

public class AliexpressChoiceProductPostOneStopServiceProductSkuWarehouseStockDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 可售库存 */
                @ApiField("sellable_quantity")
            private Long sellableQuantity;
        /** 库存编码 */
                @ApiField("warehouse_code")
            private String warehouseCode;
        /** 库存名称 */
                @ApiField("warehouse_name")
            private String warehouseName;
    
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
        public String getWarehouseName() {
    return this.warehouseName;
    }
    public void setWarehouseName(String warehouseName) {
    this.warehouseName = warehouseName;
    }
    }