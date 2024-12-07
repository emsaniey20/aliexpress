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

public class AliexpressTradeSellerOrderDecryptresultObjObject implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 买家全名 */
                @ApiField("buyer_signer_fullname")
            private String buyerSignerFullname;
        /** 电话号码 */
                @ApiField("phone_number")
            private String phoneNumber;
        /** address2 */
                @ApiField("address2")
            private String address2;
        /** 收件人 */
                @ApiField("contact_person")
            private String contactPerson;
        /** 收件详细地址 */
                @ApiField("detail_address")
            private String detailAddress;
        /** 移动手机号码 */
                @ApiField("mobile_no")
            private String mobileNo;
        /** 买家 first_name */
                @ApiField("first_name")
            private String firstName;
    
        public String getBuyerSignerFullname() {
    return this.buyerSignerFullname;
    }
    public void setBuyerSignerFullname(String buyerSignerFullname) {
    this.buyerSignerFullname = buyerSignerFullname;
    }
        public String getPhoneNumber() {
    return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    }
        public String getAddress2() {
    return this.address2;
    }
    public void setAddress2(String address2) {
    this.address2 = address2;
    }
        public String getContactPerson() {
    return this.contactPerson;
    }
    public void setContactPerson(String contactPerson) {
    this.contactPerson = contactPerson;
    }
        public String getDetailAddress() {
    return this.detailAddress;
    }
    public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
    }
        public String getMobileNo() {
    return this.mobileNo;
    }
    public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    }
        public String getFirstName() {
    return this.firstName;
    }
    public void setFirstName(String firstName) {
    this.firstName = firstName;
    }
    }