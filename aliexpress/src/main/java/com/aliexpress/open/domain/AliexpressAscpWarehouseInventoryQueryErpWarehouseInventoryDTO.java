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

public class AliexpressAscpWarehouseInventoryQueryErpWarehouseInventoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 仓名称 */
                @ApiField("store_name")
            private String storeName;
        /** 仓编码 */
                @ApiField("store_code")
            private String storeCode;
        /** 货品条形码 */
                @ApiField("whc_bar_code")
            private String whcBarCode;
        /** 货品编码 */
                @ApiField("sc_item_code")
            private String scItemCode;
        /** 货品名称 */
                @ApiField("sc_item_name")
            private String scItemName;
        /** 货品Id */
                @ApiField("sc_item_id")
            private Long scItemId;
        /** 占用数量 */
                @ApiField("lock_quantity")
            private String lockQuantity;
        /** 仓内实际库存数量(包含占用) */
                @ApiField("quantity")
            private String quantity;
        /** 扩展字段 */
                @ApiField("feature")
            private String feature;
        /** 库存类型(1 良品，101 残品) */
                @ApiField("inventory_type")
            private Integer inventoryType;
    
        public String getStoreName() {
    return this.storeName;
    }
    public void setStoreName(String storeName) {
    this.storeName = storeName;
    }
        public String getStoreCode() {
    return this.storeCode;
    }
    public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
    }
        public String getWhcBarCode() {
    return this.whcBarCode;
    }
    public void setWhcBarCode(String whcBarCode) {
    this.whcBarCode = whcBarCode;
    }
        public String getScItemCode() {
    return this.scItemCode;
    }
    public void setScItemCode(String scItemCode) {
    this.scItemCode = scItemCode;
    }
        public String getScItemName() {
    return this.scItemName;
    }
    public void setScItemName(String scItemName) {
    this.scItemName = scItemName;
    }
        public Long getScItemId() {
    return this.scItemId;
    }
    public void setScItemId(Long scItemId) {
    this.scItemId = scItemId;
    }
        public String getLockQuantity() {
    return this.lockQuantity;
    }
    public void setLockQuantity(String lockQuantity) {
    this.lockQuantity = lockQuantity;
    }
        public String getQuantity() {
    return this.quantity;
    }
    public void setQuantity(String quantity) {
    this.quantity = quantity;
    }
        public String getFeature() {
    return this.feature;
    }
    public void setFeature(String feature) {
    this.feature = feature;
    }
        public Integer getInventoryType() {
    return this.inventoryType;
    }
    public void setInventoryType(Integer inventoryType) {
    this.inventoryType = inventoryType;
    }
    }