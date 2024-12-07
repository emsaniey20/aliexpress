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

public class GlobalProductCreateVideo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 视频封面图片的URL */
                @ApiField("poster_url")
            private String posterUrl;
        /** 视频的类型。 主图视频： MAIN_IMAGE_VIDEO */
                @ApiField("media_type")
            private String mediaType;
        /** 视频ID */
                @ApiField("media_id")
            private Long mediaId;
    
        public String getPosterUrl() {
    return this.posterUrl;
    }
    public void setPosterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
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