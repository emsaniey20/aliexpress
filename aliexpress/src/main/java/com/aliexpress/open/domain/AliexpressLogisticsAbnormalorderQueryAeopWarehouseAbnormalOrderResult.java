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

public class AliexpressLogisticsAbnormalorderQueryAeopWarehouseAbnormalOrderResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 解决方案_仓编码 */
                @ApiField("scheme_code")
            private String schemeCode;
        /** 交易单号 */
                @ApiField("trade_order_id")
            private Long tradeOrderId;
        /** 不可达保险 */
                @ApiField("unreachable_insured")
            private Boolean unreachableInsured;
        /** 国内快递公司 */
                @ApiField("domestic_logistic_company_name")
            private String domesticLogisticCompanyName;
        /** 异常原因 */
                @ApiField("abnormal_reason")
            private String abnormalReason;
        /** 逆向高货值保险 */
                @ApiField("re_high_value_insure")
            private Boolean reHighValueInsure;
        /** 揽收仓名称 */
                @ApiField("warehouse_name")
            private String warehouseName;
        /** 解决方案编码 */
                @ApiField("solution_code")
            private String solutionCode;
        /** 揽收仓编码 */
                @ApiField("warehouse_code")
            private String warehouseCode;
        /** 高货值保险 */
                @ApiField("high_value_insure")
            private Boolean highValueInsure;
        /** 物流详情链接 */
                @ApiField("logistic_detail_url")
            private String logisticDetailUrl;
        /** 订单状态名称 */
                @ApiField("order_status_name")
            private String orderStatusName;
        /** 支付状态编码 */
                @ApiField("payment_status_code")
            private String paymentStatusCode;
        /** 退回运单号 */
                @ApiField("und_express_mail_no")
            private String undExpressMailNo;
        /** 禁运审核结果 */
                @ApiField("forbidden_audit_result")
            private String forbiddenAuditResult;
        /** 取消状态名称 */
                @ApiField("cancel_status_name")
            private String cancelStatusName;
        /** id */
                @ApiField("id")
            private Long id;
        /** 解决方案名称 */
                @ApiField("solution_name")
            private String solutionName;
        /** 状态变更时间 */
                @ApiField("gmt_status_update")
            private String gmtStatusUpdate;
        /** 异常编码 */
                @ApiField("abnormal_code")
            private String abnormalCode;
        /** 运单号 */
                @ApiField("intl_tracking_no")
            private String intlTrackingNo;
        /** 订单创建时间 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 取消状态编码 */
                @ApiField("cancel_status_code")
            private String cancelStatusCode;
        /** 订单状态编码 */
                @ApiField("order_status_code")
            private String orderStatusCode;
        /** 支付状态名称 */
                @ApiField("payment_status_name")
            private String paymentStatusName;
        /** 国内运单号 */
                @ApiField("domestic_logistic_tracking_no")
            private String domesticLogisticTrackingNo;
        /** mailNo异常获取相关编码 */
                @ApiField("mailno_status_errorcode")
            private String mailnoStatusErrorcode;
        /** mailNo异常获取相关描述 */
                @ApiField("mailno_status_errormsg")
            private String mailnoStatusErrormsg;
        /** 物流单LP号 */
                @ApiField("out_order_code")
            private String outOrderCode;
        /** 异常滞留决策超时时间 */
                @ApiField("over_time")
            private String overTime;
        /** 异常滞留包裹长宽高重 */
                @ApiField("aeop_packge_info")
            private AliexpressLogisticsAbnormalorderQueryAeopPackgeInfo aeopPackgeInfo;
    
        public String getSchemeCode() {
    return this.schemeCode;
    }
    public void setSchemeCode(String schemeCode) {
    this.schemeCode = schemeCode;
    }
        public Long getTradeOrderId() {
    return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId) {
    this.tradeOrderId = tradeOrderId;
    }
        public Boolean getUnreachableInsured() {
    return this.unreachableInsured;
    }
    public void setUnreachableInsured(Boolean unreachableInsured) {
    this.unreachableInsured = unreachableInsured;
    }
        public String getDomesticLogisticCompanyName() {
    return this.domesticLogisticCompanyName;
    }
    public void setDomesticLogisticCompanyName(String domesticLogisticCompanyName) {
    this.domesticLogisticCompanyName = domesticLogisticCompanyName;
    }
        public String getAbnormalReason() {
    return this.abnormalReason;
    }
    public void setAbnormalReason(String abnormalReason) {
    this.abnormalReason = abnormalReason;
    }
        public Boolean getReHighValueInsure() {
    return this.reHighValueInsure;
    }
    public void setReHighValueInsure(Boolean reHighValueInsure) {
    this.reHighValueInsure = reHighValueInsure;
    }
        public String getWarehouseName() {
    return this.warehouseName;
    }
    public void setWarehouseName(String warehouseName) {
    this.warehouseName = warehouseName;
    }
        public String getSolutionCode() {
    return this.solutionCode;
    }
    public void setSolutionCode(String solutionCode) {
    this.solutionCode = solutionCode;
    }
        public String getWarehouseCode() {
    return this.warehouseCode;
    }
    public void setWarehouseCode(String warehouseCode) {
    this.warehouseCode = warehouseCode;
    }
        public Boolean getHighValueInsure() {
    return this.highValueInsure;
    }
    public void setHighValueInsure(Boolean highValueInsure) {
    this.highValueInsure = highValueInsure;
    }
        public String getLogisticDetailUrl() {
    return this.logisticDetailUrl;
    }
    public void setLogisticDetailUrl(String logisticDetailUrl) {
    this.logisticDetailUrl = logisticDetailUrl;
    }
        public String getOrderStatusName() {
    return this.orderStatusName;
    }
    public void setOrderStatusName(String orderStatusName) {
    this.orderStatusName = orderStatusName;
    }
        public String getPaymentStatusCode() {
    return this.paymentStatusCode;
    }
    public void setPaymentStatusCode(String paymentStatusCode) {
    this.paymentStatusCode = paymentStatusCode;
    }
        public String getUndExpressMailNo() {
    return this.undExpressMailNo;
    }
    public void setUndExpressMailNo(String undExpressMailNo) {
    this.undExpressMailNo = undExpressMailNo;
    }
        public String getForbiddenAuditResult() {
    return this.forbiddenAuditResult;
    }
    public void setForbiddenAuditResult(String forbiddenAuditResult) {
    this.forbiddenAuditResult = forbiddenAuditResult;
    }
        public String getCancelStatusName() {
    return this.cancelStatusName;
    }
    public void setCancelStatusName(String cancelStatusName) {
    this.cancelStatusName = cancelStatusName;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public String getSolutionName() {
    return this.solutionName;
    }
    public void setSolutionName(String solutionName) {
    this.solutionName = solutionName;
    }
        public String getGmtStatusUpdate() {
    return this.gmtStatusUpdate;
    }
    public void setGmtStatusUpdate(String gmtStatusUpdate) {
    this.gmtStatusUpdate = gmtStatusUpdate;
    }
        public String getAbnormalCode() {
    return this.abnormalCode;
    }
    public void setAbnormalCode(String abnormalCode) {
    this.abnormalCode = abnormalCode;
    }
        public String getIntlTrackingNo() {
    return this.intlTrackingNo;
    }
    public void setIntlTrackingNo(String intlTrackingNo) {
    this.intlTrackingNo = intlTrackingNo;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getCancelStatusCode() {
    return this.cancelStatusCode;
    }
    public void setCancelStatusCode(String cancelStatusCode) {
    this.cancelStatusCode = cancelStatusCode;
    }
        public String getOrderStatusCode() {
    return this.orderStatusCode;
    }
    public void setOrderStatusCode(String orderStatusCode) {
    this.orderStatusCode = orderStatusCode;
    }
        public String getPaymentStatusName() {
    return this.paymentStatusName;
    }
    public void setPaymentStatusName(String paymentStatusName) {
    this.paymentStatusName = paymentStatusName;
    }
        public String getDomesticLogisticTrackingNo() {
    return this.domesticLogisticTrackingNo;
    }
    public void setDomesticLogisticTrackingNo(String domesticLogisticTrackingNo) {
    this.domesticLogisticTrackingNo = domesticLogisticTrackingNo;
    }
        public String getMailnoStatusErrorcode() {
    return this.mailnoStatusErrorcode;
    }
    public void setMailnoStatusErrorcode(String mailnoStatusErrorcode) {
    this.mailnoStatusErrorcode = mailnoStatusErrorcode;
    }
        public String getMailnoStatusErrormsg() {
    return this.mailnoStatusErrormsg;
    }
    public void setMailnoStatusErrormsg(String mailnoStatusErrormsg) {
    this.mailnoStatusErrormsg = mailnoStatusErrormsg;
    }
        public String getOutOrderCode() {
    return this.outOrderCode;
    }
    public void setOutOrderCode(String outOrderCode) {
    this.outOrderCode = outOrderCode;
    }
        public String getOverTime() {
    return this.overTime;
    }
    public void setOverTime(String overTime) {
    this.overTime = overTime;
    }
        public AliexpressLogisticsAbnormalorderQueryAeopPackgeInfo getAeopPackgeInfo() {
    return this.aeopPackgeInfo;
    }
    public void setAeopPackgeInfo(AliexpressLogisticsAbnormalorderQueryAeopPackgeInfo aeopPackgeInfo) {
    this.aeopPackgeInfo = aeopPackgeInfo;
    }
    }