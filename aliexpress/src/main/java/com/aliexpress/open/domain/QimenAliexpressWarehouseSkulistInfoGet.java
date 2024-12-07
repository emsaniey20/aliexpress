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

public class QimenAliexpressWarehouseSkulistInfoGet implements Serializable {
    private static final long serialVersionUID = 1L;
        /** SKU ID */
                @ApiField("skuId")
            private String skuId;
        /** 中文名 */
                @ApiField("skuTitleCn")
            private String skuTitleCn;
        /** 英文名 */
                @ApiField("skuTitleEn")
            private String skuTitleEn;
        /** 必填，单位：克 */
                @ApiField("weight")
            private Long weight;
        /** 必填  单位：厘米 */
                @ApiField("length")
            private Long length;
        /** 必填  单位：厘米 */
                @ApiField("width")
            private Long width;
        /** 必填  单位：厘米 */
                @ApiField("height")
            private Long height;
        /**  图片链接 */
                @ApiField("imageLink")
            private String imageLink;
        /** true */
                @ApiField("containBattery")
            private Boolean containBattery;
    
        public String getSkuId() {
    return this.skuId;
    }
    public void setSkuId(String skuId) {
    this.skuId = skuId;
    }
        public String getSkuTitleCn() {
    return this.skuTitleCn;
    }
    public void setSkuTitleCn(String skuTitleCn) {
    this.skuTitleCn = skuTitleCn;
    }
        public String getSkuTitleEn() {
    return this.skuTitleEn;
    }
    public void setSkuTitleEn(String skuTitleEn) {
    this.skuTitleEn = skuTitleEn;
    }
        public Long getWeight() {
    return this.weight;
    }
    public void setWeight(Long weight) {
    this.weight = weight;
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
        public String getImageLink() {
    return this.imageLink;
    }
    public void setImageLink(String imageLink) {
    this.imageLink = imageLink;
    }
        public Boolean getContainBattery() {
    return this.containBattery;
    }
    public void setContainBattery(Boolean containBattery) {
    this.containBattery = containBattery;
    }
    }