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

public class AliexpressTradeNewRedefiningFindorderbyidAeopTpOperationLogDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 操作类型，用于记录操作事件。可能值为front_create_order, front_seller_send_all_goods, front_seller_send_part_goods, front_pay_online_success, front_trade_completed, front_trade_success, trade_close, front_buyerComfirmAcceptGoods, front_sellerAnnounceSendGoods, front_paypal_pay_success, front_pay_wu_success, front_pay_qw_success, front_mb_pay_success, cancel_order_close_trade, buyer_close_cancel, pledge_refund_ing, pledge_refund_fail, pledge_refund_success, pledge_issue_buyer_create, pledge_issue_buyer_modify, pledge_issue_buyer_accept, pledge_issue_buyer_cancel, pledge_issue_cs_cancel_money, risk_control_pass, buyer_cancle_group_after_payment, group_success, group_failure, buyer_cancle_group_after_payment, presell_promotion_end */
                @ApiField("action_type")
            private String actionType;
        /** 子订单ID */
                @ApiField("child_order_id")
            private Long childOrderId;
        /** 创建时间（此时间为美国太平洋时间） */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 修改时间（此时间为美国太平洋时间） */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** id */
                @ApiField("id")
            private Long id;
        /** 操作备注 */
                @ApiField("memo")
            private String memo;
        /** 操作者 */
                @ApiField("operator")
            private String operator;
        /** 订单ID */
                @ApiField("order_id")
            private Long orderId;
    
        public String getActionType() {
    return this.actionType;
    }
    public void setActionType(String actionType) {
    this.actionType = actionType;
    }
        public Long getChildOrderId() {
    return this.childOrderId;
    }
    public void setChildOrderId(Long childOrderId) {
    this.childOrderId = childOrderId;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public String getMemo() {
    return this.memo;
    }
    public void setMemo(String memo) {
    this.memo = memo;
    }
        public String getOperator() {
    return this.operator;
    }
    public void setOperator(String operator) {
    this.operator = operator;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
    }