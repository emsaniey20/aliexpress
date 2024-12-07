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

public class AliexpressLogisticsBuyerFreightCalculateAeopFreightCalculateResultListResponseForBuyer implements Serializable {
    private static final long serialVersionUID = 1L;
        /** aeopFreightCalculateResultForBuyerDTOList */
                @ApiListField("aeop_freight_calculate_result_for_buyer_d_t_o_list")
            private List<AliexpressLogisticsBuyerFreightCalculateAeopFreightCalculateResultForBuyerDTO> aeopFreightCalculateResultForBuyerDTOList;
        /** errorDesc */
                @ApiField("error_desc")
            private String errorDesc;
        /** success */
                @ApiField("success")
            private Boolean success;
    
        public List<AliexpressLogisticsBuyerFreightCalculateAeopFreightCalculateResultForBuyerDTO> getAeopFreightCalculateResultForBuyerDTOList() {
    return this.aeopFreightCalculateResultForBuyerDTOList;
    }
    public void setAeopFreightCalculateResultForBuyerDTOList(List<AliexpressLogisticsBuyerFreightCalculateAeopFreightCalculateResultForBuyerDTO> aeopFreightCalculateResultForBuyerDTOList) {
    this.aeopFreightCalculateResultForBuyerDTOList = aeopFreightCalculateResultForBuyerDTOList;
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