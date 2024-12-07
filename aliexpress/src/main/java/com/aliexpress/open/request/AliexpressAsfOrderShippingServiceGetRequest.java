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
*  aliexpress.asf.order.shipping.service.get
*/
public class AliexpressAsfOrderShippingServiceGetRequest extends BaseGopRequest<AliexpressAsfOrderShippingServiceGetResponse> {

    /** tradeOrderId */
    private Long tradeOrderId;
    /** locale */
    private String locale;
    /** tradeOrderItemIdList */
    private List<Long> tradeOrderItemIdList;

    public Long getTradeOrderId(){
        return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId){
        this.tradeOrderId = tradeOrderId;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }
    public List<Long> getTradeOrderItemIdList(){
        return this.tradeOrderItemIdList;
    }
    public void setTradeOrderItemIdList(List<Long> tradeOrderItemIdList){
        this.tradeOrderItemIdList = tradeOrderItemIdList;
        }

    @Override
    public String getApiName() {
        return "aliexpress.asf.order.shipping.service.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (tradeOrderId != null) {
                        super.addApiParameter("tradeOrderId", tradeOrderId.toString());
                    }
                            if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                            if (tradeOrderItemIdList != null) {
                        super.addApiParameter("tradeOrderItemIdList", new JSONWriter(true, false).write(tradeOrderItemIdList));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressAsfOrderShippingServiceGetResponse> getResponseClass() {
        return AliexpressAsfOrderShippingServiceGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}