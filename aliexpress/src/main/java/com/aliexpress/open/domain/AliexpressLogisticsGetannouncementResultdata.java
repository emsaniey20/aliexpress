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

public class AliexpressLogisticsGetannouncementResultdata implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 结果列表 */
                @ApiListField("result_list")
            private List<AliexpressLogisticsGetannouncementResult> resultList;
        /** 1 */
                @ApiField("error_desc")
            private String errorDesc;
        /** 明细条目执行结果的成功状态 */
                @ApiField("success")
            private Boolean success;
    
        public List<AliexpressLogisticsGetannouncementResult> getResultList() {
    return this.resultList;
    }
    public void setResultList(List<AliexpressLogisticsGetannouncementResult> resultList) {
    this.resultList = resultList;
    }
        public String getErrorDesc() {
    return this.errorDesc;
    }
    public void setErrorDesc(String errorDesc) {
    this.errorDesc = errorDesc;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
    }