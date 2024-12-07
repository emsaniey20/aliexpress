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

public class AliexpressCarmodelGetArticlePageResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 错误信息 */
                @ApiListField("error_list")
            private List<AliexpressCarmodelGetArticleErrorMessage> errorList;
        /** 是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 分页信息 */
                @ApiField("page_info")
            private AliexpressCarmodelGetArticlePageInfoDTO pageInfo;
        /** 数据信息 */
                @ApiListField("data_source_list")
            private List<AliexpressCarmodelGetArticleArticleDTO> dataSourceList;
    
        public List<AliexpressCarmodelGetArticleErrorMessage> getErrorList() {
    return this.errorList;
    }
    public void setErrorList(List<AliexpressCarmodelGetArticleErrorMessage> errorList) {
    this.errorList = errorList;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public AliexpressCarmodelGetArticlePageInfoDTO getPageInfo() {
    return this.pageInfo;
    }
    public void setPageInfo(AliexpressCarmodelGetArticlePageInfoDTO pageInfo) {
    this.pageInfo = pageInfo;
    }
        public List<AliexpressCarmodelGetArticleArticleDTO> getDataSourceList() {
    return this.dataSourceList;
    }
    public void setDataSourceList(List<AliexpressCarmodelGetArticleArticleDTO> dataSourceList) {
    this.dataSourceList = dataSourceList;
    }
    }