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

public class AliexpressAscpPoPageQueryPurchaseOrderPageQueryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 采购单号 */
                @ApiField("purchase_order_no")
            private String purchaseOrderNo;
        /** 单据类型 10:普通仓发 50:JIT */
                @ApiField("order_type")
            private Integer orderType;
        /** 行业账套 AER 221000，AEG(choice2.0) 288000 aechoice 5110000 */
                @ApiField("biz_type")
            private Integer bizType;
        /** 当前页 */
                @ApiField("page_index")
            private Integer pageIndex;
        /** 分页大小 */
                @ApiField("page_size")
            private Integer pageSize;
        /** 单据状态 10:待确认  15:已确认 17:待发货  20:待收货 21:已到仓 30:部分收货 40:收货完成 -99:已取消,不传则返回所有状态的采购单 */
                @ApiField("status")
            private Integer status;
        /** "yyyy-MM-dd HH:mm:ss" */
                @ApiField("create_time_begin")
            private String createTimeBegin;
        /** "yyyy-MM-dd HH:mm:ss" */
                @ApiField("create_time_end")
            private String createTimeEnd;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id, choice2.0(当bizType=288000时)场景下可以不传该参数) */
                @ApiField("channel_user_id")
            private Long channelUserId;
        /** 交易主单号 */
                @ApiField("trade_order_id")
            private String tradeOrderId;
        /** 1代表当前店铺订单, 2代表主子店铺所有订单 */
                @ApiField("data_range")
            private Integer dataRange;
    
        public String getPurchaseOrderNo() {
    return this.purchaseOrderNo;
    }
    public void setPurchaseOrderNo(String purchaseOrderNo) {
    this.purchaseOrderNo = purchaseOrderNo;
    }
        public Integer getOrderType() {
    return this.orderType;
    }
    public void setOrderType(Integer orderType) {
    this.orderType = orderType;
    }
        public Integer getBizType() {
    return this.bizType;
    }
    public void setBizType(Integer bizType) {
    this.bizType = bizType;
    }
        public Integer getPageIndex() {
    return this.pageIndex;
    }
    public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
        public Integer getStatus() {
    return this.status;
    }
    public void setStatus(Integer status) {
    this.status = status;
    }
        public String getCreateTimeBegin() {
    return this.createTimeBegin;
    }
    public void setCreateTimeBegin(String createTimeBegin) {
    this.createTimeBegin = createTimeBegin;
    }
        public String getCreateTimeEnd() {
    return this.createTimeEnd;
    }
    public void setCreateTimeEnd(String createTimeEnd) {
    this.createTimeEnd = createTimeEnd;
    }
        public Long getChannelUserId() {
    return this.channelUserId;
    }
    public void setChannelUserId(Long channelUserId) {
    this.channelUserId = channelUserId;
    }
        public String getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(String tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
        public Integer getDataRange() {
    return this.dataRange;
    }
    public void setDataRange(Integer dataRange) {
    this.dataRange = dataRange;
    }
    }