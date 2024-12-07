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

public class AliexpressSolutionSkuAttributeQuerySkuValueSimplifiedInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** aliexpress sku value name */
                @ApiField("aliexpress_sku_value_name")
            private String aliexpressSkuValueName;
    
        public String getAliexpressSkuValueName() {
    return this.aliexpressSkuValueName;
    }
    public void setAliexpressSkuValueName(String aliexpressSkuValueName) {
    this.aliexpressSkuValueName = aliexpressSkuValueName;
    }
    }