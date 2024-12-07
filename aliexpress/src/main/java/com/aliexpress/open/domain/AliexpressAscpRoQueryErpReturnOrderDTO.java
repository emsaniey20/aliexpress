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

public class AliexpressAscpRoQueryErpReturnOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 单据创建人 */
                @ApiField("creator")
            private String creator;
        /** 扩展字段 */
                @ApiField("extend_fields")
            private String extendFields;
        /** 单据创建时间戳 */
                @ApiField("gmt_create")
            private Long gmtCreate;
        /** 出库时间戳 */
                @ApiField("gmt_outbound")
            private Long gmtOutbound;
        /** 库存类型描述 */
                @ApiField("inventory_type_desc")
            private String inventoryTypeDesc;
        /** 物流单号 */
                @ApiField("lbx_no")
            private String lbxNo;
        /** 退供单号 */
                @ApiField("return_order_no")
            private String returnOrderNo;
        /** 退供原因 */
                @ApiField("return_reason_desc")
            private String returnReasonDesc;
        /** 退供类型 */
                @ApiField("return_type_desc")
            private String returnTypeDesc;
        /** 退供SKU数量 */
                @ApiField("sku_count")
            private Long skuCount;
        /** 状态编码 */
                @ApiField("status")
            private Integer status;
        /** 状态描述 */
                @ApiField("status_desc")
            private String statusDesc;
        /** 仓编码 */
                @ApiField("store_code")
            private String storeCode;
        /** 仓名称 */
                @ApiField("store_name")
            private String storeName;
        /** 供应商Id */
                @ApiField("supplier_id")
            private Long supplierId;
        /** 供应商名称 */
                @ApiField("supplier_name")
            private String supplierName;
        /** 退供总金额,单位分 */
                @ApiField("total_amount")
            private String totalAmount;
        /** 退供总数量 */
                @ApiField("total_quantity")
            private Long totalQuantity;
        /** 实际退供总金额，单位分 */
                @ApiField("total_return_amount")
            private String totalReturnAmount;
        /** 实际退供数量 */
                @ApiField("total_return_quantity")
            private Long totalReturnQuantity;
    
        public String getCreator() {
    return this.creator;
    }
    public void setCreator(String creator) {
    this.creator = creator;
    }
        public String getExtendFields() {
    return this.extendFields;
    }
    public void setExtendFields(String extendFields) {
    this.extendFields = extendFields;
    }
        public Long getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(Long gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public Long getGmtOutbound() {
    return this.gmtOutbound;
    }
    public void setGmtOutbound(Long gmtOutbound) {
    this.gmtOutbound = gmtOutbound;
    }
        public String getInventoryTypeDesc() {
    return this.inventoryTypeDesc;
    }
    public void setInventoryTypeDesc(String inventoryTypeDesc) {
    this.inventoryTypeDesc = inventoryTypeDesc;
    }
        public String getLbxNo() {
    return this.lbxNo;
    }
    public void setLbxNo(String lbxNo) {
    this.lbxNo = lbxNo;
    }
        public String getReturnOrderNo() {
    return this.returnOrderNo;
    }
    public void setReturnOrderNo(String returnOrderNo) {
    this.returnOrderNo = returnOrderNo;
    }
        public String getReturnReasonDesc() {
    return this.returnReasonDesc;
    }
    public void setReturnReasonDesc(String returnReasonDesc) {
    this.returnReasonDesc = returnReasonDesc;
    }
        public String getReturnTypeDesc() {
    return this.returnTypeDesc;
    }
    public void setReturnTypeDesc(String returnTypeDesc) {
    this.returnTypeDesc = returnTypeDesc;
    }
        public Long getSkuCount() {
    return this.skuCount;
    }
    public void setSkuCount(Long skuCount) {
    this.skuCount = skuCount;
    }
        public Integer getStatus() {
    return this.status;
    }
    public void setStatus(Integer status) {
    this.status = status;
    }
        public String getStatusDesc() {
    return this.statusDesc;
    }
    public void setStatusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
    }
        public String getStoreCode() {
    return this.storeCode;
    }
    public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
    }
        public String getStoreName() {
    return this.storeName;
    }
    public void setStoreName(String storeName) {
    this.storeName = storeName;
    }
        public Long getSupplierId() {
    return this.supplierId;
    }
    public void setSupplierId(Long supplierId) {
    this.supplierId = supplierId;
    }
        public String getSupplierName() {
    return this.supplierName;
    }
    public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
    }
        public String getTotalAmount() {
    return this.totalAmount;
    }
    public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    }
        public Long getTotalQuantity() {
    return this.totalQuantity;
    }
    public void setTotalQuantity(Long totalQuantity) {
    this.totalQuantity = totalQuantity;
    }
        public String getTotalReturnAmount() {
    return this.totalReturnAmount;
    }
    public void setTotalReturnAmount(String totalReturnAmount) {
    this.totalReturnAmount = totalReturnAmount;
    }
        public Long getTotalReturnQuantity() {
    return this.totalReturnQuantity;
    }
    public void setTotalReturnQuantity(Long totalReturnQuantity) {
    this.totalReturnQuantity = totalReturnQuantity;
    }
    }