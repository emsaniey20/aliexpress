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
*  /ai/image/translation
*/
public class AiImageTranslationRequest extends BaseGopRequest<AiImageTranslationResponse> {

    /** 原图 URL */
    private String imageUrl;
    /** 源语种，（英/中/中英文） */
    private String sourceLanguage;
    /** 目标语种（西\法\葡\韩\越南语\马来语\泰语\菲律宾语\俄语\巴基斯坦语\印尼语\阿拉伯语\土耳其语） */
    private String targetLanguage;
    /** 是否不翻译商品主体上文字 */
    private Boolean excludingProductArea;

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
    public String getTargetLanguage(){
        return this.targetLanguage;
    }
    public void setTargetLanguage(String targetLanguage){
        this.targetLanguage = targetLanguage;
        }
    public Boolean getExcludingProductArea(){
        return this.excludingProductArea;
    }
    public void setExcludingProductArea(Boolean excludingProductArea){
        this.excludingProductArea = excludingProductArea;
        }

    @Override
    public String getApiName() {
        return "/ai/image/translation";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (imageUrl != null) {
                        super.addApiParameter("imageUrl", imageUrl.toString());
                    }
                            if (sourceLanguage != null) {
                        super.addApiParameter("sourceLanguage", sourceLanguage.toString());
                    }
                            if (targetLanguage != null) {
                        super.addApiParameter("targetLanguage", targetLanguage.toString());
                    }
                            if (excludingProductArea != null) {
                        super.addApiParameter("excludingProductArea", excludingProductArea.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AiImageTranslationResponse> getResponseClass() {
        return AiImageTranslationResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}