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

public class AliexpressTradeRedefiningFindorderlistsimplequerySimpleOrderProductVO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 是否假一赔三产品 */
                @ApiField("money_back3x")
            private Boolean moneyBack3x;
        /** 商品编码 */
                @ApiField("sku_code")
            private String skuCode;
        /** 商品货币名称 */
                @ApiField("product_unit_price_cur")
            private String productUnitPriceCur;
        /** 商品单价 */
                @ApiField("product_unit_price")
            private String productUnitPrice;
        /** 商品数量 */
                @ApiField("product_count")
            private Integer productCount;
        /** 商品主图URL */
                @ApiField("product_img_url")
            private String productImgUrl;
        /** 快照URL */
                @ApiField("product_snap_url")
            private String productSnapUrl;
        /** 商品名称 */
                @ApiField("product_name")
            private String productName;
        /** 商品ID */
                @ApiField("product_id")
            private Long productId;
        /** 子订单状态 */
                @ApiField("son_order_status")
            private String sonOrderStatus;
        /** 商品单位 */
                @ApiField("product_unit")
            private String productUnit;
        /** 备货时间 */
                @ApiField("goods_prepare_time")
            private Integer goodsPrepareTime;
        /** 子订单号 */
                @ApiField("child_id")
            private Long childId;
    
        public Boolean getMoneyBack3x() {
    return this.moneyBack3x;
    }
    public void setMoneyBack3x(Boolean moneyBack3x) {
    this.moneyBack3x = moneyBack3x;
    }
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public String getProductUnitPriceCur() {
    return this.productUnitPriceCur;
    }
    public void setProductUnitPriceCur(String productUnitPriceCur) {
    this.productUnitPriceCur = productUnitPriceCur;
    }
        public String getProductUnitPrice() {
    return this.productUnitPrice;
    }
    public void setProductUnitPrice(String productUnitPrice) {
    this.productUnitPrice = productUnitPrice;
    }
        public Integer getProductCount() {
    return this.productCount;
    }
    public void setProductCount(Integer productCount) {
    this.productCount = productCount;
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
        public String getProductName() {
    return this.productName;
    }
    public void setProductName(String productName) {
    this.productName = productName;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getSonOrderStatus() {
    return this.sonOrderStatus;
    }
    public void setSonOrderStatus(String sonOrderStatus) {
    this.sonOrderStatus = sonOrderStatus;
    }
        public String getProductUnit() {
    return this.productUnit;
    }
    public void setProductUnit(String productUnit) {
    this.productUnit = productUnit;
    }
        public Integer getGoodsPrepareTime() {
    return this.goodsPrepareTime;
    }
    public void setGoodsPrepareTime(Integer goodsPrepareTime) {
    this.goodsPrepareTime = goodsPrepareTime;
    }
        public Long getChildId() {
    return this.childId;
    }
    public void setChildId(Long childId) {
    this.childId = childId;
    }
    }