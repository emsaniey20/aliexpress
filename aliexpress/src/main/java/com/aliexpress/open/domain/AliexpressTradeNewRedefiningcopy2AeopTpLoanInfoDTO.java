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

public class AliexpressTradeNewRedefiningcopy2AeopTpLoanInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 111sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf  */
                @ApiField("escrow_fee_amount")
            private String escrowFeeAmount;
        /** 111sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf  */
                @ApiField("loan_time")
            private String loanTime;
        /** 111sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf  */
                @ApiField("escrow_fee_currency")
            private String escrowFeeCurrency;
        /** 111sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf  */
                @ApiField("affiliate_fee_currency")
            private String affiliateFeeCurrency;
        /** 111sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf  */
                @ApiField("affiliate_fee_amount")
            private String affiliateFeeAmount;
        /** 111sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf 1sa sad sdafsdafasdfsadfasdf sdsdaf asd sdaf asdf sda fdsa fdsa fsdaf sda. sdaf sadf asd. dsaf . dsaf  */
                @ApiField("loan_amount")
            private AliexpressTradeNewRedefiningcopy2MoneyStr loanAmount;
    
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
        public AliexpressTradeNewRedefiningcopy2MoneyStr getLoanAmount() {
    return this.loanAmount;
    }
    public void setLoanAmount(AliexpressTradeNewRedefiningcopy2MoneyStr loanAmount) {
    this.loanAmount = loanAmount;
    }
    }