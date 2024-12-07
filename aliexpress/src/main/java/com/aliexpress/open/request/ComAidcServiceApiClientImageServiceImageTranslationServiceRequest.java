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
*  com.aidc.service.api.client.image.service.ImageTranslationService
*/
public class ComAidcServiceApiClientImageServiceImageTranslationServiceRequest extends BaseGopRequest<ComAidcServiceApiClientImageServiceImageTranslationServiceResponse> {

    /** image base64 */
    private String imageBase64;
    /** french */
    private String targetLanguage;
    /** image_url */
    private String imageUrl;
    /** english */
    private String sourceLanguage;

    public String getImageBase64(){
        return this.imageBase64;
    }
    public void setImageBase64(String imageBase64){
        this.imageBase64 = imageBase64;
        }
    public String getTargetLanguage(){
        return this.targetLanguage;
    }
    public void setTargetLanguage(String targetLanguage){
        this.targetLanguage = targetLanguage;
        }
    public String getImageUrl(){
        return this.imageUrl;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
        }
    public String getSourceLanguage(){
        return this.sourceLanguage;
    }
    public void setSourceLanguage(String sourceLanguage){
        this.sourceLanguage = sourceLanguage;
        }

    @Override
    public String getApiName() {
        return "com.aidc.service.api.client.image.service.ImageTranslationService";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (imageBase64 != null) {
                        super.addApiParameter("image_base64", imageBase64.toString());
                    }
                            if (targetLanguage != null) {
                        super.addApiParameter("target_language", targetLanguage.toString());
                    }
                            if (imageUrl != null) {
                        super.addApiParameter("image_url", imageUrl.toString());
                    }
                            if (sourceLanguage != null) {
                        super.addApiParameter("source_language", sourceLanguage.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<ComAidcServiceApiClientImageServiceImageTranslationServiceResponse> getResponseClass() {
        return ComAidcServiceApiClientImageServiceImageTranslationServiceResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}