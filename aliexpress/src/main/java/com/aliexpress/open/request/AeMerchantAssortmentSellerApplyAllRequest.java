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
*  ae.merchant.assortment.seller.apply.all
*/
public class AeMerchantAssortmentSellerApplyAllRequest extends BaseGopRequest<AeMerchantAssortmentSellerApplyAllResponse> {

    /** 类型 */
    private Integer planType;

    public Integer getPlanType(){
        return this.planType;
    }
    public void setPlanType(Integer planType){
        this.planType = planType;
        }

    @Override
    public String getApiName() {
        return "ae.merchant.assortment.seller.apply.all";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (planType != null) {
                        super.addApiParameter("planType", planType.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AeMerchantAssortmentSellerApplyAllResponse> getResponseClass() {
        return AeMerchantAssortmentSellerApplyAllResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}