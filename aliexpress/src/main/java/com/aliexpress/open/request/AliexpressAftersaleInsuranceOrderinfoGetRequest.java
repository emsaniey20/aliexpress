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
*  aliexpress.aftersale.insurance.orderinfo.get
*/
public class AliexpressAftersaleInsuranceOrderinfoGetRequest extends BaseGopRequest<AliexpressAftersaleInsuranceOrderinfoGetResponse> {

    /** 订单号 */
    private Long bizOrderId;

    public Long getBizOrderId(){
        return this.bizOrderId;
    }
    public void setBizOrderId(Long bizOrderId){
        this.bizOrderId = bizOrderId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.aftersale.insurance.orderinfo.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (bizOrderId != null) {
                        super.addApiParameter("biz_order_id", bizOrderId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAftersaleInsuranceOrderinfoGetResponse> getResponseClass() {
        return AliexpressAftersaleInsuranceOrderinfoGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}