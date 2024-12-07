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
*  global.category.tree.list
*/
public class GlobalCategoryTreeListRequest extends BaseGopRequest<GlobalCategoryTreeListResponse> {

    /** 语言。  zh_CN ：中文         en_US：美国英语      th_TH：泰国泰语      de_DE：德国德语        es_ES：西班牙西班牙语              ja_JP ： 日本日语      ko_KR：韩国韩语      tr_TR：土耳其土耳其语        nl_NL：荷兰荷兰语          pl_PL：波兰波兰语        ru_RU：俄国俄语      fr_FR：法国法语        */
    private String locale;
    /** 类目ID。  查询一级目录时category_id不需要传。 */
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
        return "global.category.tree.list";
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
    public Class<GlobalCategoryTreeListResponse> getResponseClass() {
        return GlobalCategoryTreeListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "GET";
    }
}