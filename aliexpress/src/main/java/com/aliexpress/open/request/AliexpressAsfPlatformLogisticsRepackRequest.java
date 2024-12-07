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
*  aliexpress.asf.platform.logistics.repack
*/
public class AliexpressAsfPlatformLogisticsRepackRequest extends BaseGopRequest<AliexpressAsfPlatformLogisticsRepackResponse> {

    /** trackingNumber */
    private String trackingNumber;
    /** tradeOrderId */
    private Long tradeOrderId;
    /** locale */
    private String locale;

    public String getTrackingNumber(){
        return this.trackingNumber;
    }
    public void setTrackingNumber(String trackingNumber){
        this.trackingNumber = trackingNumber;
        }
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

    @Override
    public String getApiName() {
        return "aliexpress.asf.platform.logistics.repack";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (trackingNumber != null) {
                        super.addApiParameter("trackingNumber", trackingNumber.toString());
                    }
                            if (tradeOrderId != null) {
                        super.addApiParameter("tradeOrderId", tradeOrderId.toString());
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
    public Class<AliexpressAsfPlatformLogisticsRepackResponse> getResponseClass() {
        return AliexpressAsfPlatformLogisticsRepackResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}