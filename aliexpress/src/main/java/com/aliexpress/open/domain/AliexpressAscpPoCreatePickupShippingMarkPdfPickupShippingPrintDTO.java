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

public class AliexpressAscpPoCreatePickupShippingMarkPdfPickupShippingPrintDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 揽收单号 */
                @ApiField("pickup_order_number")
            private String pickupOrderNumber;
        /** 业务租户Id，全托管 场景请填写 5110000, choice2.0(AEG)场景填: 288000 */
                @ApiField("biz_type")
            private Integer bizType;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
                @ApiField("channel_user_id")
            private Long channelUserId;
        /** 全托管支持尺寸: 默认只是全部打印, 不用设置size参数。半托管: 必须设置size参数，1. A4，打印货品明细；2. 100 * 100尺寸, 不包含货品明细。 */
                @ApiField("size")
            private String size;
    
        public String getPickupOrderNumber() {
    return this.pickupOrderNumber;
    }
    public void setPickupOrderNumber(String pickupOrderNumber) {
    this.pickupOrderNumber = pickupOrderNumber;
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
        public String getSize() {
    return this.size;
    }
    public void setSize(String size) {
    this.size = size;
    }
    }