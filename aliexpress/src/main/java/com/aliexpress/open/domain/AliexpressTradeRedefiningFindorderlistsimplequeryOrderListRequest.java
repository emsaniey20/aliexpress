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

public class AliexpressTradeRedefiningFindorderlistsimplequeryOrderListRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 订单创建时间结束值，格式: yyyy-MM-dd hh:MM:ss,如2015-07-10 00:00:00 倘若时间维度未精确到时分秒，故该时间条件筛选不许生效。此入参时间为美国太平洋时间。 */
                @ApiField("create_date_end")
            private String createDateEnd;
        /** 订单创建时间起始值，格式: yyyy-MM-dd hh:MM:ss,如2015-07-09 00:00:00 倘若时间维度未精确到时分秒，故该时间条件筛选不许生效。此入参为美国太平洋时间。 */
                @ApiField("create_date_start")
            private String createDateStart;
        /** 查询多个订单状态下的订单信息，具体订单状态见order_status详情。 */
                @ApiListField("order_status_list")
            private String orderStatusList;
        /** 当前页码 */
                @ApiField("page")
            private Integer page;
        /** 每页订单数，最大50 */
                @ApiField("page_size")
            private Integer pageSize;
        /** 订单状态： PLACE_ORDER_SUCCESS:等待买家付款; IN_CANCEL:买家申请取消; WAIT_SELLER_SEND_GOODS:等待您发货; SELLER_PART_SEND_GOODS:部分发货; WAIT_BUYER_ACCEPT_GOODS:等待买家收货; FUND_PROCESSING:买家确认收货后，等待退放款处理的状态; FINISH:已结束的订单; IN_ISSUE:含纠纷的订单; IN_FROZEN:冻结中的订单; WAIT_SELLER_EXAMINE_MONEY:等待您确认金额; RISK_CONTROL:订单处于风控24小时中，从买家在线支付完成后开始，持续24小时。 */
                @ApiField("order_status")
            private String orderStatus;
    
        public String getCreateDateEnd() {
    return this.createDateEnd;
    }
    public void setCreateDateEnd(String createDateEnd) {
    this.createDateEnd = createDateEnd;
    }
        public String getCreateDateStart() {
    return this.createDateStart;
    }
    public void setCreateDateStart(String createDateStart) {
    this.createDateStart = createDateStart;
    }
        public String getOrderStatusList() {
    return this.orderStatusList;
    }
    public void setOrderStatusList(String orderStatusList) {
    this.orderStatusList = orderStatusList;
    }
        public Integer getPage() {
    return this.page;
    }
    public void setPage(Integer page) {
    this.page = page;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
    }