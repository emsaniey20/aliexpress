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

public class AliexpressSocialProductFulldetailQueryProductSKUProperty implements Serializable {
    private static final long serialVersionUID = 1L;
        /** if sku contains color prop */
                @ApiField("is_show_type_color")
            private Boolean isShowTypeColor;
        /** sku orders */
                @ApiField("order")
            private Integer order;
        /** if show type */
                @ApiField("show_type")
            private String showType;
        /** if show color */
                @ApiField("show_type_color")
            private Boolean showTypeColor;
        /** size info */
                @ApiField("size_info")
            private AliexpressSocialProductFulldetailQuerySizeChartDTO sizeInfo;
        /** property id */
                @ApiField("sku_property_id")
            private Integer skuPropertyId;
        /** property name */
                @ApiField("sku_property_name")
            private String skuPropertyName;
        /** list of properties */
                @ApiListField("sku_property_values")
            private List<AliexpressSocialProductFulldetailQueryProductSKUPropertyValue> skuPropertyValues;
    
        public Boolean getIsShowTypeColor() {
    return this.isShowTypeColor;
    }
    public void setIsShowTypeColor(Boolean isShowTypeColor) {
    this.isShowTypeColor = isShowTypeColor;
    }
        public Integer getOrder() {
    return this.order;
    }
    public void setOrder(Integer order) {
    this.order = order;
    }
        public String getShowType() {
    return this.showType;
    }
    public void setShowType(String showType) {
    this.showType = showType;
    }
        public Boolean getShowTypeColor() {
    return this.showTypeColor;
    }
    public void setShowTypeColor(Boolean showTypeColor) {
    this.showTypeColor = showTypeColor;
    }
        public AliexpressSocialProductFulldetailQuerySizeChartDTO getSizeInfo() {
    return this.sizeInfo;
    }
    public void setSizeInfo(AliexpressSocialProductFulldetailQuerySizeChartDTO sizeInfo) {
    this.sizeInfo = sizeInfo;
    }
        public Integer getSkuPropertyId() {
    return this.skuPropertyId;
    }
    public void setSkuPropertyId(Integer skuPropertyId) {
    this.skuPropertyId = skuPropertyId;
    }
        public String getSkuPropertyName() {
    return this.skuPropertyName;
    }
    public void setSkuPropertyName(String skuPropertyName) {
    this.skuPropertyName = skuPropertyName;
    }
        public List<AliexpressSocialProductFulldetailQueryProductSKUPropertyValue> getSkuPropertyValues() {
    return this.skuPropertyValues;
    }
    public void setSkuPropertyValues(List<AliexpressSocialProductFulldetailQueryProductSKUPropertyValue> skuPropertyValues) {
    this.skuPropertyValues = skuPropertyValues;
    }
    }