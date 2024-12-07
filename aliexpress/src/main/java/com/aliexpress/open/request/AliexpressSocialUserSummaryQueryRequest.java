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
*  aliexpress.social.user.summary.query
*/
public class AliexpressSocialUserSummaryQueryRequest extends BaseGopRequest<AliexpressSocialUserSummaryQueryResponse> {

    /** Order time filter (LAST_30_DAYS, LAST_3_MONTHS, LAST_6_MONTHS) */
    private String orderFilter;
    /** sns user id */
    private Long snsId;
    /** SNS platform */
    private String snsPartner;

    public String getOrderFilter(){
        return this.orderFilter;
    }
    public void setOrderFilter(String orderFilter){
        this.orderFilter = orderFilter;
        }
    public Long getSnsId(){
        return this.snsId;
    }
    public void setSnsId(Long snsId){
        this.snsId = snsId;
        }
    public String getSnsPartner(){
        return this.snsPartner;
    }
    public void setSnsPartner(String snsPartner){
        this.snsPartner = snsPartner;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.user.summary.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (orderFilter != null) {
                        super.addApiParameter("order_filter", orderFilter.toString());
                    }
                            if (snsId != null) {
                        super.addApiParameter("sns_id", snsId.toString());
                    }
                            if (snsPartner != null) {
                        super.addApiParameter("sns_partner", snsPartner.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialUserSummaryQueryResponse> getResponseClass() {
        return AliexpressSocialUserSummaryQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}