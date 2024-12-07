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

public class AliexpressTradeRedefiningFindordertradeinfoChildOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 子订单ID */
                @ApiField("id")
            private Long id;
        /** 商品排序号 */
                @ApiField("order_sort_id")
            private Integer orderSortId;
        /** 子订单初始金额的货币单位 */
                @ApiField("init_order_amt_cur")
            private String initOrderAmtCur;
        /** 子订单初始金额 */
                @ApiField("init_order_amt")
            private String initOrderAmt;
        /** 商品属性 */
                @ApiField("product_attributes")
            private String productAttributes;
        /** 商品的SKU编码 */
                @ApiField("sku_code")
            private String skuCode;
        /** lot数量 */
                @ApiField("lot_num")
            private String lotNum;
        /** 商品规格 */
                @ApiField("product_standard")
            private String productStandard;
        /** 商品计量单位 */
                @ApiField("product_unit")
            private String productUnit;
        /** 商品数量 */
                @ApiField("product_count")
            private Integer productCount;
        /** 商品价格的货币单位 */
                @ApiField("product_price_cur")
            private String productPriceCur;
        /** 商品价格 */
                @ApiField("product_price")
            private String productPrice;
        /** 商品名称 */
                @ApiField("product_name")
            private String productName;
        /** 商品ID */
                @ApiField("product_id")
            private Long productId;
        /** 冻结状态(NO_FROZEN:无冻结；IN_FROZEN:冻结中) */
                @ApiField("frozen_status")
            private String frozenStatus;
        /** 纠纷状态(NO_ISSUE:无纠纷；IN_ISSUE:纠纷中；END_ISSUE:纠纷结束) */
                @ApiField("issue_status")
            private String issueStatus;
        /** 资金状态(NOT_PAY:未付款; PAY_SUCCESS:付款成功;  WAIT_SELLER_CHECK:卖家验款) */
                @ApiField("fund_status")
            private String fundStatus;
        /** 子订单状态 */
                @ApiField("order_status")
            private String orderStatus;
    
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public Integer getOrderSortId() {
    return this.orderSortId;
    }
    public void setOrderSortId(Integer orderSortId) {
    this.orderSortId = orderSortId;
    }
        public String getInitOrderAmtCur() {
    return this.initOrderAmtCur;
    }
    public void setInitOrderAmtCur(String initOrderAmtCur) {
    this.initOrderAmtCur = initOrderAmtCur;
    }
        public String getInitOrderAmt() {
    return this.initOrderAmt;
    }
    public void setInitOrderAmt(String initOrderAmt) {
    this.initOrderAmt = initOrderAmt;
    }
        public String getProductAttributes() {
    return this.productAttributes;
    }
    public void setProductAttributes(String productAttributes) {
    this.productAttributes = productAttributes;
    }
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public String getLotNum() {
    return this.lotNum;
    }
    public void setLotNum(String lotNum) {
    this.lotNum = lotNum;
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
        public Integer getProductCount() {
    return this.productCount;
    }
    public void setProductCount(Integer productCount) {
    this.productCount = productCount;
    }
        public String getProductPriceCur() {
    return this.productPriceCur;
    }
    public void setProductPriceCur(String productPriceCur) {
    this.productPriceCur = productPriceCur;
    }
        public String getProductPrice() {
    return this.productPrice;
    }
    public void setProductPrice(String productPrice) {
    this.productPrice = productPrice;
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
        public String getFundStatus() {
    return this.fundStatus;
    }
    public void setFundStatus(String fundStatus) {
    this.fundStatus = fundStatus;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
    }