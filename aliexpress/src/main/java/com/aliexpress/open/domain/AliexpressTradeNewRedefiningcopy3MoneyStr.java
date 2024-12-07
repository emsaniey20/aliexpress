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

public class AliexpressTradeNewRedefiningcopy3MoneyStr implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("amount")
            private Long amount;
        /** 1 */
                @ApiField("cent_factor")
            private Integer centFactor;
        /** 1 */
                @ApiField("amount_str")
            private String amountStr;
        /** 1 */
                @ApiField("cent")
            private Integer cent;
        /** 1 */
                @ApiField("currency")
            private AliexpressTradeNewRedefiningcopy3Currency currency;
        /** 1 */
                @ApiField("currency_code")
            private String currencyCode;
    
        public Long getAmount() {
    return this.amount;
    }
    public void setAmount(Long amount) {
    this.amount = amount;
    }
        public Integer getCentFactor() {
    return this.centFactor;
    }
    public void setCentFactor(Integer centFactor) {
    this.centFactor = centFactor;
    }
        public String getAmountStr() {
    return this.amountStr;
    }
    public void setAmountStr(String amountStr) {
    this.amountStr = amountStr;
    }
        public Integer getCent() {
    return this.cent;
    }
    public void setCent(Integer cent) {
    this.cent = cent;
    }
        public AliexpressTradeNewRedefiningcopy3Currency getCurrency() {
    return this.currency;
    }
    public void setCurrency(AliexpressTradeNewRedefiningcopy3Currency currency) {
    this.currency = currency;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
    }