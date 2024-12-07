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

public class AliexpressTaxationCalculateOpenQueryHjTaxCalculateResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 交易币种 */
                @ApiField("currency")
            private AliexpressTaxationCalculateOpenQueryCurrency currency;
        /** 币种转欧元汇率 */
                @ApiField("exchange_rate")
            private String exchangeRate;
        /** 交易行计税结果 */
                @ApiListField("lines")
            private List<AliexpressTaxationCalculateOpenQueryHjLineTaxCalculateResultDTO> lines;
    
        public AliexpressTaxationCalculateOpenQueryCurrency getCurrency() {
    return this.currency;
    }
    public void setCurrency(AliexpressTaxationCalculateOpenQueryCurrency currency) {
    this.currency = currency;
    }
        public String getExchangeRate() {
    return this.exchangeRate;
    }
    public void setExchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
    }
        public List<AliexpressTaxationCalculateOpenQueryHjLineTaxCalculateResultDTO> getLines() {
    return this.lines;
    }
    public void setLines(List<AliexpressTaxationCalculateOpenQueryHjLineTaxCalculateResultDTO> lines) {
    this.lines = lines;
    }
    }