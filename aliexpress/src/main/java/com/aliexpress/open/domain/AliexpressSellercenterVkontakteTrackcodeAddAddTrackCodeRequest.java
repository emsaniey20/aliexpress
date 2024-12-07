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

public class AliexpressSellercenterVkontakteTrackcodeAddAddTrackCodeRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** vk Order Id */
                @ApiField("vk_order_id")
            private Long vkOrderId;
        /** vk Seller Id */
                @ApiField("vk_seller_id")
            private String vkSellerId;
        /** track code */
                @ApiField("track_code")
            private String trackCode;
    
        public Long getVkOrderId() {
    return this.vkOrderId;
    }
    public void setVkOrderId(Long vkOrderId) {
    this.vkOrderId = vkOrderId;
    }
        public String getVkSellerId() {
    return this.vkSellerId;
    }
    public void setVkSellerId(String vkSellerId) {
    this.vkSellerId = vkSellerId;
    }
        public String getTrackCode() {
    return this.trackCode;
    }
    public void setTrackCode(String trackCode) {
    this.trackCode = trackCode;
    }
    }