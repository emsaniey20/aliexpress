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

public class AliexpressSolutionSkuAttributeQuerySkuAttributeInfoQueryResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** supported sku attribute lis */
                @ApiListField("supporting_sku_attribute_list")
            private List<AliexpressSolutionSkuAttributeQuerySupportedSkuAttributeDTO> supportingSkuAttributeList;
        /** common attributes under a specific category */
                @ApiListField("supporting_common_attribute_list")
            private List<AliexpressSolutionSkuAttributeQuerySupportedCommonAttributeDTO> supportingCommonAttributeList;
    
        public List<AliexpressSolutionSkuAttributeQuerySupportedSkuAttributeDTO> getSupportingSkuAttributeList() {
    return this.supportingSkuAttributeList;
    }
    public void setSupportingSkuAttributeList(List<AliexpressSolutionSkuAttributeQuerySupportedSkuAttributeDTO> supportingSkuAttributeList) {
    this.supportingSkuAttributeList = supportingSkuAttributeList;
    }
        public List<AliexpressSolutionSkuAttributeQuerySupportedCommonAttributeDTO> getSupportingCommonAttributeList() {
    return this.supportingCommonAttributeList;
    }
    public void setSupportingCommonAttributeList(List<AliexpressSolutionSkuAttributeQuerySupportedCommonAttributeDTO> supportingCommonAttributeList) {
    this.supportingCommonAttributeList = supportingCommonAttributeList;
    }
    }