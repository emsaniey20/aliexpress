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

public class GlobalProductCreatePackageInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 包裹高度 */
                @ApiField("package_height")
            private String packageHeight;
        /** 包裹重量。取值范围:0.001-500.000,保留三位小数,采用进位制,单位:公斤。 */
                @ApiField("package_weight")
            private String packageWeight;
        /** 包裹长度 */
                @ApiField("package_length")
            private String packageLength;
        /** 包裹宽度 */
                @ApiField("package_width")
            private String packageWidth;
    
        public String getPackageHeight() {
    return this.packageHeight;
    }
    public void setPackageHeight(String packageHeight) {
    this.packageHeight = packageHeight;
    }
        public String getPackageWeight() {
    return this.packageWeight;
    }
    public void setPackageWeight(String packageWeight) {
    this.packageWeight = packageWeight;
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
    }