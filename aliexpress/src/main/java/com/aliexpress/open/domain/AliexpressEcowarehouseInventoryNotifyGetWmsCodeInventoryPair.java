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

public class AliexpressEcowarehouseInventoryNotifyGetWmsCodeInventoryPair implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 可售库存 */
                @ApiField("available_stock")
            private Integer availableStock;
        /** 仓code */
                @ApiField("warehouse_code")
            private String warehouseCode;
    
        public Integer getAvailableStock() {
    return this.availableStock;
    }
    public void setAvailableStock(Integer availableStock) {
    this.availableStock = availableStock;
    }
        public String getWarehouseCode() {
    return this.warehouseCode;
    }
    public void setWarehouseCode(String warehouseCode) {
    this.warehouseCode = warehouseCode;
    }
    }