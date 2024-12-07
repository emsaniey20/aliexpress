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

public class AliexpressLogisticsServiceQueryAeopOnlineLogisticsServiceRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 子交易单列表 */
                @ApiListField("sub_order_list")
            private List<AliexpressLogisticsServiceQueryAeopOnlineLogisticsServiceItemDTO> subOrderList;
        /** 主交易单id */
                @ApiField("order_id")
            private Long orderId;
        /** 长;单位cm */
                @ApiField("goods_length")
            private Integer goodsLength;
        /** 重量;单位KG */
                @ApiField("goods_weight")
            private String goodsWeight;
        /** 高;单位cm */
                @ApiField("goods_height")
            private Integer goodsHeight;
        /** 宽;单位cm */
                @ApiField("goods_width")
            private Integer goodsWidth;
        /** 语言 */
                @ApiField("locale")
            private String locale;
    
        public List<AliexpressLogisticsServiceQueryAeopOnlineLogisticsServiceItemDTO> getSubOrderList() {
    return this.subOrderList;
    }
    public void setSubOrderList(List<AliexpressLogisticsServiceQueryAeopOnlineLogisticsServiceItemDTO> subOrderList) {
    this.subOrderList = subOrderList;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public Integer getGoodsLength() {
    return this.goodsLength;
    }
    public void setGoodsLength(Integer goodsLength) {
    this.goodsLength = goodsLength;
    }
        public String getGoodsWeight() {
    return this.goodsWeight;
    }
    public void setGoodsWeight(String goodsWeight) {
    this.goodsWeight = goodsWeight;
    }
        public Integer getGoodsHeight() {
    return this.goodsHeight;
    }
    public void setGoodsHeight(Integer goodsHeight) {
    this.goodsHeight = goodsHeight;
    }
        public Integer getGoodsWidth() {
    return this.goodsWidth;
    }
    public void setGoodsWidth(Integer goodsWidth) {
    this.goodsWidth = goodsWidth;
    }
        public String getLocale() {
    return this.locale;
    }
    public void setLocale(String locale) {
    this.locale = locale;
    }
    }