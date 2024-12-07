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
*  aliexpress.affiliate.order.get
*/
public class AliexpressAffiliateOrderGetRequest extends BaseGopRequest<AliexpressAffiliateOrderGetResponse> {

    /** API signature */
    private String appSignature;
    /** Respond parameter */
    private String fields;
    /** Order ID list, separated by comma. Query by sub order id is supported */
    private String orderIds;

    public String getAppSignature(){
        return this.appSignature;
    }
    public void setAppSignature(String appSignature){
        this.appSignature = appSignature;
        }
    public String getFields(){
        return this.fields;
    }
    public void setFields(String fields){
        this.fields = fields;
        }
    public String getOrderIds(){
        return this.orderIds;
    }
    public void setOrderIds(String orderIds){
        this.orderIds = orderIds;
        }

    @Override
    public String getApiName() {
        return "aliexpress.affiliate.order.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (appSignature != null) {
                        super.addApiParameter("app_signature", appSignature.toString());
                    }
                            if (fields != null) {
                        super.addApiParameter("fields", fields.toString());
                    }
                            if (orderIds != null) {
                        super.addApiParameter("order_ids", orderIds.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressAffiliateOrderGetResponse> getResponseClass() {
        return AliexpressAffiliateOrderGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}