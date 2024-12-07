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

public class AliexpressTradeRedefiningFindloanlistqueryFundLoanListVO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 总条数 */
                @ApiField("total_item")
            private Integer totalItem;
        /** 订单放款列表 */
                @ApiListField("order_list")
            private List<AliexpressTradeRedefiningFindloanlistqueryOrderLoanItemVO> orderList;
    
        public Integer getTotalItem() {
    return this.totalItem;
    }
    public void setTotalItem(Integer totalItem) {
    this.totalItem = totalItem;
    }
        public List<AliexpressTradeRedefiningFindloanlistqueryOrderLoanItemVO> getOrderList() {
    return this.orderList;
    }
    public void setOrderList(List<AliexpressTradeRedefiningFindloanlistqueryOrderLoanItemVO> orderList) {
    this.orderList = orderList;
    }
    }