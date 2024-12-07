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

public class AliexpressTradeNewRedefiningFindorderbyidMoneyStr implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 金额（mount=cent/cant_factor） */
                @ApiField("amount")
            private String amount;
        /** 币种 */
                @ApiField("currency_code")
            private String currencyCode;
        /** 过时字段，尽量使用amount字段 */
                @ApiField("amount_str")
            private String amountStr;
        /** 最小货币单位（例如人民币：分） */
                @ApiField("cent")
            private Long cent;
        /** 到最小货币单元的乘积因子（例如人民币：100） */
                @ApiField("cent_factor")
            private Long centFactor;
        /** 货币描述 */
                @ApiField("currency")
            private AliexpressTradeNewRedefiningFindorderbyidCurrency currency;
    
        public String getAmount() {
    return this.amount;
    }
    public void setAmount(String amount) {
    this.amount = amount;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public String getAmountStr() {
    return this.amountStr;
    }
    public void setAmountStr(String amountStr) {
    this.amountStr = amountStr;
    }
        public Long getCent() {
    return this.cent;
    }
    public void setCent(Long cent) {
    this.cent = cent;
    }
        public Long getCentFactor() {
    return this.centFactor;
    }
    public void setCentFactor(Long centFactor) {
    this.centFactor = centFactor;
    }
        public AliexpressTradeNewRedefiningFindorderbyidCurrency getCurrency() {
    return this.currency;
    }
    public void setCurrency(AliexpressTradeNewRedefiningFindorderbyidCurrency currency) {
    this.currency = currency;
    }
    }