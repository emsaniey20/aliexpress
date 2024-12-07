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
*  aliexpress.merchant.partner.auth.check
*/
public class AliexpressMerchantPartnerAuthCheckRequest extends BaseGopRequest<AliexpressMerchantPartnerAuthCheckResponse> {

    /** 请求 */
    private AliexpressMerchantPartnerAuthCheckAuthCheckRequest paramAuthCheckRequest;

    public AliexpressMerchantPartnerAuthCheckAuthCheckRequest getParamAuthCheckRequest(){
        return this.paramAuthCheckRequest;
    }
    public void setParamAuthCheckRequest(AliexpressMerchantPartnerAuthCheckAuthCheckRequest paramAuthCheckRequest){
        this.paramAuthCheckRequest = paramAuthCheckRequest;
        }

    @Override
    public String getApiName() {
        return "aliexpress.merchant.partner.auth.check";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (paramAuthCheckRequest != null) {
                        super.addApiParameter("param_auth_check_request", new JSONWriter(true, false).write(paramAuthCheckRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMerchantPartnerAuthCheckResponse> getResponseClass() {
        return AliexpressMerchantPartnerAuthCheckResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}