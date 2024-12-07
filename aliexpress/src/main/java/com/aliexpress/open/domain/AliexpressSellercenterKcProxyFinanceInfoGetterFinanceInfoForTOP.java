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

public class AliexpressSellercenterKcProxyFinanceInfoGetterFinanceInfoForTOP implements Serializable {
    private static final long serialVersionUID = 1L;
        /** available amount */
                @ApiField("available_amount")
            private String availableAmount;
        /** last updated */
                @ApiField("gmt_updated")
            private String gmtUpdated;
        /** frozen amount */
                @ApiField("frozen_amount")
            private String frozenAmount;
    
        public String getAvailableAmount() {
    return this.availableAmount;
    }
    public void setAvailableAmount(String availableAmount) {
    this.availableAmount = availableAmount;
    }
        public String getGmtUpdated() {
    return this.gmtUpdated;
    }
    public void setGmtUpdated(String gmtUpdated) {
    this.gmtUpdated = gmtUpdated;
    }
        public String getFrozenAmount() {
    return this.frozenAmount;
    }
    public void setFrozenAmount(String frozenAmount) {
    this.frozenAmount = frozenAmount;
    }
    }