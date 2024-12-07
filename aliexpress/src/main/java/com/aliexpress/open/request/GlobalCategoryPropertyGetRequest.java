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
*  /global/category/property/get
*/
public class GlobalCategoryPropertyGetRequest extends BaseGopRequest<GlobalCategoryPropertyGetResponse> {

    /** 1 */
    private GlobalCategoryPropertyGetAuthDO authDO;
    /** 1 */
    private Long categoryId;
    /** 1 */
    private String locale;

    public GlobalCategoryPropertyGetAuthDO getAuthDO(){
        return this.authDO;
    }
    public void setAuthDO(GlobalCategoryPropertyGetAuthDO authDO){
        this.authDO = authDO;
        }
    public Long getCategoryId(){
        return this.categoryId;
    }
    public void setCategoryId(Long categoryId){
        this.categoryId = categoryId;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }

    @Override
    public String getApiName() {
        return "/global/category/property/get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (authDO != null) {
                        super.addApiParameter("authDO", new JSONWriter(true, false).write(authDO));
                    }
                            if (categoryId != null) {
                        super.addApiParameter("categoryId", categoryId.toString());
                    }
                            if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<GlobalCategoryPropertyGetResponse> getResponseClass() {
        return GlobalCategoryPropertyGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}