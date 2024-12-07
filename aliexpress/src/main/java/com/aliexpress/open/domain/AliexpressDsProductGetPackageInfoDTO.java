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

public class AliexpressDsProductGetPackageInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Number of basic products for custom weighing */
                @ApiField("base_unit")
            private Integer baseUnit;
        /** Product height */
                @ApiField("package_height")
            private Integer packageHeight;
        /** The gross weight of the product */
                @ApiField("gross_weight")
            private String grossWeight;
        /** The length of the product */
                @ApiField("package_length")
            private Integer packageLength;
        /** Product width */
                @ApiField("package_width")
            private Integer packageWidth;
        /** Unit of commodity */
                @ApiField("product_unit")
            private Integer productUnit;
        /** Type of packaging */
                @ApiField("package_type")
            private Boolean packageType;
    
        public Integer getBaseUnit() {
    return this.baseUnit;
    }
    public void setBaseUnit(Integer baseUnit) {
    this.baseUnit = baseUnit;
    }
        public Integer getPackageHeight() {
    return this.packageHeight;
    }
    public void setPackageHeight(Integer packageHeight) {
    this.packageHeight = packageHeight;
    }
        public String getGrossWeight() {
    return this.grossWeight;
    }
    public void setGrossWeight(String grossWeight) {
    this.grossWeight = grossWeight;
    }
        public Integer getPackageLength() {
    return this.packageLength;
    }
    public void setPackageLength(Integer packageLength) {
    this.packageLength = packageLength;
    }
        public Integer getPackageWidth() {
    return this.packageWidth;
    }
    public void setPackageWidth(Integer packageWidth) {
    this.packageWidth = packageWidth;
    }
        public Integer getProductUnit() {
    return this.productUnit;
    }
    public void setProductUnit(Integer productUnit) {
    this.productUnit = productUnit;
    }
        public Boolean getPackageType() {
    return this.packageType;
    }
    public void setPackageType(Boolean packageType) {
    this.packageType = packageType;
    }
    }