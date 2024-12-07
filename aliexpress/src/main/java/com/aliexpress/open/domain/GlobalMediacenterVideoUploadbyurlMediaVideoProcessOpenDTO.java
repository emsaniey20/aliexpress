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

public class GlobalMediacenterVideoUploadbyurlMediaVideoProcessOpenDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 0表示转存成功，1表示转存失败，2表示处理中。同一个URL首次上传时，返回2 */
                @ApiField("transfer_status")
            private Integer transferStatus;
        /** 入参中的bizId，原样返回 */
                @ApiField("biz_id")
            private String bizId;
        /** 视频信息。transferStatus!=0时为空 */
                @ApiField("video_info")
            private GlobalMediacenterVideoUploadbyurlMediaVideoOpenDTO videoInfo;
        /** transfer_status=1转存失败时，此字段将给出错误原因 */
                @ApiField("error_msg")
            private String errorMsg;
    
        public Integer getTransferStatus() {
    return this.transferStatus;
    }
    public void setTransferStatus(Integer transferStatus) {
    this.transferStatus = transferStatus;
    }
        public String getBizId() {
    return this.bizId;
    }
    public void setBizId(String bizId) {
    this.bizId = bizId;
    }
        public GlobalMediacenterVideoUploadbyurlMediaVideoOpenDTO getVideoInfo() {
    return this.videoInfo;
    }
    public void setVideoInfo(GlobalMediacenterVideoUploadbyurlMediaVideoOpenDTO videoInfo) {
    this.videoInfo = videoInfo;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
    }