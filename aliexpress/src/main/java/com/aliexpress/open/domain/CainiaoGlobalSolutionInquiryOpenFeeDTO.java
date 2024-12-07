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

public class CainiaoGlobalSolutionInquiryOpenFeeDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 费用详细列表 */
                @ApiListField("fee_detail_list")
            private List<CainiaoGlobalSolutionInquiryOpenFeeDetailDTO> feeDetailList;
        /** 总费用 */
                @ApiField("total_fee")
            private Long totalFee;
        /** 币种 */
                @ApiField("currency")
            private String currency;
        /** 费用类型，POST_ESTIMATED_COST：预估费用 */
                @ApiField("fee_type")
            private String feeType;
    
        public List<CainiaoGlobalSolutionInquiryOpenFeeDetailDTO> getFeeDetailList() {
    return this.feeDetailList;
    }
    public void setFeeDetailList(List<CainiaoGlobalSolutionInquiryOpenFeeDetailDTO> feeDetailList) {
    this.feeDetailList = feeDetailList;
    }
        public Long getTotalFee() {
    return this.totalFee;
    }
    public void setTotalFee(Long totalFee) {
    this.totalFee = totalFee;
    }
        public String getCurrency() {
    return this.currency;
    }
    public void setCurrency(String currency) {
    this.currency = currency;
    }
        public String getFeeType() {
    return this.feeType;
    }
    public void setFeeType(String feeType) {
    this.feeType = feeType;
    }
    }