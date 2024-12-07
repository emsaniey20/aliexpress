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

public class AliexpressInfluencerContentArticlePublishContentHashtagDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 开始坐标 */
                @ApiField("start")
            private Integer start;
        /** 结束坐标 */
                @ApiField("end")
            private Integer end;
        /** 内容 */
                @ApiField("content")
            private String content;
        /** 类型，0=hashtag */
                @ApiField("object_type")
            private Integer objectType;
        /** hashtag+Id */
                @ApiField("object_id")
            private Long objectId;
    
        public Integer getStart() {
    return this.start;
    }
    public void setStart(Integer start) {
    this.start = start;
    }
        public Integer getEnd() {
    return this.end;
    }
    public void setEnd(Integer end) {
    this.end = end;
    }
        public String getContent() {
    return this.content;
    }
    public void setContent(String content) {
    this.content = content;
    }
        public Integer getObjectType() {
    return this.objectType;
    }
    public void setObjectType(Integer objectType) {
    this.objectType = objectType;
    }
        public Long getObjectId() {
    return this.objectId;
    }
    public void setObjectId(Long objectId) {
    this.objectId = objectId;
    }
    }