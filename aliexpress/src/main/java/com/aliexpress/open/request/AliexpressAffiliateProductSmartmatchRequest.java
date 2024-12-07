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
*  aliexpress.affiliate.product.smartmatch
*/
public class AliexpressAffiliateProductSmartmatchRequest extends BaseGopRequest<AliexpressAffiliateProductSmartmatchResponse> {

    /** App information */
    private String app;
    /** API signature */
    private String appSignature;
    /** Device infomation */
    private String device;
    /** adid or idfa, for more information please refer to https://support.google.com/admanager/answer/6238701 Can be null, if it is null, it can be recommended based on keywords or product ID */
    private String deviceId;
    /** Respond parameter list, eg: commission_rate,sale_price */
    private String fields;
    /** Recommend products by keywords. eg: mp3 */
    private String keywords;
    /** Request page number */
    private Integer pageNo;
    /** Product ID, matching related products product ID */
    private String productId;
    /** site information */
    private String site;
    /** Target Currency: USD, GBP, CAD, EUR, UAH, MXN, TRY, RUB, BRL, AUD, INR, JPY, IDR, SEK,KRW,ILS,THB,CLP,VND */
    private String targetCurrency;
    /** Target Languages: EN,RU,PT,ES,FR,ID,IT,TH,JA,AR,VI,TR,DE,HE,KO,NL,PL,MX,CL,IN */
    private String targetLanguage;
    /** trackingId */
    private String trackingId;
    /** user id */
    private String user;
    /** The Ship to country. Filter products that can be sent to that country; Returns the price according to the country’s tax rate policy. */
    private String country;

    public String getApp(){
        return this.app;
    }
    public void setApp(String app){
        this.app = app;
        }
    public String getAppSignature(){
        return this.appSignature;
    }
    public void setAppSignature(String appSignature){
        this.appSignature = appSignature;
        }
    public String getDevice(){
        return this.device;
    }
    public void setDevice(String device){
        this.device = device;
        }
    public String getDeviceId(){
        return this.deviceId;
    }
    public void setDeviceId(String deviceId){
        this.deviceId = deviceId;
        }
    public String getFields(){
        return this.fields;
    }
    public void setFields(String fields){
        this.fields = fields;
        }
    public String getKeywords(){
        return this.keywords;
    }
    public void setKeywords(String keywords){
        this.keywords = keywords;
        }
    public Integer getPageNo(){
        return this.pageNo;
    }
    public void setPageNo(Integer pageNo){
        this.pageNo = pageNo;
        }
    public String getProductId(){
        return this.productId;
    }
    public void setProductId(String productId){
        this.productId = productId;
        }
    public String getSite(){
        return this.site;
    }
    public void setSite(String site){
        this.site = site;
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
    public String getUser(){
        return this.user;
    }
    public void setUser(String user){
        this.user = user;
        }
    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
        }

    @Override
    public String getApiName() {
        return "aliexpress.affiliate.product.smartmatch";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (app != null) {
                        super.addApiParameter("app", app.toString());
                    }
                            if (appSignature != null) {
                        super.addApiParameter("app_signature", appSignature.toString());
                    }
                            if (device != null) {
                        super.addApiParameter("device", device.toString());
                    }
                            if (deviceId != null) {
                        super.addApiParameter("device_id", deviceId.toString());
                    }
                            if (fields != null) {
                        super.addApiParameter("fields", fields.toString());
                    }
                            if (keywords != null) {
                        super.addApiParameter("keywords", keywords.toString());
                    }
                            if (pageNo != null) {
                        super.addApiParameter("page_no", pageNo.toString());
                    }
                            if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (site != null) {
                        super.addApiParameter("site", site.toString());
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
                            if (user != null) {
                        super.addApiParameter("user", user.toString());
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
    public Class<AliexpressAffiliateProductSmartmatchResponse> getResponseClass() {
        return AliexpressAffiliateProductSmartmatchResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}