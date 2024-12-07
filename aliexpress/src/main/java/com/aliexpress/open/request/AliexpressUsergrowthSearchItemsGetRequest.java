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
*  aliexpress.usergrowth.search.items.get
*/
public class AliexpressUsergrowthSearchItemsGetRequest extends BaseGopRequest<AliexpressUsergrowthSearchItemsGetResponse> {

    /** ship to country */
    private String countryCode;
    /** page index */
    private String pageIndex;
    /** page size */
    private String pageSize;
    /** language */
    private String language;
    /** currency code */
    private String currencyCode;
    /** Third party tracking_id */
    private String trackingId;
    /** user input keypods */
    private List<String> keywords;

    public String getCountryCode(){
        return this.countryCode;
    }
    public void setCountryCode(String countryCode){
        this.countryCode = countryCode;
        }
    public String getPageIndex(){
        return this.pageIndex;
    }
    public void setPageIndex(String pageIndex){
        this.pageIndex = pageIndex;
        }
    public String getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(String pageSize){
        this.pageSize = pageSize;
        }
    public String getLanguage(){
        return this.language;
    }
    public void setLanguage(String language){
        this.language = language;
        }
    public String getCurrencyCode(){
        return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode){
        this.currencyCode = currencyCode;
        }
    public String getTrackingId(){
        return this.trackingId;
    }
    public void setTrackingId(String trackingId){
        this.trackingId = trackingId;
        }
    public List<String> getKeywords(){
        return this.keywords;
    }
    public void setKeywords(List<String> keywords){
        this.keywords = keywords;
        }

    @Override
    public String getApiName() {
        return "aliexpress.usergrowth.search.items.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (countryCode != null) {
                        super.addApiParameter("country_code", countryCode.toString());
                    }
                            if (pageIndex != null) {
                        super.addApiParameter("page_index", pageIndex.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (language != null) {
                        super.addApiParameter("language", language.toString());
                    }
                            if (currencyCode != null) {
                        super.addApiParameter("currency_code", currencyCode.toString());
                    }
                            if (trackingId != null) {
                        super.addApiParameter("tracking_id", trackingId.toString());
                    }
                            if (keywords != null) {
                        super.addApiParameter("keywords", new JSONWriter(true, false).write(keywords));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressUsergrowthSearchItemsGetResponse> getResponseClass() {
        return AliexpressUsergrowthSearchItemsGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}