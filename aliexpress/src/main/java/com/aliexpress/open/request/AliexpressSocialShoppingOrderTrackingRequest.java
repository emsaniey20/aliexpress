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
*  aliexpress.social.shopping.order.tracking
*/
public class AliexpressSocialShoppingOrderTrackingRequest extends BaseGopRequest<AliexpressSocialShoppingOrderTrackingResponse> {

    /** Language country code */
    private String lang;
    /** orderId to track */
    private Long orderid;
    /** Timezone */
    private String timeZone;

    public String getLang(){
        return this.lang;
    }
    public void setLang(String lang){
        this.lang = lang;
        }
    public Long getOrderid(){
        return this.orderid;
    }
    public void setOrderid(Long orderid){
        this.orderid = orderid;
        }
    public String getTimeZone(){
        return this.timeZone;
    }
    public void setTimeZone(String timeZone){
        this.timeZone = timeZone;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.shopping.order.tracking";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (lang != null) {
                        super.addApiParameter("lang", lang.toString());
                    }
                            if (orderid != null) {
                        super.addApiParameter("orderid", orderid.toString());
                    }
                            if (timeZone != null) {
                        super.addApiParameter("time_zone", timeZone.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialShoppingOrderTrackingResponse> getResponseClass() {
        return AliexpressSocialShoppingOrderTrackingResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}