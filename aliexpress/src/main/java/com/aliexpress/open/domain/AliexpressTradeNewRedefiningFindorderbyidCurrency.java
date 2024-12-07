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

public class AliexpressTradeNewRedefiningFindorderbyidCurrency implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 币种数字编码 */
                @ApiField("numeric_code")
            private Long numericCode;
        /** 币种符号 */
                @ApiField("symbol")
            private String symbol;
        /** 币种 */
                @ApiField("currency_code")
            private String currencyCode;
        /** 默认最小精确度 */
                @ApiField("default_fraction_digits")
            private Long defaultFractionDigits;
        /** 币种名称 */
                @ApiField("display_name")
            private String displayName;
    
        public Long getNumericCode() {
    return this.numericCode;
    }
    public void setNumericCode(Long numericCode) {
    this.numericCode = numericCode;
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
        public Long getDefaultFractionDigits() {
    return this.defaultFractionDigits;
    }
    public void setDefaultFractionDigits(Long defaultFractionDigits) {
    this.defaultFractionDigits = defaultFractionDigits;
    }
        public String getDisplayName() {
    return this.displayName;
    }
    public void setDisplayName(String displayName) {
    this.displayName = displayName;
    }
    }