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

public class AliexpressAscpPoCreatePickupOrderContactInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 区域 */
                @ApiField("area")
            private String area;
        /** 地址 */
                @ApiField("address")
            private String address;
        /** 区域Id */
                @ApiField("area_id")
            private String areaId;
        /** 电话 */
                @ApiField("phone")
            private String phone;
        /** 姓名 */
                @ApiField("name")
            private String name;
        /** 详细地址 {"provCode":"110000","areaCode":"110102","cityCode":"110100","prov":"北京","city":"北京市","area":"西城区","addressDetail":"详细的地址"} */
                @ApiField("address_context")
            private String addressContext;
    
        public String getArea() {
    return this.area;
    }
    public void setArea(String area) {
    this.area = area;
    }
        public String getAddress() {
    return this.address;
    }
    public void setAddress(String address) {
    this.address = address;
    }
        public String getAreaId() {
    return this.areaId;
    }
    public void setAreaId(String areaId) {
    this.areaId = areaId;
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
        public String getAddressContext() {
    return this.addressContext;
    }
    public void setAddressContext(String addressContext) {
    this.addressContext = addressContext;
    }
    }