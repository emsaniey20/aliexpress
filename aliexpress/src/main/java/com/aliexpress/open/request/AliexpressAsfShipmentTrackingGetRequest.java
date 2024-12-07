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
*  aliexpress.asf.shipment.tracking.get
*/
public class AliexpressAsfShipmentTrackingGetRequest extends BaseGopRequest<AliexpressAsfShipmentTrackingGetResponse> {

    /** 运单号 */
    private String mailNo;
    /** tradeOrderId */
    private Long tradeOrderId;
    /** es_ES */
    private String locale;

    public String getMailNo(){
        return this.mailNo;
    }
    public void setMailNo(String mailNo){
        this.mailNo = mailNo;
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
        return "aliexpress.asf.shipment.tracking.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (mailNo != null) {
                        super.addApiParameter("mailNo", mailNo.toString());
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
    public Class<AliexpressAsfShipmentTrackingGetResponse> getResponseClass() {
        return AliexpressAsfShipmentTrackingGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}