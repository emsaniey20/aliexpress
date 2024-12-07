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

public class AliexpressCategoryRedefiningGetallchildattributesresultAeopUnit implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 和标准属性对换比率 */
                @ApiField("rate")
            private String rate;
        /** 单位名称 */
                @ApiField("unit_name")
            private String unitName;
    
        public String getRate() {
    return this.rate;
    }
    public void setRate(String rate) {
    this.rate = rate;
    }
        public String getUnitName() {
    return this.unitName;
    }
    public void setUnitName(String unitName) {
    this.unitName = unitName;
    }
    }