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

public class AliexpressTradeOrderCreatePrice implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 价格，精确到分 */
                @ApiField("price")
            private String price;
    
        public String getPrice() {
    return this.price;
    }
    public void setPrice(String price) {
    this.price = price;
    }
    }