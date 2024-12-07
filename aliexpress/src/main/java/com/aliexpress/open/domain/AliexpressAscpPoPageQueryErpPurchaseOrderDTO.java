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

public class AliexpressAscpPoPageQueryErpPurchaseOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 供应商名称 */
                @ApiField("supplier_name")
            private String supplierName;
        /** 创建人 */
                @ApiField("creator")
            private String creator;
        /** 单据状态 */
                @ApiField("status_desc")
            private String statusDesc;
        /** 供应商id */
                @ApiField("supplier_id")
            private Long supplierId;
        /** 预计到仓时间 */
                @ApiField("pre_arrive_time")
            private Long preArriveTime;
        /** 创建时间 */
                @ApiField("gmt_create")
            private Long gmtCreate;
        /** 采购单号 */
                @ApiField("purchase_order_no")
            private String purchaseOrderNo;
        /** 采购单总金额 */
                @ApiField("total_amount")
            private String totalAmount;
        /** 采购数量 */
                @ApiField("total_quantity")
            private Integer totalQuantity;
        /** sku数量 */
                @ApiField("total_sku_count")
            private Integer totalSkuCount;
        /** 仓名 */
                @ApiField("store_name")
            private String storeName;
        /** 采购单失效时间 */
                @ApiField("gmt_expiration")
            private Long gmtExpiration;
        /** 仓code */
                @ApiField("store_code")
            private String storeCode;
        /** 单据状态 */
                @ApiField("status")
            private Integer status;
        /** 物流单号列表 */
                @ApiListField("whc_order_no_list")
            private List<String> whcOrderNoList;
        /** 已弃用，参考status 1:未发货，2:已发货 */
                @ApiField("pickup_status")
            private Integer pickupStatus;
        /** 收货人所在国家 */
                @ApiField("receiver_country")
            private String receiverCountry;
        /** 揽收单号 */
                @ApiField("pick_up_order_no")
            private String pickUpOrderNo;
        /** 自寄单号 */
                @ApiField("self_delivery_no")
            private String selfDeliveryNo;
        /** 交易主单号 */
                @ApiField("trade_order_id")
            private String tradeOrderId;
        /** 国际出库物流LP单 */
                @ApiField("lp")
            private String lp;
        /** 仓回传重量, 单位g */
                @ApiField("package_weight")
            private Integer packageWeight;
        /** 仓地址 */
                @ApiField("store_address_detail")
            private String storeAddressDetail;
        /** 仓联系人姓名 */
                @ApiField("store_contact_name")
            private String storeContactName;
        /** 仓联系人电话 */
                @ApiField("store_contact_phone")
            private String storeContactPhone;
        /** 异常场景下货物处理方式, 0代表退回. */
                @ApiField("return_type")
            private Integer returnType;
        /** 退回场景下, 商家填的联系人 */
                @ApiField("return_contact_name")
            private String returnContactName;
        /** 退回场景下, 商家填的电话 */
                @ApiField("return_contact_phone")
            private String returnContactPhone;
        /**  交易订单归属的店铺 */
                @ApiField("cn_login_id")
            private String cnLoginId;
    
        public String getSupplierName() {
    return this.supplierName;
    }
    public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
    }
        public String getCreator() {
    return this.creator;
    }
    public void setCreator(String creator) {
    this.creator = creator;
    }
        public String getStatusDesc() {
    return this.statusDesc;
    }
    public void setStatusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
    }
        public Long getSupplierId() {
    return this.supplierId;
    }
    public void setSupplierId(Long supplierId) {
    this.supplierId = supplierId;
    }
        public Long getPreArriveTime() {
    return this.preArriveTime;
    }
    public void setPreArriveTime(Long preArriveTime) {
    this.preArriveTime = preArriveTime;
    }
        public Long getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(Long gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getPurchaseOrderNo() {
    return this.purchaseOrderNo;
    }
    public void setPurchaseOrderNo(String purchaseOrderNo) {
    this.purchaseOrderNo = purchaseOrderNo;
    }
        public String getTotalAmount() {
    return this.totalAmount;
    }
    public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    }
        public Integer getTotalQuantity() {
    return this.totalQuantity;
    }
    public void setTotalQuantity(Integer totalQuantity) {
    this.totalQuantity = totalQuantity;
    }
        public Integer getTotalSkuCount() {
    return this.totalSkuCount;
    }
    public void setTotalSkuCount(Integer totalSkuCount) {
    this.totalSkuCount = totalSkuCount;
    }
        public String getStoreName() {
    return this.storeName;
    }
    public void setStoreName(String storeName) {
    this.storeName = storeName;
    }
        public Long getGmtExpiration() {
    return this.gmtExpiration;
    }
    public void setGmtExpiration(Long gmtExpiration) {
    this.gmtExpiration = gmtExpiration;
    }
        public String getStoreCode() {
    return this.storeCode;
    }
    public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
    }
        public Integer getStatus() {
    return this.status;
    }
    public void setStatus(Integer status) {
    this.status = status;
    }
        public List<String> getWhcOrderNoList() {
    return this.whcOrderNoList;
    }
    public void setWhcOrderNoList(List<String> whcOrderNoList) {
    this.whcOrderNoList = whcOrderNoList;
    }
        public Integer getPickupStatus() {
    return this.pickupStatus;
    }
    public void setPickupStatus(Integer pickupStatus) {
    this.pickupStatus = pickupStatus;
    }
        public String getReceiverCountry() {
    return this.receiverCountry;
    }
    public void setReceiverCountry(String receiverCountry) {
    this.receiverCountry = receiverCountry;
    }
        public String getPickUpOrderNo() {
    return this.pickUpOrderNo;
    }
    public void setPickUpOrderNo(String pickUpOrderNo) {
    this.pickUpOrderNo = pickUpOrderNo;
    }
        public String getSelfDeliveryNo() {
    return this.selfDeliveryNo;
    }
    public void setSelfDeliveryNo(String selfDeliveryNo) {
    this.selfDeliveryNo = selfDeliveryNo;
    }
        public String getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(String tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
        public String getLp() {
    return this.lp;
    }
    public void setLp(String lp) {
    this.lp = lp;
    }
        public Integer getPackageWeight() {
    return this.packageWeight;
    }
    public void setPackageWeight(Integer packageWeight) {
    this.packageWeight = packageWeight;
    }
        public String getStoreAddressDetail() {
    return this.storeAddressDetail;
    }
    public void setStoreAddressDetail(String storeAddressDetail) {
    this.storeAddressDetail = storeAddressDetail;
    }
        public String getStoreContactName() {
    return this.storeContactName;
    }
    public void setStoreContactName(String storeContactName) {
    this.storeContactName = storeContactName;
    }
        public String getStoreContactPhone() {
    return this.storeContactPhone;
    }
    public void setStoreContactPhone(String storeContactPhone) {
    this.storeContactPhone = storeContactPhone;
    }
        public Integer getReturnType() {
    return this.returnType;
    }
    public void setReturnType(Integer returnType) {
    this.returnType = returnType;
    }
        public String getReturnContactName() {
    return this.returnContactName;
    }
    public void setReturnContactName(String returnContactName) {
    this.returnContactName = returnContactName;
    }
        public String getReturnContactPhone() {
    return this.returnContactPhone;
    }
    public void setReturnContactPhone(String returnContactPhone) {
    this.returnContactPhone = returnContactPhone;
    }
        public String getCnLoginId() {
    return this.cnLoginId;
    }
    public void setCnLoginId(String cnLoginId) {
    this.cnLoginId = cnLoginId;
    }
    }