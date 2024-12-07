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

public class AliexpressChoiceProductQueryAeopPackageDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 产品的高度，注意！！！！过时字段，3月8号以后会下线 */
                @ApiField("package_height")
            private String packageHeight;
        /** 产品的毛重，注意！！！！过时字段，3月8号以后会下线 */
                @ApiField("gross_weight")
            private String grossWeight;
        /** 每包的数量 */
                @ApiField("lot_num")
            private Integer lotNum;
        /** 产品的长度，注意！！！！过时字段，3月8号以后会下线 */
                @ApiField("package_length")
            private String packageLength;
        /** 产品的宽度，注意！！！！过时字段，3月8号以后会下线 */
                @ApiField("package_width")
            private String packageWidth;
        /** 产品的单位 */
                @ApiField("product_unit")
            private Integer productUnit;
        /** 打包销售: true 非打包销售:false */
                @ApiField("package_type")
            private Boolean packageType;
    
        public String getPackageHeight() {
    return this.packageHeight;
    }
    public void setPackageHeight(String packageHeight) {
    this.packageHeight = packageHeight;
    }
        public String getGrossWeight() {
    return this.grossWeight;
    }
    public void setGrossWeight(String grossWeight) {
    this.grossWeight = grossWeight;
    }
        public Integer getLotNum() {
    return this.lotNum;
    }
    public void setLotNum(Integer lotNum) {
    this.lotNum = lotNum;
    }
        public String getPackageLength() {
    return this.packageLength;
    }
    public void setPackageLength(String packageLength) {
    this.packageLength = packageLength;
    }
        public String getPackageWidth() {
    return this.packageWidth;
    }
    public void setPackageWidth(String packageWidth) {
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