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

public class AliexpressSocialProductFreightQueryFreightItemOpenApiVO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** City code */
                @ApiField("city_code")
            private String cityCode;
        /** City name */
                @ApiField("city_name")
            private String cityName;
        /** Commit day */
                @ApiField("commit_day")
            private String commitDay;
        /** Company */
                @ApiField("company")
            private String company;
        /** Core zone */
                @ApiField("core_zone")
            private String coreZone;
        /** Currency */
                @ApiField("currency")
            private String currency;
        /** Cut time */
                @ApiField("cut_time")
            private String cutTime;
        /** Delivery date */
                @ApiField("delivery_date")
            private String deliveryDate;
        /** Discount */
                @ApiField("discount")
            private Integer discount;
        /** Freight amount */
                @ApiField("freight_amount")
            private String freightAmount;
        /** If it is HBA */
                @ApiField("is_hba_service")
            private Boolean isHbaService;
        /** Remaining time */
                @ApiField("remain_time")
            private String remainTime;
        /** Count full name */
                @ApiField("send_goods_country_full_name")
            private String sendGoodsCountryFullName;
        /** Service features */
                @ApiField("service_features")
            private String serviceFeatures;
        /** Tracking code */
                @ApiField("tracking_code")
            private Boolean trackingCode;
    
        public String getCityCode() {
    return this.cityCode;
    }
    public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
    }
        public String getCityName() {
    return this.cityName;
    }
    public void setCityName(String cityName) {
    this.cityName = cityName;
    }
        public String getCommitDay() {
    return this.commitDay;
    }
    public void setCommitDay(String commitDay) {
    this.commitDay = commitDay;
    }
        public String getCompany() {
    return this.company;
    }
    public void setCompany(String company) {
    this.company = company;
    }
        public String getCoreZone() {
    return this.coreZone;
    }
    public void setCoreZone(String coreZone) {
    this.coreZone = coreZone;
    }
        public String getCurrency() {
    return this.currency;
    }
    public void setCurrency(String currency) {
    this.currency = currency;
    }
        public String getCutTime() {
    return this.cutTime;
    }
    public void setCutTime(String cutTime) {
    this.cutTime = cutTime;
    }
        public String getDeliveryDate() {
    return this.deliveryDate;
    }
    public void setDeliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
    }
        public Integer getDiscount() {
    return this.discount;
    }
    public void setDiscount(Integer discount) {
    this.discount = discount;
    }
        public String getFreightAmount() {
    return this.freightAmount;
    }
    public void setFreightAmount(String freightAmount) {
    this.freightAmount = freightAmount;
    }
        public Boolean getIsHbaService() {
    return this.isHbaService;
    }
    public void setIsHbaService(Boolean isHbaService) {
    this.isHbaService = isHbaService;
    }
        public String getRemainTime() {
    return this.remainTime;
    }
    public void setRemainTime(String remainTime) {
    this.remainTime = remainTime;
    }
        public String getSendGoodsCountryFullName() {
    return this.sendGoodsCountryFullName;
    }
    public void setSendGoodsCountryFullName(String sendGoodsCountryFullName) {
    this.sendGoodsCountryFullName = sendGoodsCountryFullName;
    }
        public String getServiceFeatures() {
    return this.serviceFeatures;
    }
    public void setServiceFeatures(String serviceFeatures) {
    this.serviceFeatures = serviceFeatures;
    }
        public Boolean getTrackingCode() {
    return this.trackingCode;
    }
    public void setTrackingCode(Boolean trackingCode) {
    this.trackingCode = trackingCode;
    }
    }