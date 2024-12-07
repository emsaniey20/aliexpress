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
*  aliexpress.marketing.redefining.getactlist
*/
public class AliexpressMarketingRedefiningGetactlistRequest extends BaseGopRequest<AliexpressMarketingRedefiningGetactlistResponse> {

    /** 服务入参 */
    private AliexpressMarketingRedefiningGetactlistSellerCouponActivityApiQuery paramSellerCouponActivityApiQuery;

    public AliexpressMarketingRedefiningGetactlistSellerCouponActivityApiQuery getParamSellerCouponActivityApiQuery(){
        return this.paramSellerCouponActivityApiQuery;
    }
    public void setParamSellerCouponActivityApiQuery(AliexpressMarketingRedefiningGetactlistSellerCouponActivityApiQuery paramSellerCouponActivityApiQuery){
        this.paramSellerCouponActivityApiQuery = paramSellerCouponActivityApiQuery;
        }

    @Override
    public String getApiName() {
        return "aliexpress.marketing.redefining.getactlist";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (paramSellerCouponActivityApiQuery != null) {
                        super.addApiParameter("param_seller_coupon_activity_api_query", new JSONWriter(true, false).write(paramSellerCouponActivityApiQuery));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMarketingRedefiningGetactlistResponse> getResponseClass() {
        return AliexpressMarketingRedefiningGetactlistResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}