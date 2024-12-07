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
*  aliexpress.merchant.partner.alipayuserid.usedstatus.get
*/
public class AliexpressMerchantPartnerAlipayuseridUsedstatusGetRequest extends BaseGopRequest<AliexpressMerchantPartnerAlipayuseridUsedstatusGetResponse> {

    /** 支付宝用户id */
    private String alipayUserId;

    public String getAlipayUserId(){
        return this.alipayUserId;
    }
    public void setAlipayUserId(String alipayUserId){
        this.alipayUserId = alipayUserId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.merchant.partner.alipayuserid.usedstatus.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (alipayUserId != null) {
                        super.addApiParameter("alipay_user_id", alipayUserId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMerchantPartnerAlipayuseridUsedstatusGetResponse> getResponseClass() {
        return AliexpressMerchantPartnerAlipayuseridUsedstatusGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}