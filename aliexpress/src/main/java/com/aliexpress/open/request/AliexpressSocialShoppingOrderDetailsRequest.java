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
*  aliexpress.social.shopping.order.details
*/
public class AliexpressSocialShoppingOrderDetailsRequest extends BaseGopRequest<AliexpressSocialShoppingOrderDetailsResponse> {

    /** locale */
    private String locale;
    /** order id */
    private Long orderId;

    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }
    public Long getOrderId(){
        return this.orderId;
    }
    public void setOrderId(Long orderId){
        this.orderId = orderId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.shopping.order.details";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                            if (orderId != null) {
                        super.addApiParameter("order_id", orderId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialShoppingOrderDetailsResponse> getResponseClass() {
        return AliexpressSocialShoppingOrderDetailsResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}