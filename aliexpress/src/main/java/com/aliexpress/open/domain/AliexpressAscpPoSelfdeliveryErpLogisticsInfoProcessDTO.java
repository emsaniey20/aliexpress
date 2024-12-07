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

public class AliexpressAscpPoSelfdeliveryErpLogisticsInfoProcessDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 行业账套 aechoice全托管:5110000，AEG:288000  */
                @ApiField("biz_type")
            private Integer bizType;
        /** 1 : 快递, 2: 卡车派送, 3: 其他 */
                @ApiField("delivery_type")
            private Integer deliveryType;
        /** 快递方式必填, 物流服务商 */
                @ApiField("logistics_service_provider")
            private String logisticsServiceProvider;
        /** 卡车派送必填，自送车牌号 */
                @ApiField("appointment_license_plate")
            private String appointmentLicensePlate;
        /** 快递方式必填，快递单号 */
                @ApiListField("appointment_express_no_list")
            private List<String> appointmentExpressNoList;
        /** 物流备注 */
                @ApiField("logistics_mark")
            private String logisticsMark;
        /** 司机手机号 */
                @ApiField("appointment_phone_number")
            private String appointmentPhoneNumber;
        /** 本次自送的采购单号列表,数量限制[1-99] */
                @ApiListField("purchase_order_no_list")
            private List<String> purchaseOrderNoList;
        /** 预估体积，单位：立方米 */
                @ApiField("estimate_goods_volume")
            private Long estimateGoodsVolume;
        /** "JIT"：JIT自送 */
                @ApiField("self_delivery_scene_code")
            private String selfDeliverySceneCode;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
                @ApiField("channel_user_id")
            private Long channelUserId;
        /** 异常处理方式, 0代表退回 */
                @ApiField("return_type")
            private Integer returnType;
        /** 异常退货联系人 */
                @ApiField("return_contact_info_dto")
            private AliexpressAscpPoSelfdeliveryContactInfoDTO returnContactInfoDto;
    
        public Integer getBizType() {
    return this.bizType;
    }
    public void setBizType(Integer bizType) {
    this.bizType = bizType;
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
        public String getAppointmentPhoneNumber() {
    return this.appointmentPhoneNumber;
    }
    public void setAppointmentPhoneNumber(String appointmentPhoneNumber) {
    this.appointmentPhoneNumber = appointmentPhoneNumber;
    }
        public List<String> getPurchaseOrderNoList() {
    return this.purchaseOrderNoList;
    }
    public void setPurchaseOrderNoList(List<String> purchaseOrderNoList) {
    this.purchaseOrderNoList = purchaseOrderNoList;
    }
        public Long getEstimateGoodsVolume() {
    return this.estimateGoodsVolume;
    }
    public void setEstimateGoodsVolume(Long estimateGoodsVolume) {
    this.estimateGoodsVolume = estimateGoodsVolume;
    }
        public String getSelfDeliverySceneCode() {
    return this.selfDeliverySceneCode;
    }
    public void setSelfDeliverySceneCode(String selfDeliverySceneCode) {
    this.selfDeliverySceneCode = selfDeliverySceneCode;
    }
        public Long getChannelUserId() {
    return this.channelUserId;
    }
    public void setChannelUserId(Long channelUserId) {
    this.channelUserId = channelUserId;
    }
        public Integer getReturnType() {
    return this.returnType;
    }
    public void setReturnType(Integer returnType) {
    this.returnType = returnType;
    }
        public AliexpressAscpPoSelfdeliveryContactInfoDTO getReturnContactInfoDto() {
    return this.returnContactInfoDto;
    }
    public void setReturnContactInfoDto(AliexpressAscpPoSelfdeliveryContactInfoDTO returnContactInfoDto) {
    this.returnContactInfoDto = returnContactInfoDto;
    }
    }