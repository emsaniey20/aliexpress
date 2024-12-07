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

public class AriseOrderListQueryOrderListOpenDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 分页信息 */
                @ApiField("page_info")
            private AriseOrderListQueryPage pageInfo;
        /** 订单信息 */
                @ApiListField("order_infos")
            private List<AriseOrderListQueryOrderSimplifiedOpenDTO> orderInfos;
    
        public AriseOrderListQueryPage getPageInfo() {
    return this.pageInfo;
    }
    public void setPageInfo(AriseOrderListQueryPage pageInfo) {
    this.pageInfo = pageInfo;
    }
        public List<AriseOrderListQueryOrderSimplifiedOpenDTO> getOrderInfos() {
    return this.orderInfos;
    }
    public void setOrderInfos(List<AriseOrderListQueryOrderSimplifiedOpenDTO> orderInfos) {
    this.orderInfos = orderInfos;
    }
    }