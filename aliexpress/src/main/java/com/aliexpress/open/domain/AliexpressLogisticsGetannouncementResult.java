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

public class AliexpressLogisticsGetannouncementResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 封面 */
                @ApiField("cover")
            private String cover;
        /** 消息类型 */
                @ApiField("message_type")
            private String messageType;
        /** 描述 */
                @ApiField("description")
            private String description;
        /** 标题 */
                @ApiField("title")
            private String title;
        /** 跳转链接 */
                @ApiField("url")
            private String url;
        /** 状态 */
                @ApiField("status")
            private String status;
        /** 发布时间 */
                @ApiField("publish_time")
            private String publishTime;
    
        public String getCover() {
    return this.cover;
    }
    public void setCover(String cover) {
    this.cover = cover;
    }
        public String getMessageType() {
    return this.messageType;
    }
    public void setMessageType(String messageType) {
    this.messageType = messageType;
    }
        public String getDescription() {
    return this.description;
    }
    public void setDescription(String description) {
    this.description = description;
    }
        public String getTitle() {
    return this.title;
    }
    public void setTitle(String title) {
    this.title = title;
    }
        public String getUrl() {
    return this.url;
    }
    public void setUrl(String url) {
    this.url = url;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public String getPublishTime() {
    return this.publishTime;
    }
    public void setPublishTime(String publishTime) {
    this.publishTime = publishTime;
    }
    }