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

public class CainiaoGlobalSolutionInquiryOpenPackageParam implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 包裹长度，单位毫米 */
                @ApiField("length")
            private Long length;
        /** 包裹宽度，单位毫米 */
                @ApiField("width")
            private Long width;
        /** 包裹高度，单位毫米 */
                @ApiField("height")
            private Long height;
        /** 包裹重量，单位克 */
                @ApiField("weight")
            private Long weight;
    
        public Long getLength() {
    return this.length;
    }
    public void setLength(Long length) {
    this.length = length;
    }
        public Long getWidth() {
    return this.width;
    }
    public void setWidth(Long width) {
    this.width = width;
    }
        public Long getHeight() {
    return this.height;
    }
    public void setHeight(Long height) {
    this.height = height;
    }
        public Long getWeight() {
    return this.weight;
    }
    public void setWeight(Long weight) {
    this.weight = weight;
    }
    }