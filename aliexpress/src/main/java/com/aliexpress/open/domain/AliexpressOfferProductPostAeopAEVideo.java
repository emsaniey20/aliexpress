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

public class AliexpressOfferProductPostAeopAEVideo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 媒体唯一标识Id */
                @ApiField("media_id")
            private Long mediaId;
        /** 媒体类型 */
                @ApiField("media_type")
            private String mediaType;
        /** 媒体封面URL */
                @ApiField("poster_url")
            private String posterUrl;
    
        public Long getMediaId() {
    return this.mediaId;
    }
    public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
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