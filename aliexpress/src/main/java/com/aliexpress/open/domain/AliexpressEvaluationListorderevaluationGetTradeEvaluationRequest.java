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

public class AliexpressEvaluationListorderevaluationGetTradeEvaluationRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 买家评价星级（1-5星） */
                @ApiListField("buyer_product_ratings")
            private List<Integer> buyerProductRatings;
        /** 订单完成结束时间 */
                @ApiField("end_order_complete_date")
            private String endOrderCompleteDate;
        /** 评价生效结束时间 */
                @ApiField("end_valid_date")
            private String endValidDate;
        /** 父订单ID集合，最多50 */
                @ApiListField("parent_order_ids")
            private List<Long> parentOrderIds;
        /** 商品id */
                @ApiField("product_id")
            private Long productId;
        /** 订单完成开始时间 */
                @ApiField("start_order_complete_date")
            private String startOrderCompleteDate;
        /** 评价生效开始时间 */
                @ApiField("start_valid_date")
            private String startValidDate;
    
        public List<Integer> getBuyerProductRatings() {
    return this.buyerProductRatings;
    }
    public void setBuyerProductRatings(List<Integer> buyerProductRatings) {
    this.buyerProductRatings = buyerProductRatings;
    }
        public String getEndOrderCompleteDate() {
    return this.endOrderCompleteDate;
    }
    public void setEndOrderCompleteDate(String endOrderCompleteDate) {
    this.endOrderCompleteDate = endOrderCompleteDate;
    }
        public String getEndValidDate() {
    return this.endValidDate;
    }
    public void setEndValidDate(String endValidDate) {
    this.endValidDate = endValidDate;
    }
        public List<Long> getParentOrderIds() {
    return this.parentOrderIds;
    }
    public void setParentOrderIds(List<Long> parentOrderIds) {
    this.parentOrderIds = parentOrderIds;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getStartOrderCompleteDate() {
    return this.startOrderCompleteDate;
    }
    public void setStartOrderCompleteDate(String startOrderCompleteDate) {
    this.startOrderCompleteDate = startOrderCompleteDate;
    }
        public String getStartValidDate() {
    return this.startValidDate;
    }
    public void setStartValidDate(String startValidDate) {
    this.startValidDate = startValidDate;
    }
    }