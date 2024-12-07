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

public class AliexpressPopChoiceProductQueryPopChoiceNationalPrice implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 国家/地区名称 */
                @ApiField("nation_name")
            private String nationName;
        /** SKU物流费用 */
                @ApiField("price")
            private String price;
        /** 国家/地区码 */
                @ApiField("nation_code")
            private String nationCode;
    
        public String getNationName() {
    return this.nationName;
    }
    public void setNationName(String nationName) {
    this.nationName = nationName;
    }
        public String getPrice() {
    return this.price;
    }
    public void setPrice(String price) {
    this.price = price;
    }
        public String getNationCode() {
    return this.nationCode;
    }
    public void setNationCode(String nationCode) {
    this.nationCode = nationCode;
    }
    }