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
*  /auth/token/security/translate
*/
public class AuthTokenSecurityTranslateRequest extends BaseGopRequest<AuthTokenSecurityTranslateResponse> {

    /** 源语言 */
    private String sourceLanguage;

    public String getSourceLanguage(){
        return this.sourceLanguage;
    }
    public void setSourceLanguage(String sourceLanguage){
        this.sourceLanguage = sourceLanguage;
        }

    @Override
    public String getApiName() {
        return "/auth/token/security/translate";
    }
    @Override
    public IopHashMap getApiParams() {
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
    public Class<AuthTokenSecurityTranslateResponse> getResponseClass() {
        return AuthTokenSecurityTranslateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}