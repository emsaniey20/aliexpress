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

public class AliexpressSocialShoppingOrderListOrderDto implements Serializable {
    private static final long serialVersionUID = 1L;
        /** can_additional_eval */
                @ApiField("can_additional_eval")
            private Boolean canAdditionalEval;
        /** can_cancel */
                @ApiField("can_cancel")
            private Boolean canCancel;
        /** can_confirm_received */
                @ApiField("can_confirm_received")
            private Boolean canConfirmReceived;
        /** can_delete */
                @ApiField("can_delete")
            private Boolean canDelete;
        /** can_evaluate */
                @ApiField("can_evaluate")
            private Boolean canEvaluate;
        /** can_extend */
                @ApiField("can_extend")
            private Boolean canExtend;
        /** can_invite_friends */
                @ApiField("can_invite_friends")
            private Boolean canInviteFriends;
        /** can_not_pay_hint */
                @ApiField("can_not_pay_hint")
            private String canNotPayHint;
        /** can_pay */
                @ApiField("can_pay")
            private Boolean canPay;
        /** can_resume */
                @ApiField("can_resume")
            private Boolean canResume;
        /** can_tracking */
                @ApiField("can_tracking")
            private Boolean canTracking;
        /** carrioperator */
                @ApiField("carrioperator")
            private String carrioperator;
        /** country */
                @ApiField("country")
            private String country;
        /** end_reason */
                @ApiField("end_reason")
            private String endReason;
        /** gmt_over_time */
                @ApiField("gmt_over_time")
            private Long gmtOverTime;
        /** gmt_trade_create */
                @ApiField("gmt_trade_create")
            private String gmtTradeCreate;
        /** mars_url */
                @ApiField("mars_url")
            private String marsUrl;
        /** mobile_n_o */
                @ApiField("mobile_n_o")
            private String mobileNO;
        /** order_amount */
                @ApiField("order_amount")
            private String orderAmount;
        /** order_count */
                @ApiField("order_count")
            private Long orderCount;
        /** order_currency */
                @ApiField("order_currency")
            private String orderCurrency;
        /** order_id */
                @ApiField("order_id")
            private Long orderId;
        /** order_signature */
                @ApiField("order_signature")
            private String orderSignature;
        /** order_status */
                @ApiField("order_status")
            private String orderStatus;
        /** over_left_time */
                @ApiField("over_left_time")
            private Long overLeftTime;
        /** reminder_copywriting */
                @ApiField("reminder_copywriting")
            private String reminderCopywriting;
        /** shop_number */
                @ApiField("shop_number")
            private String shopNumber;
        /** show_status */
                @ApiField("show_status")
            private String showStatus;
        /** sub_list */
                @ApiListField("sub_list")
            private List<AliexpressSocialShoppingOrderListSubOrderDto> subList;
        /** cashier_request_token */
                @ApiField("cashier_request_token")
            private String cashierRequestToken;
    
