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
*  taobao.vas.subscribe.get
*/
public class TaobaoVasSubscribeGetRequest extends BaseGopRequest<TaobaoVasSubscribeGetResponse> {

    /** 商品编码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得该应用的商品代码 */
    private String articleCode;
    /** 会员名 */
    private String nick;

    public String getArticleCode(){
        return this.articleCode;
    }
    public void setArticleCode(String articleCode){
        this.articleCode = articleCode;
        }
    public String getNick(){
        return this.nick;
    }
    public void setNick(String nick){
        this.nick = nick;
        }

    @Override
    public String getApiName() {
        return "taobao.vas.subscribe.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (articleCode != null) {
                        super.addApiParameter("article_code", articleCode.toString());
                    }
                            if (nick != null) {
                        super.addApiParameter("nick", nick.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<TaobaoVasSubscribeGetResponse> getResponseClass() {
        return TaobaoVasSubscribeGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}