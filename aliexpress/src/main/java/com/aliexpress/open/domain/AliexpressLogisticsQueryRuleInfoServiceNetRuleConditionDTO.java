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

public class AliexpressLogisticsQueryRuleInfoServiceNetRuleConditionDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 国家code */
                @ApiField("country")
            private String country;
        /** 金额 */
                @ApiField("amount")
            private Long amount;
        /** 比较符号 */
                @ApiField("compare_type")
            private String compareType;
        /** 币种 */
                @ApiField("currency_code")
            private String currencyCode;
    
        public String getCountry() {
    return this.country;
    }
    public void setCountry(String country) {
    this.country = country;
    }
        public Long getAmount() {
    return this.amount;
    }
    public void setAmount(Long amount) {
    this.amount = amount;
    }
        public String getCompareType() {
    return this.compareType;
    }
    public void setCompareType(String compareType) {
    this.compareType = compareType;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
    }