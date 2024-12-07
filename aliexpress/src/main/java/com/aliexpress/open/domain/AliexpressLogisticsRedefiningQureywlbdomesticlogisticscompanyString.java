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

public class AliexpressLogisticsRedefiningQureywlbdomesticlogisticscompanyString implements Serializable {
    private static final long serialVersionUID = 1L;
        /** name */
                @ApiField("name")
            private String name;
        /** companyId */
                @ApiField("company_id")
            private Long companyId;
        /** companyCode */
                @ApiField("company_code")
            private String companyCode;
    
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
        public Long getCompanyId() {
    return this.companyId;
    }
    public void setCompanyId(Long companyId) {
    this.companyId = companyId;
    }
        public String getCompanyCode() {
    return this.companyCode;
    }
    public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
    }
    }