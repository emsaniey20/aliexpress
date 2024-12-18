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

public class AliexpressAscpPoCreatePickupOrderPickupOrderCreateRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 单据类型 1:入库单 */
                @ApiField("order_type")
            private Integer orderType;
        /** 预计揽收时间 yyyy-MM-dd  */
                @ApiField("estimated_pickup_date")
            private String estimatedPickupDate;
        /** 车型 2: 额定载重2T，核载体积15方，长宽高4.2*1.9*1.9  3: 额定载重12T，核载体积45方，长宽高7.6*2.4*2.7  4: 额定载重15T，核载体积55方，长宽高9.6*2.4*2.7  7: 其它 */
                @ApiField("car_type")
            private Integer carType;
        /** 业务租户Id，全托管 场景请填写 5110000, choice2.0(AEG)场景填: 288000 */
                @ApiField("biz_type")
            private Integer bizType;
        /** 预估重量 kg */
                @ApiField("estimated_weight")
            private String estimatedWeight;
        /** 物流方式 1:零担  2:整车  3:其它 */
                @ApiField("shipping_method")
            private Integer shippingMethod;
        /** 预估箱数 */
                @ApiField("estimated_box_number")
            private Integer estimatedBoxNumber;
        /** 联系人 */
                @ApiField("contact_info_dto")
            private AliexpressAscpPoCreatePickupOrderContactInfoDTO contactInfoDto;
        /** 预估体积 m³ */
                @ApiField("estimated_volume")
            private String estimatedVolume;
        /** 采购单号,上限200 */
                @ApiListField("order_no_list")
            private List<String> orderNoList;
        /** 物品类型 1:衣服 2:母婴玩具(非食品)  3:运动健康  4:3C数码  5:汽车用品  6:其他 */
                @ApiField("goods_type")
            private Integer goodsType;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
                @ApiField("channel_user_id")
            private Long channelUserId;
        /** 异常处理方式, 0代表退回 */
                @ApiField("return_type")
            private Integer returnType;
        /** 异常退货联系人 */
                @ApiField("return_contact_info_dto")
            private AliexpressAscpPoCreatePickupOrderContactInfoDTO returnContactInfoDto;
    
        public Integer getOrderType() {
    return this.orderType;
    }
    public void setOrderType(Integer orderType) {
    this.orderType = orderType;
    }
        public String getEstimatedPickupDate() {
    return this.estimatedPickupDate;
    }
    public void setEstimatedPickupDate(String estimatedPickupDate) {
    this.estimatedPickupDate = estimatedPickupDate;
    }
        public Integer getCarType() {
    return this.carType;
    }
    public void setCarType(Integer carType) {
    this.carType = carType;
    }
        public Integer getBizType() {
    return this.bizType;
    }
    public void setBizType(Integer bizType) {
    this.bizType = bizType;
    }
        public String getEstimatedWeight() {
    return this.estimatedWeight;
    }
    public void setEstimatedWeight(String estimatedWeight) {
    this.estimatedWeight = estimatedWeight;
    }
        public Integer getShippingMethod() {
    return this.shippingMethod;
    }
    public void setShippingMethod(Integer shippingMethod) {
    this.shippingMethod = shippingMethod;
    }
        public Integer getEstimatedBoxNumber() {
    return this.estimatedBoxNumber;
    }
    public void setEstimatedBoxNumber(Integer estimatedBoxNumber) {
    this.estimatedBoxNumber = estimatedBoxNumber;
    }
        public AliexpressAscpPoCreatePickupOrderContactInfoDTO getContactInfoDto() {
    return this.contactInfoDto;
    }
    public void setContactInfoDto(AliexpressAscpPoCreatePickupOrderContactInfoDTO contactInfoDto) {
    this.contactInfoDto = contactInfoDto;
    }
        public String getEstimatedVolume() {
    return this.estimatedVolume;
    }
    public void setEstimatedVolume(String estimatedVolume) {
    this.estimatedVolume = estimatedVolume;
    }
        public List<String> getOrderNoList() {
    return this.orderNoList;
    }
    public void setOrderNoList(List<String> orderNoList) {
    this.orderNoList = orderNoList;
    }
        public Integer getGoodsType() {
    return this.goodsType;
    }
    public void setGoodsType(Integer goodsType) {
    this.goodsType = goodsType;
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
        public AliexpressAscpPoCreatePickupOrderContactInfoDTO getReturnContactInfoDto() {
    return this.returnContactInfoDto;
    }
    public void setReturnContactInfoDto(AliexpressAscpPoCreatePickupOrderContactInfoDTO returnContactInfoDto) {
    this.returnContactInfoDto = returnContactInfoDto;
    }
    }