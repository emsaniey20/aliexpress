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

public class CainiaoGlobalHandoverUpdateReturnerDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 退件地址 */
                @ApiField("address")
            private CainiaoGlobalHandoverUpdateAddressDTO address;
        /** 邮箱 */
                @ApiField("email")
            private String email;
        /** 移动电话, 校验格式：^1(3|4|5|6|7|8|9)\d{9}$ */
                @ApiField("mobile")
            private String mobile;
        /** 固定电话，可空，校验格式：(^0[\d]{2,3}-[\d]{7,8}$)|(^400[\d]{3,4}[\d]{3,4}$)|(400-[\d]{3,4}-[\d]{3,4}$) */
                @ApiField("phone")
            private String phone;
        /** 退件联系人名称，必须包含中文字符 */
                @ApiField("name")
            private String name;
        /** AE后台维护的退件地址ID */
                @ApiField("address_id")
            private Long addressId;
    
        public CainiaoGlobalHandoverUpdateAddressDTO getAddress() {
    return this.address;
    }
    public void setAddress(CainiaoGlobalHandoverUpdateAddressDTO address) {
    this.address = address;
    }
        public String getEmail() {
    return this.email;
    }
    public void setEmail(String email) {
    this.email = email;
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
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
        public Long getAddressId() {
    return this.addressId;
    }
    public void setAddressId(Long addressId) {
    this.addressId = addressId;
    }
    }