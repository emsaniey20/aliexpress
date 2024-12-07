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
*  aliexpress.member.queryaccountstatus
*/
public class AliexpressMemberQueryaccountstatusRequest extends BaseGopRequest<AliexpressMemberQueryaccountstatusResponse> {

    /** 用户accountId */
    private Long accountId;

    public Long getAccountId(){
        return this.accountId;
    }
    public void setAccountId(Long accountId){
        this.accountId = accountId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.member.queryaccountstatus";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (accountId != null) {
                        super.addApiParameter("accountId", accountId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMemberQueryaccountstatusResponse> getResponseClass() {
        return AliexpressMemberQueryaccountstatusResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}