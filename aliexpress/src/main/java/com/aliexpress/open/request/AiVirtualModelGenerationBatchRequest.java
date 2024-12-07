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
*  /ai/virtual/model/generation/batch
*/
public class AiVirtualModelGenerationBatchRequest extends BaseGopRequest<AiVirtualModelGenerationBatchResponse> {

    /** 模特类型 */
    private String race;
    /** 模特性别 */
    private String gender;
    /** 期望生成图片数量 */
    private Integer count;
    /** 原图base64 */
    private String imageBase64;
    /** 原图url */
    private String imageUrl;
    /** 是否保持背景 */
    private Boolean maskKeepBg;

    public String getRace(){
        return this.race;
    }
    public void setRace(String race){
        this.race = race;
        }
    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender){
        this.gender = gender;
        }
    public Integer getCount(){
        return this.count;
    }
    public void setCount(Integer count){
        this.count = count;
        }
    public String getImageBase64(){
        return this.imageBase64;
    }
    public void setImageBase64(String imageBase64){
        this.imageBase64 = imageBase64;
        }
    public String getImageUrl(){
        return this.imageUrl;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
        }
    public Boolean getMaskKeepBg(){
        return this.maskKeepBg;
    }
    public void setMaskKeepBg(Boolean maskKeepBg){
        this.maskKeepBg = maskKeepBg;
        }

    @Override
    public String getApiName() {
        return "/ai/virtual/model/generation/batch";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (race != null) {
                        super.addApiParameter("race", race.toString());
                    }
                            if (gender != null) {
                        super.addApiParameter("gender", gender.toString());
                    }
                            if (count != null) {
                        super.addApiParameter("count", count.toString());
                    }
                            if (imageBase64 != null) {
                        super.addApiParameter("imageBase64", imageBase64.toString());
                    }
                            if (imageUrl != null) {
                        super.addApiParameter("imageUrl", imageUrl.toString());
                    }
                            if (maskKeepBg != null) {
                        super.addApiParameter("maskKeepBg", maskKeepBg.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                    return super.getFileParams();
    }

    @Override
    public Class<AiVirtualModelGenerationBatchResponse> getResponseClass() {
        return AiVirtualModelGenerationBatchResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}