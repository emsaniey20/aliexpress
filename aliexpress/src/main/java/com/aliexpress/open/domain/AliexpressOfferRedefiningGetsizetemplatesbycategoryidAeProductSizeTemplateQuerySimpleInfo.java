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

public class AliexpressOfferRedefiningGetsizetemplatesbycategoryidAeProductSizeTemplateQuerySimpleInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 模版所属叶子类目 */
                @ApiField("category_id")
            private Long categoryId;
        /** 是否是默认模版 */
                @ApiField("is_default")
            private String isDefault;
        /** 模型名称 */
                @ApiField("model_name")
            private String modelName;
        /** 尺码模版名称 */
                @ApiField("name")
            private String name;
        /** 尺码模版ID */
                @ApiField("sizechart_id")
            private Long sizechartId;
    
        public Long getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
    }
        public String getIsDefault() {
    return this.isDefault;
    }
    public void setIsDefault(String isDefault) {
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