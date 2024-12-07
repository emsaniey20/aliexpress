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
*  aliexpress.ugc.product.video.upload
*/
public class AliexpressUgcProductVideoUploadRequest extends BaseGopRequest<AliexpressUgcProductVideoUploadResponse> {

    /** 商品id */
    private Long productId;
    /** 表示更新主图视频 */
    private String mediaType;
    /** 视频地址，后缀以视频格式结束，视频大小2G，视频格式wmv,avi,mpg,mpeg,3gp,mov,mp4,flv,f4v,m4v,m2t,mts,rmvb,vob,mkv */
    private String videoFileUrl;

    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public String getMediaType(){
        return this.mediaType;
    }
    public void setMediaType(String mediaType){
        this.mediaType = mediaType;
        }
    public String getVideoFileUrl(){
        return this.videoFileUrl;
    }
    public void setVideoFileUrl(String videoFileUrl){
        this.videoFileUrl = videoFileUrl;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ugc.product.video.upload";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (mediaType != null) {
                        super.addApiParameter("media_type", mediaType.toString());
                    }
                            if (videoFileUrl != null) {
                        super.addApiParameter("video_file_url", videoFileUrl.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressUgcProductVideoUploadResponse> getResponseClass() {
        return AliexpressUgcProductVideoUploadResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}