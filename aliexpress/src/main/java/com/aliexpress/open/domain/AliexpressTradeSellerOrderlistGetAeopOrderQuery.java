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

public class AliexpressTradeSellerOrderlistGetAeopOrderQuery implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 买家登录id */
                @ApiField("buyer_login_id")
            private String buyerLoginId;
        /** 订单创建时间结束值，格式: yyyy-mm-dd hh:mm:ss,此时间为美国太平洋时间 */
                @ApiField("create_date_end")
            private String createDateEnd;
        /** 订单创建时间起始值 格式: yyyy-mm-dd hh:mm:ss。此时间为美国太平洋时间 */
                @ApiField("create_date_start")
            private String createDateStart;
        /** 页码 */
                @ApiField("current_page")
            private Integer currentPage;
        /** 订单修改时间结束值，格式: yyyy-mm-dd hh:mm:ss。此时间为美国太平洋时间 */
                @ApiField("modified_date_end")
            private String modifiedDateEnd;
        /** 订单修改时间起始值 格式: yyyy-mm-dd hh:mm:ss 需要加上createdate控制查询范围。可查询时间范围；默认180天，查询已结束订单为30天。此时间为美国太平洋时间 */
                @ApiField("modified_date_start")
            private String modifiedDateStart;
        /** 订单状态： PLACE_ORDER_SUCCESS:等待买家付款; IN_CANCEL:买家申请取消; WAIT_SELLER_SEND_GOODS:等待您发货; SELLER_PART_SEND_GOODS:部分发货; WAIT_BUYER_ACCEPT_GOODS:等待买家收货; FUND_PROCESSING:买卖家达成一致，资金处理中； IN_ISSUE:含纠纷中的订单; IN_FROZEN:冻结中的订单; WAIT_SELLER_EXAMINE_MONEY:等待您确认金额; RISK_CONTROL:订单处于风控24小时中，从买家在线支付完成后开始，持续24小时。 以上状态查询可分别做单独查询，不传订单状态查询订单信息不包含（FINISH，已结束订单状态） FINISH:已结束的订单，需单独查询。 */
                @ApiField("order_status")
            private String orderStatus;
        /** 查询多个订单状态下的订单信息，具体订单状态见order_status描述 */
                @ApiListField("order_status_list")
            private List<String> orderStatusList;
        /** 每页条数 */
                @ApiField("page_size")
            private Integer pageSize;
    
        public String getBuyerLoginId() {
    return this.buyerLoginId;
    }
    public void setBuyerLoginId(String buyerLoginId) {
    this.buyerLoginId = buyerLoginId;
    }
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
        public Integer getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    }
        public String getModifiedDateEnd() {
    return this.modifiedDateEnd;
    }
    public void setModifiedDateEnd(String modifiedDateEnd) {
    this.modifiedDateEnd = modifiedDateEnd;
    }
        public String getModifiedDateStart() {
    return this.modifiedDateStart;
    }
    public void setModifiedDateStart(String modifiedDateStart) {
    this.modifiedDateStart = modifiedDateStart;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public List<String> getOrderStatusList() {
    return this.orderStatusList;
    }
    public void setOrderStatusList(List<String> orderStatusList) {
    this.orderStatusList = orderStatusList;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
    }