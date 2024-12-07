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

public class AliexpressSocialProductEvaluationQueryProductEvaluationResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Evaluations list */
                @ApiListField("evaluations")
            private List<AliexpressSocialProductEvaluationQueryBuyerEvaluation> evaluations;
        /** Page number */
                @ApiField("page_number")
            private Integer pageNumber;
        /** Page size */
                @ApiField("page_size")
            private Integer pageSize;
        /** Total feedback number */
                @ApiField("total_number")
            private Integer totalNumber;
    
        public List<AliexpressSocialProductEvaluationQueryBuyerEvaluation> getEvaluations() {
    return this.evaluations;
    }
    public void setEvaluations(List<AliexpressSocialProductEvaluationQueryBuyerEvaluation> evaluations) {
    this.evaluations = evaluations;
    }
        public Integer getPageNumber() {
    return this.pageNumber;
    }
    public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
        public Integer getTotalNumber() {
    return this.totalNumber;
    }
    public void setTotalNumber(Integer totalNumber) {
    this.totalNumber = totalNumber;
    }
    }