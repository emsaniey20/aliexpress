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

public class AliexpressCarmodelGetArticleCriteriaDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 标准缩写描述 */
                @ApiField("criteria_abbr_description")
            private String criteriaAbbrDescription;
        /** 标准id */
                @ApiField("criteria_id")
            private Integer criteriaId;
        /** 原始值 */
                @ApiField("raw_value")
            private String rawValue;
        /** 标准单位描述 */
                @ApiField("criteria_unit_description")
            private String criteriaUnitDescription;
        /** 格式化值 */
                @ApiField("formatted_value")
            private String formattedValue;
        /** 是否间隔 */
                @ApiField("interval")
            private Boolean interval;
        /** 是否间匹配搜索查询 */
                @ApiField("matches_search_query")
            private String matchesSearchQuery;
        /** 标准类型 */
                @ApiField("criteria_type")
            private String criteriaType;
        /** 是否立即显示 */
                @ApiField("immediate_display")
            private Boolean immediateDisplay;
        /** 是否强制性 */
                @ApiField("mandatory")
            private Boolean mandatory;
        /** 标准描述 */
                @ApiField("criteria_description")
            private String criteriaDescription;
        /** 后继标准 ID */
                @ApiField("successor_criteria_id")
            private String successorCriteriaId;
    
        public String getCriteriaAbbrDescription() {
    return this.criteriaAbbrDescription;
    }
    public void setCriteriaAbbrDescription(String criteriaAbbrDescription) {
    this.criteriaAbbrDescription = criteriaAbbrDescription;
    }
        public Integer getCriteriaId() {
    return this.criteriaId;
    }
    public void setCriteriaId(Integer criteriaId) {
    this.criteriaId = criteriaId;
    }
        public String getRawValue() {
    return this.rawValue;
    }
    public void setRawValue(String rawValue) {
    this.rawValue = rawValue;
    }
        public String getCriteriaUnitDescription() {
    return this.criteriaUnitDescription;
    }
    public void setCriteriaUnitDescription(String criteriaUnitDescription) {
    this.criteriaUnitDescription = criteriaUnitDescription;
    }
        public String getFormattedValue() {
    return this.formattedValue;
    }
    public void setFormattedValue(String formattedValue) {
    this.formattedValue = formattedValue;
    }
        public Boolean getInterval() {
    return this.interval;
    }
    public void setInterval(Boolean interval) {
    this.interval = interval;
    }
        public String getMatchesSearchQuery() {
    return this.matchesSearchQuery;
    }
    public void setMatchesSearchQuery(String matchesSearchQuery) {
    this.matchesSearchQuery = matchesSearchQuery;
    }
        public String getCriteriaType() {
    return this.criteriaType;
    }
    public void setCriteriaType(String criteriaType) {
    this.criteriaType = criteriaType;
    }
        public Boolean getImmediateDisplay() {
    return this.immediateDisplay;
    }
    public void setImmediateDisplay(Boolean immediateDisplay) {
    this.immediateDisplay = immediateDisplay;
    }
        public Boolean getMandatory() {
    return this.mandatory;
    }
    public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
    }
        public String getCriteriaDescription() {
    return this.criteriaDescription;
    }
    public void setCriteriaDescription(String criteriaDescription) {
    this.criteriaDescription = criteriaDescription;
    }
        public String getSuccessorCriteriaId() {
    return this.successorCriteriaId;
    }
    public void setSuccessorCriteriaId(String successorCriteriaId) {
    this.successorCriteriaId = successorCriteriaId;
    }
    }