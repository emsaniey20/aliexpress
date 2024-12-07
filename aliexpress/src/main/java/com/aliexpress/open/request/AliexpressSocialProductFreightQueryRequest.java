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
*  aliexpress.social.product.freight.query
*/
public class AliexpressSocialProductFreightQueryRequest extends BaseGopRequest<AliexpressSocialProductFreightQueryResponse> {

    /** Product id */
    private Long productId;
    /** Amount */
    private Integer quantity;
    /** Country to ship from */
    private String shipFromCountry;
    /** Country to ship to */
    private String shipToCountry;
    /** Curreny */
    private String currency;

    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public Integer getQuantity(){
        return this.quantity;
    }
    public void setQuantity(Integer quantity){
        this.quantity = quantity;
        }
    public String getShipFromCountry(){
        return this.shipFromCountry;
    }
    public void setShipFromCountry(String shipFromCountry){
        this.shipFromCountry = shipFromCountry;
        }
    public String getShipToCountry(){
        return this.shipToCountry;
    }
    public void setShipToCountry(String shipToCountry){
        this.shipToCountry = shipToCountry;
        }
    public String getCurrency(){
        return this.currency;
    }
    public void setCurrency(String currency){
        this.currency = currency;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.product.freight.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (quantity != null) {
                        super.addApiParameter("quantity", quantity.toString());
                    }
                            if (shipFromCountry != null) {
                        super.addApiParameter("ship_from_country", shipFromCountry.toString());
                    }
                            if (shipToCountry != null) {
                        super.addApiParameter("ship_to_country", shipToCountry.toString());
                    }
                            if (currency != null) {
                        super.addApiParameter("currency", currency.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialProductFreightQueryResponse> getResponseClass() {
        return AliexpressSocialProductFreightQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}