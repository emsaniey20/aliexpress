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

public class AliexpressSocialProductEvaluationQueryBuyerEvaluation implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Updated feedback */
                @ApiField("additional_feedback")
            private String additionalFeedback;
        /** Buyer blured name */
                @ApiField("buyer_blured_name")
            private String buyerBluredName;
        /** Country of buyer */
                @ApiField("buyer_country_code")
            private String buyerCountryCode;
        /** Evaluation, stars number */
                @ApiField("evaluation")
            private String evaluation;
        /** Feedback text */
                @ApiField("feedback")
            private String feedback;
        /** Feedback date */
                @ApiField("feedback_epoch_date")
            private Long feedbackEpochDate;
        /** Buyer added images */
                @ApiListField("image_urls")
            private List<String> imageUrls;
        /** if the review is anonymous */
                @ApiField("is_anonymous")
            private Boolean isAnonymous;
        /** Logistics service display name */
                @ApiField("logistics_service")
            private String logisticsService;
        /** Order Id */
                @ApiField("order_id")
            private Long orderId;
        /** SKU */
                @ApiField("product_sku")
            private String productSku;
    
        public String getAdditionalFeedback() {
    return this.additionalFeedback;
    }
    public void setAdditionalFeedback(String additionalFeedback) {
    this.additionalFeedback = additionalFeedback;
    }
        public String getBuyerBluredName() {
    return this.buyerBluredName;
    }
    public void setBuyerBluredName(String buyerBluredName) {
    this.buyerBluredName = buyerBluredName;
    }
        public String getBuyerCountryCode() {
    return this.buyerCountryCode;
    }
    public void setBuyerCountryCode(String buyerCountryCode) {
    this.buyerCountryCode = buyerCountryCode;
    }
        public String getEvaluation() {
    return this.evaluation;
    }
    public void setEvaluation(String evaluation) {
    this.evaluation = evaluation;
    }
        public String getFeedback() {
    return this.feedback;
    }
    public void setFeedback(String feedback) {
    this.feedback = feedback;
    }
        public Long getFeedbackEpochDate() {
    return this.feedbackEpochDate;
    }
    public void setFeedbackEpochDate(Long feedbackEpochDate) {
    this.feedbackEpochDate = feedbackEpochDate;
    }
        public List<String> getImageUrls() {
    return this.imageUrls;
    }
    public void setImageUrls(List<String> imageUrls) {
    this.imageUrls = imageUrls;
    }
        public Boolean getIsAnonymous() {
    return this.isAnonymous;
    }
    public void setIsAnonymous(Boolean isAnonymous) {
    this.isAnonymous = isAnonymous;
    }
        public String getLogisticsService() {
    return this.logisticsService;
    }
    public void setLogisticsService(String logisticsService) {
    this.logisticsService = logisticsService;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public String getProductSku() {
    return this.productSku;
    }
    public void setProductSku(String productSku) {
    this.productSku = productSku;
    }
    }