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

public class AliexpressSolutionOrderInfoGetcopy1692615547969Currency implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Display name of the currency */
                @ApiField("display_name")
            private String displayName;
        /** Symbol of the currency */
                @ApiField("symbol")
            private String symbol;
        /** Currency code */
                @ApiField("currency_code")
            private String currencyCode;
        /** Numeric code of the currency */
                @ApiField("numeric_code")
            private Long numericCode;
        /** The default minimum accuracy of the currency */
                @ApiField("default_fraction_digits")
            private Long defaultFractionDigits;
    
        public String getDisplayName() {
    return this.displayName;
    }
    public void setDisplayName(String displayName) {
    this.displayName = displayName;
    }
        public String getSymbol() {
    return this.symbol;
    }
    public void setSymbol(String symbol) {
    this.symbol = symbol;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
        public Long getNumericCode() {
    return this.numericCode;
    }
    public void setNumericCode(Long numericCode) {
    this.numericCode = numericCode;
    }
        public Long getDefaultFractionDigits() {
    return this.defaultFractionDigits;
    }
    public void setDefaultFractionDigits(Long defaultFractionDigits) {
    this.defaultFractionDigits = defaultFractionDigits;
    }
    }