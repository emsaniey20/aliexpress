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
*  /ds/product/get
*/
public class DsProductGetRequest extends BaseGopRequest<DsProductGetResponse> {

    /** product id */
    private Long productId;
    /** local country */
    private String localCountry;
    /** local language */
    private String localLanguage;

    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public String getLocalCountry(){
        return this.localCountry;
    }
    public void setLocalCountry(String localCountry){
        this.localCountry = localCountry;
        }
    public String getLocalLanguage(){
        return this.localLanguage;
    }
    public void setLocalLanguage(String localLanguage){
        this.localLanguage = localLanguage;
        }

    @Override
    public String getApiName() {
        return "/ds/product/get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (localCountry != null) {
                        super.addApiParameter("local_country", localCountry.toString());
                    }
                            if (localLanguage != null) {
                        super.addApiParameter("local_language", localLanguage.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<DsProductGetResponse> getResponseClass() {
        return DsProductGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}