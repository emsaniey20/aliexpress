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

public class AriseOrderListQueryOrderLineSimplifiedOpenDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 包裹id，响应cancel时需要按照包裹维度响应，同一个包裹的子订单必须一次性响应，不同包裹的子订单不能同时响应 */
                @ApiField("package_id")
            private String packageId;
        /** 商品属性 */
                @ApiListField("product_attrs")
            private List<String> productAttrs;
        /** 商品数量 */
                @ApiField("quantity")
            private Integer quantity;
        /** 商品id */
                @ApiField("product_id")
            private Long productId;
        /** 商品总费用 */
                @ApiField("product_total_amount")
            private AriseOrderListQueryOpenMoney productTotalAmount;
        /** 订单状态，包括waitPaid(待支付)、waitShipping(待发货)、waitDelivered(待收货)、waitSellerConfirmCancel(待卖家响应买家)、rejectBuyerCancel(取消请求已拒绝)、orderCancelled(订单取消)、delivered(已收货，订单完成)、closed(订单关闭) */
                @ApiField("order_status")
            private String orderStatus;
        /** 商品图片链接 */
                @ApiField("product_picture_url")
            private String productPictureUrl;
        /** 订单金额，卖家视角 */
                @ApiField("seller_order_amount")
            private AriseOrderListQueryOpenMoney sellerOrderAmount;
        /** 订单标 */
                @ApiListField("tags")
            private List<String> tags;
        /** 商品标题 */
                @ApiField("product_title")
            private String productTitle;
        /** 商品单价 */
                @ApiField("product_unit_amount")
            private AriseOrderListQueryOpenMoney productUnitAmount;
        /** 子订单id */
                @ApiField("trade_orderline_id")
            private Long tradeOrderlineId;
        /** 商品链接 */
                @ApiField("product_url")
            private String productUrl;
        /** sku id */
                @ApiField("sku_id")
            private Long skuId;
        /** 买家发起取消后，卖家响应处理的超时时间，当order_status为waitSellerConfirmCancel，本字段有效 */
                @ApiField("cancel_confirm_timeout")
            private Long cancelConfirmTimeout;
    
        public String getPackageId() {
    return this.packageId;
    }
    public void setPackageId(String packageId) {
    this.packageId = packageId;
    }
        public List<String> getProductAttrs() {
    return this.productAttrs;
    }
    public void setProductAttrs(List<String> productAttrs) {
    this.productAttrs = productAttrs;
    }
        public Integer getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Integer quantity) {
    this.quantity = quantity;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public AriseOrderListQueryOpenMoney getProductTotalAmount() {
    return this.productTotalAmount;
    }
    public void setProductTotalAmount(AriseOrderListQueryOpenMoney productTotalAmount) {
    this.productTotalAmount = productTotalAmount;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public String getProductPictureUrl() {
    return this.productPictureUrl;
    }
    public void setProductPictureUrl(String productPictureUrl) {
    this.productPictureUrl = productPictureUrl;
    }
        public AriseOrderListQueryOpenMoney getSellerOrderAmount() {
    return this.sellerOrderAmount;
    }
    public void setSellerOrderAmount(AriseOrderListQueryOpenMoney sellerOrderAmount) {
    this.sellerOrderAmount = sellerOrderAmount;
    }
        public List<String> getTags() {
    return this.tags;
    }
    public void setTags(List<String> tags) {
    this.tags = tags;
    }
        public String getProductTitle() {
    return this.productTitle;
    }
    public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
    }
        public AriseOrderListQueryOpenMoney getProductUnitAmount() {
    return this.productUnitAmount;
    }
    public void setProductUnitAmount(AriseOrderListQueryOpenMoney productUnitAmount) {
    this.productUnitAmount = productUnitAmount;
    }
        public Long getTradeOrderlineId() {
    return this.tradeOrderlineId;
    }
    public void setTradeOrderlineId(Long tradeOrderlineId) {
    this.tradeOrderlineId = tradeOrderlineId;
    }
        public String getProductUrl() {
    return this.productUrl;
    }
    public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
    }
        public Long getSkuId() {
    return this.skuId;
    }
    public void setSkuId(Long skuId) {
    this.skuId = skuId;
    }
        public Long getCancelConfirmTimeout() {
    return this.cancelConfirmTimeout;
    }
    public void setCancelConfirmTimeout(Long cancelConfirmTimeout) {
    this.cancelConfirmTimeout = cancelConfirmTimeout;
    }
    }