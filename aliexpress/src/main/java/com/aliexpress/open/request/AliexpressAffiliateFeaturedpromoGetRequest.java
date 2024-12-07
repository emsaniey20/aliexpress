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
*  aliexpress.affiliate.featuredpromo.get
*/
public class AliexpressAffiliateFeaturedpromoGetRequest extends BaseGopRequest<AliexpressAffiliateFeaturedpromoGetResponse> {

    /** API signature */
    private String appSignature;

    public String getAppSignature(){
        return this.appSignature;
    }
    public void setAppSignature(String appSignature){
        this.appSignature = appSignature;
        }

    @Override
    public String getApiName() {
        return "aliexpress.affiliate.featuredpromo.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (appSignature != null) {
                        super.addApiParameter("app_signature", appSignature.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAffiliateFeaturedpromoGetResponse> getResponseClass() {
        return AliexpressAffiliateFeaturedpromoGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}