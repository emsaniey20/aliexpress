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

public class AliexpressCarmodelGetCountrydataObject implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 国家代码 */
                @ApiField("countryCode")
            private String countryCode;
        /** 固定7 */
                @ApiField("usage")
            private Integer usage;
        /** 国家名称 */
                @ApiField("countryName")
            private String countryName;
    
        public String getCountryCode() {
    return this.countryCode;
    }
    public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
    }
        public Integer getUsage() {
    return this.usage;
    }
    public void setUsage(Integer usage) {
    this.usage = usage;
    }
        public String getCountryName() {
    return this.countryName;
    }
    public void setCountryName(String countryName) {
    this.countryName = countryName;
    }
    }