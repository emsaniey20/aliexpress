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
*  aliexpress.offer.redefining.querybundle
*/
public class AliexpressOfferRedefiningQuerybundleRequest extends BaseGopRequest<AliexpressOfferRedefiningQuerybundleResponse> {

    /** 查询入参 */
    private AliexpressOfferRedefiningQuerybundleAeopOfferBundleQueryCondition paramAeopOfferBundleQueryCondition;

    public AliexpressOfferRedefiningQuerybundleAeopOfferBundleQueryCondition getParamAeopOfferBundleQueryCondition(){
        return this.paramAeopOfferBundleQueryCondition;
    }
    public void setParamAeopOfferBundleQueryCondition(AliexpressOfferRedefiningQuerybundleAeopOfferBundleQueryCondition paramAeopOfferBundleQueryCondition){
        this.paramAeopOfferBundleQueryCondition = paramAeopOfferBundleQueryCondition;
        }

    @Override
    public String getApiName() {
        return "aliexpress.offer.redefining.querybundle";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (paramAeopOfferBundleQueryCondition != null) {
                        super.addApiParameter("param_aeop_offer_bundle_query_condition", new JSONWriter(true, false).write(paramAeopOfferBundleQueryCondition));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressOfferRedefiningQuerybundleResponse> getResponseClass() {
        return AliexpressOfferRedefiningQuerybundleResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}