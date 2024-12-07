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
*  aliexpress.affiliate.featuredpromo.products.get
*/
public class AliexpressAffiliateFeaturedpromoProductsGetRequest extends BaseGopRequest<AliexpressAffiliateFeaturedpromoProductsGetResponse> {

    /** API signature */
    private String appSignature;
    /** Category ID, you can get category ID via "get category" API https://developers.aliexpress.com/en/doc.htm?docId=45801&docType=2 */
    private String categoryId;
    /** Respond parameter list, eg: commission_rate,sale_price */
    private String fields;
    /** Page number */
    private Long pageNo;
    /** record count of each page, 1 - 50 */
    private Long pageSize;
    /** End time of promotion, PST time */
    private String promotionEndTime;
    /** Promotion name, you can get Promotion name via "get featuredpromo info" API. eg. "Hot Product", "New Arrival", "Best Seller", "weeklydeals" */
    private String promotionName;
    /** Start time of promotion, PST time */
    private String promotionStartTime;
    /** sort by：commissionAsc，commissionDesc, priceAsc，priceDesc，volumeAsc、volumeDesc, discountAsc, discountDesc, ratingAsc，ratingDesc, promotionTimeAsc, promotionTimeDesc */
    private String sort;
    /** target currency:USD, GBP, CAD, EUR, UAH, MXN, TRY, RUB, BRL, AUD, INR, JPY, IDR, SEK,KRW */
    private String targetCurrency;
    /** target language:EN,RU,PT,ES,FR,ID,IT,TH,JA,AR,VI,TR,DE,HE,KO,NL,PL,MX,CL,IN */
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
    public String getPromotionEndTime(){
        return this.promotionEndTime;
    }
    public void setPromotionEndTime(String promotionEndTime){
        this.promotionEndTime = promotionEndTime;
        }
    public String getPromotionName(){
        return this.promotionName;
    }
    public void setPromotionName(String promotionName){
        this.promotionName = promotionName;
        }
    public String getPromotionStartTime(){
        return this.promotionStartTime;
    }
    public void setPromotionStartTime(String promotionStartTime){
        this.promotionStartTime = promotionStartTime;
        }
    public String getSort(){
        return this.sort;
    }
    public void setSort(String sort){
        this.sort = sort;
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
        return "aliexpress.affiliate.featuredpromo.products.get";
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
                            if (pageNo != null) {
                        super.addApiParameter("page_no", pageNo.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (promotionEndTime != null) {
                        super.addApiParameter("promotion_end_time", promotionEndTime.toString());
                    }
                            if (promotionName != null) {
                        super.addApiParameter("promotion_name", promotionName.toString());
                    }
                            if (promotionStartTime != null) {
                        super.addApiParameter("promotion_start_time", promotionStartTime.toString());
                    }
                            if (sort != null) {
                        super.addApiParameter("sort", sort.toString());
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
    public Class<AliexpressAffiliateFeaturedpromoProductsGetResponse> getResponseClass() {
        return AliexpressAffiliateFeaturedpromoProductsGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}