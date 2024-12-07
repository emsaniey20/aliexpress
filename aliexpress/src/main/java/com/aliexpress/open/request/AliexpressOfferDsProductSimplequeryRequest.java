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
*  aliexpress.offer.ds.product.simplequery
*/
public class AliexpressOfferDsProductSimplequeryRequest extends BaseGopRequest<AliexpressOfferDsProductSimplequeryResponse> {

    /** 商品ID */
    private Long productId;
    /** 国家 */
    private String localCountry;
    /** 语言 */
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
        return "aliexpress.offer.ds.product.simplequery";
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
    public Class<AliexpressOfferDsProductSimplequeryResponse> getResponseClass() {
        return AliexpressOfferDsProductSimplequeryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}