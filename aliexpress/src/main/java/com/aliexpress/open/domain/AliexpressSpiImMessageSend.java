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

public class AliexpressSpiImMessageSend implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("seller_id")
            private Long sellerId;
        /** 1 */
                @ApiField("buyer_id")
            private Long buyerId;
        /** 1 */
                @ApiField("message_type")
            private String messageType;
        /** 1 */
                @ApiField("content")
            private String content;
    
        public Long getSellerId() {
    return this.sellerId;
    }
    public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
    }
        public Long getBuyerId() {
    return this.buyerId;
    }
    public void setBuyerId(Long buyerId) {
    this.buyerId = buyerId;
    }
        public String getMessageType() {
    return this.messageType;
    }
    public void setMessageType(String messageType) {
    this.messageType = messageType;
    }
        public String getContent() {
    return this.content;
    }
    public void setContent(String content) {
    this.content = content;
    }
    }