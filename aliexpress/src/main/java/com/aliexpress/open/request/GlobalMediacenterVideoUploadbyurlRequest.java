package com.aliexpress.open.request;

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
import com.aliexpress.open.response.*;


/**
*  global.mediacenter.video.uploadbyurl
*/
public class GlobalMediacenterVideoUploadbyurlRequest extends BaseGopRequest<GlobalMediacenterVideoUploadbyurlResponse> {

    /** 自定义视频名称 */
    private String videoName;
    /** 待转存视频文件URL */
    private String originVideoUrl;
    /** 自定义业务id，如商品id。视频异步上传处理完成后，将原样返回给ISV */
    private String bizId;

    public String getVideoName(){
        return this.videoName;
    }
    public void setVideoName(String videoName){
        this.videoName = videoName;
        }
    public String getOriginVideoUrl(){
        return this.originVideoUrl;
    }
    public void setOriginVideoUrl(String originVideoUrl){
        this.originVideoUrl = originVideoUrl;
        }
    public String getBizId(){
        return this.bizId;
    }
    public void setBizId(String bizId){
        this.bizId = bizId;
        }

    @Override
    public String getApiName() {
        return "global.mediacenter.video.uploadbyurl";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (videoName != null) {
                        super.addApiParameter("video_name", videoName.toString());
                    }
                            if (originVideoUrl != null) {
                        super.addApiParameter("origin_video_url", originVideoUrl.toString());
                    }
                            if (bizId != null) {
                        super.addApiParameter("biz_id", bizId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<GlobalMediacenterVideoUploadbyurlResponse> getResponseClass() {
        return GlobalMediacenterVideoUploadbyurlResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}