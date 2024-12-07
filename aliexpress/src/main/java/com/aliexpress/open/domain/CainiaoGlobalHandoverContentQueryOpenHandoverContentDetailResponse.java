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

public class CainiaoGlobalHandoverContentQueryOpenHandoverContentDetailResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** bigbag：大包约揽  batch：批次约揽 */
                @ApiField("appointment_type")
            private String appointmentType;
        /** bigbag：大包约揽  batch：批次约揽 */
                @ApiField("appointment_type_name")
            private String appointmentTypeName;
        /** DOOR_PICKUP:上门揽收 SELF_POST:自寄 SELF_SEND：自送 */
                @ApiField("pickup_type")
            private String pickupType;
        /** DOOR_PICKUP:上门揽收 SELF_POST:自寄 SELF_SEND：自送 */
                @ApiField("pickup_type_name")
            private String pickupTypeName;
        /** master：主大包，slave：子大包(批次揽收才有) */
                @ApiField("bigbag_type")
            private String bigbagType;
        /** 批次约揽下的子大包列表 */
                @ApiListField("slave_bigbag_list")
            private List<CainiaoGlobalHandoverContentQueryOpenSlaveBagDTO> slaveBigbagList;
        /** 交接物物流订单编号 */
                @ApiField("order_code")
            private String orderCode;
        /** 交接物运单号 */
                @ApiField("tracking_number")
            private String trackingNumber;
        /** 交接物状态 */
                @ApiField("status")
            private String status;
        /** 大包关联的小包列表 */
                @ApiListField("parcel_order_list")
            private List<CainiaoGlobalHandoverContentQueryOpenParcelOrderDTO> parcelOrderList;
        /** 预估重量 */
                @ApiField("estimate_weight")
            private String estimateWeight;
        /** 实际重量 */
                @ApiField("actual_weight")
            private String actualWeight;
        /** 重量单位 */
                @ApiField("weight_unit")
            private String weightUnit;
        /** 预估费用 */
                @ApiField("estimate_fee")
            private String estimateFee;
        /** 实际费用 */
                @ApiField("actual_fee")
            private String actualFee;
        /** 费用币种 */
                @ApiField("fee_currency")
            private String feeCurrency;
        /** 费用单位 */
                @ApiField("fee_unit")
            private String feeUnit;
        /** 交接物状态 */
                @ApiField("status_name")
            private String statusName;
        /** 交接物关联的交接单状态code */
                @ApiField("handover_order_status")
            private String handoverOrderStatus;
        /** 交接物关联的交接单状态名称 */
                @ApiField("handover_order_status_name")
            private String handoverOrderStatusName;
    
        public String getAppointmentType() {
    return this.appointmentType;
    }
    public void setAppointmentType(String appointmentType) {
    this.appointmentType = appointmentType;
    }
        public String getAppointmentTypeName() {
    return this.appointmentTypeName;
    }
    public void setAppointmentTypeName(String appointmentTypeName) {
    this.appointmentTypeName = appointmentTypeName;
    }
        public String getPickupType() {
    return this.pickupType;
    }
    public void setPickupType(String pickupType) {
    this.pickupType = pickupType;
    }
        public String getPickupTypeName() {
    return this.pickupTypeName;
    }
    public void setPickupTypeName(String pickupTypeName) {
    this.pickupTypeName = pickupTypeName;
    }
        public String getBigbagType() {
    return this.bigbagType;
    }
    public void setBigbagType(String bigbagType) {
    this.bigbagType = bigbagType;
    }
        public List<CainiaoGlobalHandoverContentQueryOpenSlaveBagDTO> getSlaveBigbagList() {
    return this.slaveBigbagList;
    }
    public void setSlaveBigbagList(List<CainiaoGlobalHandoverContentQueryOpenSlaveBagDTO> slaveBigbagList) {
    this.slaveBigbagList = slaveBigbagList;
    }
        public String getOrderCode() {
    return this.orderCode;
    }
    public void setOrderCode(String orderCode) {
    this.orderCode = orderCode;
    }
        public String getTrackingNumber() {
    return this.trackingNumber;
    }
    public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public List<CainiaoGlobalHandoverContentQueryOpenParcelOrderDTO> getParcelOrderList() {
    return this.parcelOrderList;
    }
    public void setParcelOrderList(List<CainiaoGlobalHandoverContentQueryOpenParcelOrderDTO> parcelOrderList) {
    this.parcelOrderList = parcelOrderList;
    }
        public String getEstimateWeight() {
    return this.estimateWeight;
    }
    public void setEstimateWeight(String estimateWeight) {
    this.estimateWeight = estimateWeight;
    }
        public String getActualWeight() {
    return this.actualWeight;
    }
    public void setActualWeight(String actualWeight) {
    this.actualWeight = actualWeight;
    }
        public String getWeightUnit() {
    return this.weightUnit;
    }
    public void setWeightUnit(String weightUnit) {
    this.weightUnit = weightUnit;
    }
        public String getEstimateFee() {
    return this.estimateFee;
    }
    public void setEstimateFee(String estimateFee) {
    this.estimateFee = estimateFee;
    }
        public String getActualFee() {
    return this.actualFee;
    }
    public void setActualFee(String actualFee) {
    this.actualFee = actualFee;
    }
        public String getFeeCurrency() {
    return this.feeCurrency;
    }
    public void setFeeCurrency(String feeCurrency) {
    this.feeCurrency = feeCurrency;
    }
        public String getFeeUnit() {
    return this.feeUnit;
    }
    public void setFeeUnit(String feeUnit) {
    this.feeUnit = feeUnit;
    }
        public String getStatusName() {
    return this.statusName;
    }
    public void setStatusName(String statusName) {
    this.statusName = statusName;
    }
        public String getHandoverOrderStatus() {
    return this.handoverOrderStatus;
    }
    public void setHandoverOrderStatus(String handoverOrderStatus) {
    this.handoverOrderStatus = handoverOrderStatus;
    }
        public String getHandoverOrderStatusName() {
    return this.handoverOrderStatusName;
    }
    public void setHandoverOrderStatusName(String handoverOrderStatusName) {
    this.handoverOrderStatusName = handoverOrderStatusName;
    }
    }