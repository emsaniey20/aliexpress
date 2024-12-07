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

public class CainiaoGlobalLogisticOrderCreateOpenReceiverParam implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 收件人名称 */
                @ApiField("name")
            private String name;
        /** 收件人座机号 */
                @ApiField("telephone")
            private String telephone;
        /** 收件人手机号 */
                @ApiField("mobile_phone")
            private String mobilePhone;
        /** 收件人地址信息 */
                @ApiField("address_param")
            private CainiaoGlobalLogisticOrderCreateOpenAddressParam addressParam;
        /** 用户昵称 */
                @ApiField("user_nick")
            private String userNick;
        /** 邮箱 */
                @ApiField("email")
            private String email;
    
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
        public String getTelephone() {
    return this.telephone;
    }
    public void setTelephone(String telephone) {
    this.telephone = telephone;
    }
        public String getMobilePhone() {
    return this.mobilePhone;
    }
    public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
    }
        public CainiaoGlobalLogisticOrderCreateOpenAddressParam getAddressParam() {
    return this.addressParam;
    }
    public void setAddressParam(CainiaoGlobalLogisticOrderCreateOpenAddressParam addressParam) {
    this.addressParam = addressParam;
    }
        public String getUserNick() {
    return this.userNick;
    }
    public void setUserNick(String userNick) {
    this.userNick = userNick;
    }
        public String getEmail() {
    return this.email;
    }
    public void setEmail(String email) {
    this.email = email;
    }
    }