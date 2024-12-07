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

public class AriseOrderListQueryOrderQueryListOpenRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 订单状态，包括waitPaid(待支付)、waitShipping(待发货)、waitDelivered(待收货)、waitSellerConfirmCancel(待卖家响应买家)、cancelrejectBuyerCancel(取消请求已拒绝)、orderCancelled(订单取消)、delivered(已收货，订单完成)、closed(订单关闭) */
                @ApiField("order_status")
            private String orderStatus;
        /** 查询的每页数量 */
                @ApiField("page_size")
            private Integer pageSize;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query） */
                @ApiField("channel_seller_id")
            private Long channelSellerId;
        /** 订单创建时间-开始时间（unix时间戳，单位毫秒） */
                @ApiField("create_time_start")
            private String createTimeStart;
        /** 订单创建时间-结束时间（unix时间戳，单位毫秒） */
                @ApiField("create_time_end")
            private String createTimeEnd;
        /** 当前页数 */
                @ApiField("current_page")
            private Integer currentPage;
        /** 渠道（可以在这个API中查询：global.seller.relation.query） */
                @ApiField("open_channel")
            private String openChannel;
    
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
        public Long getChannelSellerId() {
    return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId) {
    this.channelSellerId = channelSellerId;
    }
        public String getCreateTimeStart() {
    return this.createTimeStart;
    }
    public void setCreateTimeStart(String createTimeStart) {
    this.createTimeStart = createTimeStart;
    }
        public String getCreateTimeEnd() {
    return this.createTimeEnd;
    }
    public void setCreateTimeEnd(String createTimeEnd) {
    this.createTimeEnd = createTimeEnd;
    }
        public Integer getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    }
        public String getOpenChannel() {
    return this.openChannel;
    }
    public void setOpenChannel(String openChannel) {
    this.openChannel = openChannel;
    }
    }