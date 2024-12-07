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
*  ae.merchant.assortment.seller.plan.chance.list
*/
public class AeMerchantAssortmentSellerPlanChanceListRequest extends BaseGopRequest<AeMerchantAssortmentSellerPlanChanceListResponse> {

    /** 补品计划id */
    private Long planId;
    /** 页码，从1开始 */
    private Integer current;
    /** 每页数量 */
    private Integer pageSize;

    public Long getPlanId(){
        return this.planId;
    }
    public void setPlanId(Long planId){
        this.planId = planId;
        }
    public Integer getCurrent(){
        return this.current;
    }
    public void setCurrent(Integer current){
        this.current = current;
        }
    public Integer getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Integer pageSize){
        this.pageSize = pageSize;
        }

    @Override
    public String getApiName() {
        return "ae.merchant.assortment.seller.plan.chance.list";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (planId != null) {
                        super.addApiParameter("planId", planId.toString());
                    }
                            if (current != null) {
                        super.addApiParameter("current", current.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("pageSize", pageSize.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AeMerchantAssortmentSellerPlanChanceListResponse> getResponseClass() {
        return AeMerchantAssortmentSellerPlanChanceListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}