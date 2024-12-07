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
*  aliexpress.asf.shipment.pack
*/
public class AliexpressAsfShipmentPackRequest extends BaseGopRequest<AliexpressAsfShipmentPackResponse> {

    /** tradeOrderId */
    private Long tradeOrderId;
    /** tradeOrderItemIdList */
    private List<AliexpressAsfShipmentPackTradeOrderItemDTO> tradeOrderItemIdList;
    /** addressId */
    private String addressId;
    /** sendOption */
    private String sendOption;
    /** 多语言 */
    private String locale;

    public Long getTradeOrderId(){
        return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId){
        this.tradeOrderId = tradeOrderId;
        }
    public List<AliexpressAsfShipmentPackTradeOrderItemDTO> getTradeOrderItemIdList(){
        return this.tradeOrderItemIdList;
    }
    public void setTradeOrderItemIdList(List<AliexpressAsfShipmentPackTradeOrderItemDTO> tradeOrderItemIdList){
        this.tradeOrderItemIdList = tradeOrderItemIdList;
        }
    public String getAddressId(){
        return this.addressId;
    }
    public void setAddressId(String addressId){
        this.addressId = addressId;
        }
    public String getSendOption(){
        return this.sendOption;
    }
    public void setSendOption(String sendOption){
        this.sendOption = sendOption;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }

    @Override
    public String getApiName() {
        return "aliexpress.asf.shipment.pack";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (tradeOrderId != null) {
                        super.addApiParameter("tradeOrderId", tradeOrderId.toString());
                    }
                            if (tradeOrderItemIdList != null) {
                        super.addApiParameter("tradeOrderItemIdList", new JSONWriter(true, false).write(tradeOrderItemIdList));
                    }
                            if (addressId != null) {
                        super.addApiParameter("addressId", addressId.toString());
                    }
                            if (sendOption != null) {
                        super.addApiParameter("sendOption", sendOption.toString());
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
    public Class<AliexpressAsfShipmentPackResponse> getResponseClass() {
        return AliexpressAsfShipmentPackResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}