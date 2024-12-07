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

public class GspOrderQueryforsupplierReceiverDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 收件人姓名 */
                @ApiField("fullName")
            private String fullName;
        /** 手机号 */
                @ApiField("mobile")
            private String mobile;
        /** 固定电话 */
                @ApiField("phone")
            private String phone;
    
        public String getFullName() {
    return this.fullName;
    }
    public void setFullName(String fullName) {
    this.fullName = fullName;
    }
        public String getMobile() {
    return this.mobile;
    }
    public void setMobile(String mobile) {
    this.mobile = mobile;
    }
        public String getPhone() {
    return this.phone;
    }
    public void setPhone(String phone) {
    this.phone = phone;
    }
    }