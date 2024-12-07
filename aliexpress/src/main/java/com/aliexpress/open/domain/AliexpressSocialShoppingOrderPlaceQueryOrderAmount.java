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

public class AliexpressSocialShoppingOrderPlaceQueryOrderAmount implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Amount of the order */
                @ApiField("amount")
            private String amount;
        /** Amount in sub-currency */
                @ApiField("amount_cents")
            private String amountCents;
        /** currency */
                @ApiField("currency_code")
            private String currencyCode;
    
        public String getAmount() {
    return this.amount;
    }
    public void setAmount(String amount) {
    this.amount = amount;
    }
        public String getAmountCents() {
    return this.amountCents;
    }
    public void setAmountCents(String amountCents) {
    this.amountCents = amountCents;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
    }