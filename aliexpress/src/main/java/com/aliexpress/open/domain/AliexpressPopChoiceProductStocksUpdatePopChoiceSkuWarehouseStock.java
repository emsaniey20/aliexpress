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

public class AliexpressPopChoiceProductStocksUpdatePopChoiceSkuWarehouseStock implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 库存数量 >=0 */
                @ApiField("sellable_quantity")
            private Long sellableQuantity;
        /** 库存编码 */
                @ApiField("warehouse_code")
            private String warehouseCode;
    
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