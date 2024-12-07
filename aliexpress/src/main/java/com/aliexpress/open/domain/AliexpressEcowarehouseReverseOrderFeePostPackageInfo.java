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

public class AliexpressEcowarehouseReverseOrderFeePostPackageInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** length(mm) */
                @ApiField("length")
            private Integer length;
        /** width(mm) */
                @ApiField("width")
            private Integer width;
        /** height(mm) */
                @ApiField("height")
            private Integer height;
        /** weight(g) */
                @ApiField("weight")
            private Integer weight;
    
        public Integer getLength() {
    return this.length;
    }
    public void setLength(Integer length) {
    this.length = length;
    }
        public Integer getWidth() {
    return this.width;
    }
    public void setWidth(Integer width) {
    this.width = width;
    }
        public Integer getHeight() {
    return this.height;
    }
    public void setHeight(Integer height) {
    this.height = height;
    }
        public Integer getWeight() {
    return this.weight;
    }
    public void setWeight(Integer weight) {
    this.weight = weight;
    }
    }