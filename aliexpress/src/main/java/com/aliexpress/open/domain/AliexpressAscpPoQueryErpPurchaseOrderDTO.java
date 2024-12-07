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

public class AliexpressAscpPoQueryErpPurchaseOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 入库完结时间 */
                @ApiField("actual_inbound_time")
            private Long actualInboundTime;
        /** 预约单号 */
                @ApiField("appoint_order_no")
            private String appointOrderNo;
        /** 创建人 */
                @ApiField("creator")
            private String creator;
        /** 扩展字段 */
                @ApiField("extend_fields")
            private String extendFields;
        /** 采购单创建时间 */
                @ApiField("gmt_create")
            private Long gmtCreate;
        /** 采购单失效时间 */
                @ApiField("gmt_expiration")
            private Long gmtExpiration;
        /** 物流单号 */
                @ApiField("lbx_no")
            private String lbxNo;
        /** 预计到仓时间 */
                @ApiField("pre_arrive_time")
            private Long preArriveTime;
        /** 采购单号 */
                @ApiField("purchase_order_no")
            private String purchaseOrderNo;
        /** 收货数量 */
                @ApiField("received_quantity")
            private Long receivedQuantity;
        /** 单据状态 */
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
        /** 采购单总金额 */
                @ApiField("total_amount")
            private String totalAmount;
        /** 采购单总数量 */
                @ApiField("total_quantity")
            private Long totalQuantity;
        /** 采购单SKU数量 */
                @ApiField("total_sku_count")
            private Long totalSkuCount;
    
        public Long getActualInboundTime() {
    return this.actualInboundTime;
    }
    public void setActualInboundTime(Long actualInboundTime) {
    this.actualInboundTime = actualInboundTime;
    }
        public String getAppointOrderNo() {
    return this.appointOrderNo;
    }
    public void setAppointOrderNo(String appointOrderNo) {
    this.appointOrderNo = appointOrderNo;
    }
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
        public Long getGmtExpiration() {
    return this.gmtExpiration;
    }
    public void setGmtExpiration(Long gmtExpiration) {
    this.gmtExpiration = gmtExpiration;
    }
        public String getLbxNo() {
    return this.lbxNo;
    }
    public void setLbxNo(String lbxNo) {
    this.lbxNo = lbxNo;
    }
        public Long getPreArriveTime() {
    return this.preArriveTime;
    }
    public void setPreArriveTime(Long preArriveTime) {
    this.preArriveTime = preArriveTime;
    }
        public String getPurchaseOrderNo() {
    return this.purchaseOrderNo;
    }
    public void setPurchaseOrderNo(String purchaseOrderNo) {
    this.purchaseOrderNo = purchaseOrderNo;
    }
        public Long getReceivedQuantity() {
    return this.receivedQuantity;
    }
    public void setReceivedQuantity(Long receivedQuantity) {
    this.receivedQuantity = receivedQuantity;
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
        public Long getTotalSkuCount() {
    return this.totalSkuCount;
    }
    public void setTotalSkuCount(Long totalSkuCount) {
    this.totalSkuCount = totalSkuCount;
    }
    }