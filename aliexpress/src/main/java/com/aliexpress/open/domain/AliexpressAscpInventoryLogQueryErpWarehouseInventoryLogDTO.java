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

public class AliexpressAscpInventoryLogQueryErpWarehouseInventoryLogDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 交易子单号 */
                @ApiField("biz_sub_trade_id")
            private String bizSubTradeId;
        /** 交易主单号 */
                @ApiField("biz_trade_id")
            private String bizTradeId;
        /** 出入库时间 */
                @ApiField("operate_time")
            private Long operateTime;
        /** 业务类型（PO0  普通采购,ADJ0 报废,ADJ1 盘点调整,ADJ2 状态调整,SO0  TOC销售,SO1  TOB销售,SO4  TOC补发,RTV0 普通采购退货,RSO0 TOC销售退货,SYS1 系统调账） */
                @ApiField("biz_activity_type")
            private String bizActivityType;
        /** 业务子单号 */
                @ApiField("operation_detail_order_id")
            private String operationDetailOrderId;
        /** 业务主单号 */
                @ApiField("operation_order_id")
            private String operationOrderId;
        /** 变化后占用数量 */
                @ApiField("result_lock_quantity")
            private String resultLockQuantity;
        /** 占用变化数量 */
                @ApiField("change_lock_quantity")
            private String changeLockQuantity;
        /** 变化后库存数量 */
                @ApiField("result_quantity")
            private String resultQuantity;
        /** 库存变化数量 */
                @ApiField("change_quantity")
            private String changeQuantity;
        /** 扩展字段 */
                @ApiField("feature")
            private String feature;
        /** 库存类型(1 良品，101 残品) */
                @ApiField("inventory_type")
            private Integer inventoryType;
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
        /** 仓内单据号 */
                @ApiField("wh_order_code")
            private String whOrderCode;
    
        public String getBizSubTradeId() {
    return this.bizSubTradeId;
    }
    public void setBizSubTradeId(String bizSubTradeId) {
    this.bizSubTradeId = bizSubTradeId;
    }
        public String getBizTradeId() {
    return this.bizTradeId;
    }
    public void setBizTradeId(String bizTradeId) {
    this.bizTradeId = bizTradeId;
    }
        public Long getOperateTime() {
    return this.operateTime;
    }
    public void setOperateTime(Long operateTime) {
    this.operateTime = operateTime;
    }
        public String getBizActivityType() {
    return this.bizActivityType;
    }
    public void setBizActivityType(String bizActivityType) {
    this.bizActivityType = bizActivityType;
    }
        public String getOperationDetailOrderId() {
    return this.operationDetailOrderId;
    }
    public void setOperationDetailOrderId(String operationDetailOrderId) {
    this.operationDetailOrderId = operationDetailOrderId;
    }
        public String getOperationOrderId() {
    return this.operationOrderId;
    }
    public void setOperationOrderId(String operationOrderId) {
    this.operationOrderId = operationOrderId;
    }
        public String getResultLockQuantity() {
    return this.resultLockQuantity;
    }
    public void setResultLockQuantity(String resultLockQuantity) {
    this.resultLockQuantity = resultLockQuantity;
    }
        public String getChangeLockQuantity() {
    return this.changeLockQuantity;
    }
    public void setChangeLockQuantity(String changeLockQuantity) {
    this.changeLockQuantity = changeLockQuantity;
    }
        public String getResultQuantity() {
    return this.resultQuantity;
    }
    public void setResultQuantity(String resultQuantity) {
    this.resultQuantity = resultQuantity;
    }
        public String getChangeQuantity() {
    return this.changeQuantity;
    }
    public void setChangeQuantity(String changeQuantity) {
    this.changeQuantity = changeQuantity;
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
        public String getWhOrderCode() {
    return this.whOrderCode;
    }
    public void setWhOrderCode(String whOrderCode) {
    this.whOrderCode = whOrderCode;
    }
    }