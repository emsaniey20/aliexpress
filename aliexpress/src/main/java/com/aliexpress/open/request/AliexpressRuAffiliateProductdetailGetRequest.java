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
*  aliexpress.ru.affiliate.productdetail.get
*/
public class AliexpressRuAffiliateProductdetailGetRequest extends BaseGopRequest<AliexpressRuAffiliateProductdetailGetResponse> {

    /** Product ids */
    private String productIds;
    /** Publisher id */
    private Long publisherId;
    /** Target currencies: USD, GBP, CAD, EUR, UAH, MXN, TRY, RUB, BRL, AUD, INR, JPY, IDR, SEK, KRW */
    private String targetCurrency;
    /** Target language: EN, RU, PT, ES, FR, ID, IT, TH, JA, AR, VI, TR, DE, HE, KO, NL, PL, MX, CL, IW, IN */
    private String targetLanguage;
    /** Tracking id */
    private String trackingId;

    public String getProductIds(){
        return this.productIds;
    }
    public void setProductIds(String productIds){
        this.productIds = productIds;
        }
    public Long getPublisherId(){
        return this.publisherId;
    }
    public void setPublisherId(Long publisherId){
        this.publisherId = publisherId;
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

    @Override
    public String getApiName() {
        return "aliexpress.ru.affiliate.productdetail.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productIds != null) {
                        super.addApiParameter("product_ids", productIds.toString());
                    }
                            if (publisherId != null) {
                        super.addApiParameter("publisher_id", publisherId.toString());
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
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressRuAffiliateProductdetailGetResponse> getResponseClass() {
        return AliexpressRuAffiliateProductdetailGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}