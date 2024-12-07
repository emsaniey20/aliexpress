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

public class SupplyItemUpdateSkuUpdateDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sku拓展字段 */
                @ApiField("picUrl")
            private String picUrl;
        /** sku拓展字段 */
                @ApiField("features")
            private HashMap<String, Object> features;
        /** sku库存 */
                @ApiField("quantity")
            private Integer quantity;
        /** sku价格 */
                @ApiField("price")
            private String price;
        /** sku编码 */
                @ApiField("skuId")
            private Long skuId;
        /** sku状态 */
                @ApiField("status")
            private Integer status;
    
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
        public Integer getQuantity() {
    return this.quantity;
    }
    public void setQuantity(Integer quantity) {
    this.quantity = quantity;
    }
        public String getPrice() {
    return this.price;
    }
    public void setPrice(String price) {
    this.price = price;
    }
        public Long getSkuId() {
    return this.skuId;
    }
    public void setSkuId(Long skuId) {
    this.skuId = skuId;
    }
        public Integer getStatus() {
    return this.status;
    }
    public void setStatus(Integer status) {
    this.status = status;
    }
    }