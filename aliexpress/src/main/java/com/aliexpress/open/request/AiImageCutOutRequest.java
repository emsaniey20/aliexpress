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
*  /ai/image/cut/out
*/
public class AiImageCutOutRequest extends BaseGopRequest<AiImageCutOutResponse> {

    /** 背景类型：白底图（.jpg) ; 透明图（.png) 分别取值： WHITE_BACKGROUND=白底 TRANSPARENT=透明 */
    private String backGroundType;
    /** ImageUrl 或 ImageBase64：跟 Base64 不能同时为空，优先取 Base64 */
    private String imageBase64;
    /** 目标的高 */
    private Long targetHeight;
    /** ImageUrl 或 ImageBase64：跟 Base64 不能同时为空，优先取 Base64 */
    private String imageUrl;
    /** 目标的宽 */
    private Long targetWidth;

    public String getBackGroundType(){
        return this.backGroundType;
    }
    public void setBackGroundType(String backGroundType){
        this.backGroundType = backGroundType;
        }
    public String getImageBase64(){
        return this.imageBase64;
    }
    public void setImageBase64(String imageBase64){
        this.imageBase64 = imageBase64;
        }
    public Long getTargetHeight(){
        return this.targetHeight;
    }
    public void setTargetHeight(Long targetHeight){
        this.targetHeight = targetHeight;
        }
    public String getImageUrl(){
        return this.imageUrl;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
        }
    public Long getTargetWidth(){
        return this.targetWidth;
    }
    public void setTargetWidth(Long targetWidth){
        this.targetWidth = targetWidth;
        }

    @Override
    public String getApiName() {
        return "/ai/image/cut/out";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (backGroundType != null) {
                        super.addApiParameter("backGroundType", backGroundType.toString());
                    }
                            if (imageBase64 != null) {
                        super.addApiParameter("imageBase64", imageBase64.toString());
                    }
                            if (targetHeight != null) {
                        super.addApiParameter("targetHeight", targetHeight.toString());
                    }
                            if (imageUrl != null) {
                        super.addApiParameter("imageUrl", imageUrl.toString());
                    }
                            if (targetWidth != null) {
                        super.addApiParameter("targetWidth", targetWidth.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<AiImageCutOutResponse> getResponseClass() {
        return AiImageCutOutResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}