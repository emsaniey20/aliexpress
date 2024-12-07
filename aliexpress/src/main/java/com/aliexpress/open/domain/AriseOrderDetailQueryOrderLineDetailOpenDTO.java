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

public class AriseOrderDetailQueryOrderLineDetailOpenDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品属性 */
                @ApiListField("product_attrs")
            private List<String> productAttrs;
        /** 数量 */
                @ApiField("quantity")
            private Integer quantity;
        /** 商品id */
                @ApiField("product_id")
            private Long productId;
        /** 商品总金额 */
                @ApiField("product_total_amount")
            private AriseOrderDetailQueryOpenMoney productTotalAmount;
        /** 运费总优惠，如果没有则不返回此字段 */
                @ApiField("shipping_discount_amount")
            private AriseOrderDetailQueryOpenMoney shippingDiscountAmount;
        /** 订单状态 */
                @ApiField("order_status")
            private String orderStatus;
        /** 商品图片地址 */
                @ApiField("product_picture_url")
            private String productPictureUrl;
        /** 订单金额（卖家视角） */
                @ApiField("seller_order_amount")
            private AriseOrderDetailQueryOpenMoney sellerOrderAmount;
        /** 订单标 */
                @ApiListField("tags")
            private List<String> tags;
        /** 商品标题 */
                @ApiField("product_title")
            private String productTitle;
        /** 商品单价 */
                @ApiField("product_unit_amount")
            private AriseOrderDetailQueryOpenMoney productUnitAmount;
        /** 支付金额 */
                @ApiField("pay_amount")
            private AriseOrderDetailQueryOpenMoney payAmount;
        /** 运费 */
                @ApiField("shipping_amount")
            private AriseOrderDetailQueryOpenMoney shippingAmount;
        /** 子订单号 */
                @ApiField("trade_orderline_id")
            private Long tradeOrderlineId;
        /** 商品链接 */
                @ApiField("product_url")
            private String productUrl;
        /** 优惠金额 */
                @ApiField("promotion_amount")
            private AriseOrderDetailQueryOpenMoney promotionAmount;
        /** skuId */
                @ApiField("sku_id")
            private Long skuId;
        /** 卖家自定义的skuCode */
                @ApiField("seller_sku_code")
            private String sellerSkuCode;
        /** 平台生成的skuCode */
                @ApiField("shop_sku_code")
            private String shopSkuCode;
        /** 子订单创建时间 */
                @ApiField("create_time")
            private Long createTime;
        /** 子订单修改时间 */
                @ApiField("modify_time")
            private Long modifyTime;
        /** 商品卖家折扣，如果没有此折扣则不返回此字段 */
                @ApiField("product_seller_discount_amount")
            private AriseOrderDetailQueryOpenMoney productSellerDiscountAmount;
        /** 商品平台折扣，如果没有此折扣则不返回此字段 */
                @ApiField("product_platform_discount_amount")
            private AriseOrderDetailQueryOpenMoney productPlatformDiscountAmount;
        /** 运费卖家折扣，如果没有此折扣则不返回此字段 */
                @ApiField("shipping_seller_discount_amount")
            private AriseOrderDetailQueryOpenMoney shippingSellerDiscountAmount;
        /** 运费平台折扣，如果没有此折扣则不返回此字段 */
                @ApiField("shipping_platform_discount_amount")
            private AriseOrderDetailQueryOpenMoney shippingPlatformDiscountAmount;
        /** 商品总优惠 */
                @ApiField("product_discount_amount")
            private AriseOrderDetailQueryOpenMoney productDiscountAmount;
        /** 买家发起取消后，卖家响应处理的超时时间，当order_status为waitSellerConfirmCancel，本字段有效 */
                @ApiField("cancel_confirm_timeout")
            private Long cancelConfirmTimeout;
        /** 包裹id，响应cancel时需要按照包裹维度响应，同一个包裹的子订单必须一次性响应，不同包裹的子订单不能同时响应 */
                @ApiField("package_id")
            private String packageId;
    
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
        public AriseOrderDetailQueryOpenMoney getProductTotalAmount() {
    return this.productTotalAmount;
    }
    public void setProductTotalAmount(AriseOrderDetailQueryOpenMoney productTotalAmount) {
    this.productTotalAmount = productTotalAmount;
    }
        public AriseOrderDetailQueryOpenMoney getShippingDiscountAmount() {
    return this.shippingDiscountAmount;
    }
    public void setShippingDiscountAmount(AriseOrderDetailQueryOpenMoney shippingDiscountAmount) {
    this.shippingDiscountAmount = shippingDiscountAmount;
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
        public AriseOrderDetailQueryOpenMoney getSellerOrderAmount() {
    return this.sellerOrderAmount;
    }
    public void setSellerOrderAmount(AriseOrderDetailQueryOpenMoney sellerOrderAmount) {
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
        public AriseOrderDetailQueryOpenMoney getProductUnitAmount() {
    return this.productUnitAmount;
    }
    public void setProductUnitAmount(AriseOrderDetailQueryOpenMoney productUnitAmount) {
    this.productUnitAmount = productUnitAmount;
    }
        public AriseOrderDetailQueryOpenMoney getPayAmount() {
    return this.payAmount;
    }
    public void setPayAmount(AriseOrderDetailQueryOpenMoney payAmount) {
    this.payAmount = payAmount;
    }
        public AriseOrderDetailQueryOpenMoney getShippingAmount() {
    return this.shippingAmount;
    }
    public void setShippingAmount(AriseOrderDetailQueryOpenMoney shippingAmount) {
    this.shippingAmount = shippingAmount;
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
        public AriseOrderDetailQueryOpenMoney getPromotionAmount() {
    return this.promotionAmount;
    }
    public void setPromotionAmount(AriseOrderDetailQueryOpenMoney promotionAmount) {
    this.promotionAmount = promotionAmount;
    }
        public Long getSkuId() {
    return this.skuId;
    }
    public void setSkuId(Long skuId) {
    this.skuId = skuId;
    }
        public String getSellerSkuCode() {
    return this.sellerSkuCode;
    }
    public void setSellerSkuCode(String sellerSkuCode) {
    this.sellerSkuCode = sellerSkuCode;
    }
        public String getShopSkuCode() {
    return this.shopSkuCode;
    }
    public void setShopSkuCode(String shopSkuCode) {
    this.shopSkuCode = shopSkuCode;
    }
        public Long getCreateTime() {
    return this.createTime;
    }
    public void setCreateTime(Long createTime) {
    this.createTime = createTime;
    }
        public Long getModifyTime() {
    return this.modifyTime;
    }
    public void setModifyTime(Long modifyTime) {
    this.modifyTime = modifyTime;
    }
        public AriseOrderDetailQueryOpenMoney getProductSellerDiscountAmount() {
    return this.productSellerDiscountAmount;
    }
    public void setProductSellerDiscountAmount(AriseOrderDetailQueryOpenMoney productSellerDiscountAmount) {
    this.productSellerDiscountAmount = productSellerDiscountAmount;
    }
        public AriseOrderDetailQueryOpenMoney getProductPlatformDiscountAmount() {
    return this.productPlatformDiscountAmount;
    }
    public void setProductPlatformDiscountAmount(AriseOrderDetailQueryOpenMoney productPlatformDiscountAmount) {
    this.productPlatformDiscountAmount = productPlatformDiscountAmount;
    }
        public AriseOrderDetailQueryOpenMoney getShippingSellerDiscountAmount() {
    return this.shippingSellerDiscountAmount;
    }
    public void setShippingSellerDiscountAmount(AriseOrderDetailQueryOpenMoney shippingSellerDiscountAmount) {
    this.shippingSellerDiscountAmount = shippingSellerDiscountAmount;
    }
        public AriseOrderDetailQueryOpenMoney getShippingPlatformDiscountAmount() {
    return this.shippingPlatformDiscountAmount;
    }
    public void setShippingPlatformDiscountAmount(AriseOrderDetailQueryOpenMoney shippingPlatformDiscountAmount) {
    this.shippingPlatformDiscountAmount = shippingPlatformDiscountAmount;
    }
        public AriseOrderDetailQueryOpenMoney getProductDiscountAmount() {
    return this.productDiscountAmount;
    }
    public void setProductDiscountAmount(AriseOrderDetailQueryOpenMoney productDiscountAmount) {
    this.productDiscountAmount = productDiscountAmount;
    }
        public Long getCancelConfirmTimeout() {
    return this.cancelConfirmTimeout;
    }
    public void setCancelConfirmTimeout(Long cancelConfirmTimeout) {
    this.cancelConfirmTimeout = cancelConfirmTimeout;
    }
        public String getPackageId() {
    return this.packageId;
    }
    public void setPackageId(String packageId) {
    this.packageId = packageId;
    }
    }