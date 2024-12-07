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

public class AriseProductUpdateProductSKU implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 包裹重量 */
                @ApiField("package_weight")
            private String packageWeight;
        /** sku价格 */
                @ApiField("sku_price")
            private String skuPrice;
        /** sku库存 */
                @ApiField("sku_stock")
            private Long skuStock;
        /** 包裹宽度 */
                @ApiField("package_width")
            private String packageWidth;
        /** 包裹高度 */
                @ApiField("package_height")
            private String packageHeight;
        /** sku日常促销价 */
                @ApiField("sku_discount_price")
            private String skuDiscountPrice;
        /** sku销售属性模块 。可以从类目属性查询接口查询到类目下对应的 属性id和属性值id */
                @ApiListField("sku_property_list")
            private List<AriseProductUpdateSKUProperty> skuPropertyList;
        /** eanCode */
                @ApiField("ean_code")
            private String eanCode;
        /** sku套图 */
                @ApiListField("sku_image_list")
            private List<String> skuImageList;
        /** 包裹长度 */
                @ApiField("package_length")
            private String packageLength;
        /** 平台生成的sku_id，每个sku唯一 */
                @ApiField("sku_id")
            private Long skuId;
        /** Sku商家编码。 格式:半角英数字,长度20,不包含空格大于号和小于号。 */
                @ApiField("sku_code")
            private String skuCode;
        /** sku状态，可选值为:active,inactive */
                @ApiField("status")
            private String status;
    
        public String getPackageWeight() {
    return this.packageWeight;
    }
    public void setPackageWeight(String packageWeight) {
    this.packageWeight = packageWeight;
    }
        public String getSkuPrice() {
    return this.skuPrice;
    }
    public void setSkuPrice(String skuPrice) {
    this.skuPrice = skuPrice;
    }
        public Long getSkuStock() {
    return this.skuStock;
    }
    public void setSkuStock(Long skuStock) {
    this.skuStock = skuStock;
    }
        public String getPackageWidth() {
    return this.packageWidth;
    }
    public void setPackageWidth(String packageWidth) {
    this.packageWidth = packageWidth;
    }
        public String getPackageHeight() {
    return this.packageHeight;
    }
    public void setPackageHeight(String packageHeight) {
    this.packageHeight = packageHeight;
    }
        public String getSkuDiscountPrice() {
    return this.skuDiscountPrice;
    }
    public void setSkuDiscountPrice(String skuDiscountPrice) {
    this.skuDiscountPrice = skuDiscountPrice;
    }
        public List<AriseProductUpdateSKUProperty> getSkuPropertyList() {
    return this.skuPropertyList;
    }
    public void setSkuPropertyList(List<AriseProductUpdateSKUProperty> skuPropertyList) {
    this.skuPropertyList = skuPropertyList;
    }
        public String getEanCode() {
    return this.eanCode;
    }
    public void setEanCode(String eanCode) {
    this.eanCode = eanCode;
    }
        public List<String> getSkuImageList() {
    return this.skuImageList;
    }
    public void setSkuImageList(List<String> skuImageList) {
    this.skuImageList = skuImageList;
    }
        public String getPackageLength() {
    return this.packageLength;
    }
    public void setPackageLength(String packageLength) {
    this.packageLength = packageLength;
    }
        public Long getSkuId() {
    return this.skuId;
    }
    public void setSkuId(Long skuId) {
    this.skuId = skuId;
    }
        public String getSkuCode() {
    return this.skuCode;
    }
    public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
    }