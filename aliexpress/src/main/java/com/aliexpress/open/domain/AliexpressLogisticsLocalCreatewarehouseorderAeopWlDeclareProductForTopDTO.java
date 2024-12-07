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

public class AliexpressLogisticsLocalCreatewarehouseorderAeopWlDeclareProductForTopDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 判断是否属于非液体化妆品 */
                @ApiField("aneroid_markup")
            private Boolean aneroidMarkup;
        /** 是否易碎 */
                @ApiField("breakable")
            private Boolean breakable;
        /** 类目中文名称 */
                @ApiField("category_cn_desc")
            private String categoryCnDesc;
        /** 类目英文名称 */
                @ApiField("category_en_desc")
            private String categoryEnDesc;
        /** 是否包含电池 */
                @ApiField("contains_battery")
            private Boolean containsBattery;
        /** 海关编码 */
                @ApiField("hs_code")
            private String hsCode;
        /** 是否纯电池 */
                @ApiField("only_battery")
            private Boolean onlyBattery;
        /** 产品申报金额 */
                @ApiField("product_declare_amount")
            private String productDeclareAmount;
        /** 商品ID */
                @ApiField("product_id")
            private Long productId;
        /** 产品数量 */
                @ApiField("product_num")
            private Integer productNum;
        /** 产品重量 */
                @ApiField("product_weight")
            private String productWeight;
        /** scItem code */
                @ApiField("sc_item_code")
            private String scItemCode;
        /** scItem id */
                @ApiField("sc_item_id")
            private Long scItemId;
        /** scItem name */
                @ApiField("sc_item_name")
            private String scItemName;
        /** sku code */
                @ApiField("sku_code")
            private String skuCode;
        /** sku value */
                @ApiField("sku_value")
            private String skuValue;
        /** 是否特货 */
                @ApiField("contains_special_goods")
            private Boolean containsSpecialGoods;
        /** 交易子单号 */
                @ApiField("child_order_id")
            private Long childOrderId;
    
        public Boolean getAneroidMarkup() {
    return this.aneroidMarkup;
    }
    public void setAneroidMarkup(Boolean aneroidMarkup) {
    this.aneroidMarkup = aneroidMarkup;
    }
        public Boolean getBreakable() {
    return this.breakable;
    }
    public void setBreakable(Boolean breakable) {
    this.breakable = breakable;
    }
        public String getCategoryCnDesc() {
    return this.categoryCnDesc;
    }
    public void setCategoryCnDesc(String categoryCnDesc) {
    this.categoryCnDesc = categoryCnDesc;
    }
        public String getCategoryEnDesc() {
    return this.categoryEnDesc;
    }
    public void setCategoryEnDesc(String categoryEnDesc) {
    this.categoryEnDesc = categoryEnDesc;
    }
        public Boolean getContainsBattery() {
    return this.containsBattery;
    }
    public void setContainsBattery(Boolean containsBattery) {
    this.containsBattery = containsBattery;
    }
        public String getHsCode() {
    return this.hsCode;
    }
    public void setHsCode(String hsCode) {
    this.hsCode = hsCode;
    }
        public Boolean getOnlyBattery() {
    return this.onlyBattery;
    }
    public void setOnlyBattery(Boolean onlyBattery) {
    this.onlyBattery = onlyBattery;
    }
        public String getProductDeclareAmount() {
    return this.productDeclareAmount;
    }
    public void setProductDeclareAmount(String productDeclareAmount) {
    this.productDeclareAmount = productDeclareAmount;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public Integer getProductNum() {
    return this.productNum;
    }
    public void setProductNum(Integer productNum) {
    this.productNum = productNum;
    }
        public String getProductWeight() {
    return this.productWeight;
    }
    public void setProductWeight(String productWeight) {
    this.productWeight = productWeight;
    }
        public String getScItemCode() {
    return this.scItemCode;
    }
    public void setScItemCode(String scItemCode) {
    this.scItemCode = scItemCode;
    }
        public Long getScItemId() {
    return this.scItemId;
    }
    public void setScItemId(Long scItemId) {
    this.scItemId = scItemId;
    }
        public String getScItemName() {
    return this.scItemName;
    }
    public void setScItemName(String scItemName) {
    this.scItemName = scItemName;
    }
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public String getSkuValue() {
    return this.skuValue;
    }
    public void setSkuValue(String skuValue) {
    this.skuValue = skuValue;
    }
        public Boolean getContainsSpecialGoods() {
    return this.containsSpecialGoods;
    }
    public void setContainsSpecialGoods(Boolean containsSpecialGoods) {
    this.containsSpecialGoods = containsSpecialGoods;
    }
        public Long getChildOrderId() {
    return this.childOrderId;
    }
    public void setChildOrderId(Long childOrderId) {
    this.childOrderId = childOrderId;
    }
    }