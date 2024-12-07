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

public class SupplyItemCreateSkuDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sku库存 */
                @ApiField("quantity")
            private Integer quantity;
        /** sku长度 */
                @ApiField("length")
            private Integer length;
        /** sku图片地址 */
                @ApiField("picUrl")
            private String picUrl;
        /** 拓展字段 */
                @ApiField("features")
            private HashMap<String, Object> features;
        /** sku净重 */
                @ApiField("netWeight")
            private String netWeight;
        /** sku毛重 */
                @ApiField("grossWeight")
            private String grossWeight;
        /** sku价格 */
                @ApiField("price")
            private String price;
        /** sku宽度 */
                @ApiField("width")
            private Integer width;
        /** sku编码 */
                @ApiField("skuId")
            private Long skuId;
        /** sku属性 */
                @ApiListField("properties")
            private List<SupplyItemCreateSupplyPvDTO> properties;
        /** sku高度 */
                @ApiField("height")
            private Integer height;
    
        public Integer getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Integer quantity) {
    this.quantity = quantity;
    }
        public Integer getLength() {
    return this.length;
    }
    public void setLength(Integer length) {
    this.length = length;
    }
        public String getPicUrl() {
    return this.picUrl;
    }
    public void setPicUrl(String picUrl) {
    this.picUrl = picUrl;
    }
        public HashMap<String, Object> getFeatures() {
    return this.features;
    }
    public void setFeatures(HashMap<String, Object> features) {
    this.features = features;
    }
        public String getNetWeight() {
    return this.netWeight;
    }
    public void setNetWeight(String netWeight) {
    this.netWeight = netWeight;
    }
        public String getGrossWeight() {
    return this.grossWeight;
    }
    public void setGrossWeight(String grossWeight) {
    this.grossWeight = grossWeight;
    }
        public String getPrice() {
    return this.price;
    }
    public void setPrice(String price) {
    this.price = price;
    }
        public Integer getWidth() {
    return this.width;
    }
    public void setWidth(Integer width) {
    this.width = width;
    }
        public Long getSkuId() {
    return this.skuId;
    }
    public void setSkuId(Long skuId) {
    this.skuId = skuId;
    }
        public List<SupplyItemCreateSupplyPvDTO> getProperties() {
    return this.properties;
    }
    public void setProperties(List<SupplyItemCreateSupplyPvDTO> properties) {
    this.properties = properties;
    }
        public Integer getHeight() {
    return this.height;
    }
    public void setHeight(Integer height) {
    this.height = height;
    }
    }