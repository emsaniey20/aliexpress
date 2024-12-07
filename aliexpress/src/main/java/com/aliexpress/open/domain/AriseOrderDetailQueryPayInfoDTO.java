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

public class AriseOrderDetailQueryPayInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 支付时间， 时间戳 */
                @ApiField("pay_time")
            private Long payTime;
        /** 支付途径 */
                @ApiField("pay_channel")
            private String payChannel;
        /** 商品原价 */
                @ApiField("sale_original_amount")
            private String saleOriginalAmount;
        /** 商品总折扣 */
                @ApiField("product_discount_amount")
            private String productDiscountAmount;
        /** 商品卖家折扣 */
                @ApiField("product_seller_discount_amount")
            private String productSellerDiscountAmount;
        /** 商品平台折扣 */
                @ApiField("product_platform_discount_amount")
            private String productPlatformDiscountAmount;
        /** 运费总价 */
                @ApiField("shipping_amount")
            private String shippingAmount;
        /** 运费总折扣 */
                @ApiField("shipping_discount_amount")
            private String shippingDiscountAmount;
        /** 运费卖家折扣 */
                @ApiField("shipping_seller_discount_amount")
            private String shippingSellerDiscountAmount;
        /** 运费平台折扣 */
                @ApiField("shipping_platform_discount_amount")
            private String shippingPlatformDiscountAmount;
        /** 买家支付金额 */
                @ApiField("total_amount")
            private String totalAmount;
    
        public Long getPayTime() {
    return this.payTime;
    }
    public void setPayTime(Long payTime) {
    this.payTime = payTime;
    }
        public String getPayChannel() {
    return this.payChannel;
    }
    public void setPayChannel(String payChannel) {
    this.payChannel = payChannel;
    }
        public String getSaleOriginalAmount() {
    return this.saleOriginalAmount;
    }
    public void setSaleOriginalAmount(String saleOriginalAmount) {
    this.saleOriginalAmount = saleOriginalAmount;
    }
        public String getProductDiscountAmount() {
    return this.productDiscountAmount;
    }
    public void setProductDiscountAmount(String productDiscountAmount) {
    this.productDiscountAmount = productDiscountAmount;
    }
        public String getProductSellerDiscountAmount() {
    return this.productSellerDiscountAmount;
    }
    public void setProductSellerDiscountAmount(String productSellerDiscountAmount) {
    this.productSellerDiscountAmount = productSellerDiscountAmount;
    }
        public String getProductPlatformDiscountAmount() {
    return this.productPlatformDiscountAmount;
    }
    public void setProductPlatformDiscountAmount(String productPlatformDiscountAmount) {
    this.productPlatformDiscountAmount = productPlatformDiscountAmount;
    }
        public String getShippingAmount() {
    return this.shippingAmount;
    }
    public void setShippingAmount(String shippingAmount) {
    this.shippingAmount = shippingAmount;
    }
        public String getShippingDiscountAmount() {
    return this.shippingDiscountAmount;
    }
    public void setShippingDiscountAmount(String shippingDiscountAmount) {
    this.shippingDiscountAmount = shippingDiscountAmount;
    }
        public String getShippingSellerDiscountAmount() {
    return this.shippingSellerDiscountAmount;
    }
    public void setShippingSellerDiscountAmount(String shippingSellerDiscountAmount) {
    this.shippingSellerDiscountAmount = shippingSellerDiscountAmount;
    }
        public String getShippingPlatformDiscountAmount() {
    return this.shippingPlatformDiscountAmount;
    }
    public void setShippingPlatformDiscountAmount(String shippingPlatformDiscountAmount) {
    this.shippingPlatformDiscountAmount = shippingPlatformDiscountAmount;
    }
        public String getTotalAmount() {
    return this.totalAmount;
    }
    public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    }
    }