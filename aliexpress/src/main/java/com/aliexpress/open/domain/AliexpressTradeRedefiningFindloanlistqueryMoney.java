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

public class AliexpressTradeRedefiningFindloanlistqueryMoney implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 币种USD/RUB */
                @ApiField("currency_code")
            private String currencyCode;
        /** 到最小货币单元的乘积因子 */
                @ApiField("cent_factor")
            private Integer centFactor;
        /** 分 */
                @ApiField("cent")
            private Long cent;
        /** 金额 */
                @ApiField("amount")
            private String amount;
        /** 货币描述 */
                @ApiField("currency")
            private AliexpressTradeRedefiningFindloanlistqueryCurrency currency;
    
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public Integer getCentFactor() {
    return this.centFactor;
    }
    public void setCentFactor(Integer centFactor) {
    this.centFactor = centFactor;
    }
        public Long getCent() {
    return this.cent;
    }
    public void setCent(Long cent) {
    this.cent = cent;
    }
        public String getAmount() {
    return this.amount;
    }
    public void setAmount(String amount) {
    this.amount = amount;
    }
        public AliexpressTradeRedefiningFindloanlistqueryCurrency getCurrency() {
    return this.currency;
    }
    public void setCurrency(AliexpressTradeRedefiningFindloanlistqueryCurrency currency) {
    this.currency = currency;
    }
    }