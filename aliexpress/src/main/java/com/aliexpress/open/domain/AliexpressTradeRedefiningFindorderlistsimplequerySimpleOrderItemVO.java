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

public class AliexpressTradeRedefiningFindorderlistsimplequerySimpleOrderItemVO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品列表 */
                @ApiListField("product_list")
            private List<AliexpressTradeRedefiningFindorderlistsimplequerySimpleOrderProductVO> productList;
        /** 订单备注 */
                @ApiField("memo")
            private String memo;
        /** 当前状态的超时剩余时间，单位毫秒（负数表示已超时时间）。已作废,不再返回值。 */
                @ApiField("timeout_left_time")
            private Long timeoutLeftTime;
        /** 订单类型（AE_COMMON:普通订单;AE_TRIAL:试用订单;AE_RECHARGE:手机充值订单) */
                @ApiField("biz_type")
            private String bizType;
        /** 订单状态 */
                @ApiField("order_status")
            private String orderStatus;
        /** 订单修改时间，美国太平洋时间 */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** 订单创建时间，美国太平洋时间 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 订单ID */
                @ApiField("order_id")
            private Long orderId;
    
        public List<AliexpressTradeRedefiningFindorderlistsimplequerySimpleOrderProductVO> getProductList() {
    return this.productList;
    }
    public void setProductList(List<AliexpressTradeRedefiningFindorderlistsimplequerySimpleOrderProductVO> productList) {
    this.productList = productList;
    }
        public String getMemo() {
    return this.memo;
    }
    public void setMemo(String memo) {
    this.memo = memo;
    }
        public Long getTimeoutLeftTime() {
    return this.timeoutLeftTime;
    }
    public void setTimeoutLeftTime(Long timeoutLeftTime) {
    this.timeoutLeftTime = timeoutLeftTime;
    }
        public String getBizType() {
    return this.bizType;
    }
    public void setBizType(String bizType) {
    this.bizType = bizType;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
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
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
    }