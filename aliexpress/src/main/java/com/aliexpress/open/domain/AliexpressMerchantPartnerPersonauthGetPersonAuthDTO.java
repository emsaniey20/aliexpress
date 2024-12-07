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

public class AliexpressMerchantPartnerPersonauthGetPersonAuthDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 支付宝登录账号 */
                @ApiField("partner_account_id")
            private String partnerAccountId;
        /** 注册号 */
                @ApiField("cert_no")
            private String certNo;
        /** 公司名 */
                @ApiField("firm_name")
            private String firmName;
        /** 支付宝Id */
                @ApiField("user_id")
            private String userId;
        /** 主账号 */
                @ApiField("ali_id")
            private Long aliId;
        /** AE 登陆账号 */
                @ApiField("login_id")
            private String loginId;
        /** 邮箱 */
                @ApiField("email")
            private String email;
        /** 手机号 */
                @ApiField("contact_mobile")
            private String contactMobile;
    
        public String getPartnerAccountId() {
    return this.partnerAccountId;
    }
    public void setPartnerAccountId(String partnerAccountId) {
    this.partnerAccountId = partnerAccountId;
    }
        public String getCertNo() {
    return this.certNo;
    }
    public void setCertNo(String certNo) {
    this.certNo = certNo;
    }
        public String getFirmName() {
    return this.firmName;
    }
    public void setFirmName(String firmName) {
    this.firmName = firmName;
    }
        public String getUserId() {
    return this.userId;
    }
    public void setUserId(String userId) {
    this.userId = userId;
    }
        public Long getAliId() {
    return this.aliId;
    }
    public void setAliId(Long aliId) {
    this.aliId = aliId;
    }
        public String getLoginId() {
    return this.loginId;
    }
    public void setLoginId(String loginId) {
    this.loginId = loginId;
    }
        public String getEmail() {
    return this.email;
    }
    public void setEmail(String email) {
    this.email = email;
    }
        public String getContactMobile() {
    return this.contactMobile;
    }
    public void setContactMobile(String contactMobile) {
    this.contactMobile = contactMobile;
    }
    }