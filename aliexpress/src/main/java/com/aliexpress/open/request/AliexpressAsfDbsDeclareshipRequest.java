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
*  aliexpress.asf.dbs.declareship
*/
public class AliexpressAsfDbsDeclareshipRequest extends BaseGopRequest<AliexpressAsfDbsDeclareshipResponse> {

    /** tradeOrderId */
    private Long tradeOrderId;
    /** shipmentProviderCode */
    private String shipmentProviderCode;
    /** trackingNumber */
    private String trackingNumber;
    /** tradeOrderItemIdList */
    private List<AliexpressAsfDbsDeclareshipTradeOrderItemDTO> tradeOrderItemIdList;
    /** locale */
    private String locale;

    public Long getTradeOrderId(){
        return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId){
        this.tradeOrderId = tradeOrderId;
        }
    public String getShipmentProviderCode(){
        return this.shipmentProviderCode;
    }
    public void setShipmentProviderCode(String shipmentProviderCode){
        this.shipmentProviderCode = shipmentProviderCode;
        }
    public String getTrackingNumber(){
        return this.trackingNumber;
    }
    public void setTrackingNumber(String trackingNumber){
        this.trackingNumber = trackingNumber;
        }
    public List<AliexpressAsfDbsDeclareshipTradeOrderItemDTO> getTradeOrderItemIdList(){
        return this.tradeOrderItemIdList;
    }
    public void setTradeOrderItemIdList(List<AliexpressAsfDbsDeclareshipTradeOrderItemDTO> tradeOrderItemIdList){
        this.tradeOrderItemIdList = tradeOrderItemIdList;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }

    @Override
    public String getApiName() {
        return "aliexpress.asf.dbs.declareship";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (tradeOrderId != null) {
                        super.addApiParameter("tradeOrderId", tradeOrderId.toString());
                    }
                            if (shipmentProviderCode != null) {
                        super.addApiParameter("shipmentProviderCode", shipmentProviderCode.toString());
                    }
                            if (trackingNumber != null) {
                        super.addApiParameter("trackingNumber", trackingNumber.toString());
                    }
                            if (tradeOrderItemIdList != null) {
                        super.addApiParameter("tradeOrderItemIdList", new JSONWriter(true, false).write(tradeOrderItemIdList));
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
    public Class<AliexpressAsfDbsDeclareshipResponse> getResponseClass() {
        return AliexpressAsfDbsDeclareshipResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}