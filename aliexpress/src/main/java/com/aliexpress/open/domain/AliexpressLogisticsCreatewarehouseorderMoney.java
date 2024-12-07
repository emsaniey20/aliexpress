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

public class AliexpressLogisticsCreatewarehouseorderMoney implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 分 */
                @ApiField("cent")
            private Long cent;
        /** 币种三字码 */
                @ApiField("currency_code")
            private String currencyCode;
    
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
    }