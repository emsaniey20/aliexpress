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

public class AliexpressLogisticsQueryRuleInfoPackageNetRuleConditionDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 是否包含国家关系， true表示包含  false表示不包含 */
                @ApiField("is_contain_country")
            private Boolean isContainCountry;
        /** 国家code */
                @ApiListField("country")
            private List<String> country;
        /** 比较符号 */
                @ApiField("compare_type")
            private String compareType;
        /** 物流服务数组 */
                @ApiListField("service_names")
            private List<String> serviceNames;
        /** 币种 */
                @ApiField("currency_code")
            private String currencyCode;
        /** 金额 */
                @ApiField("value")
            private String value;
    
        public Boolean getIsContainCountry() {
    return this.isContainCountry;
    }
    public void setIsContainCountry(Boolean isContainCountry) {
    this.isContainCountry = isContainCountry;
    }
        public List<String> getCountry() {
    return this.country;
    }
    public void setCountry(List<String> country) {
    this.country = country;
    }
        public String getCompareType() {
    return this.compareType;
    }
    public void setCompareType(String compareType) {
    this.compareType = compareType;
    }
        public List<String> getServiceNames() {
    return this.serviceNames;
    }
    public void setServiceNames(List<String> serviceNames) {
    this.serviceNames = serviceNames;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public String getValue() {
    return this.value;
    }
    public void setValue(String value) {
    this.value = value;
    }
    }