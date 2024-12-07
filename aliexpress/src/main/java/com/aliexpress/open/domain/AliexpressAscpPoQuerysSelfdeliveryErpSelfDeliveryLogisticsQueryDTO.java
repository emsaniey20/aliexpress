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

public class AliexpressAscpPoQuerysSelfdeliveryErpSelfDeliveryLogisticsQueryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 自寄单号 */
                @ApiField("self_delivery_no")
            private String selfDeliveryNo;
        /** 行业账套 aechoice全托管:5110000，AEG:288000  */
                @ApiField("biz_type")
            private Integer bizType;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
                @ApiField("channel_user_id")
            private Long channelUserId;
    
        public String getSelfDeliveryNo() {
    return this.selfDeliveryNo;
    }
    public void setSelfDeliveryNo(String selfDeliveryNo) {
    this.selfDeliveryNo = selfDeliveryNo;
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
    }