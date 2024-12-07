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

public class GlobalProductsListCspProductSearchApiSingleResultDTO$SaleChannel implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 渠道商品ID */
                @ApiField("channel_item_id")
            private String channelItemId;
        /** 渠道名称 */
                @ApiField("channel_name")
            private String channelName;
        /** 渠道值 */
                @ApiField("value")
            private String value;
        /** 渠道铺货状态. :  ASSORTMENT_FALSE(0), ASSORTMENT_DRAFT(4), ASSORTMENT_ONLINE(1), ASSORTMENT_OFFLINE(2), ASSORTMENT_ING(3) */
                @ApiField("publish_status")
            private String publishStatus;
    
        public String getChannelItemId() {
    return this.channelItemId;
    }
    public void setChannelItemId(String channelItemId) {
    this.channelItemId = channelItemId;
    }
        public String getChannelName() {
    return this.channelName;
    }
    public void setChannelName(String channelName) {
    this.channelName = channelName;
    }
        public String getValue() {
    return this.value;
    }
    public void setValue(String value) {
    this.value = value;
    }
        public String getPublishStatus() {
    return this.publishStatus;
    }
    public void setPublishStatus(String publishStatus) {
    this.publishStatus = publishStatus;
    }
    }