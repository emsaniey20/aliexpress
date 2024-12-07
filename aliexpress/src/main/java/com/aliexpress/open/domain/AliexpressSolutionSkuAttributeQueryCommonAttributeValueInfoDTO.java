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

public class AliexpressSolutionSkuAttributeQueryCommonAttributeValueInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** aliexpress common attribute value id */
                @ApiField("aliexpress_common_attribute_value_id")
            private Long aliexpressCommonAttributeValueId;
        /** aliexpress common attribute value */
                @ApiField("aliexpress_common_attribute_value")
            private String aliexpressCommonAttributeValue;
    
        public Long getAliexpressCommonAttributeValueId() {
    return this.aliexpressCommonAttributeValueId;
    }
    public void setAliexpressCommonAttributeValueId(Long aliexpressCommonAttributeValueId) {
    this.aliexpressCommonAttributeValueId = aliexpressCommonAttributeValueId;
    }
        public String getAliexpressCommonAttributeValue() {
    return this.aliexpressCommonAttributeValue;
    }
    public void setAliexpressCommonAttributeValue(String aliexpressCommonAttributeValue) {
    this.aliexpressCommonAttributeValue = aliexpressCommonAttributeValue;
    }
    }