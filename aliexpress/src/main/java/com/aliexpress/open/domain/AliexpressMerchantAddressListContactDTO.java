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

public class AliexpressMerchantAddressListContactDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 手机 */
                @ApiField("phone")
            private String phone;
        /** 姓名 */
                @ApiField("contact_name")
            private String contactName;
        /** 电话号 */
                @ApiField("mobile")
            private String mobile;
    
        public String getPhone() {
    return this.phone;
    }
    public void setPhone(String phone) {
    this.phone = phone;
    }
        public String getContactName() {
    return this.contactName;
    }
    public void setContactName(String contactName) {
    this.contactName = contactName;
    }
        public String getMobile() {
    return this.mobile;
    }
    public void setMobile(String mobile) {
    this.mobile = mobile;
    }
    }