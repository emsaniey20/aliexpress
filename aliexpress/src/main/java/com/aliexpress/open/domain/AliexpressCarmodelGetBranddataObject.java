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

public class AliexpressCarmodelGetBranddataObject implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 品牌商标id */
                @ApiField("brandLogoID")
            private String brandLogoID;
        /** 品牌名称 */
                @ApiField("brandName")
            private String brandName;
        /** 品牌id */
                @ApiField("brandId")
            private Integer brandId;
    
        public String getBrandLogoID() {
    return this.brandLogoID;
    }
    public void setBrandLogoID(String brandLogoID) {
    this.brandLogoID = brandLogoID;
    }
        public String getBrandName() {
    return this.brandName;
    }
    public void setBrandName(String brandName) {
    this.brandName = brandName;
    }
        public Integer getBrandId() {
    return this.brandId;
    }
    public void setBrandId(Integer brandId) {
    this.brandId = brandId;
    }
    }