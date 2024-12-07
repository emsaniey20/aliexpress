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

public class AliexpressTradeRedefiningFindloanlistqueryOrderLoanItemVO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 订单ID */
                @ApiField("order_id")
            private Long orderId;
        /** 子订单元素列表 */
                @ApiListField("son_order_list")
            private List<AliexpressTradeRedefiningFindloanlistquerySonOrderLoanVO> sonOrderList;
        /** 订单状态： PLACE_ORDER_SUCCESS:等待买家付款; IN_CANCEL:买家申请取消; WAIT_SELLER_SEND_GOODS:等待您发货; SELLER_PART_SEND_GOODS:部分发货; WAIT_BUYER_ACCEPT_GOODS:等待买家收货; FUND_PROCESSING:买卖家达成一致，资金处理中； IN_ISSUE:含纠纷中的订单; IN_FROZEN:冻结中的订单; WAIT_SELLER_EXAMINE_MONEY:等待您确认金额; RISK_CONTROL:订单处于风控24小时中，从买家在线支付完成后开始，持续24小时。 以上状态查询可分别做单独查询，不传订单状态查询订单信息不包含（FINISH，已结束订单状态） FINISH:已结束的订单，需单独查询。 */
                @ApiField("order_status")
            private String orderStatus;
        /** 总金额 */
                @ApiField("amount_total")
            private AliexpressTradeRedefiningFindloanlistqueryMoney amountTotal;
    
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public List<AliexpressTradeRedefiningFindloanlistquerySonOrderLoanVO> getSonOrderList() {
    return this.sonOrderList;
    }
    public void setSonOrderList(List<AliexpressTradeRedefiningFindloanlistquerySonOrderLoanVO> sonOrderList) {
    this.sonOrderList = sonOrderList;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public AliexpressTradeRedefiningFindloanlistqueryMoney getAmountTotal() {
    return this.amountTotal;
    }
    public void setAmountTotal(AliexpressTradeRedefiningFindloanlistqueryMoney amountTotal) {
    this.amountTotal = amountTotal;
    }
    }