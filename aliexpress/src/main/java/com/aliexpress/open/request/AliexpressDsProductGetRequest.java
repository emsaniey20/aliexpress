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
*  aliexpress.ds.product.get
*/
public class AliexpressDsProductGetRequest extends BaseGopRequest<AliexpressDsProductGetResponse> {

    /** Country */
    private String shipToCountry;
    /** Item ID */
    private Long productId;
    /** Target currency */
    private String targetCurrency;
    /** Target language */
    private String targetLanguage;

    public String getShipToCountry(){
        return this.shipToCountry;
    }
    public void setShipToCountry(String shipToCountry){
        this.shipToCountry = shipToCountry;
        }
    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
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

    @Override
    public String getApiName() {
        return "aliexpress.ds.product.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (shipToCountry != null) {
                        super.addApiParameter("ship_to_country", shipToCountry.toString());
                    }
                            if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (targetCurrency != null) {
                        super.addApiParameter("target_currency", targetCurrency.toString());
                    }
                            if (targetLanguage != null) {
                        super.addApiParameter("target_language", targetLanguage.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressDsProductGetResponse> getResponseClass() {
        return AliexpressDsProductGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}