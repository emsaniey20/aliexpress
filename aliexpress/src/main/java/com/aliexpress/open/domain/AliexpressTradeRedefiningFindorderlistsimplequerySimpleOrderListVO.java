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

public class AliexpressTradeRedefiningFindorderlistsimplequerySimpleOrderListVO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 总数量(SC订单不包含在结果中） */
                @ApiField("total_item")
            private Integer totalItem;
        /** 订单列表 */
                @ApiListField("order_list")
            private List<AliexpressTradeRedefiningFindorderlistsimplequerySimpleOrderItemVO> orderList;
    
        public Integer getTotalItem() {
    return this.totalItem;
    }
    public void setTotalItem(Integer totalItem) {
    this.totalItem = totalItem;
    }
        public List<AliexpressTradeRedefiningFindorderlistsimplequerySimpleOrderItemVO> getOrderList() {
    return this.orderList;
    }
    public void setOrderList(List<AliexpressTradeRedefiningFindorderlistsimplequerySimpleOrderItemVO> orderList) {
    this.orderList = orderList;
    }
    }