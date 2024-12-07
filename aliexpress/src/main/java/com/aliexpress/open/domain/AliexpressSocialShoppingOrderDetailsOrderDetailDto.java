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

public class AliexpressSocialShoppingOrderDetailsOrderDetailDto implements Serializable {
    private static final long serialVersionUID = 1L;
        /** tracking data */
                @ApiListField("tracking_infos")
            private List<AliexpressSocialShoppingOrderDetailsPackageInfo> trackingInfos;
        /** - */
                @ApiField("can_cancel")
            private Boolean canCancel;
        /** - */
                @ApiField("can_confirm_received")
            private Boolean canConfirmReceived;
        /** - */
                @ApiField("can_evaluate")
            private Boolean canEvaluate;
        /** - */
                @ApiField("can_extend")
            private Boolean canExtend;
        /** - */
                @ApiField("can_pay")
            private Boolean canPay;
        /** - */
                @ApiField("can_resume")
            private Boolean canResume;
        /** - */
                @ApiField("can_tracking")
            private Boolean canTracking;
        /** - */
                @ApiField("creation_time")
            private String creationTime;
        /** - */
                @ApiField("frozen_status")
            private String frozenStatus;
        /** - */
                @ApiField("fund_status")
            private String fundStatus;
        /** - */
                @ApiField("issue_status")
            private String issueStatus;
        /** - */
                @ApiField("logistics_status")
            private String logisticsStatus;
        /** - */
                @ApiField("order_id")
            private Long orderId;
        /** - */
                @ApiField("over_time_milliseconds")
            private Long overTimeMilliseconds;
        /** - */
                @ApiListField("products")
            private List<AliexpressSocialShoppingOrderDetailsOrderProductDto> products;
        /** - */
                @ApiField("reason_for_order_termination")
            private String reasonForOrderTermination;
        /** - */
                @ApiField("show_status")
            private String showStatus;
        /** - */
                @ApiField("status")
            private String status;
        /** - */
                @ApiField("cashier_token")
            private String cashierToken;
    
        public List<AliexpressSocialShoppingOrderDetailsPackageInfo> getTrackingInfos() {
    return this.trackingInfos;
    }
    public void setTrackingInfos(List<AliexpressSocialShoppingOrderDetailsPackageInfo> trackingInfos) {
    this.trackingInfos = trackingInfos;
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
        public String getCreationTime() {
    return this.creationTime;
    }
    public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
    }
        public String getFrozenStatus() {
    return this.frozenStatus;
    }
    public void setFrozenStatus(String frozenStatus) {
    this.frozenStatus = frozenStatus;
    }
        public String getFundStatus() {
    return this.fundStatus;
    }
    public void setFundStatus(String fundStatus) {
    this.fundStatus = fundStatus;
    }
        public String getIssueStatus() {
    return this.issueStatus;
    }
    public void setIssueStatus(String issueStatus) {
    this.issueStatus = issueStatus;
    }
        public String getLogisticsStatus() {
    return this.logisticsStatus;
    }
    public void setLogisticsStatus(String logisticsStatus) {
    this.logisticsStatus = logisticsStatus;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public Long getOverTimeMilliseconds() {
    return this.overTimeMilliseconds;
    }
    public void setOverTimeMilliseconds(Long overTimeMilliseconds) {
    this.overTimeMilliseconds = overTimeMilliseconds;
    }
        public List<AliexpressSocialShoppingOrderDetailsOrderProductDto> getProducts() {
    return this.products;
    }
    public void setProducts(List<AliexpressSocialShoppingOrderDetailsOrderProductDto> products) {
    this.products = products;
    }
        public String getReasonForOrderTermination() {
    return this.reasonForOrderTermination;
    }
    public void setReasonForOrderTermination(String reasonForOrderTermination) {
    this.reasonForOrderTermination = reasonForOrderTermination;
    }
        public String getShowStatus() {
    return this.showStatus;
    }
    public void setShowStatus(String showStatus) {
    this.showStatus = showStatus;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public String getCashierToken() {
    return this.cashierToken;
    }
    public void setCashierToken(String cashierToken) {
    this.cashierToken = cashierToken;
    }
    }