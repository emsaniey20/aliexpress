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

public class AliexpressAscpPoItemQueryErpPurchaseOrderItemDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 条码 */
                @ApiField("barcode")
            private String barcode;
        /** 商品id */
                @ApiField("item_id")
            private String itemId;
        /** 商品skuId */
                @ApiField("sku_id")
            private String skuId;
        /** sku图片链接 */
                @ApiField("sku_img")
            private String skuImg;
        /** 扩展字段 */
                @ApiField("extend_fields")
            private String extendFields;
        /** 未税采购金额，单位元 */
                @ApiField("no_tax_purchase_amount_dec")
            private String noTaxPurchaseAmountDec;
        /** 含税采购金额，单位元 */
                @ApiField("purchase_amount_dec")
            private String purchaseAmountDec;
        /** 未税采购单价，单位元 */
                @ApiField("no_tax_purchase_price_dec")
            private String noTaxPurchasePriceDec;
        /** 含税采购单价，单位元 */
                @ApiField("purchase_price_dec")
            private String purchasePriceDec;
        /** 税率 */
                @ApiField("tax_rate")
            private String taxRate;
        /** 实收残品数量 */
                @ApiField("received_defective_qty")
            private Long receivedDefectiveQty;
        /** 实收正品数量 */
                @ApiField("received_normal_qty")
            private Long receivedNormalQty;
        /** 采购数量 */
                @ApiField("quantity")
            private Long quantity;
        /** 货品名称 */
                @ApiField("title")
            private String title;
        /** 货品Id */
                @ApiField("sc_item_id")
            private Long scItemId;
        /** 采购单号 */
                @ApiField("purchase_order_no")
            private String purchaseOrderNo;
    
        public String getBarcode() {
    return this.barcode;
    }
    public void setBarcode(String barcode) {
    this.barcode = barcode;
    }
        public String getItemId() {
    return this.itemId;
    }
    public void setItemId(String itemId) {
    this.itemId = itemId;
    }
        public String getSkuId() {
    return this.skuId;
    }
    public void setSkuId(String skuId) {
    this.skuId = skuId;
    }
        public String getSkuImg() {
    return this.skuImg;
    }
    public void setSkuImg(String skuImg) {
    this.skuImg = skuImg;
    }
        public String getExtendFields() {
    return this.extendFields;
    }
    public void setExtendFields(String extendFields) {
    this.extendFields = extendFields;
    }
        public String getNoTaxPurchaseAmountDec() {
    return this.noTaxPurchaseAmountDec;
    }
    public void setNoTaxPurchaseAmountDec(String noTaxPurchaseAmountDec) {
    this.noTaxPurchaseAmountDec = noTaxPurchaseAmountDec;
    }
        public String getPurchaseAmountDec() {
    return this.purchaseAmountDec;
    }
    public void setPurchaseAmountDec(String purchaseAmountDec) {
    this.purchaseAmountDec = purchaseAmountDec;
    }
        public String getNoTaxPurchasePriceDec() {
    return this.noTaxPurchasePriceDec;
    }
    public void setNoTaxPurchasePriceDec(String noTaxPurchasePriceDec) {
    this.noTaxPurchasePriceDec = noTaxPurchasePriceDec;
    }
        public String getPurchasePriceDec() {
    return this.purchasePriceDec;
    }
    public void setPurchasePriceDec(String purchasePriceDec) {
    this.purchasePriceDec = purchasePriceDec;
    }
        public String getTaxRate() {
    return this.taxRate;
    }
    public void setTaxRate(String taxRate) {
    this.taxRate = taxRate;
    }
        public Long getReceivedDefectiveQty() {
    return this.receivedDefectiveQty;
    }
    public void setReceivedDefectiveQty(Long receivedDefectiveQty) {
    this.receivedDefectiveQty = receivedDefectiveQty;
    }
        public Long getReceivedNormalQty() {
    return this.receivedNormalQty;
    }
    public void setReceivedNormalQty(Long receivedNormalQty) {
    this.receivedNormalQty = receivedNormalQty;
    }
        public Long getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Long quantity) {
    this.quantity = quantity;
    }
        public String getTitle() {
    return this.title;
    }
    public void setTitle(String title) {
    this.title = title;
    }
        public Long getScItemId() {
    return this.scItemId;
    }
    public void setScItemId(Long scItemId) {
    this.scItemId = scItemId;
    }
        public String getPurchaseOrderNo() {
    return this.purchaseOrderNo;
    }
    public void setPurchaseOrderNo(String purchaseOrderNo) {
    this.purchaseOrderNo = purchaseOrderNo;
    }
    }