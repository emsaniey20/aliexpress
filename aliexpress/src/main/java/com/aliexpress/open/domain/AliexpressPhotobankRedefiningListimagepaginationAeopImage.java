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

public class AliexpressPhotobankRedefiningListimagepaginationAeopImage implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 这张图片在图片银行中名称。可以根据这个值在图片银行中搜索到对应的图片。 */
                @ApiField("display_name")
            private String displayName;
        /** 这张图片的大小。单位：字节(B)。 */
                @ApiField("file_size")
            private Integer fileSize;
        /** gmtCreate */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** gmtModified */
                @ApiField("gmt_modified")
            private String gmtModified;
        /** 图片银行产品分组ID */
                @ApiField("group_id")
            private String groupId;
        /** 这张图片的高度。单位：像素。 */
                @ApiField("height")
            private Integer height;
        /** 这张图片在图片银行中的ID。 */
                @ApiField("iid")
            private Long iid;
        /** 这张图片被引用的次数。 */
                @ApiField("reference_count")
            private Integer referenceCount;
        /** status */
                @ApiField("status")
            private String status;
        /** 这张图片的URL。可以将这个URL添加到产品的主图或者详描中。 */
                @ApiField("url")
            private String url;
        /** 这张图片的宽度。单位：像素。 */
                @ApiField("width")
            private Integer width;
    
        public String getDisplayName() {
    return this.displayName;
    }
    public void setDisplayName(String displayName) {
    this.displayName = displayName;
    }
        public Integer getFileSize() {
    return this.fileSize;
    }
    public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public String getGmtModified() {
    return this.gmtModified;
    }
    public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
    }
        public String getGroupId() {
    return this.groupId;
    }
    public void setGroupId(String groupId) {
    this.groupId = groupId;
    }
        public Integer getHeight() {
    return this.height;
    }
    public void setHeight(Integer height) {
    this.height = height;
    }
        public Long getIid() {
    return this.iid;
    }
    public void setIid(Long iid) {
    this.iid = iid;
    }
        public Integer getReferenceCount() {
    return this.referenceCount;
    }
    public void setReferenceCount(Integer referenceCount) {
    this.referenceCount = referenceCount;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public String getUrl() {
    return this.url;
    }
    public void setUrl(String url) {
    this.url = url;
    }
        public Integer getWidth() {
    return this.width;
    }
    public void setWidth(Integer width) {
    this.width = width;
    }
    }