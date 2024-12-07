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

public class AliexpressTradeNewRedefiningcopy3Currency implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("symbol")
            private String symbol;
        /** 1 */
                @ApiField("display_name")
            private String displayName;
        /** 1 */
                @ApiField("currency_code")
            private String currencyCode;
        /** 1 */
                @ApiField("default_fraction_digits")
            private Integer defaultFractionDigits;
        /** 1 */
                @ApiField("numeric_code")
            private Integer numericCode;
    
        public String getSymbol() {
    return this.symbol;
    }
    public void setSymbol(String symbol) {
    this.symbol = symbol;
    }
        public String getDisplayName() {
    return this.displayName;
    }
    public void setDisplayName(String displayName) {
    this.displayName = displayName;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public Integer getDefaultFractionDigits() {
    return this.defaultFractionDigits;
    }
    public void setDefaultFractionDigits(Integer defaultFractionDigits) {
    this.defaultFractionDigits = defaultFractionDigits;
    }
        public Integer getNumericCode() {
    return this.numericCode;
    }
    public void setNumericCode(Integer numericCode) {
    this.numericCode = numericCode;
    }
    }