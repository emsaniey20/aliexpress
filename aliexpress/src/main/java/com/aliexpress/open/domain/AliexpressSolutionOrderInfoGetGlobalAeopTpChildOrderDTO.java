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

public class AliexpressSolutionOrderInfoGetGlobalAeopTpChildOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** snapshot ID */
                @ApiField("snapshot_id")
            private String snapshotId;
        /** How many products in one piece or lot */
                @ApiField("lot_num")
            private Integer lotNum;
        /** logistics amount */
                @ApiField("logistics_amount")
            private AliexpressSolutionOrderInfoGetGlobalMoneyStr logisticsAmount;
        /** goods prepare days */
                @ApiField("goods_prepare_time")
            private Integer goodsPrepareTime;
        /** Extended attributes of product */
                @ApiField("product_attributes")
            private String productAttributes;
        /** buyer memo */
                @ApiField("buyer_memo")
            private String buyerMemo;
        /** refund info */
                @ApiField("refund_info")
            private AliexpressSolutionOrderInfoGetGlobalAeopTpRefundInfoDTO refundInfo;
        /** product_unit */
                @ApiField("product_unit")
            private String productUnit;
        /** order ID */
                @ApiField("id")
            private Long id;
        /** logistics type */
                @ApiField("logistics_type")
            private String logisticsType;
        /** frozen status（NO_FROZEN; IN_FROZEN） */
                @ApiField("frozen_status")
            private String frozenStatus;
        /** issue status */
                @ApiField("issue_status")
            private String issueStatus;
        /** order sort id */
                @ApiField("order_sort_id")
            private Integer orderSortId;
        /** affiliate fee rate */
                @ApiField("afflicate_fee_rate")
            private String afflicateFeeRate;
        /** order amount */
                @ApiField("init_order_amt")
            private AliexpressSolutionOrderInfoGetGlobalMoneyStr initOrderAmt;
        /** child issue info */
                @ApiField("child_issue_info")
            private AliexpressSolutionOrderInfoGetGlobalAeopTpIssueInfoDTO childIssueInfo;
        /** logistics service name */
                @ApiField("logistics_service_name")
            private String logisticsServiceName;
        /** order loan info */
                @ApiField("loan_info")
            private AliexpressSolutionOrderInfoGetGlobalAeopTpLoanInfoDTO loanInfo;
        /** product snapshot Url */
                @ApiField("product_snap_url")
            private String productSnapUrl;
        /** Order Status：PLACE_ORDER_SUCCESS;  IN_CANCEL;  WAIT_SELLER_SEND_GOODS;  SELLER_PART_SEND_GOODS;  WAIT_BUYER_ACCEPT_GOODS;  FUND_PROCESSING; IN_ISSUE;  IN_FROZEN;  WAIT_SELLER_EXAMINE_MONEY;  RISK_CONTROL. */
                @ApiField("order_status")
            private String orderStatus;
        /** SKU code */
                @ApiField("sku_code")
            private String skuCode;
        /** SELLER_SEND_GOODS" or "WAREHOUSE_SEND_GOODS" */
                @ApiField("send_goods_operator")
            private String sendGoodsOperator;
        /** product ID */
                @ApiField("product_id")
            private Long productId;
        /** product quantity */
                @ApiField("product_count")
            private Integer productCount;
        /** fund status (NOT_PAY；PAY_SUCCESS) */
                @ApiField("fund_status")
            private String fundStatus;
        /** escrow fee rate */
                @ApiField("escrow_fee_rate")
            private String escrowFeeRate;
        /** product image Url */
                @ApiField("product_img_url")
            private String productImgUrl;
        /** child order ID */
                @ApiField("child_order_id")
            private String childOrderId;
        /** product price */
                @ApiField("product_price")
            private AliexpressSolutionOrderInfoGetGlobalMoneyStr productPrice;
        /** product name */
                @ApiField("product_name")
            private String productName;
        /** snapshot small photo path */
                @ApiField("snapshot_small_photo_path")
            private String snapshotSmallPhotoPath;
        /** Product specifications */
                @ApiField("product_standard")
            private String productStandard;
        /** cainiaoInternationalWarehouse */
                @ApiField("logistics_warehouse_type")
            private String logisticsWarehouseType;
        /** discount amount of child order */
                @ApiField("child_order_discount_info")
            private AliexpressSolutionOrderInfoGetGlobalMoneyStr childOrderDiscountInfo;
        /** An amount to adjust the product price on, for example, if the seller wants to give buyer a personal discount by the "Adjust price"  button in order management backend. */
                @ApiField("child_order_adjust_amount")
            private AliexpressSolutionOrderInfoGetGlobalMoneyStr childOrderAdjustAmount;
        /** discount detail list for each child order */
                @ApiListField("child_order_discount_detail_list")
            private List<AliexpressSolutionOrderInfoGetGlobalAeopTpSaleDiscountInfo> childOrderDiscountDetailList;
    
        public String getSnapshotId() {
    return this.snapshotId;
    }
    public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    }
        public Integer getLotNum() {
    return this.lotNum;
    }
    public void setLotNum(Integer lotNum) {
    this.lotNum = lotNum;
    }
        public AliexpressSolutionOrderInfoGetGlobalMoneyStr getLogisticsAmount() {
    return this.logisticsAmount;
    }
    public void setLogisticsAmount(AliexpressSolutionOrderInfoGetGlobalMoneyStr logisticsAmount) {
    this.logisticsAmount = logisticsAmount;
    }
        public Integer getGoodsPrepareTime() {
    return this.goodsPrepareTime;
    }
    public void setGoodsPrepareTime(Integer goodsPrepareTime) {
    this.goodsPrepareTime = goodsPrepareTime;
    }
        public String getProductAttributes() {
    return this.productAttributes;
    }
    public void setProductAttributes(String productAttributes) {
    this.productAttributes = productAttributes;
    }
        public String getBuyerMemo() {
    return this.buyerMemo;
    }
    public void setBuyerMemo(String buyerMemo) {
    this.buyerMemo = buyerMemo;
    }
        public AliexpressSolutionOrderInfoGetGlobalAeopTpRefundInfoDTO getRefundInfo() {
    return this.refundInfo;
    }
    public void setRefundInfo(AliexpressSolutionOrderInfoGetGlobalAeopTpRefundInfoDTO refundInfo) {
    this.refundInfo = refundInfo;
    }
        public String getProductUnit() {
    return this.productUnit;
    }
    public void setProductUnit(String productUnit) {
    this.productUnit = productUnit;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public String getLogisticsType() {
    return this.logisticsType;
    }
    public void setLogisticsType(String logisticsType) {
    this.logisticsType = logisticsType;
    }
        public String getFrozenStatus() {
    return this.frozenStatus;
    }
    public void setFrozenStatus(String frozenStatus) {
    this.frozenStatus = frozenStatus;
    }
        public String getIssueStatus() {
    return this.issueStatus;
    }
    public void setIssueStatus(String issueStatus) {
    this.issueStatus = issueStatus;
    }
        public Integer getOrderSortId() {
    return this.orderSortId;
    }
    public void setOrderSortId(Integer orderSortId) {
    this.orderSortId = orderSortId;
    }
        public String getAfflicateFeeRate() {
    return this.afflicateFeeRate;
    }
    public void setAfflicateFeeRate(String afflicateFeeRate) {
    this.afflicateFeeRate = afflicateFeeRate;
    }
        public AliexpressSolutionOrderInfoGetGlobalMoneyStr getInitOrderAmt() {
    return this.initOrderAmt;
    }
    public void setInitOrderAmt(AliexpressSolutionOrderInfoGetGlobalMoneyStr initOrderAmt) {
    this.initOrderAmt = initOrderAmt;
    }
        public AliexpressSolutionOrderInfoGetGlobalAeopTpIssueInfoDTO getChildIssueInfo() {
    return this.childIssueInfo;
    }
    public void setChildIssueInfo(AliexpressSolutionOrderInfoGetGlobalAeopTpIssueInfoDTO childIssueInfo) {
    this.childIssueInfo = childIssueInfo;
    }
        public String getLogisticsServiceName() {
    return this.logisticsServiceName;
    }
    public void setLogisticsServiceName(String logisticsServiceName) {
    this.logisticsServiceName = logisticsServiceName;
    }
        public AliexpressSolutionOrderInfoGetGlobalAeopTpLoanInfoDTO getLoanInfo() {
    return this.loanInfo;
    }
    public void setLoanInfo(AliexpressSolutionOrderInfoGetGlobalAeopTpLoanInfoDTO loanInfo) {
    this.loanInfo = loanInfo;
    }
        public String getProductSnapUrl() {
    return this.productSnapUrl;
    }
    public void setProductSnapUrl(String productSnapUrl) {
    this.productSnapUrl = productSnapUrl;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public String getSendGoodsOperator() {
    return this.sendGoodsOperator;
    }
    public void setSendGoodsOperator(String sendGoodsOperator) {
    this.sendGoodsOperator = sendGoodsOperator;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public Integer getProductCount() {
    return this.productCount;
    }
    public void setProductCount(Integer productCount) {
    this.productCount = productCount;
    }
        public String getFundStatus() {
    return this.fundStatus;
    }
    public void setFundStatus(String fundStatus) {
    this.fundStatus = fundStatus;
    }
        public String getEscrowFeeRate() {
    return this.escrowFeeRate;
    }
    public void setEscrowFeeRate(String escrowFeeRate) {
    this.escrowFeeRate = escrowFeeRate;
    }
        public String getProductImgUrl() {
    return this.productImgUrl;
    }
    public void setProductImgUrl(String productImgUrl) {
    this.productImgUrl = productImgUrl;
    }
        public String getChildOrderId() {
    return this.childOrderId;
    }
    public void setChildOrderId(String childOrderId) {
    this.childOrderId = childOrderId;
    }
        public AliexpressSolutionOrderInfoGetGlobalMoneyStr getProductPrice() {
    return this.productPrice;
    }
    public void setProductPrice(AliexpressSolutionOrderInfoGetGlobalMoneyStr productPrice) {
    this.productPrice = productPrice;
    }
        public String getProductName() {
    return this.productName;
    }
    public void setProductName(String productName) {
    this.productName = productName;
    }
        public String getSnapshotSmallPhotoPath() {
    return this.snapshotSmallPhotoPath;
    }
    public void setSnapshotSmallPhotoPath(String snapshotSmallPhotoPath) {
    this.snapshotSmallPhotoPath = snapshotSmallPhotoPath;
    }
        public String getProductStandard() {
    return this.productStandard;
    }
    public void setProductStandard(String productStandard) {
    this.productStandard = productStandard;
    }
        public String getLogisticsWarehouseType() {
    return this.logisticsWarehouseType;
    }
    public void setLogisticsWarehouseType(String logisticsWarehouseType) {
    this.logisticsWarehouseType = logisticsWarehouseType;
    }
        public AliexpressSolutionOrderInfoGetGlobalMoneyStr getChildOrderDiscountInfo() {
    return this.childOrderDiscountInfo;
    }
    public void setChildOrderDiscountInfo(AliexpressSolutionOrderInfoGetGlobalMoneyStr childOrderDiscountInfo) {
    this.childOrderDiscountInfo = childOrderDiscountInfo;
    }
        public AliexpressSolutionOrderInfoGetGlobalMoneyStr getChildOrderAdjustAmount() {
    return this.childOrderAdjustAmount;
    }
    public void setChildOrderAdjustAmount(AliexpressSolutionOrderInfoGetGlobalMoneyStr childOrderAdjustAmount) {
    this.childOrderAdjustAmount = childOrderAdjustAmount;
    }
        public List<AliexpressSolutionOrderInfoGetGlobalAeopTpSaleDiscountInfo> getChildOrderDiscountDetailList() {
    return this.childOrderDiscountDetailList;
    }
    public void setChildOrderDiscountDetailList(List<AliexpressSolutionOrderInfoGetGlobalAeopTpSaleDiscountInfo> childOrderDiscountDetailList) {
    this.childOrderDiscountDetailList = childOrderDiscountDetailList;
    }
    }