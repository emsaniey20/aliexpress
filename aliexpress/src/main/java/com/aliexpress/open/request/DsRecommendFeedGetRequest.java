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
*  /ds/recommend/feed/get
*/
public class DsRecommendFeedGetRequest extends BaseGopRequest<DsRecommendFeedGetResponse> {

    /** screens the subject product library for the target country */
    private String country;
    /** target currency:USD, GBP, CAD, EUR, UAH, MXN, TRY, RUB, BRL, AUD, INR, JPY, IDR, SEK,KRW */
    private String targetCurrency;
    /** target language:EN,RU,PT,ES,FR,ID,IT,TH,JA,AR,VI,TR,DE,HE,KO,NL,PL,MX,CL,IN */
    private String targetLanguage;
    /** record count of each page, 1 - 50 */
    private Long pageSize;
    /** sort by：priceAsc，priceDesc，volumeAsc、volumeDesc, discountAsc, discountDesc, DSRratingAsc，DSRratingDesc, */
    private String sort;
    /** feed name, eg. "DS bestseller" */
    private String feedName;
    /** Page number */
    private Long pageNo;
    /** Category ID, you can get category ID via "get category" API https://developers.aliexpress.com/en/doc.htm?docId=45801&docType=2 */
    private String categoryId;

    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
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
    public Long getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Long pageSize){
        this.pageSize = pageSize;
        }
    public String getSort(){
        return this.sort;
    }
    public void setSort(String sort){
        this.sort = sort;
        }
    public String getFeedName(){
        return this.feedName;
    }
    public void setFeedName(String feedName){
        this.feedName = feedName;
        }
    public Long getPageNo(){
        return this.pageNo;
    }
    public void setPageNo(Long pageNo){
        this.pageNo = pageNo;
        }
    public String getCategoryId(){
        return this.categoryId;
    }
    public void setCategoryId(String categoryId){
        this.categoryId = categoryId;
        }

    @Override
    public String getApiName() {
        return "/ds/recommend/feed/get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (country != null) {
                        super.addApiParameter("country", country.toString());
                    }
                            if (targetCurrency != null) {
                        super.addApiParameter("target_currency", targetCurrency.toString());
                    }
                            if (targetLanguage != null) {
                        super.addApiParameter("target_language", targetLanguage.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (sort != null) {
                        super.addApiParameter("sort", sort.toString());
                    }
                            if (feedName != null) {
                        super.addApiParameter("feed_name", feedName.toString());
                    }
                            if (pageNo != null) {
                        super.addApiParameter("page_no", pageNo.toString());
                    }
                            if (categoryId != null) {
                        super.addApiParameter("category_id", categoryId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                            return super.getFileParams();
    }

    @Override
    public Class<DsRecommendFeedGetResponse> getResponseClass() {
        return DsRecommendFeedGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}