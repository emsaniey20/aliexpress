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

public class AliexpressAftersaleInsuranceOrderinfoGetAeOrderForPolicyDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 请求退款的时间 */
                @ApiField("apply_refund_time")
            private String applyRefundTime;
        /** 订单id */
                @ApiField("biz_order_id")
            private Long bizOrderId;
        /** 买家订单收货国家 */
                @ApiField("buyer_country")
            private String buyerCountry;
        /** 买家id */
                @ApiField("buyer_id")
            private Long buyerId;
        /** 买家等级 */
                @ApiField("buyer_level")
            private String buyerLevel;
        /** 买家名称 */
                @ApiField("buyer_name")
            private String buyerName;
        /** 产品id */
                @ApiField("item_id")
            private Long itemId;
        /** 子类目id */
                @ApiField("leaf_category_id")
            private Integer leafCategoryId;
        /** 子类目名称中文 */
                @ApiField("leaf_category_name_cn")
            private String leafCategoryNameCn;
        /** 子类目名称英文 */
                @ApiField("leaf_category_name_en")
            private String leafCategoryNameEn;
        /** 主订单号 */
                @ApiField("main_order_id")
            private Long mainOrderId;
        /** 订单金额 */
                @ApiField("order_amount")
            private Long orderAmount;
        /** 币种 */
                @ApiField("order_amount_currency")
            private String orderAmountCurrency;
        /** 订单创建时间 */
                @ApiField("order_create_time")
            private String orderCreateTime;
        /** 支付时间 */
                @ApiField("order_pay_time")
            private String orderPayTime;
        /** 属性 */
                @ApiField("product_attributes")
            private String productAttributes;
        /** 数量 */
                @ApiField("product_count")
            private Integer productCount;
        /** 产品图片（多个用逗号隔开） */
                @ApiField("product_images")
            private String productImages;
        /** 产品名称中 */
                @ApiField("product_name_cn")
            private String productNameCn;
        /** 产品名称英 */
                @ApiField("product_name_en")
            private String productNameEn;
        /** 产品快照 */
                @ApiField("product_snap_url")
            private String productSnapUrl;
        /** 类目id */
                @ApiField("root_category_id")
            private Integer rootCategoryId;
        /** 根类目名称 */
                @ApiField("root_category_name_cn")
            private String rootCategoryNameCn;
        /** 根类目名称 */
                @ApiField("root_category_name_en")
            private String rootCategoryNameEn;
        /** 卖家id */
                @ApiField("seller_id")
            private Long sellerId;
        /** 卖家留言 */
                @ApiField("seller_memo")
            private String sellerMemo;
        /** 卖家名称 */
                @ApiField("seller_name")
            private String sellerName;
    
        public String getApplyRefundTime() {
    return this.applyRefundTime;
    }
    public void setApplyRefundTime(String applyRefundTime) {
    this.applyRefundTime = applyRefundTime;
    }
        public Long getBizOrderId() {
    return this.bizOrderId;
    }
    public void setBizOrderId(Long bizOrderId) {
    this.bizOrderId = bizOrderId;
    }
        public String getBuyerCountry() {
    return this.buyerCountry;
    }
    public void setBuyerCountry(String buyerCountry) {
    this.buyerCountry = buyerCountry;
    }
        public Long getBuyerId() {
    return this.buyerId;
    }
    public void setBuyerId(Long buyerId) {
    this.buyerId = buyerId;
    }
        public String getBuyerLevel() {
    return this.buyerLevel;
    }
    public void setBuyerLevel(String buyerLevel) {
    this.buyerLevel = buyerLevel;
    }
        public String getBuyerName() {
    return this.buyerName;
    }
    public void setBuyerName(String buyerName) {
    this.buyerName = buyerName;
    }
        public Long getItemId() {
    return this.itemId;
    }
    public void setItemId(Long itemId) {
    this.itemId = itemId;
    }
        public Integer getLeafCategoryId() {
    return this.leafCategoryId;
    }
    public void setLeafCategoryId(Integer leafCategoryId) {
    this.leafCategoryId = leafCategoryId;
    }
        public String getLeafCategoryNameCn() {
    return this.leafCategoryNameCn;
    }
    public void setLeafCategoryNameCn(String leafCategoryNameCn) {
    this.leafCategoryNameCn = leafCategoryNameCn;
    }
        public String getLeafCategoryNameEn() {
    return this.leafCategoryNameEn;
    }
    public void setLeafCategoryNameEn(String leafCategoryNameEn) {
    this.leafCategoryNameEn = leafCategoryNameEn;
    }
        public Long getMainOrderId() {
    return this.mainOrderId;
    }
    public void setMainOrderId(Long mainOrderId) {
    this.mainOrderId = mainOrderId;
    }
        public Long getOrderAmount() {
    return this.orderAmount;
    }
    public void setOrderAmount(Long orderAmount) {
    this.orderAmount = orderAmount;
    }
        public String getOrderAmountCurrency() {
    return this.orderAmountCurrency;
    }
    public void setOrderAmountCurrency(String orderAmountCurrency) {
    this.orderAmountCurrency = orderAmountCurrency;
    }
        public String getOrderCreateTime() {
    return this.orderCreateTime;
    }
    public void setOrderCreateTime(String orderCreateTime) {
    this.orderCreateTime = orderCreateTime;
    }
        public String getOrderPayTime() {
    return this.orderPayTime;
    }
    public void setOrderPayTime(String orderPayTime) {
    this.orderPayTime = orderPayTime;
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
        public String getProductImages() {
    return this.productImages;
    }
    public void setProductImages(String productImages) {
    this.productImages = productImages;
    }
        public String getProductNameCn() {
    return this.productNameCn;
    }
    public void setProductNameCn(String productNameCn) {
    this.productNameCn = productNameCn;
    }
        public String getProductNameEn() {
    return this.productNameEn;
    }
    public void setProductNameEn(String productNameEn) {
    this.productNameEn = productNameEn;
    }
        public String getProductSnapUrl() {
    return this.productSnapUrl;
    }
    public void setProductSnapUrl(String productSnapUrl) {
    this.productSnapUrl = productSnapUrl;
    }
        public Integer getRootCategoryId() {
    return this.rootCategoryId;
    }
    public void setRootCategoryId(Integer rootCategoryId) {
    this.rootCategoryId = rootCategoryId;
    }
        public String getRootCategoryNameCn() {
    return this.rootCategoryNameCn;
    }
    public void setRootCategoryNameCn(String rootCategoryNameCn) {
    this.rootCategoryNameCn = rootCategoryNameCn;
    }
        public String getRootCategoryNameEn() {
    return this.rootCategoryNameEn;
    }
    public void setRootCategoryNameEn(String rootCategoryNameEn) {
    this.rootCategoryNameEn = rootCategoryNameEn;
    }
        public Long getSellerId() {
    return this.sellerId;
    }
    public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
    }
        public String getSellerMemo() {
    return this.sellerMemo;
    }
    public void setSellerMemo(String sellerMemo) {
    this.sellerMemo = sellerMemo;
    }
        public String getSellerName() {
    return this.sellerName;
    }
    public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
    }
    }