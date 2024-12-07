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
*  aliexpress.affiliate.hotproduct.download
*/
public class AliexpressAffiliateHotproductDownloadRequest extends BaseGopRequest<AliexpressAffiliateHotproductDownloadResponse> {

    /** API signature */
    private String appSignature;
    /** Category ID, you can get category ID via "get category" API https://developers.aliexpress.com/en/doc.htm?docId=45801&docType=2 */
    private String categoryId;
    /** Respond parameter list. eg: commission_rate,sale_price */
    private String fields;
    /** Local site：global, it_site, es_site, ru_site */
    private String localeSite;
    /** Page number */
    private Long pageNo;
    /** record count of each page, 1 - 50 */
    private Long pageSize;
    /** Target Currency:USD, GBP, CAD, EUR, UAH, MXN, TRY, RUB, BRL, AUD, INR, JPY, IDR, SEK,KRW,ILS,THB,CLP,VND */
    private String targetCurrency;
    /** Target Language:EN,RU,PT,ES,FR,ID,IT,TH,JA,AR,VI,TR,DE,HE,KO,NL,PL,MX,CL,IN */
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
    public String getCategoryId(){
        return this.categoryId;
    }
    public void setCategoryId(String categoryId){
        this.categoryId = categoryId;
        }
    public String getFields(){
        return this.fields;
    }
    public void setFields(String fields){
        this.fields = fields;
        }
    public String getLocaleSite(){
        return this.localeSite;
    }
    public void setLocaleSite(String localeSite){
        this.localeSite = localeSite;
        }
    public Long getPageNo(){
        return this.pageNo;
    }
    public void setPageNo(Long pageNo){
        this.pageNo = pageNo;
        }
    public Long getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Long pageSize){
        this.pageSize = pageSize;
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
        return "aliexpress.affiliate.hotproduct.download";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (appSignature != null) {
                        super.addApiParameter("app_signature", appSignature.toString());
                    }
                            if (categoryId != null) {
                        super.addApiParameter("category_id", categoryId.toString());
                    }
                            if (fields != null) {
                        super.addApiParameter("fields", fields.toString());
                    }
                            if (localeSite != null) {
                        super.addApiParameter("locale_site", localeSite.toString());
                    }
                            if (pageNo != null) {
                        super.addApiParameter("page_no", pageNo.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
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
    public Class<AliexpressAffiliateHotproductDownloadResponse> getResponseClass() {
        return AliexpressAffiliateHotproductDownloadResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}