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
*  aliexpress.affiliate.hotproduct.query
*/
public class AliexpressAffiliateHotproductQueryRequest extends BaseGopRequest<AliexpressAffiliateHotproductQueryResponse> {

    /** API signature */
    private String appSignature;
    /** List of category ID, you can get category ID via "get category" API https://developers.aliexpress.com/en/doc.htm?docId=45801&docType=2 */
    private String categoryIds;
    /** Respond parameter list, eg: commission_rate,sale_price */
    private String fields;
    /** Filter products by keywords. eg: mp3 */
    private String keywords;
    /** Filter products by highest price, unit cent */
    private Long maxSalePrice;
    /** Filter products by lowest price, unit cent */
    private Long minSalePrice;
    /** Page number */
    private Long pageNo;
    /** Record count of each page, 1 - 50 */
    private Long pageSize;
    /** product type：ALL,PLAZA,TMALL */
    private String platformProductType;
    /** sort by:SALE_PRICE_ASC, SALE_PRICE_DESC, LAST_VOLUME_ASC, LAST_VOLUME_DESC */
    private String sort;
    /** target currency:USD, GBP, CAD, EUR, UAH, MXN, TRY, RUB, BRL, AUD, INR, JPY, IDR, SEK,KRW */
    private String targetCurrency;
    /** target language:EN,RU,PT,ES,FR,ID,IT,TH,JA,AR,VI,TR,DE,HE,KO,NL,PL,MX,CL,IW,IN */
    private String targetLanguage;
    /** Your trackingID */
    private String trackingId;
    /** Estimated delivery days. 3：in 3 days，5：in 5 days，7：in 7 days，10：in 10 days */
    private String deliveryDays;
    /** The Ship to country. Filter products that can be sent to that country; Returns the price according to the country’s tax rate policy. */
    private String shipToCountry;

    public String getAppSignature(){
        return this.appSignature;
    }
    public void setAppSignature(String appSignature){
        this.appSignature = appSignature;
        }
    public String getCategoryIds(){
        return this.categoryIds;
    }
    public void setCategoryIds(String categoryIds){
        this.categoryIds = categoryIds;
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
    public Long getMaxSalePrice(){
        return this.maxSalePrice;
    }
    public void setMaxSalePrice(Long maxSalePrice){
        this.maxSalePrice = maxSalePrice;
        }
    public Long getMinSalePrice(){
        return this.minSalePrice;
    }
    public void setMinSalePrice(Long minSalePrice){
        this.minSalePrice = minSalePrice;
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
    public String getPlatformProductType(){
        return this.platformProductType;
    }
    public void setPlatformProductType(String platformProductType){
        this.platformProductType = platformProductType;
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
    public String getDeliveryDays(){
        return this.deliveryDays;
    }
    public void setDeliveryDays(String deliveryDays){
        this.deliveryDays = deliveryDays;
        }
    public String getShipToCountry(){
        return this.shipToCountry;
    }
    public void setShipToCountry(String shipToCountry){
        this.shipToCountry = shipToCountry;
        }

    @Override
    public String getApiName() {
        return "aliexpress.affiliate.hotproduct.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (appSignature != null) {
                        super.addApiParameter("app_signature", appSignature.toString());
                    }
                            if (categoryIds != null) {
                        super.addApiParameter("category_ids", categoryIds.toString());
                    }
                            if (fields != null) {
                        super.addApiParameter("fields", fields.toString());
                    }
                            if (keywords != null) {
                        super.addApiParameter("keywords", keywords.toString());
                    }
                            if (maxSalePrice != null) {
                        super.addApiParameter("max_sale_price", maxSalePrice.toString());
                    }
                            if (minSalePrice != null) {
                        super.addApiParameter("min_sale_price", minSalePrice.toString());
                    }
                            if (pageNo != null) {
                        super.addApiParameter("page_no", pageNo.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (platformProductType != null) {
                        super.addApiParameter("platform_product_type", platformProductType.toString());
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
                            if (deliveryDays != null) {
                        super.addApiParameter("delivery_days", deliveryDays.toString());
                    }
                            if (shipToCountry != null) {
                        super.addApiParameter("ship_to_country", shipToCountry.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                                                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressAffiliateHotproductQueryResponse> getResponseClass() {
        return AliexpressAffiliateHotproductQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}