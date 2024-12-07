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

public class AliexpressLogisticsServiceQueryAeopOnlineLogisticsServiceResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 是否成功 */
                @ApiField("is_success")
            private Boolean isSuccess;
        /** 错误描述 */
                @ApiField("error_desc")
            private String errorDesc;
        /** result list */
                @ApiListField("result_list")
            private List<AliexpressLogisticsServiceQueryAeopOnlineLogisticsServiceResult> resultList;
    
        public Boolean getIsSuccess() {
    return this.isSuccess;
    }
    public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    }
        public String getErrorDesc() {
    return this.errorDesc;
    }
    public void setErrorDesc(String errorDesc) {
    this.errorDesc = errorDesc;
    }
        public List<AliexpressLogisticsServiceQueryAeopOnlineLogisticsServiceResult> getResultList() {
    return this.resultList;
    }
    public void setResultList(List<AliexpressLogisticsServiceQueryAeopOnlineLogisticsServiceResult> resultList) {
    this.resultList = resultList;
    }
    }