        public Boolean getCanAdditionalEval() {
    return this.canAdditionalEval;
    }
    public void setCanAdditionalEval(Boolean canAdditionalEval) {
    this.canAdditionalEval = canAdditionalEval;
    }
        public Boolean getCanCancel() {
    return this.canCancel;
    }
    public void setCanCancel(Boolean canCancel) {
    this.canCancel = canCancel;
    }
        public Boolean getCanConfirmReceived() {
    return this.canConfirmReceived;
    }
    public void setCanConfirmReceived(Boolean canConfirmReceived) {
    this.canConfirmReceived = canConfirmReceived;
    }
        public Boolean getCanDelete() {
    return this.canDelete;
    }
    public void setCanDelete(Boolean canDelete) {
    this.canDelete = canDelete;
    }
        public Boolean getCanEvaluate() {
    return this.canEvaluate;
    }
    public void setCanEvaluate(Boolean canEvaluate) {
    this.canEvaluate = canEvaluate;
    }
        public Boolean getCanExtend() {
    return this.canExtend;
    }
    public void setCanExtend(Boolean canExtend) {
    this.canExtend = canExtend;
    }
        public Boolean getCanInviteFriends() {
    return this.canInviteFriends;
    }
    public void setCanInviteFriends(Boolean canInviteFriends) {
    this.canInviteFriends = canInviteFriends;
    }
        public String getCanNotPayHint() {
    return this.canNotPayHint;
    }
    public void setCanNotPayHint(String canNotPayHint) {
    this.canNotPayHint = canNotPayHint;
    }
        public Boolean getCanPay() {
    return this.canPay;
    }
    public void setCanPay(Boolean canPay) {
    this.canPay = canPay;
    }
        public Boolean getCanResume() {
    return this.canResume;
    }
    public void setCanResume(Boolean canResume) {
    this.canResume = canResume;
    }
        public Boolean getCanTracking() {
    return this.canTracking;
    }
    public void setCanTracking(Boolean canTracking) {
    this.canTracking = canTracking;
    }
        public String getCarrioperator() {
    return this.carrioperator;
    }
    public void setCarrioperator(String carrioperator) {
    this.carrioperator = carrioperator;
    }
        public String getCountry() {
    return this.country;
    }
    public void setCountry(String country) {
    this.country = country;
    }
        public String getEndReason() {
    return this.endReason;
    }
    public void setEndReason(String endReason) {
    this.endReason = endReason;
    }
        public Long getGmtOverTime() {
    return this.gmtOverTime;
    }
    public void setGmtOverTime(Long gmtOverTime) {
    this.gmtOverTime = gmtOverTime;
    }
        public String getGmtTradeCreate() {
    return this.gmtTradeCreate;
    }
    public void setGmtTradeCreate(String gmtTradeCreate) {
    this.gmtTradeCreate = gmtTradeCreate;
    }
        public String getMarsUrl() {
    return this.marsUrl;
    }
    public void setMarsUrl(String marsUrl) {
    this.marsUrl = marsUrl;
    }
        public String getMobileNO() {
    return this.mobileNO;
    }
    public void setMobileNO(String mobileNO) {
    this.mobileNO = mobileNO;
    }
        public String getOrderAmount() {
    return this.orderAmount;
    }
    public void setOrderAmount(String orderAmount) {
    this.orderAmount = orderAmount;
    }
        public Long getOrderCount() {
    return this.orderCount;
    }
    public void setOrderCount(Long orderCount) {
    this.orderCount = orderCount;
    }
        public String getOrderCurrency() {
    return this.orderCurrency;
    }
    public void setOrderCurrency(String orderCurrency) {
    this.orderCurrency = orderCurrency;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public String getOrderSignature() {
    return this.orderSignature;
    }
    public void setOrderSignature(String orderSignature) {
    this.orderSignature = orderSignature;
    }
        public String getOrderStatus() {
    return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    }
        public Long getOverLeftTime() {
    return this.overLeftTime;
    }
    public void setOverLeftTime(Long overLeftTime) {
    this.overLeftTime = overLeftTime;
    }
        public String getReminderCopywriting() {
    return this.reminderCopywriting;
    }
    public void setReminderCopywriting(String reminderCopywriting) {
    this.reminderCopywriting = reminderCopywriting;
    }
        public String getShopNumber() {
    return this.shopNumber;
    }
    public void setShopNumber(String shopNumber) {
    this.shopNumber = shopNumber;
    }
        public String getShowStatus() {
    return this.showStatus;
    }
    public void setShowStatus(String showStatus) {
    this.showStatus = showStatus;
    }
        public List<AliexpressSocialShoppingOrderListSubOrderDto> getSubList() {
    return this.subList;
    }
    public void setSubList(List<AliexpressSocialShoppingOrderListSubOrderDto> subList) {
    this.subList = subList;
    }
        public String getCashierRequestToken() {
    return this.cashierRequestToken;
    }
    public void setCashierRequestToken(String cashierRequestToken) {
    this.cashierRequestToken = cashierRequestToken;
    }
    }