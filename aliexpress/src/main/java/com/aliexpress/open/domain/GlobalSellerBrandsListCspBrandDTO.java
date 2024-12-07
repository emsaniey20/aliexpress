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

public class GlobalSellerBrandsListCspBrandDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 品牌名称 */
                @ApiField("brand_name")
            private String brandName;
        /** 品牌ID */
                @ApiField("brand_id")
            private Long brandId;
    
        public String getBrandName() {
    return this.brandName;
    }
    public void setBrandName(String brandName) {
    this.brandName = brandName;
    }
        public Long getBrandId() {
    return this.brandId;
    }
    public void setBrandId(Long brandId) {
    this.brandId = brandId;
    }
    }