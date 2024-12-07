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
*  aliexpress.sellercenter.proxy.brand.search
*/
public class AliexpressSellercenterProxyBrandSearchRequest extends BaseGopRequest<AliexpressSellercenterProxyBrandSearchResponse> {

    /** Seller ID */
    private Long sellerId;
    /** Search name */
    private String name;

    public Long getSellerId(){
        return this.sellerId;
    }
    public void setSellerId(Long sellerId){
        this.sellerId = sellerId;
        }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
        }

    @Override
    public String getApiName() {
        return "aliexpress.sellercenter.proxy.brand.search";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (sellerId != null) {
                        super.addApiParameter("seller_id", sellerId.toString());
                    }
                            if (name != null) {
                        super.addApiParameter("name", name.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressSellercenterProxyBrandSearchResponse> getResponseClass() {
        return AliexpressSellercenterProxyBrandSearchResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}