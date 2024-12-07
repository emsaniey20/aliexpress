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
*  aliexpress.solution.product.category.suggest
*/
public class AliexpressSolutionProductCategorySuggestRequest extends BaseGopRequest<AliexpressSolutionProductCategorySuggestResponse> {

    /**  */
    private String imageUrl;
    /**  */
    private String language;
    /**  */
    private String title;

    public String getImageUrl(){
        return this.imageUrl;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
        }
    public String getLanguage(){
        return this.language;
    }
    public void setLanguage(String language){
        this.language = language;
        }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.product.category.suggest";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (imageUrl != null) {
                        super.addApiParameter("image_url", imageUrl.toString());
                    }
                            if (language != null) {
                        super.addApiParameter("language", language.toString());
                    }
                            if (title != null) {
                        super.addApiParameter("title", title.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressSolutionProductCategorySuggestResponse> getResponseClass() {
        return AliexpressSolutionProductCategorySuggestResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}