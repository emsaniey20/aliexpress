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

public class AliexpressLogisticsLocalListlogisticsserviceAeopSolutionFieldResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** result_list */
                @ApiListField("result_list")
            private List<AliexpressLogisticsLocalListlogisticsserviceLogisticsSolutionDO> resultList;
        /** errorDesc */
                @ApiField("error_desc")
            private String errorDesc;
        /** isSuccess */
                @ApiField("is_success")
            private String isSuccess;
    
        public List<AliexpressLogisticsLocalListlogisticsserviceLogisticsSolutionDO> getResultList() {
    return this.resultList;
    }
    public void setResultList(List<AliexpressLogisticsLocalListlogisticsserviceLogisticsSolutionDO> resultList) {
    this.resultList = resultList;
    }
        public String getErrorDesc() {
    return this.errorDesc;
    }
    public void setErrorDesc(String errorDesc) {
    this.errorDesc = errorDesc;
    }
        public String getIsSuccess() {
    return this.isSuccess;
    }
    public void setIsSuccess(String isSuccess) {
    this.isSuccess = isSuccess;
    }
    }