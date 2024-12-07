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
*  aliexpress.sellercenter.proxy.brand.revoke
*/
public class AliexpressSellercenterProxyBrandRevokeRequest extends BaseGopRequest<AliexpressSellercenterProxyBrandRevokeResponse> {

    /** Seller ID */
    private Long sellerId;
    /** Brand ID */
    private Long brandId;
    /** Biz ID */
    private Long bizId;

    public Long getSellerId(){
        return this.sellerId;
    }
    public void setSellerId(Long sellerId){
        this.sellerId = sellerId;
        }
    public Long getBrandId(){
        return this.brandId;
    }
    public void setBrandId(Long brandId){
        this.brandId = brandId;
        }
    public Long getBizId(){
        return this.bizId;
    }
    public void setBizId(Long bizId){
        this.bizId = bizId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.sellercenter.proxy.brand.revoke";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (sellerId != null) {
                        super.addApiParameter("seller_id", sellerId.toString());
                    }
                            if (brandId != null) {
                        super.addApiParameter("brand_id", brandId.toString());
                    }
                            if (bizId != null) {
                        super.addApiParameter("biz_id", bizId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressSellercenterProxyBrandRevokeResponse> getResponseClass() {
        return AliexpressSellercenterProxyBrandRevokeResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}