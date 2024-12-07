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

public class GlobalMediacenterImageUploadMediaImageOpenDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 图片id */
                @ApiField("id")
            private Long id;
        /** 图片上传时的名称 */
                @ApiField("name")
            private String name;
        /** 图片的URL */
                @ApiField("url")
            private String url;
        /** 图片大小，单位字节 */
                @ApiField("size")
            private Integer size;
        /** 图片宽度 */
                @ApiField("width")
            private Integer width;
        /** 图片长度 */
                @ApiField("height")
            private Integer height;
        /** 图片格式 */
                @ApiField("file_format")
            private String fileFormat;
        /** 图片所在文件夹id */
                @ApiField("folder_id")
            private Long folderId;
    
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
        public String getUrl() {
    return this.url;
    }
    public void setUrl(String url) {
    this.url = url;
    }
        public Integer getSize() {
    return this.size;
    }
    public void setSize(Integer size) {
    this.size = size;
    }
        public Integer getWidth() {
    return this.width;
    }
    public void setWidth(Integer width) {
    this.width = width;
    }
        public Integer getHeight() {
    return this.height;
    }
    public void setHeight(Integer height) {
    this.height = height;
    }
        public String getFileFormat() {
    return this.fileFormat;
    }
    public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
    }
        public Long getFolderId() {
    return this.folderId;
    }
    public void setFolderId(Long folderId) {
    this.folderId = folderId;
    }
    }