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
*  aliexpress.ru.affiliate.order.listbyindex
*/
public class AliexpressRuAffiliateOrderListbyindexRequest extends BaseGopRequest<AliexpressRuAffiliateOrderListbyindexResponse> {

    /** Request */
    private AliexpressRuAffiliateOrderListbyindexPublisherOrderEffectReq paramPublisherOrderEffectReq;

    public AliexpressRuAffiliateOrderListbyindexPublisherOrderEffectReq getParamPublisherOrderEffectReq(){
        return this.paramPublisherOrderEffectReq;
    }
    public void setParamPublisherOrderEffectReq(AliexpressRuAffiliateOrderListbyindexPublisherOrderEffectReq paramPublisherOrderEffectReq){
        this.paramPublisherOrderEffectReq = paramPublisherOrderEffectReq;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ru.affiliate.order.listbyindex";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (paramPublisherOrderEffectReq != null) {
                        super.addApiParameter("param_publisher_order_effect_req", new JSONWriter(true, false).write(paramPublisherOrderEffectReq));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressRuAffiliateOrderListbyindexResponse> getResponseClass() {
        return AliexpressRuAffiliateOrderListbyindexResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}