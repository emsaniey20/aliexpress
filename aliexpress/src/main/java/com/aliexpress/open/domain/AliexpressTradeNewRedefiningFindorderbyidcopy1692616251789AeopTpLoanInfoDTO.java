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

public class AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpLoanInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("escrow_fee_amount")
            private String escrowFeeAmount;
        /** 1 */
                @ApiField("loan_time")
            private String loanTime;
        /** 1 */
                @ApiField("escrow_fee_currency")
            private String escrowFeeCurrency;
        /** 1 */
                @ApiField("affiliate_fee_currency")
            private String affiliateFeeCurrency;
        /** 1 */
                @ApiField("affiliate_fee_amount")
            private String affiliateFeeAmount;
        /** 1 */
                @ApiField("loan_amount")
            private AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr loanAmount;
    
        public String getEscrowFeeAmount() {
    return this.escrowFeeAmount;
    }
    public void setEscrowFeeAmount(String escrowFeeAmount) {
    this.escrowFeeAmount = escrowFeeAmount;
    }
        public String getLoanTime() {
    return this.loanTime;
    }
    public void setLoanTime(String loanTime) {
    this.loanTime = loanTime;
    }
        public String getEscrowFeeCurrency() {
    return this.escrowFeeCurrency;
    }
    public void setEscrowFeeCurrency(String escrowFeeCurrency) {
    this.escrowFeeCurrency = escrowFeeCurrency;
    }
        public String getAffiliateFeeCurrency() {
    return this.affiliateFeeCurrency;
    }
    public void setAffiliateFeeCurrency(String affiliateFeeCurrency) {
    this.affiliateFeeCurrency = affiliateFeeCurrency;
    }
        public String getAffiliateFeeAmount() {
    return this.affiliateFeeAmount;
    }
    public void setAffiliateFeeAmount(String affiliateFeeAmount) {
    this.affiliateFeeAmount = affiliateFeeAmount;
    }
        public AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr getLoanAmount() {
    return this.loanAmount;
    }
    public void setLoanAmount(AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789MoneyStr loanAmount) {
    this.loanAmount = loanAmount;
    }
    }