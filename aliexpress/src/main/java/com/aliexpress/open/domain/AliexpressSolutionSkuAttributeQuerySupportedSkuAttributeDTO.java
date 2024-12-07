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

public class AliexpressSolutionSkuAttributeQuerySupportedSkuAttributeDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** aliexpress sku name, the same field when indicating the sku_name for posting product */
                @ApiField("aliexpress_sku_name")
            private String aliexpressSkuName;
        /** Indicates whether this sku attribute is mandatory under this category */
                @ApiField("required")
            private Boolean required;
        /** aliexpress sku value list */
                @ApiListField("aliexpress_sku_value_list")
            private List<AliexpressSolutionSkuAttributeQuerySkuValueSimplifiedInfoDTO> aliexpressSkuValueList;
        /** whether the corresponding aliexpress_sku_name support customized name by merchants */
                @ApiField("support_customized_name")
            private Boolean supportCustomizedName;
        /** whether the corresponding aliexpress_sku_name support customized picture */
                @ApiField("support_customized_picture")
            private Boolean supportCustomizedPicture;
    
        public String getAliexpressSkuName() {
    return this.aliexpressSkuName;
    }
    public void setAliexpressSkuName(String aliexpressSkuName) {
    this.aliexpressSkuName = aliexpressSkuName;
    }
        public Boolean getRequired() {
    return this.required;
    }
    public void setRequired(Boolean required) {
    this.required = required;
    }
        public List<AliexpressSolutionSkuAttributeQuerySkuValueSimplifiedInfoDTO> getAliexpressSkuValueList() {
    return this.aliexpressSkuValueList;
    }
    public void setAliexpressSkuValueList(List<AliexpressSolutionSkuAttributeQuerySkuValueSimplifiedInfoDTO> aliexpressSkuValueList) {
    this.aliexpressSkuValueList = aliexpressSkuValueList;
    }
        public Boolean getSupportCustomizedName() {
    return this.supportCustomizedName;
    }
    public void setSupportCustomizedName(Boolean supportCustomizedName) {
    this.supportCustomizedName = supportCustomizedName;
    }
        public Boolean getSupportCustomizedPicture() {
    return this.supportCustomizedPicture;
    }
    public void setSupportCustomizedPicture(Boolean supportCustomizedPicture) {
    this.supportCustomizedPicture = supportCustomizedPicture;
    }
    }