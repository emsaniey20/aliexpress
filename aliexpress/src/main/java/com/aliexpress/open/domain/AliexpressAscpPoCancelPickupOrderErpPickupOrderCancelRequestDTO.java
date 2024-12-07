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

public class AliexpressAscpPoCancelPickupOrderErpPickupOrderCancelRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 揽收单号 */
                @ApiField("pickup_order_number")
            private String pickupOrderNumber;
        /** 是否系统操作 */
                @ApiField("system_operate")
            private Boolean systemOperate;
        /** 行业账套 AER 221000，AEG 288000 aechoice 5110000 */
                @ApiField("biz_type")
            private Integer bizType;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
                @ApiField("channel_user_id")
            private Long channelUserId;
        /** 取消原因 */
                @ApiField("cancel_reason")
            private String cancelReason;
    
        public String getPickupOrderNumber() {
    return this.pickupOrderNumber;
    }
    public void setPickupOrderNumber(String pickupOrderNumber) {
    this.pickupOrderNumber = pickupOrderNumber;
    }
        public Boolean getSystemOperate() {
    return this.systemOperate;
    }
    public void setSystemOperate(Boolean systemOperate) {
    this.systemOperate = systemOperate;
    }
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
        public String getCancelReason() {
    return this.cancelReason;
    }
    public void setCancelReason(String cancelReason) {
    this.cancelReason = cancelReason;
    }
    }