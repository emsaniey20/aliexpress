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

public class AliexpressEcowarehouseReverseOrderStatusPostString implements Serializable {
    private static final long serialVersionUID = 1L;
        /** scan_item_code */
                @ApiField("scan_item_code")
            private String scanItemCode;
        /** 101/1 */
                @ApiField("inventory_type")
            private Integer inventoryType;
        /** quantity */
                @ApiField("quantity")
            private Integer quantity;
        /** operateType */
                @ApiField("operate_type")
            private String operateType;
    
        public String getScanItemCode() {
    return this.scanItemCode;
    }
    public void setScanItemCode(String scanItemCode) {
    this.scanItemCode = scanItemCode;
    }
        public Integer getInventoryType() {
    return this.inventoryType;
    }
    public void setInventoryType(Integer inventoryType) {
    this.inventoryType = inventoryType;
    }
        public Integer getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Integer quantity) {
    this.quantity = quantity;
    }
        public String getOperateType() {
    return this.operateType;
    }
    public void setOperateType(String operateType) {
    this.operateType = operateType;
    }
    }