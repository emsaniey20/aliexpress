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
*  /auth/token/security/refresh
*/
public class AuthTokenSecurityRefreshRequest extends BaseGopRequest<AuthTokenSecurityRefreshResponse> {

    /** refresh_token */
    private String refreshToken;

    public String getRefreshToken(){
        return this.refreshToken;
    }
    public void setRefreshToken(String refreshToken){
        this.refreshToken = refreshToken;
        }

    @Override
    public String getApiName() {
        return "/auth/token/security/refresh";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (refreshToken != null) {
                        super.addApiParameter("refresh_token", refreshToken.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AuthTokenSecurityRefreshResponse> getResponseClass() {
        return AuthTokenSecurityRefreshResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}