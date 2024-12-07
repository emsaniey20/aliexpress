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

public class AliexpressEvaluationListorderevaluationGetTradeEvaluationOpenDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 买家评价星级 */
                @ApiField("buyer_evaluation")
            private String buyerEvaluation;
        /** 买家已评时间 */
                @ApiField("buyer_fb_date")
            private String buyerFbDate;
        /** 买家评价内容 */
                @ApiField("buyer_feedback")
            private String buyerFeedback;
        /** 买家登录帐号 */
                @ApiField("buyer_login_id")
            private String buyerLoginId;
        /** 买家回复内容 */
                @ApiField("buyer_reply")
            private String buyerReply;
        /** 创建时间 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 最后修改时间 */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** 订单完成时间 */
                @ApiField("gmt_order_complete")
            private String gmtOrderComplete;
        /** 子订单id */
                @ApiField("order_id")
            private Long orderId;
        /** 父订单id */
                @ApiField("parent_order_id")
            private Long parentOrderId;
        /** 商品id */
                @ApiField("product_id")
            private Long productId;
        /** 卖家评价星级 */
                @ApiField("seller_evaluation")
            private String sellerEvaluation;
        /** 卖家已评时间 */
                @ApiField("seller_fb_date")
            private String sellerFbDate;
        /** 卖家评价内容 */
                @ApiField("seller_feedback")
            private String sellerFeedback;
        /** 卖家登录帐号 */
                @ApiField("seller_login_id")
            private String sellerLoginId;
        /** 卖家回复内容 */
                @ApiField("seller_reply")
            private String sellerReply;
        /** 评价生效日期 */
                @ApiField("valid_date")
            private String validDate;
    
        public String getBuyerEvaluation() {
    return this.buyerEvaluation;
    }
    public void setBuyerEvaluation(String buyerEvaluation) {
    this.buyerEvaluation = buyerEvaluation;
    }
        public String getBuyerFbDate() {
    return this.buyerFbDate;
    }
    public void setBuyerFbDate(String buyerFbDate) {
    this.buyerFbDate = buyerFbDate;
    }
        public String getBuyerFeedback() {
    return this.buyerFeedback;
    }
    public void setBuyerFeedback(String buyerFeedback) {
    this.buyerFeedback = buyerFeedback;
    }
        public String getBuyerLoginId() {
    return this.buyerLoginId;
    }
    public void setBuyerLoginId(String buyerLoginId) {
    this.buyerLoginId = buyerLoginId;
    }
        public String getBuyerReply() {
    return this.buyerReply;
    }
    public void setBuyerReply(String buyerReply) {
    this.buyerReply = buyerReply;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
    }
        public String getGmtOrderComplete() {
    return this.gmtOrderComplete;
    }
    public void setGmtOrderComplete(String gmtOrderComplete) {
    this.gmtOrderComplete = gmtOrderComplete;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public Long getParentOrderId() {
    return this.parentOrderId;
    }
    public void setParentOrderId(Long parentOrderId) {
    this.parentOrderId = parentOrderId;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getSellerEvaluation() {
    return this.sellerEvaluation;
    }
    public void setSellerEvaluation(String sellerEvaluation) {
    this.sellerEvaluation = sellerEvaluation;
    }
        public String getSellerFbDate() {
    return this.sellerFbDate;
    }
    public void setSellerFbDate(String sellerFbDate) {
    this.sellerFbDate = sellerFbDate;
    }
        public String getSellerFeedback() {
    return this.sellerFeedback;
    }
    public void setSellerFeedback(String sellerFeedback) {
    this.sellerFeedback = sellerFeedback;
    }
        public String getSellerLoginId() {
    return this.sellerLoginId;
    }
    public void setSellerLoginId(String sellerLoginId) {
    this.sellerLoginId = sellerLoginId;
    }
        public String getSellerReply() {
    return this.sellerReply;
    }
    public void setSellerReply(String sellerReply) {
    this.sellerReply = sellerReply;
    }
        public String getValidDate() {
    return this.validDate;
    }
    public void setValidDate(String validDate) {
    this.validDate = validDate;
    }
    }