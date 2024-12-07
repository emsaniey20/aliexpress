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
*  aliexpress.issue.partner.order.issues.get
*/
public class AliexpressIssuePartnerOrderIssuesGetRequest extends BaseGopRequest<AliexpressIssuePartnerOrderIssuesGetResponse> {

    /** 主订单id */
    private Long parentOrderId;

    public Long getParentOrderId(){
        return this.parentOrderId;
    }
    public void setParentOrderId(Long parentOrderId){
        this.parentOrderId = parentOrderId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.issue.partner.order.issues.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (parentOrderId != null) {
                        super.addApiParameter("parent_order_id", parentOrderId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressIssuePartnerOrderIssuesGetResponse> getResponseClass() {
        return AliexpressIssuePartnerOrderIssuesGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}