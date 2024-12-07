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
*  aliexpress.social.shopping.order.list
*/
public class AliexpressSocialShoppingOrderListRequest extends BaseGopRequest<AliexpressSocialShoppingOrderListResponse> {

    /** Time zone */
    private String clientTimeZone;
    /** Client type */
    private String clientType;
    /** Currency */
    private String currency;
    /** Locale */
    private String locale;
    /** Page */
    private Integer page;

    public String getClientTimeZone(){
        return this.clientTimeZone;
    }
    public void setClientTimeZone(String clientTimeZone){
        this.clientTimeZone = clientTimeZone;
        }
    public String getClientType(){
        return this.clientType;
    }
    public void setClientType(String clientType){
        this.clientType = clientType;
        }
    public String getCurrency(){
        return this.currency;
    }
    public void setCurrency(String currency){
        this.currency = currency;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }
    public Integer getPage(){
        return this.page;
    }
    public void setPage(Integer page){
        this.page = page;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.shopping.order.list";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (clientTimeZone != null) {
                        super.addApiParameter("client_time_zone", clientTimeZone.toString());
                    }
                            if (clientType != null) {
                        super.addApiParameter("client_type", clientType.toString());
                    }
                            if (currency != null) {
                        super.addApiParameter("currency", currency.toString());
                    }
                            if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                            if (page != null) {
                        super.addApiParameter("page", page.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialShoppingOrderListResponse> getResponseClass() {
        return AliexpressSocialShoppingOrderListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}