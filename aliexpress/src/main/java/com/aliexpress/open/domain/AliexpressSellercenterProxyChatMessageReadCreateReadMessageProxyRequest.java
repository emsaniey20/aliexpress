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

public class AliexpressSellercenterProxyChatMessageReadCreateReadMessageProxyRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** dateStamp */
                @ApiField("date_stamp")
            private Long dateStamp;
        /** toUserId */
                @ApiField("to_user_id")
            private Integer toUserId;
        /** fromUserId */
                @ApiField("from_user_id")
            private Integer fromUserId;
    
        public Long getDateStamp() {
    return this.dateStamp;
    }
    public void setDateStamp(Long dateStamp) {
    this.dateStamp = dateStamp;
    }
        public Integer getToUserId() {
    return this.toUserId;
    }
    public void setToUserId(Integer toUserId) {
    this.toUserId = toUserId;
    }
        public Integer getFromUserId() {
    return this.fromUserId;
    }
    public void setFromUserId(Integer fromUserId) {
    this.fromUserId = fromUserId;
    }
    }