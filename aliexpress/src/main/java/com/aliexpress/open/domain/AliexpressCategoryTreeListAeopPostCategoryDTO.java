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

public class AliexpressCategoryTreeListAeopPostCategoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 类目特征的map。AE_FEATURE_CAR_TYPE ： 当前类目是否支持车型库API，value为 汽车："car" 、摩托车："motor"。AE_FEATURE_UserDefineSalesProperty ：分国家是否支持销售属性自定义，value为对应的国家。 */
                @ApiField("features")
            private HashMap<String, Object> features;
        /** 类目多语言名称 */
                @ApiField("names")
            private HashMap<String, Object> names;
        /** 发布类目ID */
                @ApiField("id")
            private Long id;
        /** 是否叶子发布类目 */
                @ApiField("isleaf")
            private Boolean isleaf;
        /** 发布类目层级 */
                @ApiField("level")
            private String level;
    
        public HashMap<String, Object> getFeatures() {
    return this.features;
    }
    public void setFeatures(HashMap<String, Object> features) {
    this.features = features;
    }
        public HashMap<String, Object> getNames() {
    return this.names;
    }
    public void setNames(HashMap<String, Object> names) {
    this.names = names;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public Boolean getIsleaf() {
    return this.isleaf;
    }
    public void setIsleaf(Boolean isleaf) {
    this.isleaf = isleaf;
    }
        public String getLevel() {
    return this.level;
    }
    public void setLevel(String level) {
    this.level = level;
    }
    }