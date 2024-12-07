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
*  /ai/livechat/translation/and/polishment
*/
public class AiLivechatTranslationAndPolishmentRequest extends BaseGopRequest<AiLivechatTranslationAndPolishmentResponse> {

    /** 对话文本 */
    private List<String> sourceTextList;
    /** 角色 */
    private String role;
    /** 目标语种 */
    private String targetLanguage;
    /** 对话ID */
    private String sessionId;
    /** 源头ID */
    private String sourceLanguage;

    public List<String> getSourceTextList(){
        return this.sourceTextList;
    }
    public void setSourceTextList(List<String> sourceTextList){
        this.sourceTextList = sourceTextList;
        }
    public String getRole(){
        return this.role;
    }
    public void setRole(String role){
        this.role = role;
        }
    public String getTargetLanguage(){
        return this.targetLanguage;
    }
    public void setTargetLanguage(String targetLanguage){
        this.targetLanguage = targetLanguage;
        }
    public String getSessionId(){
        return this.sessionId;
    }
    public void setSessionId(String sessionId){
        this.sessionId = sessionId;
        }
    public String getSourceLanguage(){
        return this.sourceLanguage;
    }
    public void setSourceLanguage(String sourceLanguage){
        this.sourceLanguage = sourceLanguage;
        }

    @Override
    public String getApiName() {
        return "/ai/livechat/translation/and/polishment";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (sourceTextList != null) {
                        super.addApiParameter("sourceTextList", new JSONWriter(true, false).write(sourceTextList));
                    }
                            if (role != null) {
                        super.addApiParameter("role", role.toString());
                    }
                            if (targetLanguage != null) {
                        super.addApiParameter("targetLanguage", targetLanguage.toString());
                    }
                            if (sessionId != null) {
                        super.addApiParameter("sessionId", sessionId.toString());
                    }
                            if (sourceLanguage != null) {
                        super.addApiParameter("sourceLanguage", sourceLanguage.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<AiLivechatTranslationAndPolishmentResponse> getResponseClass() {
        return AiLivechatTranslationAndPolishmentResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}