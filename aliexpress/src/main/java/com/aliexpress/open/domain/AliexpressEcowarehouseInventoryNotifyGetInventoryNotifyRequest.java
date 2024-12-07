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

public class AliexpressEcowarehouseInventoryNotifyGetInventoryNotifyRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 输入 */
                @ApiListField("sku_inventory_list")
            private List<AliexpressEcowarehouseInventoryNotifyGetWarehouseSkuInventory> skuInventoryList;
        /** 服务商 */
                @ApiField("warehouse_customer_id")
            private String warehouseCustomerId;
        /** 通知类型 */
                @ApiField("type")
            private String type;
    
        public List<AliexpressEcowarehouseInventoryNotifyGetWarehouseSkuInventory> getSkuInventoryList() {
    return this.skuInventoryList;
    }
    public void setSkuInventoryList(List<AliexpressEcowarehouseInventoryNotifyGetWarehouseSkuInventory> skuInventoryList) {
    this.skuInventoryList = skuInventoryList;
    }
        public String getWarehouseCustomerId() {
    return this.warehouseCustomerId;
    }
    public void setWarehouseCustomerId(String warehouseCustomerId) {
    this.warehouseCustomerId = warehouseCustomerId;
    }
        public String getType() {
    return this.type;
    }
    public void setType(String type) {
    this.type = type;
    }
    }