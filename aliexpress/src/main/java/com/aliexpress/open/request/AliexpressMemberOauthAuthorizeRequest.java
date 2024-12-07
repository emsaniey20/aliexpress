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
*  aliexpress.member.oauth.authorize
*/
public class AliexpressMemberOauthAuthorizeRequest extends BaseGopRequest<AliexpressMemberOauthAuthorizeResponse> {

    /** response type */
    private String responseType;
    /** sns auth code */
    private String snsAuthorizationCode;
    /** sns type */
    private String snsType;
    /** auto register or not */
    private Boolean autoRegister;

    public String getResponseType(){
        return this.responseType;
    }
    public void setResponseType(String responseType){
        this.responseType = responseType;
        }
    public String getSnsAuthorizationCode(){
        return this.snsAuthorizationCode;
    }
    public void setSnsAuthorizationCode(String snsAuthorizationCode){
        this.snsAuthorizationCode = snsAuthorizationCode;
        }
    public String getSnsType(){
        return this.snsType;
    }
    public void setSnsType(String snsType){
        this.snsType = snsType;
        }
    public Boolean getAutoRegister(){
        return this.autoRegister;
    }
    public void setAutoRegister(Boolean autoRegister){
        this.autoRegister = autoRegister;
        }

    @Override
    public String getApiName() {
        return "aliexpress.member.oauth.authorize";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (responseType != null) {
                        super.addApiParameter("response_type", responseType.toString());
                    }
                            if (snsAuthorizationCode != null) {
                        super.addApiParameter("sns_authorization_code", snsAuthorizationCode.toString());
                    }
                            if (snsType != null) {
                        super.addApiParameter("sns_type", snsType.toString());
                    }
                            if (autoRegister != null) {
                        super.addApiParameter("auto_register", autoRegister.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressMemberOauthAuthorizeResponse> getResponseClass() {
        return AliexpressMemberOauthAuthorizeResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}