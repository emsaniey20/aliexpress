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
*  aliexpress.merchant.partner.personauth.get
*/
public class AliexpressMerchantPartnerPersonauthGetRequest extends BaseGopRequest<AliexpressMerchantPartnerPersonauthGetResponse> {

    /** 123456 */
    private String havanaId;

    public String getHavanaId(){
        return this.havanaId;
    }
    public void setHavanaId(String havanaId){
        this.havanaId = havanaId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.merchant.partner.personauth.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (havanaId != null) {
                        super.addApiParameter("havana_id", havanaId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMerchantPartnerPersonauthGetResponse> getResponseClass() {
        return AliexpressMerchantPartnerPersonauthGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}