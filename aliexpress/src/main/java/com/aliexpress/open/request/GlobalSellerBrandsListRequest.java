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
*  global.seller.brands.list
*/
public class GlobalSellerBrandsListRequest extends BaseGopRequest<GlobalSellerBrandsListResponse> {

    /** 语言 :en_US */
    private String locale;
    /** 统一叶子类目ID，请isv做好前置校验，只有叶子类目上才能查询到品牌 */
    private Long categoryId;

    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }
    public Long getCategoryId(){
        return this.categoryId;
    }
    public void setCategoryId(Long categoryId){
        this.categoryId = categoryId;
        }

    @Override
    public String getApiName() {
        return "global.seller.brands.list";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
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
    public Class<GlobalSellerBrandsListResponse> getResponseClass() {
        return GlobalSellerBrandsListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "GET";
    }
}