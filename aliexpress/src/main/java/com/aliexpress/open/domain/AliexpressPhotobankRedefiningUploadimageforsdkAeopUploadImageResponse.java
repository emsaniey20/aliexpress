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

public class AliexpressPhotobankRedefiningUploadimageforsdkAeopUploadImageResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
        /** 图片的高度。单位：像素 */
                @ApiField("height")
            private Integer height;
        /** 图片上传的结果。 */
                @ApiField("status")
            private String status;
        /** 图片银行总的空间大小。单位：MB */
                @ApiField("photobank_total_size")
            private String photobankTotalSize;
        /** 图片的宽度。单位：像素 */
                @ApiField("width")
            private Integer width;
        /** 已经使用了的图片银行空间。单位：MB */
                @ApiField("photobank_used_size")
            private String photobankUsedSize;
        /** 图片的名称。 */
                @ApiField("file_name")
            private String fileName;
        /** isSuccess */
                @ApiField("is_success")
            private Boolean isSuccess;
        /** 这张图片的URL。 */
                @ApiField("photobank_url")
            private String photobankUrl;
        /** 错误代码 */
                @ApiField("error_code")
            private Integer errorCode;
    
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public Integer getHeight() {
    return this.height;
    }
    public void setHeight(Integer height) {
    this.height = height;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public String getPhotobankTotalSize() {
    return this.photobankTotalSize;
    }
    public void setPhotobankTotalSize(String photobankTotalSize) {
    this.photobankTotalSize = photobankTotalSize;
    }
        public Integer getWidth() {
    return this.width;
    }
    public void setWidth(Integer width) {
    this.width = width;
    }
        public String getPhotobankUsedSize() {
    return this.photobankUsedSize;
    }
    public void setPhotobankUsedSize(String photobankUsedSize) {
    this.photobankUsedSize = photobankUsedSize;
    }
        public String getFileName() {
    return this.fileName;
    }
    public void setFileName(String fileName) {
    this.fileName = fileName;
    }
        public Boolean getIsSuccess() {
    return this.isSuccess;
    }
    public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    }
        public String getPhotobankUrl() {
    return this.photobankUrl;
    }
    public void setPhotobankUrl(String photobankUrl) {
    this.photobankUrl = photobankUrl;
    }
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    }
    }