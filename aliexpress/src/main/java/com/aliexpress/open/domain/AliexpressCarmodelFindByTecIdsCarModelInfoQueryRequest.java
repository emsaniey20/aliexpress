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

public class AliexpressCarmodelFindByTecIdsCarModelInfoQueryRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 关联车型id集合 */
                @ApiListField("link_target_id_list")
            private List<String> linkTargetIdList;
        /** 国家id */
                @ApiField("country_id")
            private String countryId;
        /** 品牌id */
                @ApiField("brand_id")
            private String brandId;
        /** 型号id */
                @ApiField("model_id")
            private String modelId;
        /** 年份id */
                @ApiField("year_id")
            private String yearId;
        /** 页大小 */
                @ApiField("page_size")
            private String pageSize;
        /** 当前页 */
                @ApiField("current")
            private String current;
    
        public List<String> getLinkTargetIdList() {
    return this.linkTargetIdList;
    }
    public void setLinkTargetIdList(List<String> linkTargetIdList) {
    this.linkTargetIdList = linkTargetIdList;
    }
        public String getCountryId() {
    return this.countryId;
    }
    public void setCountryId(String countryId) {
    this.countryId = countryId;
    }
        public String getBrandId() {
    return this.brandId;
    }
    public void setBrandId(String brandId) {
    this.brandId = brandId;
    }
        public String getModelId() {
    return this.modelId;
    }
    public void setModelId(String modelId) {
    this.modelId = modelId;
    }
        public String getYearId() {
    return this.yearId;
    }
    public void setYearId(String yearId) {
    this.yearId = yearId;
    }
        public String getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
    }
        public String getCurrent() {
    return this.current;
    }
    public void setCurrent(String current) {
    this.current = current;
    }
    }