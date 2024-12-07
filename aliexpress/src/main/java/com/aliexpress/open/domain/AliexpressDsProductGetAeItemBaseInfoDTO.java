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

public class AliexpressDsProductGetAeItemBaseInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Change the time */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** Item ID */
                @ApiField("product_id")
            private Long productId;
        /** The title of the product */
                @ApiField("subject")
            private String subject;
        /** Product status */
                @ApiField("product_status_type")
            private String productStatusType;
        /** Commodity creation time */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** Mobile detailed description */
                @ApiField("mobile_detail")
            private String mobileDetail;
        /** Average rating stars, 1-5 stars */
                @ApiField("avg_evaluation_rating")
            private String avgEvaluationRating;
        /** Reasons for removal of goods */
                @ApiField("ws_display")
            private String wsDisplay;
        /** Evaluation number */
                @ApiField("evaluation_count")
            private String evaluationCount;
        /** The date the product was removed from the shelf */
                @ApiField("ws_offline_date")
            private String wsOfflineDate;
        /** Seller's master account ID */
                @ApiField("owner_member_seq_long")
            private Long ownerMemberSeqLong;
        /** Commodity detailed description */
                @ApiField("detail")
            private String detail;
        /** The currency unit of the commodity. U.S. Dollar: USD, Ruble: RUB */
                @ApiField("currency_code")
            private String currencyCode;
        /** ID of the category of the product */
                @ApiField("category_id")
            private Long categoryId;
        /** Sales volume of product */
                @ApiField("sales_count")
            private String salesCount;
    
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getSubject() {
    return this.subject;
    }
    public void setSubject(String subject) {
    this.subject = subject;
    }
        public String getProductStatusType() {
    return this.productStatusType;
    }
    public void setProductStatusType(String productStatusType) {
    this.productStatusType = productStatusType;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getMobileDetail() {
    return this.mobileDetail;
    }
    public void setMobileDetail(String mobileDetail) {
    this.mobileDetail = mobileDetail;
    }
        public String getAvgEvaluationRating() {
    return this.avgEvaluationRating;
    }
    public void setAvgEvaluationRating(String avgEvaluationRating) {
    this.avgEvaluationRating = avgEvaluationRating;
    }
        public String getWsDisplay() {
    return this.wsDisplay;
    }
    public void setWsDisplay(String wsDisplay) {
    this.wsDisplay = wsDisplay;
    }
        public String getEvaluationCount() {
    return this.evaluationCount;
    }
    public void setEvaluationCount(String evaluationCount) {
    this.evaluationCount = evaluationCount;
    }
        public String getWsOfflineDate() {
    return this.wsOfflineDate;
    }
    public void setWsOfflineDate(String wsOfflineDate) {
    this.wsOfflineDate = wsOfflineDate;
    }
        public Long getOwnerMemberSeqLong() {
    return this.ownerMemberSeqLong;
    }
    public void setOwnerMemberSeqLong(Long ownerMemberSeqLong) {
    this.ownerMemberSeqLong = ownerMemberSeqLong;
    }
        public String getDetail() {
    return this.detail;
    }
    public void setDetail(String detail) {
    this.detail = detail;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public Long getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
    }
        public String getSalesCount() {
    return this.salesCount;
    }
    public void setSalesCount(String salesCount) {
    this.salesCount = salesCount;
    }
    }