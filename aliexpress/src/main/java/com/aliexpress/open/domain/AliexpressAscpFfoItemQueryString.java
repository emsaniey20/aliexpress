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

public class AliexpressAscpFfoItemQueryString implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 库存数量 */
                @ApiField("aic_inventory")
            private String aicInventory;
        /** 货品实际支付金额 */
                @ApiField("sku_actual_paid_amount")
            private String skuActualPaidAmount;
        /** 货品优惠金额 */
                @ApiField("sku_discount_amount")
            private String skuDiscountAmount;
        /** SKU单价 */
                @ApiField("unit_price")
            private String unitPrice;
        /** 发货数量 */
                @ApiField("order_line_qty")
            private String orderLineQty;
        /** 货品条码 */
                @ApiField("barcode")
            private String barcode;
        /** 货品Id */
                @ApiField("sc_item_id")
            private String scItemId;
        /** SKUid */
                @ApiField("sku_id")
            private String skuId;
        /** 商品名称 */
                @ApiField("item_title")
            private String itemTitle;
        /** 商品ID */
                @ApiField("item_id")
            private String itemId;
        /** 扩展字段 */
                @ApiField("extend_fields")
            private String extendFields;
    
        public String getAicInventory() {
    return this.aicInventory;
    }
    public void setAicInventory(String aicInventory) {
    this.aicInventory = aicInventory;
    }
        public String getSkuActualPaidAmount() {
    return this.skuActualPaidAmount;
    }
    public void setSkuActualPaidAmount(String skuActualPaidAmount) {
    this.skuActualPaidAmount = skuActualPaidAmount;
    }
        public String getSkuDiscountAmount() {
    return this.skuDiscountAmount;
    }
    public void setSkuDiscountAmount(String skuDiscountAmount) {
    this.skuDiscountAmount = skuDiscountAmount;
    }
        public String getUnitPrice() {
    return this.unitPrice;
    }
    public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    }
        public String getOrderLineQty() {
    return this.orderLineQty;
    }
    public void setOrderLineQty(String orderLineQty) {
    this.orderLineQty = orderLineQty;
    }
        public String getBarcode() {
    return this.barcode;
    }
    public void setBarcode(String barcode) {
    this.barcode = barcode;
    }
        public String getScItemId() {
    return this.scItemId;
    }
    public void setScItemId(String scItemId) {
    this.scItemId = scItemId;
    }
        public String getSkuId() {
    return this.skuId;
    }
    public void setSkuId(String skuId) {
    this.skuId = skuId;
    }
        public String getItemTitle() {
    return this.itemTitle;
    }
    public void setItemTitle(String itemTitle) {
    this.itemTitle = itemTitle;
    }
        public String getItemId() {
    return this.itemId;
    }
    public void setItemId(String itemId) {
    this.itemId = itemId;
    }
        public String getExtendFields() {
    return this.extendFields;
    }
    public void setExtendFields(String extendFields) {
    this.extendFields = extendFields;
    }
    }