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

public class AliexpressSolutionProductListGetItemDisplayDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** product offline time */
                @ApiField("ws_offline_date")
            private String wsOfflineDate;
        /** product offline reason */
                @ApiField("ws_display")
            private String wsDisplay;
        /** product tite */
                @ApiField("subject")
            private String subject;
        /** product src */
                @ApiField("src")
            private String src;
        /** min price among all skus of the product */
                @ApiField("product_min_price")
            private String productMinPrice;
        /** max price among all skus of the product */
                @ApiField("product_max_price")
            private String productMaxPrice;
        /** product id */
                @ApiField("product_id")
            private Long productId;
        /** seller member seq */
                @ApiField("owner_member_seq")
            private Integer ownerMemberSeq;
        /** seller login id */
                @ApiField("owner_member_id")
            private String ownerMemberId;
        /** product image urls */
                @ApiField("image_u_r_ls")
            private String imageURLs;
        /** group id */
                @ApiField("group_id")
            private Integer groupId;
        /** time that product was modifed */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** time that product was created */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** freight template id */
                @ApiField("freight_template_id")
            private Integer freightTemplateId;
        /** currency code */
                @ApiField("currency_code")
            private String currencyCode;
        /** Coupon start date, GMT+8 */
                @ApiField("coupon_start_date")
            private String couponStartDate;
        /** Coupon end date, GMT+8 */
                @ApiField("coupon_end_date")
            private String couponEndDate;
    
        public String getWsOfflineDate() {
    return this.wsOfflineDate;
    }
    public void setWsOfflineDate(String wsOfflineDate) {
    this.wsOfflineDate = wsOfflineDate;
    }
        public String getWsDisplay() {
    return this.wsDisplay;
    }
    public void setWsDisplay(String wsDisplay) {
    this.wsDisplay = wsDisplay;
    }
        public String getSubject() {
    return this.subject;
    }
    public void setSubject(String subject) {
    this.subject = subject;
    }
        public String getSrc() {
    return this.src;
    }
    public void setSrc(String src) {
    this.src = src;
    }
        public String getProductMinPrice() {
    return this.productMinPrice;
    }
    public void setProductMinPrice(String productMinPrice) {
    this.productMinPrice = productMinPrice;
    }
        public String getProductMaxPrice() {
    return this.productMaxPrice;
    }
    public void setProductMaxPrice(String productMaxPrice) {
    this.productMaxPrice = productMaxPrice;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public Integer getOwnerMemberSeq() {
    return this.ownerMemberSeq;
    }
    public void setOwnerMemberSeq(Integer ownerMemberSeq) {
    this.ownerMemberSeq = ownerMemberSeq;
    }
        public String getOwnerMemberId() {
    return this.ownerMemberId;
    }
    public void setOwnerMemberId(String ownerMemberId) {
    this.ownerMemberId = ownerMemberId;
    }
        public String getImageURLs() {
    return this.imageURLs;
    }
    public void setImageURLs(String imageURLs) {
    this.imageURLs = imageURLs;
    }
        public Integer getGroupId() {
    return this.groupId;
    }
    public void setGroupId(Integer groupId) {
    this.groupId = groupId;
    }
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public Integer getFreightTemplateId() {
    return this.freightTemplateId;
    }
    public void setFreightTemplateId(Integer freightTemplateId) {
    this.freightTemplateId = freightTemplateId;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public String getCouponStartDate() {
    return this.couponStartDate;
    }
    public void setCouponStartDate(String couponStartDate) {
    this.couponStartDate = couponStartDate;
    }
        public String getCouponEndDate() {
    return this.couponEndDate;
    }
    public void setCouponEndDate(String couponEndDate) {
    this.couponEndDate = couponEndDate;
    }
    }