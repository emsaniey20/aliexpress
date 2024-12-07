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

public class AliexpressAscpPoUpdateSelfdeliveryErpLogisticsInfoProcessDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** - */
                @ApiField("biz_type")
            private Integer bizType;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
                @ApiField("channel_user_id")
            private Long channelUserId;
        /** "JIT":jit业务 */
                @ApiField("self_delivery_scene_code")
            private String selfDeliverySceneCode;
        /** 本次自寄的采购单列表 */
                @ApiListField("purchase_order_no_list")
            private List<String> purchaseOrderNoList;
        /** 自寄方式，1:快递，2:卡车，3:其他 */
                @ApiField("delivery_type")
            private Integer deliveryType;
        /** 卡车车牌号，卡车方式必填 */
                @ApiField("appointment_license_plate")
            private String appointmentLicensePlate;
        /** 卡车司机手机号，卡车方式必填 */
                @ApiField("appointment_phone_number")
            private String appointmentPhoneNumber;
        /** 快递公司名称，快递方式必填 */
                @ApiField("logistics_service_provider")
            private String logisticsServiceProvider;
        /** 快递单号列表，快递方式必填 */
                @ApiListField("appointment_express_no_list")
            private List<String> appointmentExpressNoList;
        /** 物流备注 */
                @ApiField("logistics_mark")
            private String logisticsMark;
        /** 卡车派送的预估体积 */
                @ApiField("estimate_goods_volume")
            private Long estimateGoodsVolume;
        /** 自寄单号 */
                @ApiField("self_delivery_no")
            private String selfDeliveryNo;
        /** 异常处理方式, 0代表退回 */
                @ApiField("return_type")
            private Integer returnType;
        /** 异常退货联系人 */
                @ApiField("return_contact_info_dto")
            private AliexpressAscpPoUpdateSelfdeliveryContactInfoDTO returnContactInfoDto;
    
        public Integer getBizType() {
    return this.bizType;
    }
    public void setBizType(Integer bizType) {
    this.bizType = bizType;
    }
        public Long getChannelUserId() {
    return this.channelUserId;
    }
    public void setChannelUserId(Long channelUserId) {
    this.channelUserId = channelUserId;
    }
        public String getSelfDeliverySceneCode() {
    return this.selfDeliverySceneCode;
    }
    public void setSelfDeliverySceneCode(String selfDeliverySceneCode) {
    this.selfDeliverySceneCode = selfDeliverySceneCode;
    }
        public List<String> getPurchaseOrderNoList() {
    return this.purchaseOrderNoList;
    }
    public void setPurchaseOrderNoList(List<String> purchaseOrderNoList) {
    this.purchaseOrderNoList = purchaseOrderNoList;
    }
        public Integer getDeliveryType() {
    return this.deliveryType;
    }
    public void setDeliveryType(Integer deliveryType) {
    this.deliveryType = deliveryType;
    }
        public String getAppointmentLicensePlate() {
    return this.appointmentLicensePlate;
    }
    public void setAppointmentLicensePlate(String appointmentLicensePlate) {
    this.appointmentLicensePlate = appointmentLicensePlate;
    }
        public String getAppointmentPhoneNumber() {
    return this.appointmentPhoneNumber;
    }
    public void setAppointmentPhoneNumber(String appointmentPhoneNumber) {
    this.appointmentPhoneNumber = appointmentPhoneNumber;
    }
        public String getLogisticsServiceProvider() {
    return this.logisticsServiceProvider;
    }
    public void setLogisticsServiceProvider(String logisticsServiceProvider) {
    this.logisticsServiceProvider = logisticsServiceProvider;
    }
        public List<String> getAppointmentExpressNoList() {
    return this.appointmentExpressNoList;
    }
    public void setAppointmentExpressNoList(List<String> appointmentExpressNoList) {
    this.appointmentExpressNoList = appointmentExpressNoList;
    }
        public String getLogisticsMark() {
    return this.logisticsMark;
    }
    public void setLogisticsMark(String logisticsMark) {
    this.logisticsMark = logisticsMark;
    }
        public Long getEstimateGoodsVolume() {
    return this.estimateGoodsVolume;
    }
    public void setEstimateGoodsVolume(Long estimateGoodsVolume) {
    this.estimateGoodsVolume = estimateGoodsVolume;
    }
        public String getSelfDeliveryNo() {
    return this.selfDeliveryNo;
    }
    public void setSelfDeliveryNo(String selfDeliveryNo) {
    this.selfDeliveryNo = selfDeliveryNo;
    }
        public Integer getReturnType() {
    return this.returnType;
    }
    public void setReturnType(Integer returnType) {
    this.returnType = returnType;
    }
        public AliexpressAscpPoUpdateSelfdeliveryContactInfoDTO getReturnContactInfoDto() {
    return this.returnContactInfoDto;
    }
    public void setReturnContactInfoDto(AliexpressAscpPoUpdateSelfdeliveryContactInfoDTO returnContactInfoDto) {
    this.returnContactInfoDto = returnContactInfoDto;
    }
    }