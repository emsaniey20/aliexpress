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

public class AliexpressSolutionSkuAttributeQuerySupportedCommonAttributeDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** aliexpress common attribute name id */
                @ApiField("aliexpress_common_attribute_name_id")
            private Long aliexpressCommonAttributeNameId;
        /** aliexpress common attribute name */
                @ApiField("aliexpress_common_attribute_name")
            private String aliexpressCommonAttributeName;
        /** whether the common attribute is required under this category */
                @ApiField("required")
            private Boolean required;
        /** aliexpress common attribute value list */
                @ApiListField("aliexpress_common_attribute_value_list")
            private List<AliexpressSolutionSkuAttributeQueryCommonAttributeValueInfoDTO> aliexpressCommonAttributeValueList;
    
        public Long getAliexpressCommonAttributeNameId() {
    return this.aliexpressCommonAttributeNameId;
    }
    public void setAliexpressCommonAttributeNameId(Long aliexpressCommonAttributeNameId) {
    this.aliexpressCommonAttributeNameId = aliexpressCommonAttributeNameId;
    }
        public String getAliexpressCommonAttributeName() {
    return this.aliexpressCommonAttributeName;
    }
    public void setAliexpressCommonAttributeName(String aliexpressCommonAttributeName) {
    this.aliexpressCommonAttributeName = aliexpressCommonAttributeName;
    }
        public Boolean getRequired() {
    return this.required;
    }
    public void setRequired(Boolean required) {
    this.required = required;
    }
        public List<AliexpressSolutionSkuAttributeQueryCommonAttributeValueInfoDTO> getAliexpressCommonAttributeValueList() {
    return this.aliexpressCommonAttributeValueList;
    }
    public void setAliexpressCommonAttributeValueList(List<AliexpressSolutionSkuAttributeQueryCommonAttributeValueInfoDTO> aliexpressCommonAttributeValueList) {
    this.aliexpressCommonAttributeValueList = aliexpressCommonAttributeValueList;
    }
    }