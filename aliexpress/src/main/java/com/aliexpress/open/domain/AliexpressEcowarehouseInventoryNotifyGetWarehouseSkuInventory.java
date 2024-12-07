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

public class AliexpressEcowarehouseInventoryNotifyGetWarehouseSkuInventory implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 货主ID */
                @ApiField("owner_id")
            private String ownerId;
        /** sku id */
                @ApiField("sku_id")
            private String skuId;
        /** 输入 */
                @ApiListField("warehouse_code_inventory")
            private List<AliexpressEcowarehouseInventoryNotifyGetWmsCodeInventoryPair> warehouseCodeInventory;
    
        public String getOwnerId() {
    return this.ownerId;
    }
    public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
    }
        public String getSkuId() {
    return this.skuId;
    }
    public void setSkuId(String skuId) {
    this.skuId = skuId;
    }
        public List<AliexpressEcowarehouseInventoryNotifyGetWmsCodeInventoryPair> getWarehouseCodeInventory() {
    return this.warehouseCodeInventory;
    }
    public void setWarehouseCodeInventory(List<AliexpressEcowarehouseInventoryNotifyGetWmsCodeInventoryPair> warehouseCodeInventory) {
    this.warehouseCodeInventory = warehouseCodeInventory;
    }
    }