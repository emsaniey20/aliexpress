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

public class GlobalMediacenterVideoListpageMediaVideoOpenDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 自定义视频名称 */
                @ApiField("name")
            private String name;
        /** 视频文件格式 */
                @ApiField("file_format")
            private String fileFormat;
        /** 视频文件大小，单位byte */
                @ApiField("size")
            private Integer size;
        /** 视频封面图片URL */
                @ApiField("cover_url")
            private String coverUrl;
        /** 视频时长，单位秒 */
                @ApiField("duration")
            private Integer duration;
        /** 视频宽高比 */
                @ApiField("ratio")
            private String ratio;
        /** 视频播放地址 */
                @ApiField("url")
            private String url;
        /** 是否通过审核,1：通过，-1：不通过， 0：审核中 */
                @ApiField("audit_status")
            private String auditStatus;
        /** 媒体中心视频id。用于管理媒体中心的视频文件 */
                @ApiField("id")
            private Long id;
        /** 视频存储id。用于发布商品时使用 */
                @ApiField("store_name")
            private String storeName;
    
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
        public String getFileFormat() {
    return this.fileFormat;
    }
    public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
    }
        public Integer getSize() {
    return this.size;
    }
    public void setSize(Integer size) {
    this.size = size;
    }
        public String getCoverUrl() {
    return this.coverUrl;
    }
    public void setCoverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
    }
        public Integer getDuration() {
    return this.duration;
    }
    public void setDuration(Integer duration) {
    this.duration = duration;
    }
        public String getRatio() {
    return this.ratio;
    }
    public void setRatio(String ratio) {
    this.ratio = ratio;
    }
        public String getUrl() {
    return this.url;
    }
    public void setUrl(String url) {
    this.url = url;
    }
        public String getAuditStatus() {
    return this.auditStatus;
    }
    public void setAuditStatus(String auditStatus) {
    this.auditStatus = auditStatus;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public String getStoreName() {
    return this.storeName;
    }
    public void setStoreName(String storeName) {
    this.storeName = storeName;
    }
    }