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
*  aliexpress.sellercenter.proxy.vkshops.seller.status.update
*/
public class AliexpressSellercenterProxyVkshopsSellerStatusUpdateRequest extends BaseGopRequest<AliexpressSellercenterProxyVkshopsSellerStatusUpdateResponse> {

    /** MultiMarket seller id */
    private String mmSellerId;
    /** New status */
    private String status;

    public String getMmSellerId(){
        return this.mmSellerId;
    }
    public void setMmSellerId(String mmSellerId){
        this.mmSellerId = mmSellerId;
        }
    public String getStatus(){
        return this.status;
    }
    public void setStatus(String status){
        this.status = status;
        }

    @Override
    public String getApiName() {
        return "aliexpress.sellercenter.proxy.vkshops.seller.status.update";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (mmSellerId != null) {
                        super.addApiParameter("mm_seller_id", mmSellerId.toString());
                    }
                            if (status != null) {
                        super.addApiParameter("status", status.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressSellercenterProxyVkshopsSellerStatusUpdateResponse> getResponseClass() {
        return AliexpressSellercenterProxyVkshopsSellerStatusUpdateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}