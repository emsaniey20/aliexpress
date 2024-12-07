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

public class UserdetailGetGlobalUserDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 用户状态 */
                @ApiField("user_status")
            private Integer userStatus;
        /** 国家短码 */
                @ApiField("country_code")
            private String countryCode;
        /** 邮箱地址 */
                @ApiField("email")
            private String email;
        /** 姓名 */
                @ApiField("full_name")
            private String fullName;
        /** 用户id */
                @ApiField("user_id")
            private Integer userId;
        /** 用户类型 */
                @ApiField("user_type")
            private String userType;
    
        public Integer getUserStatus() {
    return this.userStatus;
    }
    public void setUserStatus(Integer userStatus) {
    this.userStatus = userStatus;
    }
        public String getCountryCode() {
    return this.countryCode;
    }
    public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
    }
        public String getEmail() {
    return this.email;
    }
    public void setEmail(String email) {
    this.email = email;
    }
        public String getFullName() {
    return this.fullName;
    }
    public void setFullName(String fullName) {
    this.fullName = fullName;
    }
        public Integer getUserId() {
    return this.userId;
    }
    public void setUserId(Integer userId) {
    this.userId = userId;
    }
        public String getUserType() {
    return this.userType;
    }
    public void setUserType(String userType) {
    this.userType = userType;
    }
    }