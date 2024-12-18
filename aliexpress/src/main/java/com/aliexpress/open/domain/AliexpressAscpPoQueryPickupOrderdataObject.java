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

public class AliexpressAscpPoQueryPickupOrderdataObject implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 预计揽收送达日期 yyyy-MM-dd（不带时间） */
                @ApiField("pre_arrive_time")
            private String preArriveTime;
        /** 揽收失败原因  */
                @ApiField("pickup_failed_reason")
            private String pickupFailedReason;
        /** 预估体积 m³ （不返回小数，不推荐使用） */
                @ApiField("estimated_volume")
            private Integer estimatedVolume;
        /** 实际箱数 箱 */
                @ApiField("actual_box_number")
            private Integer actualBoxNumber;
        /** 实际揽收日期 yyyy-MM-dd（不带时间） */
                @ApiField("actual_pickup_time")
            private String actualPickupTime;
        /** 实际送达日期 yyyy-MM-dd（不带时间） */
                @ApiField("actual_received_time")
            private String actualReceivedTime;
        /** 实际重量 kg （不返回小数，不推荐使用） */
                @ApiField("actual_weight")
            private Integer actualWeight;
        /** 车型 2: 额定载重2T，核载体积15方，长宽高4.2*1.9*1.9 3: 额定载重12T，核载体积45方，长宽高7.6*2.4*2.7 4: 额定载重15T，核载体积55方，长宽高9.6*2.4*2.7 7: 其它 */
                @ApiField("car_type")
            private Integer carType;
        /** 揽收车牌号 */
                @ApiField("car_no")
            private String carNo;
        /** 实际体积 m³（不返回小数，不推荐使用） */
                @ApiField("actual_volume")
            private Integer actualVolume;
        /** 联系人地址 */
                @ApiField("contact_address")
            private String contactAddress;
        /** 物流单号列表 */
                @ApiListField("whc_order_no_list")
            private List<String> whcOrderNoList;
        /** 取消原因 */
                @ApiField("cancel_reason")
            private String cancelReason;
        /** 实际费用CNY 元（不返回小数，不推荐使用） */
                @ApiField("actual_fee")
            private Integer actualFee;
        /** 预估费用CNY 元（不返回小数，不推荐使用） */
                @ApiField("estimated_fee")
            private Integer estimatedFee;
        /** 预估揽收时间yyyy-MM-dd */
                @ApiField("estimated_pickup_time")
            private String estimatedPickupTime;
        /** 揽收单状态  待揽收  待下发  已下发  已派车  已揽收  已送达  已取消  揽收失败 */
                @ApiField("status_desc")
            private String statusDesc;
        /** 联系人姓名 */
                @ApiField("contact_name")
            private String contactName;
        /** 物流方式 1:零担 2:整车 3:其它 */
                @ApiField("shipping_method")
            private Integer shippingMethod;
        /** 联系人区域(省市区)  */
                @ApiField("contact_area")
            private String contactArea;
        /** 1:衣服 2:母婴玩具(非食品)  3:运动健康  4:3C数码  5:汽车用品  6:其他 */
                @ApiField("goods_type")
            private Integer goodsType;
        /** 揽收单号 */
                @ApiField("pickup_order_number")
            private String pickupOrderNumber;
        /** 预估重量 kg（不返回小数，不推荐使用） */
                @ApiField("estimated_weight")
            private Integer estimatedWeight;
        /** 揽收司机姓名 */
                @ApiField("driver_name")
            private String driverName;
        /** 揽收司机电话 */
                @ApiField("driver_phone")
            private String driverPhone;
        /** 预估箱数 */
                @ApiField("estimated_box_number")
            private Integer estimatedBoxNumber;
        /** 联系人电话 */
                @ApiField("contact_phone")
            private String contactPhone;
        /** 入库单列表 */
                @ApiListField("order_no_list")
            private List<String> orderNoList;
        /** 仓编码 */
                @ApiField("store_code")
            private String storeCode;
        /** 预估体积 m³（返回小数，推荐使用） */
                @ApiField("estimated_volume_dec")
            private String estimatedVolumeDec;
        /** 实际体积 m³（返回小数，推荐使用） */
                @ApiField("actual_volume_dec")
            private String actualVolumeDec;
        /** 预估重量 kg（返回小数，推荐使用） */
                @ApiField("estimated_weight_dec")
            private String estimatedWeightDec;
        /** 实际重量 kg（返回小数，推荐使用） */
                @ApiField("actual_weight_dec")
            private String actualWeightDec;
        /** 预估费用CNY 元（返回小数，推荐使用） */
                @ApiField("estimated_fee_dec")
            private String estimatedFeeDec;
        /** 实际费用CNY 元（返回小数，推荐使用） */
                @ApiField("actual_fee_dec")
            private String actualFeeDec;
        /** 预计揽收送达时间 yyyy-MM-dd HH:mm:ss */
                @ApiField("pre_arrive_time_hms")
            private String preArriveTimeHms;
        /** 实际揽收时间 yyyy-MM-dd HH:mm:ss */
                @ApiField("actual_pickup_time_hms")
            private String actualPickupTimeHms;
        /** 实际送达时间 yyyy-MM-dd HH:mm:ss */
                @ApiField("actual_received_time_hms")
            private String actualReceivedTimeHms;
    
        public String getPreArriveTime() {
    return this.preArriveTime;
    }
    public void setPreArriveTime(String preArriveTime) {
    this.preArriveTime = preArriveTime;
    }
        public String getPickupFailedReason() {
    return this.pickupFailedReason;
    }
    public void setPickupFailedReason(String pickupFailedReason) {
    this.pickupFailedReason = pickupFailedReason;
    }
        public Integer getEstimatedVolume() {
    return this.estimatedVolume;
    }
    public void setEstimatedVolume(Integer estimatedVolume) {
    this.estimatedVolume = estimatedVolume;
    }
        public Integer getActualBoxNumber() {
    return this.actualBoxNumber;
    }
    public void setActualBoxNumber(Integer actualBoxNumber) {
    this.actualBoxNumber = actualBoxNumber;
    }
        public String getActualPickupTime() {
    return this.actualPickupTime;
    }
    public void setActualPickupTime(String actualPickupTime) {
    this.actualPickupTime = actualPickupTime;
    }
        public String getActualReceivedTime() {
    return this.actualReceivedTime;
    }
    public void setActualReceivedTime(String actualReceivedTime) {
    this.actualReceivedTime = actualReceivedTime;
    }
        public Integer getActualWeight() {
    return this.actualWeight;
    }
    public void setActualWeight(Integer actualWeight) {
    this.actualWeight = actualWeight;
    }
        public Integer getCarType() {
    return this.carType;
    }
    public void setCarType(Integer carType) {
    this.carType = carType;
    }
        public String getCarNo() {
    return this.carNo;
    }
    public void setCarNo(String carNo) {
    this.carNo = carNo;
    }
        public Integer getActualVolume() {
    return this.actualVolume;
    }
    public void setActualVolume(Integer actualVolume) {
    this.actualVolume = actualVolume;
    }
        public String getContactAddress() {
    return this.contactAddress;
    }
    public void setContactAddress(String contactAddress) {
    this.contactAddress = contactAddress;
    }
        public List<String> getWhcOrderNoList() {
    return this.whcOrderNoList;
    }
    public void setWhcOrderNoList(List<String> whcOrderNoList) {
    this.whcOrderNoList = whcOrderNoList;
    }
        public String getCancelReason() {
    return this.cancelReason;
    }
    public void setCancelReason(String cancelReason) {
    this.cancelReason = cancelReason;
    }
        public Integer getActualFee() {
    return this.actualFee;
    }
    public void setActualFee(Integer actualFee) {
    this.actualFee = actualFee;
    }
        public Integer getEstimatedFee() {
    return this.estimatedFee;
    }
    public void setEstimatedFee(Integer estimatedFee) {
    this.estimatedFee = estimatedFee;
    }
        public String getEstimatedPickupTime() {
    return this.estimatedPickupTime;
    }
    public void setEstimatedPickupTime(String estimatedPickupTime) {
    this.estimatedPickupTime = estimatedPickupTime;
    }
        public String getStatusDesc() {
    return this.statusDesc;
    }
    public void setStatusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
    }
        public String getContactName() {
    return this.contactName;
    }
    public void setContactName(String contactName) {
    this.contactName = contactName;
    }
        public Integer getShippingMethod() {
    return this.shippingMethod;
    }
    public void setShippingMethod(Integer shippingMethod) {
    this.shippingMethod = shippingMethod;
    }
        public String getContactArea() {
    return this.contactArea;
    }
    public void setContactArea(String contactArea) {
    this.contactArea = contactArea;
    }
        public Integer getGoodsType() {
    return this.goodsType;
    }
    public void setGoodsType(Integer goodsType) {
    this.goodsType = goodsType;
    }
        public String getPickupOrderNumber() {
    return this.pickupOrderNumber;
    }
    public void setPickupOrderNumber(String pickupOrderNumber) {
    this.pickupOrderNumber = pickupOrderNumber;
    }
        public Integer getEstimatedWeight() {
    return this.estimatedWeight;
    }
    public void setEstimatedWeight(Integer estimatedWeight) {
    this.estimatedWeight = estimatedWeight;
    }
        public String getDriverName() {
    return this.driverName;
    }
    public void setDriverName(String driverName) {
    this.driverName = driverName;
    }
        public String getDriverPhone() {
    return this.driverPhone;
    }
    public void setDriverPhone(String driverPhone) {
    this.driverPhone = driverPhone;
    }
        public Integer getEstimatedBoxNumber() {
    return this.estimatedBoxNumber;
    }
    public void setEstimatedBoxNumber(Integer estimatedBoxNumber) {
    this.estimatedBoxNumber = estimatedBoxNumber;
    }
        public String getContactPhone() {
    return this.contactPhone;
    }
    public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
    }
        public List<String> getOrderNoList() {
    return this.orderNoList;
    }
    public void setOrderNoList(List<String> orderNoList) {
    this.orderNoList = orderNoList;
    }
        public String getStoreCode() {
    return this.storeCode;
    }
    public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
    }
        public String getEstimatedVolumeDec() {
    return this.estimatedVolumeDec;
    }
    public void setEstimatedVolumeDec(String estimatedVolumeDec) {
    this.estimatedVolumeDec = estimatedVolumeDec;
    }
        public String getActualVolumeDec() {
    return this.actualVolumeDec;
    }
    public void setActualVolumeDec(String actualVolumeDec) {
    this.actualVolumeDec = actualVolumeDec;
    }
        public String getEstimatedWeightDec() {
    return this.estimatedWeightDec;
    }
    public void setEstimatedWeightDec(String estimatedWeightDec) {
    this.estimatedWeightDec = estimatedWeightDec;
    }
        public String getActualWeightDec() {
    return this.actualWeightDec;
    }
    public void setActualWeightDec(String actualWeightDec) {
    this.actualWeightDec = actualWeightDec;
    }
        public String getEstimatedFeeDec() {
    return this.estimatedFeeDec;
    }
    public void setEstimatedFeeDec(String estimatedFeeDec) {
    this.estimatedFeeDec = estimatedFeeDec;
    }
        public String getActualFeeDec() {
    return this.actualFeeDec;
    }
    public void setActualFeeDec(String actualFeeDec) {
    this.actualFeeDec = actualFeeDec;
    }
        public String getPreArriveTimeHms() {
    return this.preArriveTimeHms;
    }
    public void setPreArriveTimeHms(String preArriveTimeHms) {
    this.preArriveTimeHms = preArriveTimeHms;
    }
        public String getActualPickupTimeHms() {
    return this.actualPickupTimeHms;
    }
    public void setActualPickupTimeHms(String actualPickupTimeHms) {
    this.actualPickupTimeHms = actualPickupTimeHms;
    }
        public String getActualReceivedTimeHms() {
    return this.actualReceivedTimeHms;
    }
    public void setActualReceivedTimeHms(String actualReceivedTimeHms) {
    this.actualReceivedTimeHms = actualReceivedTimeHms;
    }
    }