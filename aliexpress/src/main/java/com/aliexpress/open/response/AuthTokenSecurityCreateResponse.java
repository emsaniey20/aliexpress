package com.aliexpress.open.response;

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
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;
import com.aliexpress.open.domain.*;


/**
*  /auth/token/security/create
*/
public class AuthTokenSecurityCreateResponse extends IopResponse {

    /** The expiring time of the access token, in seconds */
        @ApiField("expires_in")
        private Long expiresIn;
    /** Account ID，Allow null. if(account_platform=seller_center) account_id=null */
        @ApiField("account_id")
        private String accountId;
    /** user id */
        @ApiField("user_id")
        private String userId;
    /** seller id */
        @ApiField("seller_id")
        private String sellerId;
    /** Access token */
        @ApiField("access_token")
        private String accessToken;
    /** Refresh token, used to refresh the token when “refresh_expires_in”>0. */
        @ApiField("refresh_token")
        private String refreshToken;
    /** The expiring time of th refresh token */
        @ApiField("refresh_expires_in")
        private Long refreshExpiresIn;
    /** expire time */
        @ApiField("expire_time")
        private Long expireTime;
    /** refresh token valid time */
        @ApiField("refresh_token_valid_time")
        private Long refreshTokenValidTime;
    /** sp */
        @ApiField("sp")
        private String sp;
    /** locale */
        @ApiField("locale")
        private String locale;

public Long getExpiresIn(){
return this.expiresIn;
}
public void setExpiresIn(Long expiresIn){
    this.expiresIn = expiresIn;
}
public String getAccountId(){
return this.accountId;
}
public void setAccountId(String accountId){
    this.accountId = accountId;
}
public String getUserId(){
return this.userId;
}
public void setUserId(String userId){
    this.userId = userId;
}
public String getSellerId(){
return this.sellerId;
}
public void setSellerId(String sellerId){
    this.sellerId = sellerId;
}
public String getAccessToken(){
return this.accessToken;
}
public void setAccessToken(String accessToken){
    this.accessToken = accessToken;
}
public String getRefreshToken(){
return this.refreshToken;
}
public void setRefreshToken(String refreshToken){
    this.refreshToken = refreshToken;
}
public Long getRefreshExpiresIn(){
return this.refreshExpiresIn;
}
public void setRefreshExpiresIn(Long refreshExpiresIn){
    this.refreshExpiresIn = refreshExpiresIn;
}
public Long getExpireTime(){
return this.expireTime;
}
public void setExpireTime(Long expireTime){
    this.expireTime = expireTime;
}
public Long getRefreshTokenValidTime(){
return this.refreshTokenValidTime;
}
public void setRefreshTokenValidTime(Long refreshTokenValidTime){
    this.refreshTokenValidTime = refreshTokenValidTime;
}
public String getSp(){
return this.sp;
}
public void setSp(String sp){
    this.sp = sp;
}
public String getLocale(){
return this.locale;
}
public void setLocale(String locale){
    this.locale = locale;
}

}