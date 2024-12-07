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

public class SupplyItemCreateSupplyPvDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品属性值ID */
                @ApiField("valueId")
            private Long valueId;
        /** 商品属性值名称 */
                @ApiField("valueName")
            private String valueName;
        /** 商品属性ID */
                @ApiField("propId")
            private Long propId;
        /** 商品属性名称 */
                @ApiField("propName")
            private String propName;
    
        public Long getValueId() {
    return this.valueId;
    }
    public void setValueId(Long valueId) {
    this.valueId = valueId;
    }
        public String getValueName() {
    return this.valueName;
    }
    public void setValueName(String valueName) {
    this.valueName = valueName;
    }
        public Long getPropId() {
    return this.propId;
    }
    public void setPropId(Long propId) {
    this.propId = propId;
    }
        public String getPropName() {
    return this.propName;
    }
    public void setPropName(String propName) {
    this.propName = propName;
    }
    }