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

public class AliexpressAppraiseRedefiningSavesellerfeedbackEvaluationFeedbackDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 无效参数，匿名留评(默认为false) */
                @ApiField("anonymous")
            private Boolean anonymous;
        /** 评价内容 */
                @ApiField("feedback_content")
            private String feedbackContent;
        /** 无效参数，图片地址 */
                @ApiListField("image_urls")
            private String imageUrls;
        /** 评价星级，1-5 */
                @ApiField("score")
            private Integer score;
        /** 卖家登录会员ID */
                @ApiField("seller_ali_id")
            private Long sellerAliId;
        /** 买家登录会员ID，可不填，系统会根据订单获取买家id */
                @ApiField("buyer_ali_id")
            private Long buyerAliId;
        /** 主订单ID */
                @ApiField("order_id")
            private Long orderId;
    
        public Boolean getAnonymous() {
    return this.anonymous;
    }
    public void setAnonymous(Boolean anonymous) {
    this.anonymous = anonymous;
    }
        public String getFeedbackContent() {
    return this.feedbackContent;
    }
    public void setFeedbackContent(String feedbackContent) {
    this.feedbackContent = feedbackContent;
    }
        public String getImageUrls() {
    return this.imageUrls;
    }
    public void setImageUrls(String imageUrls) {
    this.imageUrls = imageUrls;
    }
        public Integer getScore() {
    return this.score;
    }
    public void setScore(Integer score) {
    this.score = score;
    }
        public Long getSellerAliId() {
    return this.sellerAliId;
    }
    public void setSellerAliId(Long sellerAliId) {
    this.sellerAliId = sellerAliId;
    }
        public Long getBuyerAliId() {
    return this.buyerAliId;
    }
    public void setBuyerAliId(Long buyerAliId) {
    this.buyerAliId = buyerAliId;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
    }