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
*  aliexpress.social.shopping.order.place.query
*/
public class AliexpressSocialShoppingOrderPlaceQueryRequest extends BaseGopRequest<AliexpressSocialShoppingOrderPlaceQueryResponse> {

    /** AE user addressID to deliver */
    private Long addressId;
    /** Buyer country code to deliver */
    private String buyerCountryCode;
    /** Currency */
    private String currencyCode;
    /** Order source label */
    private String dataTrackingType;
    /** Place order info */
    private String productJsonString;
    /** Hashed promocode */
    private String promocodeHash;
    /** deviceId of user, need for security */
    private String deviceId;
    /** user's ip, need for security */
    private String ip;

    public Long getAddressId(){
        return this.addressId;
    }
    public void setAddressId(Long addressId){
        this.addressId = addressId;
        }
    public String getBuyerCountryCode(){
        return this.buyerCountryCode;
    }
    public void setBuyerCountryCode(String buyerCountryCode){
        this.buyerCountryCode = buyerCountryCode;
        }
    public String getCurrencyCode(){
        return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode){
        this.currencyCode = currencyCode;
        }
    public String getDataTrackingType(){
        return this.dataTrackingType;
    }
    public void setDataTrackingType(String dataTrackingType){
        this.dataTrackingType = dataTrackingType;
        }
    public String getProductJsonString(){
        return this.productJsonString;
    }
    public void setProductJsonString(String productJsonString){
        this.productJsonString = productJsonString;
        }
    public String getPromocodeHash(){
        return this.promocodeHash;
    }
    public void setPromocodeHash(String promocodeHash){
        this.promocodeHash = promocodeHash;
        }
    public String getDeviceId(){
        return this.deviceId;
    }
    public void setDeviceId(String deviceId){
        this.deviceId = deviceId;
        }
    public String getIp(){
        return this.ip;
    }
    public void setIp(String ip){
        this.ip = ip;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.shopping.order.place.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (addressId != null) {
                        super.addApiParameter("address_id", addressId.toString());
                    }
                            if (buyerCountryCode != null) {
                        super.addApiParameter("buyer_country_code", buyerCountryCode.toString());
                    }
                            if (currencyCode != null) {
                        super.addApiParameter("currency_code", currencyCode.toString());
                    }
                            if (dataTrackingType != null) {
                        super.addApiParameter("data_tracking_type", dataTrackingType.toString());
                    }
                            if (productJsonString != null) {
                        super.addApiParameter("product_json_string", productJsonString.toString());
                    }
                            if (promocodeHash != null) {
                        super.addApiParameter("promocode_hash", promocodeHash.toString());
                    }
                            if (deviceId != null) {
                        super.addApiParameter("device_id", deviceId.toString());
                    }
                            if (ip != null) {
                        super.addApiParameter("ip", ip.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialShoppingOrderPlaceQueryResponse> getResponseClass() {
        return AliexpressSocialShoppingOrderPlaceQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}