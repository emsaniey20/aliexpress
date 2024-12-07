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

public class AliexpressMarketingLimiteddiscountpromotionAddpromotionproductAeopProductDiscountInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 折扣 */
                @ApiField("discount")
            private Integer discount;
        /** 终端 MOBILE or ALL */
                @ApiField("terminal")
            private String terminal;
    
        public Integer getDiscount() {
    return this.discount;
    }
    public void setDiscount(Integer discount) {
    this.discount = discount;
    }
        public String getTerminal() {
    return this.terminal;
    }
    public void setTerminal(String terminal) {
    this.terminal = terminal;
    }
    }