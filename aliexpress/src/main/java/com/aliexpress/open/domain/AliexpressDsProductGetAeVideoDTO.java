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

public class AliexpressDsProductGetAeVideoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** The URL of the video cover image */
                @ApiField("poster_url")
            private String posterUrl;
        /** Video status */
                @ApiField("media_status")
            private String mediaStatus;
        /** Seller's master account ID */
                @ApiField("ali_member_id")
            private Integer aliMemberId;
        /** Type of video */
                @ApiField("media_type")
            private String mediaType;
        /** Video ID */
                @ApiField("media_id")
            private Long mediaId;
    
        public String getPosterUrl() {
    return this.posterUrl;
    }
    public void setPosterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
    }
        public String getMediaStatus() {
    return this.mediaStatus;
    }
    public void setMediaStatus(String mediaStatus) {
    this.mediaStatus = mediaStatus;
    }
        public Integer getAliMemberId() {
    return this.aliMemberId;
    }
    public void setAliMemberId(Integer aliMemberId) {
    this.aliMemberId = aliMemberId;
    }
        public String getMediaType() {
    return this.mediaType;
    }
    public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
    }
        public Long getMediaId() {
    return this.mediaId;
    }
    public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
    }
    }