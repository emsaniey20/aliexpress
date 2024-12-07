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

public class AliexpressMerchantTaxinfoGetGlobalSellerTaxDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 国家 */
                @ApiField("country")
            private String country;
        /** 税号 */
                @ApiField("tax_code")
            private String taxCode;
        /** 企业名 */
                @ApiField("tax_entity_name")
            private String taxEntityName;
        /** 注册号 */
                @ApiField("ent_mersisnum")
            private String entMersisnum;
    
        public String getCountry() {
    return this.country;
    }
    public void setCountry(String country) {
    this.country = country;
    }
        public String getTaxCode() {
    return this.taxCode;
    }
    public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
    }
        public String getTaxEntityName() {
    return this.taxEntityName;
    }
    public void setTaxEntityName(String taxEntityName) {
    this.taxEntityName = taxEntityName;
    }
        public String getEntMersisnum() {
    return this.entMersisnum;
    }
    public void setEntMersisnum(String entMersisnum) {
    this.entMersisnum = entMersisnum;
    }
    }