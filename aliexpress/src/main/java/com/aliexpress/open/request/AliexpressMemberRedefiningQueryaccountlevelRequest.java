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
*  aliexpress.member.redefining.queryaccountlevel
*/
public class AliexpressMemberRedefiningQueryaccountlevelRequest extends BaseGopRequest<AliexpressMemberRedefiningQueryaccountlevelResponse> {

    /** 买家账号ID */
    private String loginId;

    public String getLoginId(){
        return this.loginId;
    }
    public void setLoginId(String loginId){
        this.loginId = loginId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.member.redefining.queryaccountlevel";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (loginId != null) {
                        super.addApiParameter("login_id", loginId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMemberRedefiningQueryaccountlevelResponse> getResponseClass() {
        return AliexpressMemberRedefiningQueryaccountlevelResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}