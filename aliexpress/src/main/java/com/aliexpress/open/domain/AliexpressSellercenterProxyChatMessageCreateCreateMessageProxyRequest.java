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

public class AliexpressSellercenterProxyChatMessageCreateCreateMessageProxyRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** fromUserId */
                @ApiField("from_user_id")
            private String fromUserId;
        /** toUserId */
                @ApiField("to_user_id")
            private String toUserId;
        /** templateId */
                @ApiField("template_id")
            private Integer templateId;
        /** data */
                @ApiField("data")
            private String data;
        /** dateStamp */
                @ApiField("date_stamp")
            private Long dateStamp;
    
        public String getFromUserId() {
    return this.fromUserId;
    }
    public void setFromUserId(String fromUserId) {
    this.fromUserId = fromUserId;
    }
        public String getToUserId() {
    return this.toUserId;
    }
    public void setToUserId(String toUserId) {
    this.toUserId = toUserId;
    }
        public Integer getTemplateId() {
    return this.templateId;
    }
    public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
    }
        public String getData() {
    return this.data;
    }
    public void setData(String data) {
    this.data = data;
    }
        public Long getDateStamp() {
    return this.dateStamp;
    }
    public void setDateStamp(Long dateStamp) {
    this.dateStamp = dateStamp;
    }
    }