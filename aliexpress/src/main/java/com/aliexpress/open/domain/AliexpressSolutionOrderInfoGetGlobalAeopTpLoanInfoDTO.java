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

public class AliexpressSolutionOrderInfoGetGlobalAeopTpLoanInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** loan amount */
                @ApiField("loan_amount")
            private AliexpressSolutionOrderInfoGetGlobalMoneyStr loanAmount;
        /** loan time */
                @ApiField("loan_time")
            private String loanTime;
    
        public AliexpressSolutionOrderInfoGetGlobalMoneyStr getLoanAmount() {
    return this.loanAmount;
    }
    public void setLoanAmount(AliexpressSolutionOrderInfoGetGlobalMoneyStr loanAmount) {
    this.loanAmount = loanAmount;
    }
        public String getLoanTime() {
    return this.loanTime;
    }
    public void setLoanTime(String loanTime) {
    this.loanTime = loanTime;
    }
    }