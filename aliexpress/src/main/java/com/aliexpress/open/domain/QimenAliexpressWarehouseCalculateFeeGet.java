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

public class QimenAliexpressWarehouseCalculateFeeGet implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 总费用 */
                @ApiField("fee")
            private Long fee;
        /** 币种 */
                @ApiField("currency")
            private String currency;
    
        public Long getFee() {
    return this.fee;
    }
    public void setFee(Long fee) {
    this.fee = fee;
    }
        public String getCurrency() {
    return this.currency;
    }
    public void setCurrency(String currency) {
    this.currency = currency;
    }
    }