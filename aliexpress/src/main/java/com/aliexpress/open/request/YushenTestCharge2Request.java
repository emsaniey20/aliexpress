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
*  /yushen/test/charge2
*/
public class YushenTestCharge2Request extends BaseGopRequest<YushenTestCharge2Response> {

    /** 发货国 */
    private String country;
    /** 登陆ID */
    private String loginId;

    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
        }
    public String getLoginId(){
        return this.loginId;
    }
    public void setLoginId(String loginId){
        this.loginId = loginId;
        }

    @Override
    public String getApiName() {
        return "/yushen/test/charge2";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (country != null) {
                        super.addApiParameter("country", country.toString());
                    }
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
    public Class<YushenTestCharge2Response> getResponseClass() {
        return YushenTestCharge2Response.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}