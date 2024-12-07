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

public class AriseLogisticsShipmentConfirmPackageConfirmApiRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 确认事件：DELIVERY/DELIVERY_FAIL，妥投/妥投失败 */
                @ApiField("event_code")
            private String eventCode;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query） */
                @ApiField("seller_id")
            private Long sellerId;
        /** 包裹单号 */
                @ApiListField("package_id_list")
            private List<String> packageIdList;
        /** 渠道（可以在这个API中查询：global.seller.relation.query） */
                @ApiField("channel_type")
            private String channelType;
    
        public String getEventCode() {
    return this.eventCode;
    }
    public void setEventCode(String eventCode) {
    this.eventCode = eventCode;
    }
        public Long getSellerId() {
    return this.sellerId;
    }
    public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
    }
        public List<String> getPackageIdList() {
    return this.packageIdList;
    }
    public void setPackageIdList(List<String> packageIdList) {
    this.packageIdList = packageIdList;
    }
        public String getChannelType() {
    return this.channelType;
    }
    public void setChannelType(String channelType) {
    this.channelType = channelType;
    }
    }