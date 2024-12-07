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
*  aliexpress.social.country.get
*/
public class AliexpressSocialCountryGetRequest extends BaseGopRequest<AliexpressSocialCountryGetResponse> {

    /** 语言 */
    private String language;

    public String getLanguage(){
        return this.language;
    }
    public void setLanguage(String language){
        this.language = language;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.country.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (language != null) {
                        super.addApiParameter("language", language.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialCountryGetResponse> getResponseClass() {
        return AliexpressSocialCountryGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}