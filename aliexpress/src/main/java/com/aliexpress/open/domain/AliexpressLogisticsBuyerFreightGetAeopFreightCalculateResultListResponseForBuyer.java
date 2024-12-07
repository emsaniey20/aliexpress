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

public class AliexpressLogisticsBuyerFreightGetAeopFreightCalculateResultListResponseForBuyer implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 错误描述 */
                @ApiField("error_desc")
            private String errorDesc;
        /** 服务列表 */
                @ApiListField("aeop_freight_calculate_result_for_buyer_dtolist")
            private List<AliexpressLogisticsBuyerFreightGetAeopFreightCalculateResultForBuyerDTO> aeopFreightCalculateResultForBuyerDtolist;
        /** 结果 */
                @ApiField("success")
            private Boolean success;
    
        public String getErrorDesc() {
    return this.errorDesc;
    }
    public void setErrorDesc(String errorDesc) {
    this.errorDesc = errorDesc;
    }
        public List<AliexpressLogisticsBuyerFreightGetAeopFreightCalculateResultForBuyerDTO> getAeopFreightCalculateResultForBuyerDtolist() {
    return this.aeopFreightCalculateResultForBuyerDtolist;
    }
    public void setAeopFreightCalculateResultForBuyerDtolist(List<AliexpressLogisticsBuyerFreightGetAeopFreightCalculateResultForBuyerDTO> aeopFreightCalculateResultForBuyerDtolist) {
    this.aeopFreightCalculateResultForBuyerDtolist = aeopFreightCalculateResultForBuyerDtolist;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
    }