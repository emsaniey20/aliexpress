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

public class AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpChildOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("shipping_discount_fee")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr shippingDiscountFee;
        /** 1 */
                @ApiField("escrow_fee_rate")
            private Long escrowFeeRate;
        /** 1 */
                @ApiField("product_img_url")
            private String productImgUrl;
        /** 1 */
                @ApiField("order_status")
            private String orderStatus;
        /** 1 */
                @ApiField("product_unit")
            private String productUnit;
        /** 1 */
                @ApiField("product_count")
            private Integer productCount;
        /** 1 */
                @ApiField("afflicate_fee_rate")
            private Integer afflicateFeeRate;
        /** 1 */
                @ApiField("send_goods_operator")
            private String sendGoodsOperator;
        /** 1 */
                @ApiField("product_name")
            private String productName;
        /** 1 */
                @ApiField("logistics_amount")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr logisticsAmount;
        /** 1 */
                @ApiField("issue_status")
            private String issueStatus;
        /** 1 */
                @ApiField("logistics_service_name")
            private String logisticsServiceName;
        /** 1 */
                @ApiField("child_issue_info")
            private String childIssueInfo;
        /** 1 */
                @ApiField("extend_map")
            private String extendMap;
        /** 1 */
                @ApiField("logistics_warehouse_type")
            private String logisticsWarehouseType;
        /** 1 */
                @ApiField("sale_discount_fee")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr saleDiscountFee;
        /** 1 */
                @ApiField("child_order_id")
            private String childOrderId;
        /** 1 */
                @ApiField("already_taxed")
            private String alreadyTaxed;
        /** 1 */
                @ApiField("shipping_actual_fee")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr shippingActualFee;
        /** 1 */
                @ApiField("goods_prepare_time")
            private Integer goodsPrepareTime;
        /** 1 */
                @ApiField("id")
            private Long id;
        /** 1 */
                @ApiField("actual_fee")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr actualFee;
        /** 1 */
                @ApiField("adjust_fee")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr adjustFee;
        /** 1 */
                @ApiField("snapshot_id")
            private String snapshotId;
        /** 1 */
                @ApiField("product_id")
            private Long productId;
        /** 1 */
                @ApiField("product_snap_url")
            private String productSnapUrl;
        /** 1 */
                @ApiField("init_order_amt")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr initOrderAmt;
        /** 1 */
                @ApiField("product_attributes")
            private String productAttributes;
        /** 1 */
                @ApiField("lot_num")
            private Integer lotNum;
        /** 1 */
                @ApiField("snapshot_small_photo_path")
            private String snapshotSmallPhotoPath;
        /** 1 */
                @ApiField("order_sort_id")
            private Integer orderSortId;
        /** 1 */
                @ApiListField("tags")
            private List<String> tags;
        /** 1 */
                @ApiField("product_standard")
            private String productStandard;
        /** 1 */
                @ApiListField("discount_info")
            private String discountInfo;
        /** 1 */
                @ApiField("shipping_fee")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr shippingFee;
        /** 1 */
                @ApiField("loan_info")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpLoanInfoDTO loanInfo;
        /** 1 */
                @ApiField("shipping_surcharge_fee")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr shippingSurchargeFee;
        /** 1 */
                @ApiField("refund_info")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpRefundInfoDTO refundInfo;
        /** 1 */
                @ApiField("frozen_status")
            private String frozenStatus;
        /** 1 */
                @ApiField("fund_status")
            private String fundStatus;
        /** 1 */
                @ApiField("logistics_type")
            private String logisticsType;
        /** 1 */
                @ApiField("product_price")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr productPrice;
        /** 1 */
                @ApiField("sku_code")
            private String skuCode;
        /** 1 */
                @ApiField("buyer_memo")
            private String buyerMemo;
    
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getShippingDiscountFee() {
    return this.shippingDiscountFee;
    }
    public void setShippingDiscountFee(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr shippingDiscountFee) {
    this.shippingDiscountFee = shippingDiscountFee;
    }
        public Long getEscrowFeeRate() {
    return this.escrowFeeRate;
    }
    public void setEscrowFeeRate(Long escrowFeeRate) {
    this.escrowFeeRate = escrowFeeRate;
    }
        public String getProductImgUrl() {
    return this.productImgUrl;
    }
    public void setProductImgUrl(String productImgUrl) {
    this.productImgUrl = productImgUrl;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public String getProductUnit() {
    return this.productUnit;
    }
    public void setProductUnit(String productUnit) {
    this.productUnit = productUnit;
    }
        public Integer getProductCount() {
    return this.productCount;
    }
    public void setProductCount(Integer productCount) {
    this.productCount = productCount;
    }
        public Integer getAfflicateFeeRate() {
    return this.afflicateFeeRate;
    }
    public void setAfflicateFeeRate(Integer afflicateFeeRate) {
    this.afflicateFeeRate = afflicateFeeRate;
    }
        public String getSendGoodsOperator() {
    return this.sendGoodsOperator;
    }
    public void setSendGoodsOperator(String sendGoodsOperator) {
    this.sendGoodsOperator = sendGoodsOperator;
    }
        public String getProductName() {
    return this.productName;
    }
    public void setProductName(String productName) {
    this.productName = productName;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getLogisticsAmount() {
    return this.logisticsAmount;
    }
    public void setLogisticsAmount(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr logisticsAmount) {
    this.logisticsAmount = logisticsAmount;
    }
        public String getIssueStatus() {
    return this.issueStatus;
    }
    public void setIssueStatus(String issueStatus) {
    this.issueStatus = issueStatus;
    }
        public String getLogisticsServiceName() {
    return this.logisticsServiceName;
    }
    public void setLogisticsServiceName(String logisticsServiceName) {
    this.logisticsServiceName = logisticsServiceName;
    }
        public String getChildIssueInfo() {
    return this.childIssueInfo;
    }
    public void setChildIssueInfo(String childIssueInfo) {
    this.childIssueInfo = childIssueInfo;
    }
        public String getExtendMap() {
    return this.extendMap;
    }
    public void setExtendMap(String extendMap) {
    this.extendMap = extendMap;
    }
        public String getLogisticsWarehouseType() {
    return this.logisticsWarehouseType;
    }
    public void setLogisticsWarehouseType(String logisticsWarehouseType) {
    this.logisticsWarehouseType = logisticsWarehouseType;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getSaleDiscountFee() {
    return this.saleDiscountFee;
    }
    public void setSaleDiscountFee(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr saleDiscountFee) {
    this.saleDiscountFee = saleDiscountFee;
    }
        public String getChildOrderId() {
    return this.childOrderId;
    }
    public void setChildOrderId(String childOrderId) {
    this.childOrderId = childOrderId;
    }
        public String getAlreadyTaxed() {
    return this.alreadyTaxed;
    }
    public void setAlreadyTaxed(String alreadyTaxed) {
    this.alreadyTaxed = alreadyTaxed;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getShippingActualFee() {
    return this.shippingActualFee;
    }
    public void setShippingActualFee(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr shippingActualFee) {
    this.shippingActualFee = shippingActualFee;
    }
        public Integer getGoodsPrepareTime() {
    return this.goodsPrepareTime;
    }
    public void setGoodsPrepareTime(Integer goodsPrepareTime) {
    this.goodsPrepareTime = goodsPrepareTime;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getActualFee() {
    return this.actualFee;
    }
    public void setActualFee(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr actualFee) {
    this.actualFee = actualFee;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getAdjustFee() {
    return this.adjustFee;
    }
    public void setAdjustFee(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr adjustFee) {
    this.adjustFee = adjustFee;
    }
        public String getSnapshotId() {
    return this.snapshotId;
    }
    public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getProductSnapUrl() {
    return this.productSnapUrl;
    }
    public void setProductSnapUrl(String productSnapUrl) {
    this.productSnapUrl = productSnapUrl;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getInitOrderAmt() {
    return this.initOrderAmt;
    }
    public void setInitOrderAmt(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr initOrderAmt) {
    this.initOrderAmt = initOrderAmt;
    }
        public String getProductAttributes() {
    return this.productAttributes;
    }
    public void setProductAttributes(String productAttributes) {
    this.productAttributes = productAttributes;
    }
        public Integer getLotNum() {
    return this.lotNum;
    }
    public void setLotNum(Integer lotNum) {
    this.lotNum = lotNum;
    }
        public String getSnapshotSmallPhotoPath() {
    return this.snapshotSmallPhotoPath;
    }
    public void setSnapshotSmallPhotoPath(String snapshotSmallPhotoPath) {
    this.snapshotSmallPhotoPath = snapshotSmallPhotoPath;
    }
        public Integer getOrderSortId() {
    return this.orderSortId;
    }
    public void setOrderSortId(Integer orderSortId) {
    this.orderSortId = orderSortId;
    }
        public List<String> getTags() {
    return this.tags;
    }
    public void setTags(List<String> tags) {
    this.tags = tags;
    }
        public String getProductStandard() {
    return this.productStandard;
    }
    public void setProductStandard(String productStandard) {
    this.productStandard = productStandard;
    }
        public String getDiscountInfo() {
    return this.discountInfo;
    }
    public void setDiscountInfo(String discountInfo) {
    this.discountInfo = discountInfo;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getShippingFee() {
    return this.shippingFee;
    }
    public void setShippingFee(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr shippingFee) {
    this.shippingFee = shippingFee;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpLoanInfoDTO getLoanInfo() {
    return this.loanInfo;
    }
    public void setLoanInfo(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpLoanInfoDTO loanInfo) {
    this.loanInfo = loanInfo;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getShippingSurchargeFee() {
    return this.shippingSurchargeFee;
    }
    public void setShippingSurchargeFee(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr shippingSurchargeFee) {
    this.shippingSurchargeFee = shippingSurchargeFee;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpRefundInfoDTO getRefundInfo() {
    return this.refundInfo;
    }
    public void setRefundInfo(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpRefundInfoDTO refundInfo) {
    this.refundInfo = refundInfo;
    }
        public String getFrozenStatus() {
    return this.frozenStatus;
    }
    public void setFrozenStatus(String frozenStatus) {
    this.frozenStatus = frozenStatus;
    }
        public String getFundStatus() {
    return this.fundStatus;
    }
    public void setFundStatus(String fundStatus) {
    this.fundStatus = fundStatus;
    }
        public String getLogisticsType() {
    return this.logisticsType;
    }
    public void setLogisticsType(String logisticsType) {
    this.logisticsType = logisticsType;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getProductPrice() {
    return this.productPrice;
    }
    public void setProductPrice(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr productPrice) {
    this.productPrice = productPrice;
    }
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public String getBuyerMemo() {
    return this.buyerMemo;
    }
    public void setBuyerMemo(String buyerMemo) {
    this.buyerMemo = buyerMemo;
    }
    }