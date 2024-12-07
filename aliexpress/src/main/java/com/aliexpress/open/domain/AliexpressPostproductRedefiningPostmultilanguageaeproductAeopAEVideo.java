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

public class AliexpressPostproductRedefiningPostmultilanguageaeproductAeopAEVideo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 卖家主账户ID */
                @ApiField("ali_member_id")
            private Long aliMemberId;
        /** 视频ID */
                @ApiField("media_id")
            private Long mediaId;
        /** 视频的状态 */
                @ApiField("media_status")
            private String mediaStatus;
        /** 视频的类型 */
                @ApiField("media_type")
            private String mediaType;
        /** 视频封面图片的URL */
                @ApiField("poster_url")
            private String posterUrl;
    
        public Long getAliMemberId() {
    return this.aliMemberId;
    }
    public void setAliMemberId(Long aliMemberId) {
    this.aliMemberId = aliMemberId;
    }
        public Long getMediaId() {
    return this.mediaId;
    }
    public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
    }
        public String getMediaStatus() {
    return this.mediaStatus;
    }
    public void setMediaStatus(String mediaStatus) {
    this.mediaStatus = mediaStatus;
    }
        public String getMediaType() {
    return this.mediaType;
    }
    public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
    }
        public String getPosterUrl() {
    return this.posterUrl;
    }
    public void setPosterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
    }
    }