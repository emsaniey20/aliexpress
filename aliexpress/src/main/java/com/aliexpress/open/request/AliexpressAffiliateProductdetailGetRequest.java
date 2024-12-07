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
*  aliexpress.affiliate.productdetail.get
*/
public class AliexpressAffiliateProductdetailGetRequest extends BaseGopRequest<AliexpressAffiliateProductdetailGetResponse> {

    /** API signature */
    private String appSignature;
    /** Respond parameter list. eg: commission_rate,sale_price */
    private String fields;
    /** Product ids */
    private String productIds;
    /** target currency:USD, GBP, CAD, EUR, UAH, MXN, TRY, RUB, BRL, AUD, INR, JPY, IDR, SEK,KRW */
    private String targetCurrency;
    /** Target Language :EN,RU,PT,ES,FR,ID,IT,TH,JA,AR,VI,TR,DE,HE,KO,NL,PL,MX,CL,IN */
    private String targetLanguage;
    /** Your trackingID */
    private String trackingId;
    /** The Ship to country. Filter products that can be sent to that country; Returns the price according to the country’s tax rate policy. */
    private String country;

    public String getAppSignature(){
        return this.appSignature;
    }
    public void setAppSignature(String appSignature){
        this.appSignature = appSignature;
        }
    public String getFields(){
        return this.fields;
    }
    public void setFields(String fields){
        this.fields = fields;
        }
    public String getProductIds(){
        return this.productIds;
    }
    public void setProductIds(String productIds){
        this.productIds = productIds;
        }
    public String getTargetCurrency(){
        return this.targetCurrency;
    }
    public void setTargetCurrency(String targetCurrency){
        this.targetCurrency = targetCurrency;
        }
    public String getTargetLanguage(){
        return this.targetLanguage;
    }
    public void setTargetLanguage(String targetLanguage){
        this.targetLanguage = targetLanguage;
        }
    public String getTrackingId(){
        return this.trackingId;
    }
    public void setTrackingId(String trackingId){
        this.trackingId = trackingId;
        }
    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
        }

    @Override
    public String getApiName() {
        return "aliexpress.affiliate.productdetail.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (appSignature != null) {
                        super.addApiParameter("app_signature", appSignature.toString());
                    }
                            if (fields != null) {
                        super.addApiParameter("fields", fields.toString());
                    }
                            if (productIds != null) {
                        super.addApiParameter("product_ids", productIds.toString());
                    }
                            if (targetCurrency != null) {
                        super.addApiParameter("target_currency", targetCurrency.toString());
                    }
                            if (targetLanguage != null) {
                        super.addApiParameter("target_language", targetLanguage.toString());
                    }
                            if (trackingId != null) {
                        super.addApiParameter("tracking_id", trackingId.toString());
                    }
                            if (country != null) {
                        super.addApiParameter("country", country.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressAffiliateProductdetailGetResponse> getResponseClass() {
        return AliexpressAffiliateProductdetailGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}