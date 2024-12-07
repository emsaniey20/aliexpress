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

public class AliexpressTradeNewRedefiningFindorderbyidAeopTpChildOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 物流类型，买家选择的物流方式 */
                @ApiField("logistics_type")
            private String logisticsType;
        /** 每个piece或lot对应多少个产品 */
                @ApiField("lot_num")
            private Integer lotNum;
        /** 子订单序号，用于子订单发货，即sub_trade_order_index */
                @ApiField("order_sort_id")
            private Integer orderSortId;
        /** 订单状态：PLACE_ORDER_SUCCESS:等待买家付款;  IN_CANCEL:买家申请取消;  WAIT_SELLER_SEND_GOODS:等待您发货;  SELLER_PART_SEND_GOODS:部分发货;  WAIT_BUYER_ACCEPT_GOODS:等待买家收货;  FUND_PROCESSING:买卖家达成一致，资金处理中；  IN_ISSUE:含纠纷中的订单;  IN_FROZEN:冻结中的订单;  WAIT_SELLER_EXAMINE_MONEY:等待您确认金额;  RISK_CONTROL:订单处于风控24小时中，从买家在线支付完成后开始，持续24小时。 */
                @ApiField("order_status")
            private String orderStatus;
        /** 商品扩展属性，skuid等 */
                @ApiField("product_attributes")
            private String productAttributes;
        /** 商品数量 */
                @ApiField("product_count")
            private Integer productCount;
        /** 商品ID */
                @ApiField("product_id")
            private Long productId;
        /** 商品名称 */
                @ApiField("product_name")
            private String productName;
        /** 商品单价 */
                @ApiField("product_price")
            private AliexpressTradeNewRedefiningFindorderbyidMoneyStr productPrice;
        /** 商品规格，已废弃 */
                @ApiField("product_standard")
            private String productStandard;
        /** 产品单位 */
                @ApiField("product_unit")
            private String productUnit;
        /** 子订单退款信息 */
                @ApiField("refund_info")
            private AliexpressTradeNewRedefiningFindorderbyidAeopTpRefundInfoDTO refundInfo;
        /** 发货类型"SELLER_SEND_GOODS": 卖家发货; "WAREHOUSE_SEND_GOODS":仓库发货 */
                @ApiField("send_goods_operator")
            private String sendGoodsOperator;
        /** SKU信息 */
                @ApiField("sku_code")
            private String skuCode;
        /** 快照ID */
                @ApiField("snapshot_id")
            private String snapshotId;
        /** 产品快照的图片路径 */
                @ApiField("snapshot_small_photo_path")
            private String snapshotSmallPhotoPath;
        /** 商品主图Url */
                @ApiField("product_img_url")
            private String productImgUrl;
        /** 快照Url */
                @ApiField("product_snap_url")
            private String productSnapUrl;
        /** 备货时间 */
                @ApiField("goods_prepare_time")
            private Integer goodsPrepareTime;
        /** 物流服务 */
                @ApiField("logistics_service_name")
            private String logisticsServiceName;
        /** 买家备注(子订单级别) */
                @ApiField("buyer_memo")
            private String buyerMemo;
        /** cainiaoInternationalWarehouse表示是菜鸟认证海外仓发货的，这类订单（子订单）将由菜鸟系统下发海外仓系统，进行订单履行，商家ERP需进行过滤此类型的订单（子订单）。其他情况为空 */
                @ApiField("logistics_warehouse_type")
            private String logisticsWarehouseType;
        /** 子订单中的各种标 */
                @ApiListField("tags")
            private List<String> tags;
        /** U_TAXED海外仓已税，跨境已税是I_TAXED */
                @ApiField("already_taxed")
            private String alreadyTaxed;
        /** [{"zh_CN":"存储子订单的拓展参数，是一个map 序列化成Json的，orderBusinessModel:SEMI_CHOICE_SELF"是半托管}] */
                @ApiField("extend_map")
            private String extendMap;
        /** 联盟佣金比例 */
                @ApiField("afflicate_fee_rate")
            private String afflicateFeeRate;
        /** 纠纷信息 */
                @ApiField("child_issue_info")
            private AliexpressTradeNewRedefiningFindorderbyidAeopTpIssueInfoDTO childIssueInfo;
        /** 子订单ID */
                @ApiField("child_order_id")
            private String childOrderId;
        /** 交易佣金比例 */
                @ApiField("escrow_fee_rate")
            private String escrowFeeRate;
        /** 冻结状态（NO_FROZEN:未冻结；IN_FROZEN:冻结中） */
                @ApiField("frozen_status")
            private String frozenStatus;
        /** 资金状态(NOT_PAY：待支付；PAY_SUCCESS:支付成功) */
                @ApiField("fund_status")
            private String fundStatus;
        /** 订单ID */
                @ApiField("id")
            private Long id;
        /** 订单原始总金额 */
                @ApiField("init_order_amt")
            private AliexpressTradeNewRedefiningFindorderbyidMoneyStr initOrderAmt;
        /** 纠纷状态 */
                @ApiField("issue_status")
            private String issueStatus;
        /** 子订单放款信息 */
                @ApiField("loan_info")
            private AliexpressTradeNewRedefiningFindorderbyidAeopTpLoanInfoDTO loanInfo;
        /** 放款金额 */
                @ApiField("logistics_amount")
            private AliexpressTradeNewRedefiningFindorderbyidMoneyStr logisticsAmount;
    
        public String getLogisticsType() {
    return this.logisticsType;
    }
    public void setLogisticsType(String logisticsType) {
    this.logisticsType = logisticsType;
    }
        public Integer getLotNum() {
    return this.lotNum;
    }
    public void setLotNum(Integer lotNum) {
    this.lotNum = lotNum;
    }
        public Integer getOrderSortId() {
    return this.orderSortId;
    }
    public void setOrderSortId(Integer orderSortId) {
    this.orderSortId = orderSortId;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public String getProductAttributes() {
    return this.productAttributes;
    }
    public void setProductAttributes(String productAttributes) {
    this.productAttributes = productAttributes;
    }
        public Integer getProductCount() {
    return this.productCount;
    }
    public void setProductCount(Integer productCount) {
    this.productCount = productCount;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getProductName() {
    return this.productName;
    }
    public void setProductName(String productName) {
    this.productName = productName;
    }
        public AliexpressTradeNewRedefiningFindorderbyidMoneyStr getProductPrice() {
    return this.productPrice;
    }
    public void setProductPrice(AliexpressTradeNewRedefiningFindorderbyidMoneyStr productPrice) {
    this.productPrice = productPrice;
    }
        public String getProductStandard() {
    return this.productStandard;
    }
    public void setProductStandard(String productStandard) {
    this.productStandard = productStandard;
    }
        public String getProductUnit() {
    return this.productUnit;
    }
    public void setProductUnit(String productUnit) {
    this.productUnit = productUnit;
    }
        public AliexpressTradeNewRedefiningFindorderbyidAeopTpRefundInfoDTO getRefundInfo() {
    return this.refundInfo;
    }
    public void setRefundInfo(AliexpressTradeNewRedefiningFindorderbyidAeopTpRefundInfoDTO refundInfo) {
    this.refundInfo = refundInfo;
    }
        public String getSendGoodsOperator() {
    return this.sendGoodsOperator;
    }
    public void setSendGoodsOperator(String sendGoodsOperator) {
    this.sendGoodsOperator = sendGoodsOperator;
    }
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public String getSnapshotId() {
    return this.snapshotId;
    }
    public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    }
        public String getSnapshotSmallPhotoPath() {
    return this.snapshotSmallPhotoPath;
    }
    public void setSnapshotSmallPhotoPath(String snapshotSmallPhotoPath) {
    this.snapshotSmallPhotoPath = snapshotSmallPhotoPath;
    }
        public String getProductImgUrl() {
    return this.productImgUrl;
    }
    public void setProductImgUrl(String productImgUrl) {
    this.productImgUrl = productImgUrl;
    }
        public String getProductSnapUrl() {
    return this.productSnapUrl;
    }
    public void setProductSnapUrl(String productSnapUrl) {
    this.productSnapUrl = productSnapUrl;
    }
        public Integer getGoodsPrepareTime() {
    return this.goodsPrepareTime;
    }
    public void setGoodsPrepareTime(Integer goodsPrepareTime) {
    this.goodsPrepareTime = goodsPrepareTime;
    }
        public String getLogisticsServiceName() {
    return this.logisticsServiceName;
    }
    public void setLogisticsServiceName(String logisticsServiceName) {
    this.logisticsServiceName = logisticsServiceName;
    }
        public String getBuyerMemo() {
    return this.buyerMemo;
    }
    public void setBuyerMemo(String buyerMemo) {
    this.buyerMemo = buyerMemo;
    }
        public String getLogisticsWarehouseType() {
    return this.logisticsWarehouseType;
    }
    public void setLogisticsWarehouseType(String logisticsWarehouseType) {
    this.logisticsWarehouseType = logisticsWarehouseType;
    }
        public List<String> getTags() {
    return this.tags;
    }
    public void setTags(List<String> tags) {
    this.tags = tags;
    }
        public String getAlreadyTaxed() {
    return this.alreadyTaxed;
    }
    public void setAlreadyTaxed(String alreadyTaxed) {
    this.alreadyTaxed = alreadyTaxed;
    }
        public String getExtendMap() {
    return this.extendMap;
    }
    public void setExtendMap(String extendMap) {
    this.extendMap = extendMap;
    }
        public String getAfflicateFeeRate() {
    return this.afflicateFeeRate;
    }
    public void setAfflicateFeeRate(String afflicateFeeRate) {
    this.afflicateFeeRate = afflicateFeeRate;
    }
        public AliexpressTradeNewRedefiningFindorderbyidAeopTpIssueInfoDTO getChildIssueInfo() {
    return this.childIssueInfo;
    }
    public void setChildIssueInfo(AliexpressTradeNewRedefiningFindorderbyidAeopTpIssueInfoDTO childIssueInfo) {
    this.childIssueInfo = childIssueInfo;
    }
        public String getChildOrderId() {
    return this.childOrderId;
    }
    public void setChildOrderId(String childOrderId) {
    this.childOrderId = childOrderId;
    }
        public String getEscrowFeeRate() {
    return this.escrowFeeRate;
    }
    public void setEscrowFeeRate(String escrowFeeRate) {
    this.escrowFeeRate = escrowFeeRate;
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
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public AliexpressTradeNewRedefiningFindorderbyidMoneyStr getInitOrderAmt() {
    return this.initOrderAmt;
    }
    public void setInitOrderAmt(AliexpressTradeNewRedefiningFindorderbyidMoneyStr initOrderAmt) {
    this.initOrderAmt = initOrderAmt;
    }
        public String getIssueStatus() {
    return this.issueStatus;
    }
    public void setIssueStatus(String issueStatus) {
    this.issueStatus = issueStatus;
    }
        public AliexpressTradeNewRedefiningFindorderbyidAeopTpLoanInfoDTO getLoanInfo() {
    return this.loanInfo;
    }
    public void setLoanInfo(AliexpressTradeNewRedefiningFindorderbyidAeopTpLoanInfoDTO loanInfo) {
    this.loanInfo = loanInfo;
    }
        public AliexpressTradeNewRedefiningFindorderbyidMoneyStr getLogisticsAmount() {
    return this.logisticsAmount;
    }
    public void setLogisticsAmount(AliexpressTradeNewRedefiningFindorderbyidMoneyStr logisticsAmount) {
    this.logisticsAmount = logisticsAmount;
    }
    }