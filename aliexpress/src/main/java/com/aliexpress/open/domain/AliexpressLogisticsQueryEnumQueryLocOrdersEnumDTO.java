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

public class AliexpressLogisticsQueryEnumQueryLocOrdersEnumDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 仓列表 */
                @ApiListField("res_code_list")
            private List<AliexpressLogisticsQueryEnumResCodeList> resCodeList;
        /** 物流单状态 */
                @ApiListField("order_status_list")
            private List<AliexpressLogisticsQueryEnumOrderStatusList> orderStatusList;
        /** 国家列表 */
                @ApiListField("country_list")
            private List<AliexpressLogisticsQueryEnumCountryList> countryList;
        /** 枚举 */
                @ApiField("enums")
            private AliexpressLogisticsQueryEnumenumsMap enums;
    
        public List<AliexpressLogisticsQueryEnumResCodeList> getResCodeList() {
    return this.resCodeList;
    }
    public void setResCodeList(List<AliexpressLogisticsQueryEnumResCodeList> resCodeList) {
    this.resCodeList = resCodeList;
    }
        public List<AliexpressLogisticsQueryEnumOrderStatusList> getOrderStatusList() {
    return this.orderStatusList;
    }
    public void setOrderStatusList(List<AliexpressLogisticsQueryEnumOrderStatusList> orderStatusList) {
    this.orderStatusList = orderStatusList;
    }
        public List<AliexpressLogisticsQueryEnumCountryList> getCountryList() {
    return this.countryList;
    }
    public void setCountryList(List<AliexpressLogisticsQueryEnumCountryList> countryList) {
    this.countryList = countryList;
    }
        public AliexpressLogisticsQueryEnumenumsMap getEnums() {
    return this.enums;
    }
    public void setEnums(AliexpressLogisticsQueryEnumenumsMap enums) {
    this.enums = enums;
    }
    }