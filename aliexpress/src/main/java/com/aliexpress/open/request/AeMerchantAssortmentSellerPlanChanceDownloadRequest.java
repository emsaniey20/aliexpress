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
*  ae.merchant.assortment.seller.plan.chance.download
*/
public class AeMerchantAssortmentSellerPlanChanceDownloadRequest extends BaseGopRequest<AeMerchantAssortmentSellerPlanChanceDownloadResponse> {

    /** 补品计划id */
    private Long planId;

    public Long getPlanId(){
        return this.planId;
    }
    public void setPlanId(Long planId){
        this.planId = planId;
        }

    @Override
    public String getApiName() {
        return "ae.merchant.assortment.seller.plan.chance.download";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (planId != null) {
                        super.addApiParameter("planId", planId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AeMerchantAssortmentSellerPlanChanceDownloadResponse> getResponseClass() {
        return AeMerchantAssortmentSellerPlanChanceDownloadResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}