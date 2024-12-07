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

public class AriseProductQueryVideo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 视频播放链接 */
                @ApiField("video_url")
            private String videoUrl;
        /** 视频封面图片的URL */
                @ApiField("poster_url")
            private String posterUrl;
        /** 视频的类型 */
                @ApiField("media_type")
            private String mediaType;
        /** 视频ID  */
                @ApiField("media_id")
            private Integer mediaId;
    
        public String getVideoUrl() {
    return this.videoUrl;
    }
    public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    }
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
        public Integer getMediaId() {
    return this.mediaId;
    }
    public void setMediaId(Integer mediaId) {
    this.mediaId = mediaId;
    }
    }