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

public class AriseReverseOrderQueryOpenApiReverseOrderLineDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 退款类型 */
                @ApiField("refund_payment_method")
            private String refundPaymentMethod;
        /** 逆向履约状态 */
                @ApiField("ofc_status")
            private String ofcStatus;
        /** 单价 */
                @ApiField("item_unit_price")
            private Integer itemUnitPrice;
        /** 平台SKU ID */
                @ApiField("platform_sku_id")
            private String platformSkuId;
        /** 是否平台介入 */
                @ApiField("dispute")
            private Boolean dispute;
        /** 退货退款原因 */
                @ApiField("reason_text")
            private String reasonText;
        /** 逆向单创建时间 */
                @ApiField("return_order_line_gmt_create")
            private Integer returnOrderLineGmtCreate;
        /**  EAN号 */
                @ApiField("ean_number")
            private String eanNumber;
        /** 正向单创建时间 */
                @ApiField("trade_order_gmt_create")
            private Integer tradeOrderGmtCreate;
        /** {} */
                @ApiField("product_dto")
            private AriseReverseOrderQueryLOPProductDTO productDto;
        /** 商家skuid */
                @ApiField("seller_sku_id")
            private String sellerSkuId;
        /** 逆向状态 */
                @ApiField("reverse_status")
            private String reverseStatus;
        /** {} */
                @ApiField("buyer")
            private AriseReverseOrderQueryLOPUserDTO buyer;
        /** 仓库质检结果（仅针对退回Arise质检仓质检的场景） */
                @ApiField("whqc_decision")
            private String whqcDecision;
        /** 是否退款 */
                @ApiField("need_refund")
            private Boolean needRefund;
        /** 逆向子单id */
                @ApiField("reverse_order_line_id")
            private Long reverseOrderLineId;
        /** 逆向物流状态，如 "reverse fulfillment order created" "3pl received" "goods lost" "delivery failed" "delivered" "inbound_warehouse" "reverse_notify_fulfillment_to_close" */
                @ApiField("goods_status")
            private String goodsStatus;
        /** 逆向单编辑时间 */
                @ApiField("return_order_line_gmt_modified")
            private Integer returnOrderLineGmtModified;
        /** 逆向原因码 */
                @ApiField("reason_code")
            private Integer reasonCode;
        /** 正向子单id */
                @ApiField("trade_order_line_id")
            private Long tradeOrderLineId;
        /** 退款金额 */
                @ApiField("refund_amount")
            private Integer refundAmount;
    
        public String getRefundPaymentMethod() {
    return this.refundPaymentMethod;
    }
    public void setRefundPaymentMethod(String refundPaymentMethod) {
    this.refundPaymentMethod = refundPaymentMethod;
    }
        public String getOfcStatus() {
    return this.ofcStatus;
    }
    public void setOfcStatus(String ofcStatus) {
    this.ofcStatus = ofcStatus;
    }
        public Integer getItemUnitPrice() {
    return this.itemUnitPrice;
    }
    public void setItemUnitPrice(Integer itemUnitPrice) {
    this.itemUnitPrice = itemUnitPrice;
    }
        public String getPlatformSkuId() {
    return this.platformSkuId;
    }
    public void setPlatformSkuId(String platformSkuId) {
    this.platformSkuId = platformSkuId;
    }
        public Boolean getDispute() {
    return this.dispute;
    }
    public void setDispute(Boolean dispute) {
    this.dispute = dispute;
    }
        public String getReasonText() {
    return this.reasonText;
    }
    public void setReasonText(String reasonText) {
    this.reasonText = reasonText;
    }
        public Integer getReturnOrderLineGmtCreate() {
    return this.returnOrderLineGmtCreate;
    }
    public void setReturnOrderLineGmtCreate(Integer returnOrderLineGmtCreate) {
    this.returnOrderLineGmtCreate = returnOrderLineGmtCreate;
    }
        public String getEanNumber() {
    return this.eanNumber;
    }
    public void setEanNumber(String eanNumber) {
    this.eanNumber = eanNumber;
    }
        public Integer getTradeOrderGmtCreate() {
    return this.tradeOrderGmtCreate;
    }
    public void setTradeOrderGmtCreate(Integer tradeOrderGmtCreate) {
    this.tradeOrderGmtCreate = tradeOrderGmtCreate;
    }
        public AriseReverseOrderQueryLOPProductDTO getProductDto() {
    return this.productDto;
    }
    public void setProductDto(AriseReverseOrderQueryLOPProductDTO productDto) {
    this.productDto = productDto;
    }
        public String getSellerSkuId() {
    return this.sellerSkuId;
    }
    public void setSellerSkuId(String sellerSkuId) {
    this.sellerSkuId = sellerSkuId;
    }
        public String getReverseStatus() {
    return this.reverseStatus;
    }
    public void setReverseStatus(String reverseStatus) {
    this.reverseStatus = reverseStatus;
    }
        public AriseReverseOrderQueryLOPUserDTO getBuyer() {
    return this.buyer;
    }
    public void setBuyer(AriseReverseOrderQueryLOPUserDTO buyer) {
    this.buyer = buyer;
    }
        public String getWhqcDecision() {
    return this.whqcDecision;
    }
    public void setWhqcDecision(String whqcDecision) {
    this.whqcDecision = whqcDecision;
    }
        public Boolean getNeedRefund() {
    return this.needRefund;
    }
    public void setNeedRefund(Boolean needRefund) {
    this.needRefund = needRefund;
    }
        public Long getReverseOrderLineId() {
    return this.reverseOrderLineId;
    }
    public void setReverseOrderLineId(Long reverseOrderLineId) {
    this.reverseOrderLineId = reverseOrderLineId;
    }
        public String getGoodsStatus() {
    return this.goodsStatus;
    }
    public void setGoodsStatus(String goodsStatus) {
    this.goodsStatus = goodsStatus;
    }
        public Integer getReturnOrderLineGmtModified() {
    return this.returnOrderLineGmtModified;
    }
    public void setReturnOrderLineGmtModified(Integer returnOrderLineGmtModified) {
    this.returnOrderLineGmtModified = returnOrderLineGmtModified;
    }
        public Integer getReasonCode() {
    return this.reasonCode;
    }
    public void setReasonCode(Integer reasonCode) {
    this.reasonCode = reasonCode;
    }
        public Long getTradeOrderLineId() {
    return this.tradeOrderLineId;
    }
    public void setTradeOrderLineId(Long tradeOrderLineId) {
    this.tradeOrderLineId = tradeOrderLineId;
    }
        public Integer getRefundAmount() {
    return this.refundAmount;
    }
    public void setRefundAmount(Integer refundAmount) {
    this.refundAmount = refundAmount;
    }
    }