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

public class GspOrderQueryforsupplierQueryOrderResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 订单（销售单）总数 */
                @ApiField("totalCount")
            private String totalCount;
        /** 订单数据 */
                @ApiListField("orders")
            private List<GspOrderQueryforsupplierOrderDTO> orders;
    
        public String getTotalCount() {
    return this.totalCount;
    }
    public void setTotalCount(String totalCount) {
    this.totalCount = totalCount;
    }
        public List<GspOrderQueryforsupplierOrderDTO> getOrders() {
    return this.orders;
    }
    public void setOrders(List<GspOrderQueryforsupplierOrderDTO> orders) {
    this.orders = orders;
    }
    }