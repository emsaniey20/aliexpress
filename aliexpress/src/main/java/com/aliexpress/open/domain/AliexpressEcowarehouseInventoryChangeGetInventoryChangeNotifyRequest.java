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

public class AliexpressEcowarehouseInventoryChangeGetInventoryChangeNotifyRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 库存变更模型 */
                @ApiField("ae_trade_order_id")
            private String aeTradeOrderId;
        /** 库存变更模型 */
                @ApiField("out_biz_id")
            private String outBizId;
        /** 库存变更模型 */
                @ApiField("quantity")
            private Long quantity;
        /** 库存变更模型 */
                @ApiField("warehouse_customer_id")
            private String warehouseCustomerId;
        /** 库存变更模型 */
                @ApiField("owner_id")
            private String ownerId;
        /** 库存变更模型 */
                @ApiField("type")
            private String type;
        /** 库存变更模型 */
                @ApiField("sku_id")
            private String skuId;
        /** 库存变更模型 */
                @ApiField("warehouse_code")
            private String warehouseCode;
        /** 全局幂等ID */
                @ApiField("idempotent_id")
            private String idempotentId;
    
        public String getAeTradeOrderId() {
    return this.aeTradeOrderId;
    }
    public void setAeTradeOrderId(String aeTradeOrderId) {
    this.aeTradeOrderId = aeTradeOrderId;
    }
        public String getOutBizId() {
    return this.outBizId;
    }
    public void setOutBizId(String outBizId) {
    this.outBizId = outBizId;
    }
        public Long getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Long quantity) {
    this.quantity = quantity;
    }
        public String getWarehouseCustomerId() {
    return this.warehouseCustomerId;
    }
    public void setWarehouseCustomerId(String warehouseCustomerId) {
    this.warehouseCustomerId = warehouseCustomerId;
    }
        public String getOwnerId() {
    return this.ownerId;
    }
    public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
    }
        public String getType() {
    return this.type;
    }
    public void setType(String type) {
    this.type = type;
    }
        public String getSkuId() {
    return this.skuId;
    }
    public void setSkuId(String skuId) {
    this.skuId = skuId;
    }
        public String getWarehouseCode() {
    return this.warehouseCode;
    }
    public void setWarehouseCode(String warehouseCode) {
    this.warehouseCode = warehouseCode;
    }
        public String getIdempotentId() {
    return this.idempotentId;
    }
    public void setIdempotentId(String idempotentId) {
    this.idempotentId = idempotentId;
    }
    }