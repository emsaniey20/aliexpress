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

public class AliexpressImageRedefiningUploadtempimageAeopImageResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 图片的高度。单位：像素 */
                @ApiField("height")
            private Long height;
        /** 图片的文件名。 */
                @ApiField("src_file_name")
            private String srcFileName;
        /** 本次操作的结果。 */
                @ApiField("is_success")
            private Boolean isSuccess;
        /** 图片的URL。 */
                @ApiField("url")
            private String url;
        /** 图片的宽度。单位：像素 */
                @ApiField("width")
            private Long width;
        /** 错误代码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
    
        public Long getHeight() {
    return this.height;
    }
    public void setHeight(Long height) {
    this.height = height;
    }
        public String getSrcFileName() {
    return this.srcFileName;
    }
    public void setSrcFileName(String srcFileName) {
    this.srcFileName = srcFileName;
    }
        public Boolean getIsSuccess() {
    return this.isSuccess;
    }
    public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    }
        public String getUrl() {
    return this.url;
    }
    public void setUrl(String url) {
    this.url = url;
    }
        public Long getWidth() {
    return this.width;
    }
    public void setWidth(Long width) {
    this.width = width;
    }
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
    }