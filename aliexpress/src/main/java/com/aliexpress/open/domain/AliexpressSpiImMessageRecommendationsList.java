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

public class AliexpressSpiImMessageRecommendationsList implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("seller_id")
            private String sellerId;
        /** 1 */
                @ApiField("buyer_id")
            private String buyerId;
        /** 1 */
                @ApiField("message_id")
            private String messageId;
    
        public String getSellerId() {
    return this.sellerId;
    }
    public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
    }
        public String getBuyerId() {
    return this.buyerId;
    }
    public void setBuyerId(String buyerId) {
    this.buyerId = buyerId;
    }
        public String getMessageId() {
    return this.messageId;
    }
    public void setMessageId(String messageId) {
    this.messageId = messageId;
    }
    }