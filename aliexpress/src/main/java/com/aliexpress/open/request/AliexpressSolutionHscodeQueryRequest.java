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
*  aliexpress.solution.hscode.query
*/
public class AliexpressSolutionHscodeQueryRequest extends BaseGopRequest<AliexpressSolutionHscodeQueryResponse> {

    /** country code */
    private String countryCode;
    /** Leaf category ID in Aliexpress */
    private Long categoryId;

    public String getCountryCode(){
        return this.countryCode;
    }
    public void setCountryCode(String countryCode){
        this.countryCode = countryCode;
        }
    public Long getCategoryId(){
        return this.categoryId;
    }
    public void setCategoryId(Long categoryId){
        this.categoryId = categoryId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.hscode.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (countryCode != null) {
                        super.addApiParameter("country_code", countryCode.toString());
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
    public Class<AliexpressSolutionHscodeQueryResponse> getResponseClass() {
        return AliexpressSolutionHscodeQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}