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
*  /global/category/tree/get
*/
public class GlobalCategoryTreeGetRequest extends BaseGopRequest<GlobalCategoryTreeGetResponse> {

    /** 1 */
    private GlobalCategoryTreeGetAuthDO authDO;
    /** 1 */
    private Long categoryId;
    /** 1 */
    private String locale;

    public GlobalCategoryTreeGetAuthDO getAuthDO(){
        return this.authDO;
    }
    public void setAuthDO(GlobalCategoryTreeGetAuthDO authDO){
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
        return "/global/category/tree/get";
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
    public Class<GlobalCategoryTreeGetResponse> getResponseClass() {
        return GlobalCategoryTreeGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}