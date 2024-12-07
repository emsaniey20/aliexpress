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
*  /auth/token/create
*/
public class AuthTokenCreateRequest extends BaseGopRequest<AuthTokenCreateResponse> {

    /** oauth code, get from app callback URL */
    private String code;
    /** uuid */
    private String uuid;

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
        }
    public String getUuid(){
        return this.uuid;
    }
    public void setUuid(String uuid){
        this.uuid = uuid;
        }

    @Override
    public String getApiName() {
        return "/auth/token/create";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (code != null) {
                        super.addApiParameter("code", code.toString());
                    }
                            if (uuid != null) {
                        super.addApiParameter("uuid", uuid.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AuthTokenCreateResponse> getResponseClass() {
        return AuthTokenCreateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}