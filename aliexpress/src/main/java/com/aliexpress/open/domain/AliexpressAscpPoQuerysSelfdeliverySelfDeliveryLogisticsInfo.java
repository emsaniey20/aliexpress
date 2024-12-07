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

public class AliexpressAscpPoQuerysSelfdeliverySelfDeliveryLogisticsInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 自寄单号 */
                @ApiField("self_delivery_no")
            private String selfDeliveryNo;
        /** 修改时间 */
                @ApiField("gmt_modified")
            private Long gmtModified;
        /** 关联采购单号 */
                @ApiListField("related_pos")
            private List<String> relatedPos;
        /** 自寄方式描述 */
                @ApiField("delivery_type_desc")
            private String deliveryTypeDesc;
        /** 自寄方式 */
                @ApiField("delivery_type")
            private Integer deliveryType;
        /** 物流服务商 */
                @ApiField("logistics_service_provider")
            private String logisticsServiceProvider;
        /** 卡车车牌号 */
                @ApiField("appointment_license_plate")
            private String appointmentLicensePlate;
        /** 自寄单创建时间 */
                @ApiField("gmt_create")
            private Long gmtCreate;
        /** 快递单号 */
                @ApiListField("appointment_express_no_list")
            private List<String> appointmentExpressNoList;
        /** 关联的lbx */
                @ApiListField("related_lbxs")
            private List<String> relatedLbxs;
        /** 司机手机号 */
                @ApiField("appointment_phone_number")
            private String appointmentPhoneNumber;
    
        public String getSelfDeliveryNo() {
    return this.selfDeliveryNo;
    }
    public void setSelfDeliveryNo(String selfDeliveryNo) {
    this.selfDeliveryNo = selfDeliveryNo;
    }
        public Long getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(Long gmtModified) {
    this.gmtModified = gmtModified;
    }
        public List<String> getRelatedPos() {
    return this.relatedPos;
    }
    public void setRelatedPos(List<String> relatedPos) {
    this.relatedPos = relatedPos;
    }
        public String getDeliveryTypeDesc() {
    return this.deliveryTypeDesc;
    }
    public void setDeliveryTypeDesc(String deliveryTypeDesc) {
    this.deliveryTypeDesc = deliveryTypeDesc;
    }
        public Integer getDeliveryType() {
    return this.deliveryType;
    }
    public void setDeliveryType(Integer deliveryType) {
    this.deliveryType = deliveryType;
    }
        public String getLogisticsServiceProvider() {
    return this.logisticsServiceProvider;
    }
    public void setLogisticsServiceProvider(String logisticsServiceProvider) {
    this.logisticsServiceProvider = logisticsServiceProvider;
    }
        public String getAppointmentLicensePlate() {
    return this.appointmentLicensePlate;
    }
    public void setAppointmentLicensePlate(String appointmentLicensePlate) {
    this.appointmentLicensePlate = appointmentLicensePlate;
    }
        public Long getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(Long gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public List<String> getAppointmentExpressNoList() {
    return this.appointmentExpressNoList;
    }
    public void setAppointmentExpressNoList(List<String> appointmentExpressNoList) {
    this.appointmentExpressNoList = appointmentExpressNoList;
    }
        public List<String> getRelatedLbxs() {
    return this.relatedLbxs;
    }
    public void setRelatedLbxs(List<String> relatedLbxs) {
    this.relatedLbxs = relatedLbxs;
    }
        public String getAppointmentPhoneNumber() {
    return this.appointmentPhoneNumber;
    }
    public void setAppointmentPhoneNumber(String appointmentPhoneNumber) {
    this.appointmentPhoneNumber = appointmentPhoneNumber;
    }
    }