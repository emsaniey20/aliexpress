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
*  aliexpress.social.category.mobile.query
*/
public class AliexpressSocialCategoryMobileQueryRequest extends BaseGopRequest<AliexpressSocialCategoryMobileQueryResponse> {

    /** language */
    private String lang;
    /** category */
    private Long categoryId;

    public String getLang(){
        return this.lang;
    }
    public void setLang(String lang){
        this.lang = lang;
        }
    public Long getCategoryId(){
        return this.categoryId;
    }
    public void setCategoryId(Long categoryId){
        this.categoryId = categoryId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.category.mobile.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (lang != null) {
                        super.addApiParameter("lang", lang.toString());
                    }
                            if (categoryId != null) {
                        super.addApiParameter("category_id", categoryId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialCategoryMobileQueryResponse> getResponseClass() {
        return AliexpressSocialCategoryMobileQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}