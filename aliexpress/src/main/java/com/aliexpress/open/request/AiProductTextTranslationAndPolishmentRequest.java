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
*  /ai/product/text/translation/and/polishment
*/
public class AiProductTextTranslationAndPolishmentRequest extends BaseGopRequest<AiProductTextTranslationAndPolishmentResponse> {

    /** 英文 */
    private String targetLanguage;
    /** 翻译文本 */
    private String sourceText;
    /** 格式 */
    private String formatType;
    /** 土耳其 */
    private String sourceLanguage;
    /** 翻译场景 */
    private String translateScene;

    public String getTargetLanguage(){
        return this.targetLanguage;
    }
    public void setTargetLanguage(String targetLanguage){
        this.targetLanguage = targetLanguage;
        }
    public String getSourceText(){
        return this.sourceText;
    }
    public void setSourceText(String sourceText){
        this.sourceText = sourceText;
        }
    public String getFormatType(){
        return this.formatType;
    }
    public void setFormatType(String formatType){
        this.formatType = formatType;
        }
    public String getSourceLanguage(){
        return this.sourceLanguage;
    }
    public void setSourceLanguage(String sourceLanguage){
        this.sourceLanguage = sourceLanguage;
        }
    public String getTranslateScene(){
        return this.translateScene;
    }
    public void setTranslateScene(String translateScene){
        this.translateScene = translateScene;
        }

    @Override
    public String getApiName() {
        return "/ai/product/text/translation/and/polishment";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (targetLanguage != null) {
                        super.addApiParameter("targetLanguage", targetLanguage.toString());
                    }
                            if (sourceText != null) {
                        super.addApiParameter("sourceText", sourceText.toString());
                    }
                            if (formatType != null) {
                        super.addApiParameter("formatType", formatType.toString());
                    }
                            if (sourceLanguage != null) {
                        super.addApiParameter("sourceLanguage", sourceLanguage.toString());
                    }
                            if (translateScene != null) {
                        super.addApiParameter("translateScene", translateScene.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<AiProductTextTranslationAndPolishmentResponse> getResponseClass() {
        return AiProductTextTranslationAndPolishmentResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}