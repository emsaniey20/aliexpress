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

public class AliexpressAscpOnwayInventoryQueryErpOnWayInventoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 出库仓名称 */
                @ApiField("outbound_store_name")
            private String outboundStoreName;
        /** 出库仓编码 */
                @ApiField("outbound_store_code")
            private String outboundStoreCode;
        /** 入库仓名称 */
                @ApiField("inbound_store_name")
            private String inboundStoreName;
        /** 入库仓编码 */
                @ApiField("inbound_store_code")
            private String inboundStoreCode;
        /** 在途数量 */
                @ApiField("quantity")
            private String quantity;
        /** 扩展字段 */
                @ApiField("feature")
            private String feature;
        /** 库存类型(1 采购在途，2 调拨在途，3 销售在途，4 销退在途) */
                @ApiField("inventory_type")
            private Integer inventoryType;
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
    
        public String getOutboundStoreName() {
    return this.outboundStoreName;
    }
    public void setOutboundStoreName(String outboundStoreName) {
    this.outboundStoreName = outboundStoreName;
    }
        public String getOutboundStoreCode() {
    return this.outboundStoreCode;
    }
    public void setOutboundStoreCode(String outboundStoreCode) {
    this.outboundStoreCode = outboundStoreCode;
    }
        public String getInboundStoreName() {
    return this.inboundStoreName;
    }
    public void setInboundStoreName(String inboundStoreName) {
    this.inboundStoreName = inboundStoreName;
    }
        public String getInboundStoreCode() {
    return this.inboundStoreCode;
    }
    public void setInboundStoreCode(String inboundStoreCode) {
    this.inboundStoreCode = inboundStoreCode;
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
    }