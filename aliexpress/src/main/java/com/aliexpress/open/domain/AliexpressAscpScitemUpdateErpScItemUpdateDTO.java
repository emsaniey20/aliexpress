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

public class AliexpressAscpScitemUpdateErpScItemUpdateDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 业务租户Id，AEG场景请填写288000，全托管填5110000，半托管填 7668000 */
                @ApiField("biz_type")
            private Integer bizType;
        /** 货品Id */
                @ApiField("sc_item_id")
            private Long scItemId;
        /** 货品名称 */
                @ApiField("title")
            private String title;
        /** 货品规格 */
                @ApiField("specification")
            private String specification;
        /** 是否易碎 */
                @ApiField("is_hygroscopic")
            private Boolean isHygroscopic;
        /** 是否危险品 */
                @ApiField("is_danger")
            private Boolean isDanger;
        /** 长 */
                @ApiField("length")
            private Integer length;
        /** 宽 */
                @ApiField("width")
            private Integer width;
        /** 高 */
                @ApiField("height")
            private Integer height;
        /** 重 */
                @ApiField("weight")
            private Integer weight;
        /** 毛重 */
                @ApiField("GWeight")
            private Integer gWeight;
        /** 净重 */
                @ApiField("NWeight")
            private Integer nWeight;
        /** 货品声明价值 */
                @ApiField("customs_unit_price")
            private String customsUnitPrice;
        /** 是否含电池。1:无电池, 2:内置电池, 3:外置电池 */
                @ApiField("include_battery")
            private String includeBattery;
        /** 危险品类型。枚举如下：air_embargo：航空禁运；is_knife：刀具等管制物品；contain_battery：包含电池；pressure_spray：压力喷雾；other：其他 */
                @ApiField("dangerous_type")
            private String dangerousType;
        /** 是否原箱 */
                @ApiField("origin_box_package")
            private Boolean originBoxPackage;
        /** 扩展字段, logisticsAttributes 必填。logisticsAttributes 可选值：{"0":"普货","1":"带电带磁","2":"纯电","3":"特货"} */
                @ApiField("feature")
            private String feature;
        /** 渠道卖家id（全托管必填） */
                @ApiField("channel_user_id")
            private Long channelUserId;
    
        public Integer getBizType() {
    return this.bizType;
    }
    public void setBizType(Integer bizType) {
    this.bizType = bizType;
    }
        public Long getScItemId() {
    return this.scItemId;
    }
    public void setScItemId(Long scItemId) {
    this.scItemId = scItemId;
    }
        public String getTitle() {
    return this.title;
    }
    public void setTitle(String title) {
    this.title = title;
    }
        public String getSpecification() {
    return this.specification;
    }
    public void setSpecification(String specification) {
    this.specification = specification;
    }
        public Boolean getIsHygroscopic() {
    return this.isHygroscopic;
    }
    public void setIsHygroscopic(Boolean isHygroscopic) {
    this.isHygroscopic = isHygroscopic;
    }
        public Boolean getIsDanger() {
    return this.isDanger;
    }
    public void setIsDanger(Boolean isDanger) {
    this.isDanger = isDanger;
    }
        public Integer getLength() {
    return this.length;
    }
    public void setLength(Integer length) {
    this.length = length;
    }
        public Integer getWidth() {
    return this.width;
    }
    public void setWidth(Integer width) {
    this.width = width;
    }
        public Integer getHeight() {
    return this.height;
    }
    public void setHeight(Integer height) {
    this.height = height;
    }
        public Integer getWeight() {
    return this.weight;
    }
    public void setWeight(Integer weight) {
    this.weight = weight;
    }
        public Integer getGWeight() {
    return this.gWeight;
    }
    public void setGWeight(Integer gWeight) {
    this.gWeight = gWeight;
    }
        public Integer getNWeight() {
    return this.nWeight;
    }
    public void setNWeight(Integer nWeight) {
    this.nWeight = nWeight;
    }
        public String getCustomsUnitPrice() {
    return this.customsUnitPrice;
    }
    public void setCustomsUnitPrice(String customsUnitPrice) {
    this.customsUnitPrice = customsUnitPrice;
    }
        public String getIncludeBattery() {
    return this.includeBattery;
    }
    public void setIncludeBattery(String includeBattery) {
    this.includeBattery = includeBattery;
    }
        public String getDangerousType() {
    return this.dangerousType;
    }
    public void setDangerousType(String dangerousType) {
    this.dangerousType = dangerousType;
    }
        public Boolean getOriginBoxPackage() {
    return this.originBoxPackage;
    }
    public void setOriginBoxPackage(Boolean originBoxPackage) {
    this.originBoxPackage = originBoxPackage;
    }
        public String getFeature() {
    return this.feature;
    }
    public void setFeature(String feature) {
    this.feature = feature;
    }
        public Long getChannelUserId() {
    return this.channelUserId;
    }
    public void setChannelUserId(Long channelUserId) {
    this.channelUserId = channelUserId;
    }
    }