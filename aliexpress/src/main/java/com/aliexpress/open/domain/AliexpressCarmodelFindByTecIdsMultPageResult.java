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

public class AliexpressCarmodelFindByTecIdsMultPageResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 国家下拉选项 */
                @ApiField("country_options")
            private HashMap<String, Object> countryOptions;
        /** 年份下拉选项 */
                @ApiField("year_options")
            private HashMap<String, Object> yearOptions;
        /** 错误信息 */
                @ApiListField("error_list")
            private List<AliexpressCarmodelFindByTecIdserrorListMap> errorList;
        /** 是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 分页信息 */
                @ApiField("page_info")
            private AliexpressCarmodelFindByTecIdsPageInfoDTO pageInfo;
        /** 品牌下拉选项 */
                @ApiField("brand_options")
            private HashMap<String, Object> brandOptions;
        /** 数据 */
                @ApiListField("data_source_list")
            private List<AliexpressCarmodelFindByTecIdsCarInfoDTO> dataSourceList;
        /** 型号下拉选项 */
                @ApiField("model_options")
            private HashMap<String, Object> modelOptions;
    
        public HashMap<String, Object> getCountryOptions() {
    return this.countryOptions;
    }
    public void setCountryOptions(HashMap<String, Object> countryOptions) {
    this.countryOptions = countryOptions;
    }
        public HashMap<String, Object> getYearOptions() {
    return this.yearOptions;
    }
    public void setYearOptions(HashMap<String, Object> yearOptions) {
    this.yearOptions = yearOptions;
    }
        public List<AliexpressCarmodelFindByTecIdserrorListMap> getErrorList() {
    return this.errorList;
    }
    public void setErrorList(List<AliexpressCarmodelFindByTecIdserrorListMap> errorList) {
    this.errorList = errorList;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public AliexpressCarmodelFindByTecIdsPageInfoDTO getPageInfo() {
    return this.pageInfo;
    }
    public void setPageInfo(AliexpressCarmodelFindByTecIdsPageInfoDTO pageInfo) {
    this.pageInfo = pageInfo;
    }
        public HashMap<String, Object> getBrandOptions() {
    return this.brandOptions;
    }
    public void setBrandOptions(HashMap<String, Object> brandOptions) {
    this.brandOptions = brandOptions;
    }
        public List<AliexpressCarmodelFindByTecIdsCarInfoDTO> getDataSourceList() {
    return this.dataSourceList;
    }
    public void setDataSourceList(List<AliexpressCarmodelFindByTecIdsCarInfoDTO> dataSourceList) {
    this.dataSourceList = dataSourceList;
    }
        public HashMap<String, Object> getModelOptions() {
    return this.modelOptions;
    }
    public void setModelOptions(HashMap<String, Object> modelOptions) {
    this.modelOptions = modelOptions;
    }
    }