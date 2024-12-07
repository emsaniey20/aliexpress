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

public class AliexpressSolutionOrderInfoGetGlobalMoneyStr implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Cent */
                @ApiField("cent")
            private Long cent;
        /** Currency code */
                @ApiField("currency_code")
            private String currencyCode;
        /** Amount */
                @ApiField("amount")
            private String amount;
        /** The factor to the smallest currency unit */
                @ApiField("cent_factor")
            private Long centFactor;
        /** Currency description */
                @ApiField("currency")
            private AliexpressSolutionOrderInfoGetCurrency currency;
    
        public Long getCent() {
    return this.cent;
    }
    public void setCent(Long cent) {
    this.cent = cent;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public String getAmount() {
    return this.amount;
    }
    public void setAmount(String amount) {
    this.amount = amount;
    }
        public Long getCentFactor() {
    return this.centFactor;
    }
    public void setCentFactor(Long centFactor) {
    this.centFactor = centFactor;
    }
        public AliexpressSolutionOrderInfoGetCurrency getCurrency() {
    return this.currency;
    }
    public void setCurrency(AliexpressSolutionOrderInfoGetCurrency currency) {
    this.currency = currency;
    }
    }