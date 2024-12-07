package com.aliexpress.open.domain;

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
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;

public class CainiaoGlobalCommithandovercontentUpdateUserInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 国家编码(选填) */
                @ApiField("country")
            private String country;
        /** 登陆账号(必填) */
                @ApiField("login_id")
            private String loginId;
        /** 商家id(选填) */
                @ApiField("seller_id")
            private String sellerId;
        /** 对应创建物流单的时候传入的top_user_key;跨店铺场景需要传入 */
                @ApiField("top_user_key")
            private String topUserKey;
        /** 业务类型(选填) */
                @ApiField("biz_source")
            private String bizSource;
        /** 用户Key(选填) */
                @ApiField("app_user_key")
            private String appUserKey;
        /** 用户id(选填) */
                @ApiField("user_id")
            private String userId;
    
        public String getCountry() {
    return this.country;
    }
    public void setCountry(String country) {
    this.country = country;
    }
        public String getLoginId() {
    return this.loginId;
    }
    public void setLoginId(String loginId) {
    this.loginId = loginId;
    }
        public String getSellerId() {
    return this.sellerId;
    }
    public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
    }
        public String getTopUserKey() {
    return this.topUserKey;
    }
    public void setTopUserKey(String topUserKey) {
    this.topUserKey = topUserKey;
    }
        public String getBizSource() {
    return this.bizSource;
    }
    public void setBizSource(String bizSource) {
    this.bizSource = bizSource;
    }
        public String getAppUserKey() {
    return this.appUserKey;
    }
    public void setAppUserKey(String appUserKey) {
    this.appUserKey = appUserKey;
    }
        public String getUserId() {
    return this.userId;
    }
    public void setUserId(String userId) {
    this.userId = userId;
    }
    }