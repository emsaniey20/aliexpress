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

public class AliexpressPostproductRedefiningGetsizechartinfobycategoryidString implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 是否是系统自带的尺码模版，true表示是系统自带的，false表示用户自定义. */
                @ApiField("is_default")
            private Boolean isDefault;
        /** 尺码模版的适用类型 */
                @ApiField("model_name")
            private String modelName;
        /** 尺码模版的名称 */
                @ApiField("name")
            private String name;
        /** 尺码模版ID. */
                @ApiField("sizechart_id")
            private Long sizechartId;
    
        public Boolean getIsDefault() {
    return this.isDefault;
    }
    public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    }
        public String getModelName() {
    return this.modelName;
    }
    public void setModelName(String modelName) {
    this.modelName = modelName;
    }
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
        public Long getSizechartId() {
    return this.sizechartId;
    }
    public void setSizechartId(Long sizechartId) {
    this.sizechartId = sizechartId;
    }
    }