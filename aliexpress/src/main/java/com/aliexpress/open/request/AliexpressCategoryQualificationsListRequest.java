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
*  aliexpress.category.qualifications.list
*/
public class AliexpressCategoryQualificationsListRequest extends BaseGopRequest<AliexpressCategoryQualificationsListResponse> {

    /** 类目id */
    private Long categoryId;
    /** 多语言语种标记 。zh_CN ：中文 ja_JP ： 日本日语 ko_KR：韩国韩语 tr_TR：土耳其土耳其语 nl_NL：荷兰荷兰语 pl_PL：波兰波兰语 ru_RU：俄国俄语 fr_FR：法国法语 en_US：美国英语 th_TH：泰国泰语 de_DE：德国德语 es_ES：西班牙西班牙语 */
    private String local;

    public Long getCategoryId(){
        return this.categoryId;
    }
    public void setCategoryId(Long categoryId){
        this.categoryId = categoryId;
        }
    public String getLocal(){
        return this.local;
    }
    public void setLocal(String local){
        this.local = local;
        }

    @Override
    public String getApiName() {
        return "aliexpress.category.qualifications.list";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (categoryId != null) {
                        super.addApiParameter("category_id", categoryId.toString());
                    }
                            if (local != null) {
                        super.addApiParameter("local", local.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressCategoryQualificationsListResponse> getResponseClass() {
        return AliexpressCategoryQualificationsListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "GET";
    }
}