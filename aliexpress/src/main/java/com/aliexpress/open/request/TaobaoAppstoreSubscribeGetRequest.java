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
*  taobao.appstore.subscribe.get
*/
public class TaobaoAppstoreSubscribeGetRequest extends BaseGopRequest<TaobaoAppstoreSubscribeGetResponse> {

    /** 用户昵称 */
    private String nick;
    /** 插件实例ID */
    private Long leaseId;

    public String getNick(){
        return this.nick;
    }
    public void setNick(String nick){
        this.nick = nick;
        }
    public Long getLeaseId(){
        return this.leaseId;
    }
    public void setLeaseId(Long leaseId){
        this.leaseId = leaseId;
        }

    @Override
    public String getApiName() {
        return "taobao.appstore.subscribe.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (nick != null) {
                        super.addApiParameter("nick", nick.toString());
                    }
                            if (leaseId != null) {
                        super.addApiParameter("lease_id", leaseId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<TaobaoAppstoreSubscribeGetResponse> getResponseClass() {
        return TaobaoAppstoreSubscribeGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}