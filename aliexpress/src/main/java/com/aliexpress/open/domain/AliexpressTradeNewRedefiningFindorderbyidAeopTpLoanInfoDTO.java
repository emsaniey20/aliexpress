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

public class AliexpressTradeNewRedefiningFindorderbyidAeopTpLoanInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 子订单放款金额 */
                @ApiField("loan_amount")
            private AliexpressTradeNewRedefiningFindorderbyidMoneyStr loanAmount;
        /** 放款时间 (此时间为美国太平洋时间） */
                @ApiField("loan_time")
            private String loanTime;
    
        public AliexpressTradeNewRedefiningFindorderbyidMoneyStr getLoanAmount() {
    return this.loanAmount;
    }
    public void setLoanAmount(AliexpressTradeNewRedefiningFindorderbyidMoneyStr loanAmount) {
    this.loanAmount = loanAmount;
    }
        public String getLoanTime() {
    return this.loanTime;
    }
    public void setLoanTime(String loanTime) {
    this.loanTime = loanTime;
    }
    }