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

public class TaobaoVasOrderSearchArticleBizOrder implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1655222400000 */
                @ApiField("order_cycle_start")
            private String orderCycleStart;
        /** null */
                @ApiField("refund_fee")
            private String refundFee;
        /** 默认收费项目 */
                @ApiField("article_item_name")
            private String articleItemName;
        /** 类目测试1 */
                @ApiField("article_name")
            private String articleName;
        /** 0 */
                @ApiField("total_pay_fee")
            private String totalPayFee;
        /** 1 */
                @ApiField("biz_type")
            private Integer bizType;
        /** 317230195180544 */
                @ApiField("order_id")
            private Long orderId;
        /** 1656518400000 */
                @ApiField("order_cycle_end")
            private String orderCycleEnd;
        /**  3000  	 */
                @ApiField("fee")
            private String fee;
        /** FW_GOODS-1001204320-1 */
                @ApiField("item_code")
            private String itemCode;
        /** aliqatest01 */
                @ApiField("nick")
            private String nick;
        /** null */
                @ApiField("activity_code")
            private String activityCode;
        /** null */
                @ApiField("item_name")
            private String itemName;
        /** 0个月 */
                @ApiField("order_cycle")
            private String orderCycle;
        /** 0 */
                @ApiField("biz_order_id")
            private Integer bizOrderId;
        /** 3000 */
                @ApiField("prom_fee")
            private String promFee;
        /** 1655292812000 */
                @ApiField("create")
            private String create;
        /** FW_GOODS-1001204320 */
                @ApiField("article_code")
            private String articleCode;
    
        public String getOrderCycleStart() {
    return this.orderCycleStart;
    }
    public void setOrderCycleStart(String orderCycleStart) {
    this.orderCycleStart = orderCycleStart;
    }
        public String getRefundFee() {
    return this.refundFee;
    }
    public void setRefundFee(String refundFee) {
    this.refundFee = refundFee;
    }
        public String getArticleItemName() {
    return this.articleItemName;
    }
    public void setArticleItemName(String articleItemName) {
    this.articleItemName = articleItemName;
    }
        public String getArticleName() {
    return this.articleName;
    }
    public void setArticleName(String articleName) {
    this.articleName = articleName;
    }
        public String getTotalPayFee() {
    return this.totalPayFee;
    }
    public void setTotalPayFee(String totalPayFee) {
    this.totalPayFee = totalPayFee;
    }
        public Integer getBizType() {
    return this.bizType;
    }
    public void setBizType(Integer bizType) {
    this.bizType = bizType;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public String getOrderCycleEnd() {
    return this.orderCycleEnd;
    }
    public void setOrderCycleEnd(String orderCycleEnd) {
    this.orderCycleEnd = orderCycleEnd;
    }
        public String getFee() {
    return this.fee;
    }
    public void setFee(String fee) {
    this.fee = fee;
    }
        public String getItemCode() {
    return this.itemCode;
    }
    public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
    }
        public String getNick() {
    return this.nick;
    }
    public void setNick(String nick) {
    this.nick = nick;
    }
        public String getActivityCode() {
    return this.activityCode;
    }
    public void setActivityCode(String activityCode) {
    this.activityCode = activityCode;
    }
        public String getItemName() {
    return this.itemName;
    }
    public void setItemName(String itemName) {
    this.itemName = itemName;
    }
        public String getOrderCycle() {
    return this.orderCycle;
    }
    public void setOrderCycle(String orderCycle) {
    this.orderCycle = orderCycle;
    }
        public Integer getBizOrderId() {
    return this.bizOrderId;
    }
    public void setBizOrderId(Integer bizOrderId) {
    this.bizOrderId = bizOrderId;
    }
        public String getPromFee() {
    return this.promFee;
    }
    public void setPromFee(String promFee) {
    this.promFee = promFee;
    }
        public String getCreate() {
    return this.create;
    }
    public void setCreate(String create) {
    this.create = create;
    }
        public String getArticleCode() {
    return this.articleCode;
    }
    public void setArticleCode(String articleCode) {
    this.articleCode = articleCode;
    }
    }