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

public class AriseOrderListQueryOrderSimplifiedOpenDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 订单创建时间，unix时间戳，单位毫秒 */
                @ApiField("order_create_time")
            private Long orderCreateTime;
        /** 订单id */
                @ApiField("trade_order_id")
            private Long tradeOrderId;
        /** 商家订单备注 */
                @ApiField("seller_memo")
            private String sellerMemo;
        /** 买家名字 */
                @ApiField("buyer_full_name")
            private String buyerFullName;
        /** 子订单信息 */
                @ApiListField("order_lines")
            private List<AriseOrderListQueryOrderLineSimplifiedOpenDTO> orderLines;
    
        public Long getOrderCreateTime() {
    return this.orderCreateTime;
    }
    public void setOrderCreateTime(Long orderCreateTime) {
    this.orderCreateTime = orderCreateTime;
    }
        public Long getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
        public String getSellerMemo() {
    return this.sellerMemo;
    }
    public void setSellerMemo(String sellerMemo) {
    this.sellerMemo = sellerMemo;
    }
        public String getBuyerFullName() {
    return this.buyerFullName;
    }
    public void setBuyerFullName(String buyerFullName) {
    this.buyerFullName = buyerFullName;
    }
        public List<AriseOrderListQueryOrderLineSimplifiedOpenDTO> getOrderLines() {
    return this.orderLines;
    }
    public void setOrderLines(List<AriseOrderListQueryOrderLineSimplifiedOpenDTO> orderLines) {
    this.orderLines = orderLines;
    }
    }