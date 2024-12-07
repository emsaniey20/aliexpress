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

public class AliexpressSolutionOrderInfoGetGlobalAeopTpPersonDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** login ID */
                @ApiField("login_id")
            private String loginId;
        /** last name */
                @ApiField("last_name")
            private String lastName;
        /** first name */
                @ApiField("first_name")
            private String firstName;
        /** country/region */
                @ApiField("country")
            private String country;
    
        public String getLoginId() {
    return this.loginId;
    }
    public void setLoginId(String loginId) {
    this.loginId = loginId;
    }
        public String getLastName() {
    return this.lastName;
    }
    public void setLastName(String lastName) {
    this.lastName = lastName;
    }
        public String getFirstName() {
    return this.firstName;
    }
    public void setFirstName(String firstName) {
    this.firstName = firstName;
    }
        public String getCountry() {
    return this.country;
    }
    public void setCountry(String country) {
    this.country = country;
    }
    }