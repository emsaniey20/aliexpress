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
*  aliexpress.marketing.redefining.findsellercouponactivity
*/
public class AliexpressMarketingRedefiningFindsellercouponactivityRequest extends BaseGopRequest<AliexpressMarketingRedefiningFindsellercouponactivityResponse> {

    /** Coupon活动ID */
    private Long activityId;

    public Long getActivityId(){
        return this.activityId;
    }
    public void setActivityId(Long activityId){
        this.activityId = activityId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.marketing.redefining.findsellercouponactivity";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (activityId != null) {
                        super.addApiParameter("activity_id", activityId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMarketingRedefiningFindsellercouponactivityResponse> getResponseClass() {
        return AliexpressMarketingRedefiningFindsellercouponactivityResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}