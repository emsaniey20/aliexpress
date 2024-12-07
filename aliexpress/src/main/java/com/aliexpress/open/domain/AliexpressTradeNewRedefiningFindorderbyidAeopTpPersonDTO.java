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

public class AliexpressTradeNewRedefiningFindorderbyidAeopTpPersonDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 国家/地区 */
                @ApiField("country")
            private String country;
        /** first name */
                @ApiField("first_name")
            private String firstName;
        /** last name */
                @ApiField("last_name")
            private String lastName;
        /** 登录id */
                @ApiField("login_id")
            private String loginId;
    
        public String getCountry() {
    return this.country;
    }
    public void setCountry(String country) {
    this.country = country;
    }
        public String getFirstName() {
    return this.firstName;
    }
    public void setFirstName(String firstName) {
    this.firstName = firstName;
    }
        public String getLastName() {
    return this.lastName;
    }
    public void setLastName(String lastName) {
    this.lastName = lastName;
    }
        public String getLoginId() {
    return this.loginId;
    }
    public void setLoginId(String loginId) {
    this.loginId = loginId;
    }
    }