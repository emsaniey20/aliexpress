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

public class AliexpressSocialShoppingOrderListOrderProductSkuDisplayDto implements Serializable {
    private static final long serialVersionUID = 1L;
        /** p_id */
                @ApiField("p_id")
            private String pId;
        /** p_name */
                @ApiField("p_name")
            private String pName;
        /** p_value */
                @ApiField("p_value")
            private String pValue;
        /** p_value_id */
                @ApiField("p_value_id")
            private String pValueId;
        /** order */
                @ApiField("order")
            private Integer order;
        /** property_id */
                @ApiField("property_id")
            private Long propertyId;
        /** property_name */
                @ApiField("property_name")
            private String propertyName;
        /** property_value */
                @ApiField("property_value")
            private String propertyValue;
        /** property_value_id */
                @ApiField("property_value_id")
            private Long propertyValueId;
        /** self_define_value */
                @ApiField("self_define_value")
            private String selfDefineValue;
    
        public String getPId() {
    return this.pId;
    }
    public void setPId(String pId) {
    this.pId = pId;
    }
        public String getPName() {
    return this.pName;
    }
    public void setPName(String pName) {
    this.pName = pName;
    }
        public String getPValue() {
    return this.pValue;
    }
    public void setPValue(String pValue) {
    this.pValue = pValue;
    }
        public String getPValueId() {
    return this.pValueId;
    }
    public void setPValueId(String pValueId) {
    this.pValueId = pValueId;
    }
        public Integer getOrder() {
    return this.order;
    }
    public void setOrder(Integer order) {
    this.order = order;
    }
        public Long getPropertyId() {
    return this.propertyId;
    }
    public void setPropertyId(Long propertyId) {
    this.propertyId = propertyId;
    }
        public String getPropertyName() {
    return this.propertyName;
    }
    public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
    }
        public String getPropertyValue() {
    return this.propertyValue;
    }
    public void setPropertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
    }
        public Long getPropertyValueId() {
    return this.propertyValueId;
    }
    public void setPropertyValueId(Long propertyValueId) {
    this.propertyValueId = propertyValueId;
    }
        public String getSelfDefineValue() {
    return this.selfDefineValue;
    }
    public void setSelfDefineValue(String selfDefineValue) {
    this.selfDefineValue = selfDefineValue;
    }
    }