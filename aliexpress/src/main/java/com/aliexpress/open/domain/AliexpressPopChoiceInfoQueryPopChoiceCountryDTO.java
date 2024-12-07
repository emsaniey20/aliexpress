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

public class AliexpressPopChoiceInfoQueryPopChoiceCountryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 中文国家名称 */
                @ApiField("cn_name")
            private String cnName;
        /** 国家码 */
                @ApiField("country_code")
            private String countryCode;
        /** 英文国家名称 */
                @ApiField("en_name")
            private String enName;
    
        public String getCnName() {
    return this.cnName;
    }
    public void setCnName(String cnName) {
    this.cnName = cnName;
    }
        public String getCountryCode() {
    return this.countryCode;
    }
    public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
    }
        public String getEnName() {
    return this.enName;
    }
    public void setEnName(String enName) {
    this.enName = enName;
    }
    }