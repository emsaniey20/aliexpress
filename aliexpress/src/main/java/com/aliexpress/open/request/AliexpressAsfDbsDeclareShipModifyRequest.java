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
*  aliexpress.asf.dbs.declare.ship.modify
*/
public class AliexpressAsfDbsDeclareShipModifyRequest extends BaseGopRequest<AliexpressAsfDbsDeclareShipModifyResponse> {

    /** oldTrackingNumber */
    private String oldTrackingNumber;
    /** tradeOrderId */
    private String tradeOrderId;
    /** newShipmentProviderCode */
    private String newShipmentProviderCode;
    /** newTrackingNumber */
    private String newTrackingNumber;
    /** locale */
    private String locale;

    public String getOldTrackingNumber(){
        return this.oldTrackingNumber;
    }
    public void setOldTrackingNumber(String oldTrackingNumber){
        this.oldTrackingNumber = oldTrackingNumber;
        }
    public String getTradeOrderId(){
        return this.tradeOrderId;
    }
    public void setTradeOrderId(String tradeOrderId){
        this.tradeOrderId = tradeOrderId;
        }
    public String getNewShipmentProviderCode(){
        return this.newShipmentProviderCode;
    }
    public void setNewShipmentProviderCode(String newShipmentProviderCode){
        this.newShipmentProviderCode = newShipmentProviderCode;
        }
    public String getNewTrackingNumber(){
        return this.newTrackingNumber;
    }
    public void setNewTrackingNumber(String newTrackingNumber){
        this.newTrackingNumber = newTrackingNumber;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }

    @Override
    public String getApiName() {
        return "aliexpress.asf.dbs.declare.ship.modify";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (oldTrackingNumber != null) {
                        super.addApiParameter("oldTrackingNumber", oldTrackingNumber.toString());
                    }
                            if (tradeOrderId != null) {
                        super.addApiParameter("tradeOrderId", tradeOrderId.toString());
                    }
                            if (newShipmentProviderCode != null) {
                        super.addApiParameter("newShipmentProviderCode", newShipmentProviderCode.toString());
                    }
                            if (newTrackingNumber != null) {
                        super.addApiParameter("newTrackingNumber", newTrackingNumber.toString());
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
    public Class<AliexpressAsfDbsDeclareShipModifyResponse> getResponseClass() {
        return AliexpressAsfDbsDeclareShipModifyResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}