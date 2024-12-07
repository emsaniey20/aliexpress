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

public class CainiaoGlobalLogisticOrderCreateOpenItemParam implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品ID */
                @ApiField("item_id")
            private Long itemId;
        /** 商品数量 */
                @ApiField("quantity")
            private Integer quantity;
        /** 商品英文名称 */
                @ApiField("english_name")
            private String englishName;
        /** 商品本地名称 */
                @ApiField("local_name")
            private String localName;
        /** 商品单价，单位结算币种最小单位，如人民币分 */
                @ApiField("unit_price")
            private Long unitPrice;
        /** sku */
                @ApiField("sku")
            private String sku;
        /** 后台商品ID */
                @ApiField("sc_item_id")
            private Long scItemId;
        /** 商品重量，单位g */
                @ApiField("weight")
            private Long weight;
        /** 商品属性，cf_normal：普货、cf_has_battery：含电。 */
                @ApiListField("item_features")
            private List<String> itemFeatures;
        /** 商品价格币种 */
                @ApiField("currency")
            private String currency;
        /** 商品总价 */
                @ApiField("total_price")
            private Long totalPrice;
        /** 商品长度 */
                @ApiField("length")
            private Long length;
        /** 商品宽度 */
                @ApiField("width")
            private Long width;
        /** 商品高度 */
                @ApiField("height")
            private Long height;
    
        public Long getItemId() {
    return this.itemId;
    }
    public void setItemId(Long itemId) {
    this.itemId = itemId;
    }
        public Integer getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Integer quantity) {
    this.quantity = quantity;
    }
        public String getEnglishName() {
    return this.englishName;
    }
    public void setEnglishName(String englishName) {
    this.englishName = englishName;
    }
        public String getLocalName() {
    return this.localName;
    }
    public void setLocalName(String localName) {
    this.localName = localName;
    }
        public Long getUnitPrice() {
    return this.unitPrice;
    }
    public void setUnitPrice(Long unitPrice) {
    this.unitPrice = unitPrice;
    }
        public String getSku() {
    return this.sku;
    }
    public void setSku(String sku) {
    this.sku = sku;
    }
        public Long getScItemId() {
    return this.scItemId;
    }
    public void setScItemId(Long scItemId) {
    this.scItemId = scItemId;
    }
        public Long getWeight() {
    return this.weight;
    }
    public void setWeight(Long weight) {
    this.weight = weight;
    }
        public List<String> getItemFeatures() {
    return this.itemFeatures;
    }
    public void setItemFeatures(List<String> itemFeatures) {
    this.itemFeatures = itemFeatures;
    }
        public String getCurrency() {
    return this.currency;
    }
    public void setCurrency(String currency) {
    this.currency = currency;
    }
        public Long getTotalPrice() {
    return this.totalPrice;
    }
    public void setTotalPrice(Long totalPrice) {
    this.totalPrice = totalPrice;
    }
        public Long getLength() {
    return this.length;
    }
    public void setLength(Long length) {
    this.length = length;
    }
        public Long getWidth() {
    return this.width;
    }
    public void setWidth(Long width) {
    this.width = width;
    }
        public Long getHeight() {
    return this.height;
    }
    public void setHeight(Long height) {
    this.height = height;
    }
    }