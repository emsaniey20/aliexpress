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

public class AliexpressLogisticsServiceQueryAeopOnlineLogisticsFeeItem implements Serializable {
    private static final long serialVersionUID = 1L;
        /** - */
                @ApiField("curreny")
            private String curreny;
        /** - */
                @ApiField("amount")
            private String amount;
        /** - */
                @ApiField("name")
            private String name;
        /** - */
                @ApiField("code")
            private String code;
    
        public String getCurreny() {
    return this.curreny;
    }
    public void setCurreny(String curreny) {
    this.curreny = curreny;
    }
        public String getAmount() {
    return this.amount;
    }
    public void setAmount(String amount) {
    this.amount = amount;
    }
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
        public String getCode() {
    return this.code;
    }
    public void setCode(String code) {
    this.code = code;
    }
    }